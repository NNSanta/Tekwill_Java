package tekwill_java_basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticMethod {

    //the fist static method
    static void stringToDate() throws ParseException {
        String sDate1="31/12/1998";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        System.out.println(sDate1+"\t"+date1);

    }


    //the second static method
    static void dateToStrind() {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(today);
        System.out.println("Date Format with MM/dd/yyyy : "+strDate);

    }

    //example diffs between static and public method

public void strToDate () throws ParseException {
    String strDate1="15/12/2009";
    Date dateConvert=new SimpleDateFormat("dd/MM/yyyy").parse(strDate1);
    System.out.println(strDate1+"\t"+dateConvert);


}


    public static void main(String[] args) throws ParseException {
        stringToDate();
        System.out.println();
        dateToStrind();

        //for myself
        System.out.println("\nExample for public method");
        StaticMethod example = new StaticMethod();
        example.strToDate();

    }
}
