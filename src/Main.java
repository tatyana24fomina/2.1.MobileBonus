public class Main {
    public static void main(String[] args) {

        int minAmount = 100;
        int everyAmountSpent = 50;
        int bonusInRubbles = 1;

        int payment = 800;
        int bonus = payment / everyAmountSpent * bonusInRubbles;
        System.out.println(bonus);

        int totalAmount;
        if (payment > 500) {
            totalAmount = minAmount + payment + payment / everyAmountSpent * bonusInRubbles;
        } else {
            totalAmount = minAmount + payment;
        }
        System.out.println(totalAmount);
    }
}
