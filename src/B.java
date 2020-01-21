/**
 *
 * @author Jacek Byzdra 
 */

public class B {
    private OnBEventListener bListener; 
    WordToGuess wtg = new WordToGuess();
     Display dplay = new Display();
     Status sts = new Status();
     Guesses gss = new Guesses();
     StringBuffer lettersUsedW = new StringBuffer();

    public void registerOnBEventListener(OnBEventListener bListener) 
    { 
        this.bListener = bListener; 
    } 
  

    public void doBAction() 
    { 
  
        new Thread(new Runnable() { 
            public void run() 
            { 
                String word = wtg.getRandomWord();  //get random word
                playGame(word, lettersUsedW);   //invoke the game
                if (bListener != null) { 
                    bListener.onBEvent(word,lettersUsedW); 
                } 
            } 
        }).start(); 
    } 
    
    //main game method built in recursion
     public void playGame(String word, StringBuffer lettersUsed){
        dplay.displayGallowTree(word,  lettersUsed); //show parts on gallows depending on lives value
        dplay.display( word, lettersUsed);  //display value of lives, letters  underscored and guessed
        if(sts.checkIfStillPlaying(word, lettersUsed)){  //check if user is still in the 
            lettersUsed = gss.guessLetterAndGetLetterUsed(lettersUsed); //guess a letter
            this.lettersUsedW = lettersUsed;
            playGame( word, lettersUsed);
        }
       
    }
}

/**
 *
 * @author Jacek Byzdra 
 */