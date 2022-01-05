//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package machine;

import java.util.Scanner;

public class Application {
    Backend backend = new Backend();

    public Application() {
        this.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;

        while(!finish) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.next();
            if (input.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                String input2 = scanner.next();
                if (input2.equals("1")) {
                    this.backend.makeEspresso();
                } else if (input2.equals("2")) {
                    this.backend.makeLatte();
                } else if (input2.equals("3")) {
                    this.backend.makeCappuccino();
                }
            } else if (input.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int inputWater = scanner.nextInt();
                Backend var10000 = this.backend;
                var10000.waterTank += inputWater;
                System.out.println("Write how many ml of milk you want to add: ");
                int inputMilk = scanner.nextInt();
                var10000 = this.backend;
                var10000.milkTank += inputMilk;
                System.out.println("Write how many grams of coffee beans you want to add: ");
                int inputBeans = scanner.nextInt();
                var10000 = this.backend;
                var10000.beansTank += inputBeans;
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                int inputCups = scanner.nextInt();
                var10000 = this.backend;
                var10000.cups += inputCups;
                System.out.println();
            } else if (input.equals("remaining")) {
                this.backend.remaining();
            } else if (input.equals("take")) {
                System.out.println("I gave you $" + this.backend.money);
                this.backend.money = 0;
            } else {
                finish = true;
            }
        }

    }
}
