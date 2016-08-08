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
        System.out.println("Missing Char");

        //This calls the missingChar method
        System.out.println(newDay.missingChar("kitten", 1));
        System.out.println(newDay.missingChar("kitten", 0));
        System.out.println(newDay.missingChar("kitten", 4));

        System.out.println();
        System.out.println("FrontBack");

        //This calls the front back method
        System.out.println(newDay.frontBack("These"));
        System.out.println(newDay.frontBack("Dude"));
        System.out.println(newDay.frontBack("Well"));

        System.out.println();
        System.out.println("Front 3");

        //This calls the front3 method
        System.out.println(newDay.front3("This"));
        System.out.println(newDay.front3("Timme"));
        System.out.println(newDay.front3("abc"));

        System.out.println();
        System.out.println("Back Around");

        //This calls the
        System.out.println(newDay.backAround("cat"));
        System.out.println(newDay.backAround("Dude"));
        System.out.println(newDay.backAround("Dying"));

        System.out.println();
        System.out.println("Or 3 5");

        //This calls the
        System.out.println(newDay.or35(3));
        System.out.println(newDay.or35(5));
        System.out.println(newDay.or35(23));

        System.out.println();
        System.out.println("front 22");

        //This calls the
        System.out.println(newDay.front22("Thisbe"));
        System.out.println(newDay.front22("thisis"));
        System.out.println(newDay.front22("timeing"));

        System.out.println();
        System.out.println("Start Hi");

        //This calls the startHi
        System.out.println(newDay.startHi("hi my name is"));
        System.out.println(newDay.startHi("dudd"));
        System.out.println(newDay.startHi("Duded hi"));

        System.out.println();
        System.out.println("Icy Hot");

        //This calls the icyHot
        System.out.println(newDay.icyHot(-1, 109));
        System.out.println(newDay.icyHot(-1, 200));
        System.out.println(newDay.icyHot(0, 99));

        System.out.println();
        System.out.println("int 1020");

        //This calls the in1020
        System.out.println(newDay.in1020(2, 15));
        System.out.println(newDay.in1020(44, 10));
        System.out.println(newDay.in1020(23, 23));

        System.out.println();
        System.out.println("has teen");

        //This calls the hasTeen
        System.out.println(newDay.hasTeen(12, 13, 14));
        System.out.println(newDay.hasTeen(22, 23, 24));
        System.out.println(newDay.hasTeen(13, 13 ,13));

        System.out.println();
        System.out.println("Lone Teen");

        //This calls the loneTeen
        System.out.println(newDay.loneTeen(13, 13));
        System.out.println(newDay.loneTeen(14, 77));
        System.out.println(newDay.loneTeen(88, 22));

        System.out.println();
        System.out.println("Delete del");

        //This calls the delDel
        System.out.println(newDay.delDel("adelbjk"));
        System.out.println(newDay.delDel("kdelasd"));
        System.out.println(newDay.delDel("dfdel"));

        System.out.println();
        System.out.println("Mix Start");

        //This calls the
        System.out.println(newDay.mixStart("mixitup"));
        System.out.println(newDay.mixStart("pixitup"));
        System.out.println(newDay.mixStart("m1xitup"));


        System.out.println();
        System.out.println("Start OZ");

        //This calls the startOZ
        System.out.println(newDay.startOz("ozman"));
        System.out.println(newDay.startOz("jzd"));
        System.out.println(newDay.startOz("omsk"));


        System.out.println();
        System.out.println("intMax");

        //This calls the
        System.out.println(newDay.intMax(1, 2, 4));
        System.out.println(newDay.intMax(34, 55, 32));
        System.out.println(newDay.intMax(2, 44, 76));


        System.out.println();
        System.out.println("Close 10");

        //This calls the close10
        System.out.println(newDay.close10(22, 44));
        System.out.println(newDay.close10(10,10));
        System.out.println(newDay.close10(2, 11));

        System.out.println();
        System.out.println("in3050");

        //This calls the in3050 method
        System.out.println(newDay.in3050(30, 40));
        System.out.println(newDay.in3050(30, 45));
        System.out.println(newDay.in3050(41, 49));

        System.out.println();
        System.out.println("max 1020");

        //This calls the
        System.out.println(newDay.max1020(12,14));
        System.out.println(newDay.max1020(2, 20));
        System.out.println(newDay.max1020(21,5));

        System.out.println();
        System.out.println("e String");

        //This calls the
        System.out.println(newDay.stringE("theee"));
        System.out.println(newDay.stringE("Crepe"));
        System.out.println(newDay.stringE("eeeeee"));

        System.out.println();
        System.out.println("Last Digit");

        //This calls the lastDigit method
        System.out.println(newDay.lastDigit(15, 5));
        System.out.println(newDay.lastDigit(22, 5));
        System.out.println(newDay.lastDigit(37, 29));

        System.out.println();
        System.out.println("end Up");

        //This calls the
        System.out.println(newDay.endUp("Thisisl"));
        System.out.println(newDay.endUp("dude"));
        System.out.println(newDay.endUp("TIME"));

        System.out.println();
        System.out.println("every Nth thing");

        //This calls the 
        System.out.println(newDay.everyNth("thispank", 2));
        System.out.println(newDay.everyNth("afasdggdsddd", 4));
        System.out.println(newDay.everyNth("akdkdkdjfiwiwiejfkkdsjfkjasgfg", 3));



    }
}
