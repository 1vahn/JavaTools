package TimeCalc;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome. Please enter (in order) the following parameters. Hours of time1, Minutes of time1, Seconds of time1. (milliseconds should be added as a decimal value to seconds.) Hours of time2, Minutes of time2, Seconds of time2.");
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        double t3 = scan.nextDouble();
        int t4 = scan.nextInt();
        int t5 = scan.nextInt();
        double t6 = scan.nextDouble();
        System.out.println();
        System.out.println(TimeCalc.addTime(t1,t2,t3,t4,t5,t6));
        scan.close();
    }
}