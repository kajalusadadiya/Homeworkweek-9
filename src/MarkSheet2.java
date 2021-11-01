import java.util.Scanner;

public class MarkSheet2 {
    /*
     * Re write the student mark sheet programme using if else and while loop.
     */
    int m1, e1, s1, sum, roll, pass, Total, Grade1;
    float percent;
    String name, Grade;
    double div;

    public void Grade() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = scan.nextLine();
        System.out.println("Enter your roll_number :");
        roll = scan.nextInt();

        System.out.println("Enter your English mark :");
        e1 = scan.nextInt();
        while(!(0<=e1 && e1<=100)){
            System.out.println("Invaid input,Marks should between 0 to 100");
            System.out.println("\n please enter correct marks\t\t");
            e1=scan.nextInt();
        }
        System.out.println("Enter your Maths mark :");
        m1 = scan.nextInt();
        while(!(0<=m1 && m1<=100)){
            System.out.println("Invaid input,Marks should between 0 to 100");
            System.out.println("\n please enter correct marks\t\t");
            m1=scan.nextInt();
        }
        System.out.println("Enter your Science mark :");
        s1 = scan.nextInt();
        while(!(0<=s1 && s1<=100)){
            System.out.println("Invaid input,Marks should between 0 to 100");
            System.out.println("\n please enter correct marks\t\t");
            s1=scan.nextInt();
        }

        sum = (e1 + m1 + s1);
        percent = sum * 100 / 300;


        if (percent >= 80) {
            Grade = "A+";
            System.out.println("Grade A+");
        } else if (percent >= 60) {
            Grade = "A";
            System.out.println("Grade A");
        } else if (percent >= 50) {
            Grade = "B";
            System.out.println("Grade B");
        } else if (percent >= 35) {
            Grade = "PASS";
            System.out.println("Grade C");
        } else
            Grade = "FAIL";

    }


    public void Display() {

        System.out.println("|------------------------------|");
        System.out.println("|     Mark Sheet               |");
        System.out.println("|------------------------------|");
        System.out.println("|Name     : " + "   Anand           |");
        System.out.println("|Roll No :  " + roll + "                 |");
        System.out.println("|------------------------------|");
        System.out.println("|   Subjects :  " + "    Marks      |");
        System.out.println("|------------------------------|");
        System.out.println("|    Maths    :   " + m1 +"           |" );
        System.out.println("|    Science   :  " + s1 + "           |");
        System.out.println("|    English :  " + e1 + "             |");
        System.out.println("|------------------------------|");
        System.out.println("|    Total   :  " + sum + "            |");
        System.out.println("|------------------------------|");
        System.out.println("|   Percentage    : " + percent + "       |");
        System.out.println("|   Grade         : " + Grade + "         |");
        System.out.println("|------------------------------|");

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        MarkSheet2 obj = new MarkSheet2();
        obj.Grade();
        obj.Display();
    }


}

