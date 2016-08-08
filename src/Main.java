/**
 * Created by rush on 8/8/16.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

     /*   System.out.print("Dude you know your name?");

        String name = scanner.nextLine();

        System.out.println("Cool " + name + " you bench right?");

        System.out.println();

        System.out.println("How many pounds you bench?");

     */

        Kata newDay = new Kata();

    /*

        int num = scanner.nextInt();

        System.out.println(newDay.describeDay(num));
    */
        System.out.println("Sleep In");


        //This is calling the sleepIn method from Kata
        System.out.println(newDay.sleepIn(false, false));
        System.out.println(newDay.sleepIn(true, false));
        System.out.println(newDay.sleepIn(false, true));

        System.out.println();
        System.out.println("Monkey Trouble");

        //This is the monkeyTrouble method from Kata
        System.out.println(newDay.monkeyTrouble(true, true));
        System.out.println(newDay.monkeyTrouble(false, false));
        System.out.println(newDay.monkeyTrouble(false, true));

        System.out.println();
        System.out.println("Sum double");

        //This calls the method sumDouble
        System.out.println(newDay.sumDouble(1, 2));
        System.out.println(newDay.sumDouble(3, 2));
        System.out.println(newDay.sumDouble(2, 2));

        System.out.println();
        System.out.println("Diff21");

        //This calls the method diff21
        System.out.println(newDay.diff21(19));
        System.out.println(newDay.diff21(10));
        System.out.println(newDay.diff21(21));

        System.out.println();
        System.out.println("Parrot Trouble");

        //This is the parrotTrouble method
        System.out.println(newDay.parrotTrouble(true, 6));
        System.out.println(newDay.parrotTrouble(true, 7));
        System.out.println(newDay.parrotTrouble(false, 6));

        System.out.println();
        System.out.println("makes10");

        //this calls the makes10 method
        System.out.println(newDay.makes10(9, 10));
        System.out.println(newDay.makes10(9, 9));
        System.out.println(newDay.makes10(9, 1));

        System.out.println();
        System.out.println("near Hundred");

        //This calls the nearHundred method
        System.out.println(newDay.nearHundred(93));
        System.out.println(newDay.nearHundred(90));
        System.out.println(newDay.nearHundred(89));

        System.out.println();
        System.out.println("Pos neg");

        //This calls the posNeg method
        System.out.println(newDay.posNeg(1, -1, false));
        System.out.println(newDay.posNeg(-1, 1, false));
        System.out.println(newDay.posNeg(-4, -5, true));

        System.out.println();
        System.out.println("notString Method");

        //This calls the not string method
        System.out.println(newDay.notString("candy"));
        System.out.println(newDay.notString("x"));
        System.out.println(newDay.notString("not bad"));

        System.out.println();
        System.out.println();

        //This calls the
        System.out.println(newDay);
        System.out.println(newDay);
        System.out.println(newDay);

        System.out.println();
        System.out.println();

        //This calls the
        System.out.println(newDay);
        System.out.println(newDay);
        System.out.println(newDay);



    }
}
