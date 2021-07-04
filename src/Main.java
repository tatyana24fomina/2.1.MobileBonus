public class Main {
    public static void main(String[] args) {

        int minAmount = 200;
        int everyAmountSpent = 100;
        int bonusInRubbles = 1;

        int payment = 1300;
        int bonus = 0;

        int totalAmount;
        if (payment > 1000) {
            bonus = (payment / everyAmountSpent) * bonusInRubbles;
            totalAmount = minAmount + payment + bonus;
        } else {
            totalAmount = minAmount + payment;
        }
        System.out.println(bonus);
        System.out.println(totalAmount);

    }
}
