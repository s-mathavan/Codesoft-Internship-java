package task1;

import pack.ClearScreen;

public class Print {
    public void print(){
        ClearScreen cs=new ClearScreen();
        cs.cls();
        System.out.println("\n\n*****************************Welcome to the Guessing Game!*****************************\n");
        System.out.println("I have generated a random number between 1 and 100. Can you guess what it is?\n");
        System.out.println("******************************************************************************************");
    }

}
