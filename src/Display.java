
/**
 *
 * @author Jacek Byzdra
 */
public class Display {

    public Display() {

    }

    Status st = new Status();
    WordToGuess wtg = new WordToGuess();

    //Display status of the game
    public void displayStatus(String word, StringBuffer lettersUsed) {
        if (st.checkIfGameWon(word, lettersUsed)) {
            System.out.println("Congratulation ! You won the game!");
        } else if (!st.checkIfStillPlaying(word, lettersUsed) && !st.checkIfGameWon(word, lettersUsed)) {
            System.out.println("Sorry you lost the game. ");
            System.out.println("The word was: " + word);
        } else {
            display(word, lettersUsed);
        }

    }

    /**
     *
     * @author Jacek Byzdra
     */
    //Display vertical part of the gallows
    public void displayGallowsTreeVert(int i, int j) {
        String as = "#";
        if (i != 0 && i != 8 && j == 0) {
            System.out.println(as);
        }
    }

    //Display rope of the gallows
    public void displayRope(int i) {
        String as = "#";
        String sp = "\u0020";
        String rp = "|";
        if (i == 1 || i == 2) {
            System.out.print(as);
            for (int x = 0; x < 9; x++) {
                System.out.print(sp);
            }
            System.out.println(rp);
        }
    }

    //Display head
    public void displayHead(int i) {
        String as = "#";
        String sp = "\u0020";
        String lch = "(";
        String rch = ")";
        String ey = "'";
        String nm = ";";
        if (i == 3) {
            System.out.print(as);
            for (int x = 0; x < 7; x++) {
                System.out.print(sp);
            }
            System.out.print(lch + ey + nm + ey);
            System.out.println(rch);
        }
    }

    //Display body
    public void displayBody() {
        String as = "#";
        String sp = "\u0020";
        String rp = "|";
        System.out.print(as);
        for (int x = 0; x < 9; x++) {
            System.out.print(sp);
        }
        System.out.println(rp);
    }

    //Display body and left hand
    public void displayBodyL() {
        String as = "#";
        String sp = "\u0020";
        String rp = "|";
        String lh = "/";
        System.out.print(as);
        for (int x = 0; x < 8; x++) {
            System.out.print(sp);
        }
        System.out.print(lh);
        System.out.println(rp);
    }

    //Display body, left and right hand
    public void displayBodyLR() {
        String as = "#";
        String sp = "\u0020";
        String rp = "|";
        String lh = "/";
        String rh = "\\";
        System.out.print(as);
        for (int x = 0; x < 8; x++) {
            System.out.print(sp);
        }
        System.out.print(lh);
        System.out.print(rp);
        System.out.println(rh);
    }

    //Display Left leg
    public void displayLLeg() {
        String as = "#";
        String sp = "\u0020";
        String lh = "/";
        System.out.print(as);
        for (int x = 0; x < 8; x++) {
            System.out.print(sp);
        }
        System.out.println(lh);
    }

    //Display left and right leg
    public void displayLRLeg() {
        String as = "#";
        String sp = "\u0020";
        String lh = "/";
        String rh = "\\";
        System.out.print(as);
        for (int x = 0; x < 8; x++) {
            System.out.print(sp);
        }
        System.out.print(lh);
        System.out.print(sp);
        System.out.println(rh);

    }

    //Display bottom gallows
    public void displayBottomGallows() {
        String as = "#";
        System.out.println(as);
    }

    //Display rope on gallows
    public void displayGallowsRope(int i, int j) {
        if (i != 0 && i != 8 && j == 0) {
            displayRope(i);
            if (i > 2) {
                displayBottomGallows();
            }
        }
    }

    //Display rope and head on gallows
    public void displayGallowsRopeHead(int i, int j) {
        if (i != 0 && i != 8 && j == 0) {
            displayRope(i);
            displayHead(i);
            if (i > 3) {
                displayBottomGallows();
            }
        }
    }

    //Display rope, head and boddy on gallows
    public void displayGallowsRopeHeadBody(int i, int j) {
        if (i != 0 && i != 8 && j == 0) {
            displayRope(i);
            displayHead(i);
            if (i == 4) {
                displayBody();
            }
            if (i > 4) {
                displayBottomGallows();
            }
        }
    }

