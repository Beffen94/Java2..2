public class Main {
    public static void main(String[] args) {

        int balance = 1000;    // Начальный счет
        int pay = 1020;     // Сумма пополнения
        int bonus;       //Бонус при пополнении

        if (pay < 1000) {
            bonus = 0;
        } else {
            bonus = pay / 100;
        }
        balance = balance + pay + bonus;
        System.out.println(" Количество бонусов:" + bonus);
        System.out.println("Итоговый баланс: " + balance);


    }
}
