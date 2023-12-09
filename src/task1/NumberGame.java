package task1;
import java.util.Scanner;
public class NumberGame {
    public static void main(String args[]){

        startGame();

    }
    private static void startGame(){
        int minRange=1,maxRange=100;
        int numberOfAttempt=3;
        int randomNumber=(int)(Math.random()*(maxRange-minRange+1)+minRange);

        Scanner sc=new Scanner(System.in);
        Print print=new Print();
        print.print();

        while(numberOfAttempt>0){
            int userVal= sc.nextInt();

            if(userVal==randomNumber) {
                print.print();
                System.out.println("Congratulations! Your guess is correct!");
                break;
            }
            else if(userVal>randomNumber) {
                print.print();
                System.out.println("your value is higher than my number,Try again!");
                System.out.println("No.of Attempts left:"+ --numberOfAttempt);
            }
            else if(userVal<randomNumber) {
                print.print();
                System.out.println("your value is lower than my number,Try again!");
                System.out.println("No.of Attempts left:"+ --numberOfAttempt);
            }
        }
        if(numberOfAttempt<=0) System.out.println("there is no attempt left");
        System.out.println("The generated number was "+randomNumber);
        sc.close();
    }
}