    //Display rope, head, body and left hand on gallows
    public void displayGallowsRopeHeadBodyHand(int i, int j) {
        if (i != 0 && i != 8 && j == 0) {
            displayRope(i);
            displayHead(i);
            if (i == 4) {
                displayBodyL();
            }
            if (i > 4) {
                displayBottomGallows();
            }
        }
    }

    //Display rope, head, body, left and right hand on gallows
    public void displayGallowsRopeHeadBodyHands(int i, int j) {
        if (i != 0 && i != 8 && j == 0) {
            displayRope(i);
            displayHead(i);
            if (i == 4) {
                displayBodyLR();
            }
            if (i > 4) {
                displayBottomGallows();
            }
        }
    }

    /**
     *
     * @author Jacek Byzdra
     */
    //Display rope, head, body, left and right hand, left leg on gallows
    public void displayGallowsRopeHeadBodyHandsLeg(int i, int j) {
        if (i != 0 && i != 8 && j == 0) {
            displayRope(i);
            displayHead(i);
            if (i == 4) {
                displayBodyLR();
            }
            if (i == 5) {
                displayLLeg();
            }
            if (i > 5) {
                displayBottomGallows();
            }
        }
    }

    //Display rope, head, body, left and right hand, left and right leg on gallows
    public void displayGallowsRopeHeadBodyHandsLegs(int i, int j) {
        if (i != 0 && i != 8 && j == 0) {
            displayRope(i);
            displayHead(i);
            if (i == 4) {
                displayBodyLR();
            }
            if (i == 5) {
                displayLRLeg();
            }
            if (i > 5) {
                displayBottomGallows();
            }
        }
    }

    //Display horizontal parts of gallows
    public void displayGallowsTreeHoriz(int i, int j) {
        String as = "#";
        String sp = "\u0020";
        if (i == 0 || i == 8) {
            if (j == 7) {
                System.out.println(as + sp);
            } else {
                System.out.print(as + sp);
            }
        }

    }

    //Method to show parts on gallows depending on lives value
    public void displayGallowTree(String word, StringBuffer lettersUsed) {
        int nLives = st.nLivesRemaining(word, lettersUsed);
        String as = "#";
        String sp = "\u0020";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8; j++) {
                switch (nLives) {
                    case 7:
                        displayGallowsTreeHoriz(i, j);
                        displayGallowsTreeVert(i, j);
                        break;
                    case 6:
                        displayGallowsTreeHoriz(i, j);
                        displayGallowsRope(i, j);
                        break;
                    case 5:
                        displayGallowsTreeHoriz(i, j);
                        displayGallowsRopeHead(i, j);
                        break;
                    case 4:
                        displayGallowsTreeHoriz(i, j);
                        displayGallowsRopeHeadBody(i, j);
                        break;
                    case 3:
                        displayGallowsTreeHoriz(i, j);
                        displayGallowsRopeHeadBodyHand(i, j);
                        break;
                    case 2:
                        displayGallowsTreeHoriz(i, j);
                        displayGallowsRopeHeadBodyHands(i, j);
                        break;
                    case 1:
                        displayGallowsTreeHoriz(i, j);
                        displayGallowsRopeHeadBodyHandsLeg(i, j);
                        break;
                    case 0:
                        displayGallowsTreeHoriz(i, j);
                        displayGallowsRopeHeadBodyHandsLegs(i, j);
                        break;
                    default:
                        break;
                }

            }
        }
    }

    //Method to display value of lives, letters  underscored and guessed
    public void display(String word, StringBuffer lettersUsed) {
        char[] hiddenWordWithUnderscores = wtg.getUnderscoresWithGuessedChar(word, lettersUsed);
        int nLives = st.nLivesRemaining(word, lettersUsed);
        System.out.println();
        System.out.println("Lives: " + nLives);
        System.out.print("Word: ");
        for (int i = 0; i < hiddenWordWithUnderscores.length; i++) {
            System.out.print(hiddenWordWithUnderscores[i]);
            System.out.print(" ");
        }

        System.out.println();
        System.out.print("Letters used: ");

        for (int i = 0; i < lettersUsed.length(); i++) {
            char place = lettersUsed.charAt(i);
            System.out.print(place);
            if (i < (lettersUsed.length() - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}

/**
 *
 * @author Jacek Byzdra
 */
