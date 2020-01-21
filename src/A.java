/**
 *
 * @author Jacek Byzdra 
 */
public class A implements OnBEventListener{
    Display dplay = new Display();
    
 @Override
    public void onBEvent(String word, StringBuffer lettersUsed) 
    { 
        dplay.displayStatus(word, lettersUsed); //invoke display status of the game after playGame is over
    
        
        
    } 
    
} 

/**
 *
 * @author Jacek Byzdra 
 */