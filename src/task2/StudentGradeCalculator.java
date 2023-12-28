package task2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String args[]){
        Print print=new Print();
        Scanner sc=new Scanner(System.in);
        print.print();
        System.out.print("Enter the No.of Subjects: ");
        int n=sc.nextInt();
        int temp=0;
        int avg=0;
        while(temp<n){
            print.print();
            System.out.print("Enter the subject "+ ++temp+"Mark: ");
            avg+=sc.nextInt();
        }
        avg/=n;
        if(avg>=90) System.out.println("Your Grade: A");
        else if (avg>=80) System.out.println("Your Grade: B");
        else if (avg>=70) System.out.println("Your Grade: C");
        else if (avg>=60) System.out.println("Your Grade: D");
        else if (avg>=50) System.out.println("Your Grade: E");
        else if (avg>=40) System.out.println("Your Grade: F");
        else System.out.println("Fail");
    }
}
