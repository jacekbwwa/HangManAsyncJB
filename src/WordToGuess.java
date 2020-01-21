
/**
 *
 * @author Jacek Byzdra
 */

public class WordToGuess {

    public WordToGuess() {

    }

    //Method to choos randomly word from array words
    public String getRandomWord() {
        String hardArrayWords[] = new String[]{"programming", "violoncello", "selection", "repetition",
            "serendipity", "performance", "computing", "America", "Africa", "adjective",
            "although", "another", "croquet", "commitment", "duplex", "azure", "exodus",
            "curriculum", "hyphen", "ivory", "addressee", "jigsaw", "jockey", "joyful",
            "kilobyte", "luxury", "microwave", "nowadays", "oxygen", "quorum", "sphinx",
            "subway", "swivel", "walkway", "wizard", "neutral", "ivy", "unknown", "Europe",
            "college"};

        int n = (int) (Math.random() * 40);
        String x = hardArrayWords[n].toLowerCase();
        return x;
    }

    //check if input letter is repeated
    public boolean isInputCharRepeated(char inputletter, StringBuffer allWordsChars) {
        if (((inputletter >= 'A' && inputletter <= 'Z') || (inputletter >= 'a' && inputletter <= 'z')) && allWordsChars.length() > 0) {
            for (int i = 0; i < allWordsChars.length(); i++) {
                if (inputletter == allWordsChars.charAt(i)) {
                    return true;
                }
            }
            return false;
        }
        return false;

    }

    /**
     *
     * @author Jacek Byzdra
     */
    
    //get sorted array according to most appeared word in array word
    public String[][] getArrayCharsSortedMostAppeared(String[] wordtable) {
        StringBuffer allWordsChars = new StringBuffer();
        StringBuffer wordsChars = new StringBuffer();
        int counter1;
        int counter2;

        for (int i = 0; i < wordtable.length; i++) {
            for (int j = 0; j < wordtable[i].length(); j++) {
                allWordsChars.append(Character.toLowerCase(wordtable[i].charAt(j)));
                System.out.print(wordtable[i].charAt(j));
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < allWordsChars.length(); i++) {
            if ((!isInputCharRepeated(allWordsChars.charAt(i), wordsChars))) {
                wordsChars.append(allWordsChars.charAt(i));
                System.out.print(allWordsChars.charAt(i));
            }

        }

        System.out.println();

        String arrayChars[][] = new String[2][wordsChars.length()];
        for (int j = 0; j < wordsChars.length(); j++) {
            counter1 = 0;
            counter2 = 1;
            arrayChars[0][j] = Character.toString(wordsChars.charAt(j));
            arrayChars[1][j] = Integer.toString(counter2);
            for (int i = 0; i < allWordsChars.length(); i++) {
                if (wordsChars.charAt(j) == allWordsChars.charAt(i)) {
                    counter1++;
                    arrayChars[1][j] = Integer.toString(counter1);
                }
            }

        }
        System.out.println("arrayChars0.length =: " + arrayChars[0].length);
        for (int i = 0; i < arrayChars[0].length; i++) {
            System.out.print("Letter: " + arrayChars[0][i] + " = " + arrayChars[1][i]);
            System.out.println();
        }

        return arrayChars;

    }

    //Display underscores by a row of dashes, representing each letter of the word.
    public char[] getUnderscores(String word) {
        char t = '_';
        int len = word.length();
        char[] Underscores = new char[len];
        for (int i = 0; i < Underscores.length; i++) {
            Underscores[i] = t;
        }
        return Underscores;
    }

    //Display underscores by a row of dashes, representing  letters of the word and display guessed letters
    public char[] getUnderscoresWithGuessedChar(String word, StringBuffer lettersUsed) {

        char t = '_';
        char[] hiddenWordWithUnderscores = getUnderscores(word);
        if (word.length() > 0) {
            for (int j = 0; j < lettersUsed.length(); j++) {
                for (int i = 0; i < hiddenWordWithUnderscores.length; i++) {
                    if (word.charAt(i) == lettersUsed.charAt(j)) {
                        hiddenWordWithUnderscores[i] = word.charAt(i);
                    }
                }
            }
        }
        return hiddenWordWithUnderscores;
    }

}


/**
 *
 * @author Jacek Byzdra 
 */
