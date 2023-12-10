package task1;
import java.util.Scanner;
public class NumberGame {
    static Print print=new Print();
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        while(true){
            print.print();
            System.out.println("Press 1 and enter key to play\t\t\t\t\tPress anyother number and press enter to exit");
            int n= sc.nextInt();
            if(n==1){
                startGame();
                continue;
            }
            break;
        }
    }
    private static void startGame(){
        int minRange=1,maxRange=100;
        int numberOfAttempt=3;
        int randomNumber=(int)(Math.random()*(maxRange-minRange+1)+minRange);

        Scanner sc=new Scanner(System.in);


        print.print();
        System.out.println("No.of Attempts left:3");

        while(numberOfAttempt>0){
            System.out.println();
            int userVal= sc.nextInt();

            if(userVal==randomNumber) {
                print.print();
                System.out.println("Congratulations! Your guess is correct!");
                break;
            }
            else if(userVal>randomNumber) {
                print.print();
                System.out.println("No.of Attempts left:"+ --numberOfAttempt+"\t\t\t\tHINT:your value is higher than my number,Try again!");
            }
            else if(userVal<randomNumber) {
                print.print();
                System.out.println("No.of Attempts left:"+ --numberOfAttempt+"\t\t\t\tHINT:your value is lower than my number,Try again!");
            }
        }
        if(numberOfAttempt<=0){
            print.print();
            System.out.println("\t\t\tthere is no attempts left");
        }
        System.out.println("\n\t\t\tThe generated number was "+randomNumber);
        System.out.println("\t\t\t\t\tpress any key and enter to continue");
        sc.next();
    }
}
