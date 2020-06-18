package tekwill_java_basic;

public class Roulette {
    public static void main(String[] args) {

        long seedCapital = 0;

        for (int round = 0; round < 1000000; round++) {
            long wager = 1;
            while (Math.random() < 0.5) {
                wager *= 2;
            }
            if (wager > seedCapital) {
                seedCapital = wager;
                System.out.println("[" + round + "] Maximum seed capital: " + seedCapital);
            }
        }

        long seedMoney = 1000;
        int round = 0;
        while (seedMoney > 0) {
            long wager = 1;
            while (Math.random() < 0.5) {
                wager *= 2;
            }
            if (wager > seedMoney) {
                seedMoney = 0;
            } else {
                seedMoney++;
            }
            round++;
        }
        System.out.println("You lost all your money after " + round + " rounds.");


    }

}
