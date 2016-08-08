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

    }







}

