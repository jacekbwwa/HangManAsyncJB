/**
 *
 * @author Jacek Byzdra 
 */


public class HangManAsync {
    
    public static void main(String args[]) {
    B obj = new B(); 
    WordToGuess wtog = new WordToGuess();
    String word = wtog.getRandomWord();
    
        //Async first do doBAction() then invoke onBEvent() in OnBEventListener
        OnBEventListener bListener = new A(); 
        obj.registerOnBEventListener(bListener); 
        obj.doBAction(); 
    }
    
}

/**
 *
 * @author Jacek Byzdra 
 */