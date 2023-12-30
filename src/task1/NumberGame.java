package task1;
import java.util.Scanner;
public class NumberGame {
    static Print print=new Print();
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        while(true){
            print.print();
            System.out.println("\nPress 1 and enter key to play\t\tPress anyother number and press enter to exit");
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
        int numberOfAttempt=10;
        int randomNumber=(int)(Math.random()*(maxRange-minRange+1)+minRange);

        Scanner sc=new Scanner(System.in);

        print.print();
        System.out.println("No.of Attempts left:"+numberOfAttempt);

        while(numberOfAttempt>0){
            System.out.println();
            int userVal= sc.nextInt();

            if(userVal==randomNumber) {
                print.print();
                System.out.println("\t\t\tCongratulations! Your guess is correct!");
                break;
            }
            else if(userVal>randomNumber) {
                print.print();
                System.out.println("No.of Attempts left:"+ --numberOfAttempt+"\t\t\tHINT:your value is higher than my number,Try again!");
            }
            else if(userVal<randomNumber) {
                print.print();
                System.out.println("No.of Attempts left:"+ --numberOfAttempt+"\t\t\tHINT:your value is lower than my number,Try again!");
            }
        }
        if(numberOfAttempt<=0){
            print.print();
            System.out.println("\t\t\t   there is no attempts left");
        }
        System.out.println("\n\t\t\t   The generated number was "+randomNumber);
        System.out.println("\t\t\t\tYOUR SCORE WAS: "+numberOfAttempt*10);
        System.out.println("\t\t\t  press any key and enter to continue");
        sc.next();
    }
}
