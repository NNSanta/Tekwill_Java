package exception_home;

class Gexception extends Exception {
    Gexception(String s) { super(s); }
}

    public class Task6 {
        static void f() {
            try {
                g();
            } catch(Gexception ge) {
                System.out.println("Caught GException in f try");
                ge.printStackTrace();
                throw new RuntimeException(ge);
            }
        }
        static void g() throws Gexception {
            throw new Gexception("from g()");
        }
        public static void main(String[] args) {
            f();
        }
    }

//выводит все еще error-ы