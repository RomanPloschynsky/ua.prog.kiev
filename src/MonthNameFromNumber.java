import java.time.Month;

/**
 * Created by exite on 19.07.16.
 */
public class MonthNameFromNumber {

    public static void getMonthName(String s) {
        try{
            Integer nmbr = Integer.valueOf(s);
            String mssg = "";
            if(nmbr > 0 && nmbr < 13) {
                Month mnth = Month.of(nmbr);
                mssg = String.valueOf(mnth);
            } else {
                mssg = "Please type a number from 1 to 12";
            }
            System.out.println(mssg);
        }
        catch(NumberFormatException exept){
            System.out.println("Please type a number from 1 to 12");
        }
    }


}
