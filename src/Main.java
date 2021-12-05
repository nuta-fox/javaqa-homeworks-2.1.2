public class Main {
    public static void main (String[] args) {

        System.out.println("------------");
        int amount = 100; // Количество денег на текущем счёте клиента

        int deposit = 100; // сумма пополнения
        System.out.println("Клиент пополнил счет на: " + deposit);
        int bonusAccount = 0; // бонусный счет

        bonusAccount = getBonus(deposit, bonusAccount);

        amount = amount + deposit + bonusAccount;
        System.out.println("Общий счет равен: " + amount);

        // второе задание
        System.out.println("------------");
        amount = 100; // Количество денег на текущем счёте клиента
        deposit = 1100; // сумма пополнения
        System.out.println("Клиент пополнил счет на: " + deposit);
        bonusAccount = getBonus(deposit, bonusAccount);

        amount = amount + deposit + bonusAccount;
        System.out.println("Общий счет равен: " + amount);

    }

    private static int getBonus(int deposit, int bonusAccount) {
        if (deposit > 1000) {
            System.out.println("Сумма внесенной суммы больше 1000 рублей");
            bonusAccount = bonusAccount + (deposit / 100);
            System.out.println("Бонусный счет равен: " + bonusAccount);
        }else {
            System.out.println("Размер платежа меньше 1000 рублей. Бонусы не начисляются");
        }
        return bonusAccount;
    }

}
