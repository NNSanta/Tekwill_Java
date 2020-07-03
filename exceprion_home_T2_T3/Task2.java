package exceprion_home_T2_T3;

public class Task2 extends Exception{
    String[] str = new String[]{"This is string line", "Adam", "Sensei"};

    public Task2() {
    }

    public Task2(String[] str) {
        this.str = str;
    }

    public Task2(String message, String[] str) {
        super(message);
        this.str = str;
    }

    public void print () {
        System.out.println(str);
    }
    Task2(String s){
        super(s);
    }

}
