package tekwill_java_basic;

class Emp{}

public class Convert {

    static void srtToInt(){
        String str="200";
        int value=Integer.parseInt(str);
        System.out.print("String type + int type :");
        System.out.println(str+100);  //will be 200100
        System.out.print("Converted type int + int :");
        System.out.println(value+100); //will be 300
    }


    static void intToStr(){
        int vl=150;
        String s=String.valueOf(vl);
        System.out.print("Type int + int :");
        System.out.println(vl+100);//250
        System.out.print("Type int + converted type string :");
        System.out.println(100+s);//100150

    }

    static void strToLong(){
        String str="9990449935";
        long line=Long.parseLong(str);
        System.out.print("String :");
        System.out.println(str);
        System.out.print("Converted type:");
        System.out.println(line);
    }


    static void longToStr(){
        long i=9993939399L;
        String s=String.valueOf(i);
        System.out.print("Long :");
        System.out.println(i);
        System.out.print("Converted type:");
        System.out.println(s);

    }

    static void strToFloat(){
        String s="23.6";
        float f=Float.parseFloat("23.6");
        System.out.print("String :");
        System.out.println(s);
        System.out.print("Converted type float:");
        System.out.println(f);

    }

    static void floatToString(){
        float f=12.3F;//F is the suffix for float
        String s=String.valueOf(f);
        System.out.print("Float :");
        System.out.println(f);
        System.out.print("Converted type string:");
        System.out.println(s);

    }

    static void strToDouble(){
        String s="23.6";
        double d=Double.parseDouble("23.6");
        System.out.print("String to double:");
        System.out.println(d);

    }

    static void doubleToStr(){
        double d=12.3;
        String s=String.valueOf(d);
        System.out.print("Double to string:");
        System.out.println(s);

    }

    static void strToObj(){
        String s="hello";
        Object obj=s;
        System.out.print("String to object:");
        System.out.println(obj);
    }

    

static void ObjToSrt() {
    Emp e=new Emp();
    String s=e.toString();
    String s2=String.valueOf(e);
    System.out.println(s);
    System.out.println(s2);
}


    public static void main(String[] args) {
        srtToInt();
        System.out.println();
        intToStr();
        System.out.println();
        strToLong();
        System.out.println();
        longToStr();
        System.out.println();
        strToFloat();
        System.out.println();
        floatToString();
        System.out.println();
        strToDouble();
        System.out.println();
        doubleToStr();
        System.out.println();
        strToObj();
        System.out.println();
        ObjToSrt();
        System.out.println();

    }
}
//all other converting we can found there https://www.javatpoint.com/java-object-to-string