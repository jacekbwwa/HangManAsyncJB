/**
 *
 * @author Jacek Byzdra 
 */


public class KeyBoard {

    StringBuffer lettersUsed = new StringBuffer();

    
    public KeyBoard(){
        
    }
    
    //Check if input letter is repeated
    public  boolean isInputValueRepeated(char inputletter, StringBuffer lettersUsed) 
    { 
        if(((inputletter >= 'A' && inputletter <= 'Z')||(inputletter >= 'a' && inputletter <= 'z')) && lettersUsed.length()>0){
            for(int i=0; i<lettersUsed.length(); i++){ 
            if(inputletter == lettersUsed.charAt(i)){
                return true;
            }
           }
            return false;  
        }
        return false;
       
    } 
    
    //Check if input letter is in alphabet
        public  boolean isInputValueInAlphabet(char inputletter) 
    { 
        if((inputletter >= 'A' && inputletter <= 'Z')|| (inputletter >= 'a' && inputletter <= 'z')){
            return true;
        } 
        return false;
    } 
    

    //append input letter to letterused StringBuffer
    public StringBuffer appendAndGetlettersUsed(char inputletter) {
        lettersUsed.append(inputletter);
        return lettersUsed;
    }
    
    //reset letterused StringBuffer
     public StringBuffer resetAndGetLettersUsed() {
        lettersUsed = new StringBuffer();
        return lettersUsed;
    }
    
}

/**
 *
 * @author Jacek Byzdra 
 */
