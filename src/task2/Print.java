package task2;

import pack.ClearScreen;

public class Print {
    public void print(){
        ClearScreen cs=new ClearScreen();
        cs.cls();
        System.out.println("\n\n***************************** Student Grade Calculator *****************************\n");
        System.out.println(" A=Excellent ||  B=Good    || C=Average  ||D=Below Average ||  E=Poor    || F=Fail");
        System.out.println(" (90 to 100) || (80 to 90) || (60 to 80) ||  (40 to 60)    || (30 to 40) || (0 to 40)");
        System.out.println("\n************************************************************************************");
    }
}
