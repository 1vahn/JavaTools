package TimeCalc;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome. What operation would you like to perform? \n1. Add time \n2. Subtract time \n3. Multiply time \n4. Divide time \n5. Convert time to seconds \n6. Convert seconds to time \n7. Get VDOT from time \n8. Convert time to mile time \n9. Exit");
        int choice = scan.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter the first time in hours, minutes, and seconds. For example: 1:30:45.5");
                String in1 = scan.nextLine();
                int hours = Integer.parseInt(in1.substring(0,in1.indexOf(":")));
                String temp = in1.replaceAll(Integer.toString(hours) + ":", "");
                int mins = Integer.parseInt(temp.substring(0,temp.indexOf(":")));
                String temp2 = temp.replaceAll(Integer.toString(mins) + ":", "");
                double secs = Double.parseDouble(temp2);
                Time t1 = new Time(hours,mins,secs);

                System.out.println("Enter the second time in hours, minutes, and seconds.");
                String in2 = scan.nextLine();
                int hours2 = Integer.parseInt(in1.substring(0,in1.indexOf(":")));
                String temp3 = in1.replaceAll(Integer.toString(hours) + ":", "");
                int mins2 = Integer.parseInt(temp.substring(0,temp.indexOf(":")));
                String temp4 = temp.replaceAll(Integer.toString(mins) + ":", "");
                double secs2 = Double.parseDouble(temp2);
                Time t2 = new Time(hours,mins,secs);
                System.out.println(t1.addTime(t2));
                break;
            case 2:
                System.out.println("Enter the first time in hours, minutes, and seconds. For example: 1:30:45.5");
                String in3 = scan.nextLine();
                int hours3 = Integer.parseInt(in1.substring(0,in1.indexOf(":")));
                String temp5 = in1.replaceAll(Integer.toString(hours) + ":", "");
                int mins3 = Integer.parseInt(temp.substring(0,temp.indexOf(":")));
                String temp6 = temp.replaceAll(Integer.toString(mins) + ":", "");
                double secs3 = Double.parseDouble(temp2);
                Time t3 = new Time(hours,mins,secs);

                System.out.println("Enter the second time in hours, minutes, and seconds.");
                String in4 = scan.nextLine();
                int hours4 = Integer.parseInt(in1.substring(0,in1.indexOf(":")));
                String temp7 = in1.replaceAll(Integer.toString(hours) + ":", "");
                int mins4 = Integer.parseInt(temp.substring(0,temp.indexOf(":")));
                String temp8 = temp.replaceAll(Integer.toString(mins) + ":", "");
                double secs4 = Double.parseDouble(temp2);
                Time t4 = new Time(hours,mins,secs);
                System.out.println(t3.subtractTime(t4));
                break;

            case 3:
                System.out.println("Enter the first time in hours, minutes, and seconds.");
                int h5 = scan.nextInt();
                int m5 = scan.nextInt();
                double s5 = scan.nextDouble();
                System.out.println("Enter the second time in hours, minutes, and seconds.");
                int h6 = scan.nextInt();
                int m6 = scan.nextInt();
                double s6 = scan.nextDouble();
                System.out.println(TimeCalc.multiplyTime(h5,m5,s5,h6,m6,s6));
                break;
            case 4:
                System.out.println("Enter the first time in hours, minutes, and seconds.");
                int h7 = scan.nextInt();
                int m7 = scan.nextInt();
                double s7 = scan.nextDouble();
                System.out.println("Enter the second time in hours, minutes, and seconds.");
                int h8 = scan.nextInt();
                int m8 = scan.nextInt();
                double s8 = scan.nextDouble();
                System.out.println(TimeCalc.divideTime(h7,m7,s7,h8,m8,s8));
                break;
            case 5:
                System.out.println("Enter the time in hours, minutes, and seconds.");
                int h9 = scan.nextInt();
                int m9 = scan.nextInt();
                double s9 = scan.nextDouble();
                System.out
        
        double t6 = scan.nextDouble();
        System.out.println();
        System.out.println(TimeCalc.addTime(t1,t2,t3,t4,t5,t6));
        scan.close();
    }
}