//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package machine;

public class Backend {
    int waterTank = 400;
    int milkTank = 540;
    int beansTank = 120;
    int money = 550;
    int cups = 9;

    public Backend() {
    }

    public void makeEspresso() {
        if (this.waterTank - 250 >= 0 && this.beansTank - 16 >= 0) {
            System.out.println("I have enough resources, making you a coffee!\n");
            this.waterTank -= 250;
            this.beansTank -= 16;
            --this.cups;
            this.money += 4;
        } else if (this.waterTank < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (this.beansTank < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("Sorry, not enough cups!");
        }

    }

    public void makeCappuccino() {
        if (this.waterTank - 200 >= 0 && this.beansTank - 12 >= 0 && this.milkTank - 100 >= 0) {
            System.out.println("I have enough resources, making you a coffee!\n");
            this.waterTank -= 200;
            this.milkTank -= 100;
            this.beansTank -= 12;
            --this.cups;
            this.money += 6;
        } else if (this.waterTank < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (this.beansTank < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.milkTank < 100) {
            System.out.println("Sorry, not enough milk!");
        } else {
            System.out.println("Sorry, not enough cups!");
        }

    }

    public void makeLatte() {
        if (this.waterTank - 350 >= 0 && this.beansTank - 20 >= 0 && this.milkTank - 75 >= 0) {
            System.out.println("I have enough resources, making you a coffee!\n");
            this.waterTank -= 350;
            this.milkTank -= 75;
            this.beansTank -= 20;
            --this.cups;
            this.money += 7;
        } else if (this.waterTank < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (this.beansTank < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.milkTank < 75) {
            System.out.println("Sorry, not enough milk!");
        } else {
            System.out.println("Sorry, not enough cups!");
        }

    }

    public void remaining() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(this.waterTank + " ml of water");
        System.out.println(this.milkTank + " ml of milk");
        System.out.println(this.beansTank + " g of coffee beans");
        System.out.println(this.cups + " disposable cups");
        System.out.println(this.money + "$ of money\n");
        System.out.println();
    }
}
