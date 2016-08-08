/**
 * Created by rush on 8/8/16.
 */
public class Kata {

    public String describeDay(int day) {

        if (day >= 2 && day <= 6) {
            return "That is a weekday";
        } else if (day == 1 || day == 7) {
            return "This is a weekend";
        } else {
            return "That is a tuesday";
        }
    }

    public boolean sleepIn(boolean weekDay, boolean vaction){

        if (!weekDay && vaction == false){
            return true;
        }
        if (weekDay && !vaction){
            return false;
        }
        if (!weekDay && vaction){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile){
            return true;
        }
        else {
            return false;
        }
    }

    public int sumDouble(int a, int b) {
        if (a == b){
            return 2 * (a + b);
        }
        else {
            return a + b;
        }
    }

    public int diff21(int n) {
        if (n <= 21){
            return 21 - n;
        }
        else {
            return (n - 21) * 2;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean makes10(int a, int b) {

        if (a == 10 || b == 10){
            return true;
        }
        if ((a + b) == 10) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean nearHundred(int n) {
        if ((n >= 90 && n <= 110) || (n >=190 && n <=210)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (((a < 0 && b >= 0) && negative == false) || ((a >= 0 && b < 0) && negative == false)){
            return true;
        }
        else if ((a < 0 && b < 0) && negative == true){
            return true;
        }
        else {
            return false;
        }
    }

    public String notString(String str) {
        if (str.startsWith("not")){
            return str;
        }
        else {
            return "not " + str;
        }
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);

        String back = str.substring(n+1, str.length());

        return front + back;
    }

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        return str.charAt(str.length()-1) + mid + str.charAt(0);

    }

    public String front3(String str) {
        if (str.length() <= 3){
            return str + str + str;
        }
        else {
            String first = str.substring(0,3);

            return first + first + first;
        }

    }

    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public String front22(String str) {
        int thing = 2;
        if (thing > str.length()) {
            thing = str.length();
        }

        String front = str.substring(0, thing);
        return front + str + front;

    }

    public boolean startHi(String str) {

        if (str.startsWith("hi")) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) ||
                (b>=13 && b<=19) ||
                (c>=13 && c<=19);
    }

    public boolean loneTeen(int a, int b) {
        boolean aRig = (a >= 13 && a <= 19);
        boolean bRig = (b >= 13 && b <= 19);

        return (aRig && !bRig) || (!aRig && bRig);

    }

    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {

            return str.substring(0, 1) + str.substring(4);
        }
        else {
            return str;
        }
    }

    public boolean mixStart(String str) {

        if (str.length() < 3) return false;

        String mixing = str.substring(1,3);

        if (mixing.equals("ix")){
            return true;
        }
        else{
            return false;
        }
    }

    public String startOz(String str) {
        String theEnd = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            theEnd = theEnd + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            theEnd = theEnd + str.charAt(1);
        }

        return theEnd;
    }

    public int intMax(int a, int b, int c) {
        int maxNum;


        if (a > b) {
            maxNum = a;
        } else {
            maxNum = b;
        }

        if (c > maxNum) {
            maxNum = c;
        }

        return maxNum;
    }

    public int close10(int a, int b) {

        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff){
            return a;
        }
        else if (bDiff < aDiff){
            return b;
        }
        else {
            return 0;
        }
    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }
    public int max1020(int a, int b) {

        if (b > a) {
            int dude = a;
            a = b;
            b = dude;
        }

        if (a >= 10 && a <= 20){
            return a;
        }
        if (b >= 10 && b <= 20){
            return b;
        }
        return 0;

    }

    public boolean stringE(String str) {

        int count = 0;

        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;

        }

        return (count >= 1 && count <= 3);
    }

    public boolean lastDigit(int a, int b) {

        return (a % 10 == b % 10);
    }
    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String result = "";

        // Look at every nth char
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
















}

