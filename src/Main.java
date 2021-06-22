public class Main {
    public static void main(String[] args) {

        int minAmount = 100;
        int everyAmountSpent = 50;
        int bonusInRubbles = 1;
        int minDepositAmount = 500;

        int payment = 800;

        int totalAmount;
        if (minDepositAmount >= 500) {
            totalAmount = minAmount + payment + payment / everyAmountSpent * bonusInRubbles;
        } else {
            totalAmount = minAmount + payment;
        }
        System.out.println(totalAmount);

        int totalBonus;
        if (minDepositAmount >= 500) {
            totalBonus = payment / everyAmountSpent * bonusInRubbles;
        } else {
            totalBonus = 0;
        }
        System.out.println(totalBonus);
    }
}
