import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much money are you starting with?");
        double startAmount = scan.nextDouble();
        System.out.println("What is your win probability for a single play?");
        double winChance = scan.nextDouble();
        System.out.println("How much money would you consider a successful day?");
        double winLimit = scan.nextDouble();
        System.out.println("How many days do you want to play?");
        int totalSimulations = scan.nextInt();
        int yay = 0;
        double initialStart = startAmount;
        for (int i = 0; i < totalSimulations; i++) {
            startAmount = initialStart;
            yay = 0;
            while (startAmount > 0 && startAmount < winLimit) {
                double success = Math.random();

                if (winChance > success) {
                    startAmount++;
                    yay++;
                } else {
                    startAmount--;
                    yay++;
                }
            }
            if (startAmount == 0) {
                System.out.println("fail");
            } else {
                System.out.println("success");

            }
            System.out.println(yay + " rounds today");
        }
        System.out.println(startAmount);

    }
}
