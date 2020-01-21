
/**
 *
 * @author Jacek Byzdra
 */

public class Status {

    public Status() {

    }

    //Sort char array in bubble method, return sorted String
    public String sortBubbleArray(char[] ar) {
        char k;
        String wla = "";
        for (int z = 0; z < ar.length - 1; z++) {
            for (int s = 0; s < ar.length - 1 - z; s++) {
                if (ar[s] > ar[s + 1]) {
                    k = ar[s + 1];
                    ar[s + 1] = ar[s];
                    ar[s] = k;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            wla += ar[i];
        }
        return wla;
    }

    //Split String to array and return result
    public char[] splitStringToChArray(String str) {
        char arry[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arry[i] = str.charAt(i);
        }
        return arry;
    }

    //remove dubbled chars in String and return result
    public String removedDubbledEl(String array) {
        String arp = "";
        for (int i = 0; i < array.length(); i++) {
            if (arp.indexOf(array.charAt(i)) == -1) {
                arp += array.charAt(i);
            }
        }
        return arp;
    }

    //count lives remaining and return result
    public int nLivesRemaining(String word, StringBuffer lettersUsed) {
        int counter = 0;
        int nLives = 8;
        String knc = "";
        knc = removedDubbledEl(sortBubbleArray(splitStringToChArray(word)));
        for (int i = 0; i < knc.length(); i++) {
            for (int j = 0; j < lettersUsed.length(); j++) {
                if (lettersUsed.charAt(j) == knc.charAt(i)) {
                    counter++;
                }
            }
        }
        nLives = nLives - (lettersUsed.length() - counter);
        return nLives;
    }

    //check if game won and return result
    public boolean checkIfGameWon(String word, StringBuffer lettersUsed) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < lettersUsed.length(); j++) {
                if (word.charAt(i) == lettersUsed.charAt(j)) {
                    counter++;
                }
            }
        }
        if (counter == word.length()) {
            return true;
        }
        return false;
    }

    //Check if game is over and return reult
    public boolean checkIfGameOver(String word, StringBuffer lettersUsed) {
        if (nLivesRemaining(word, lettersUsed) == 0 && !checkIfGameWon(word, lettersUsed)) {
            return true;
        }
        return false;

    }

    //check if user is still playing and return result
    public boolean checkIfStillPlaying(String word, StringBuffer lettersUsed) {
        if (nLivesRemaining(word, lettersUsed) > 0 && !checkIfGameWon(word, lettersUsed)) {
            return !checkIfGameWon(word, lettersUsed) && !checkIfGameOver(word, lettersUsed);
        }

        return false;
    }

}

/**
 *
 * @author Jacek Byzdra
 */
