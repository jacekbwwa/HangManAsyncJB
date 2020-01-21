/**
 *
 * @author Jacek Byzdra 
 */

import java.util.Scanner;

/**
 *
 * @author Jacek Byzdra 
 */


public class Guesses {
    String[] randomWord;
    
    public Guesses(){
        
    }
    
    Scanner sc = new Scanner(System.in); 
    KeyBoard kb = new KeyBoard();
    WordToGuess wtgs = new WordToGuess();
    Display dplay = new Display();
     
    // Display prompt to enter a letter, get the letter,check if letter is in alphabet,
    // check if letter is repeated, display message about input letter
    public StringBuffer guessLetterAndGetLetterUsed(StringBuffer lettersUsed){
        System.out.println("Enter a letter !");
        String inputchars  =	sc.next();  
        char inputletter = Character.toLowerCase(inputchars.charAt(0));
        System.out.println("You entered char: " + inputletter);
        if(kb.isInputValueRepeated(inputletter, lettersUsed)){
            System.out.println("You have already entered the letter: " + inputletter);
            guessLetterAndGetLetterUsed(lettersUsed);
        } else if (!kb.isInputValueInAlphabet(inputletter)){
            System.out.println("You have entered not valid letter: " + inputletter);
            System.out.println("You must enetr letter from Alphabet !");
            guessLetterAndGetLetterUsed(lettersUsed);
        } else {
            lettersUsed = kb.appendAndGetlettersUsed(inputletter);
        }  
        return lettersUsed;
    }
    

    
}

/**
 *
 * @author Jacek Byzdra 
 */