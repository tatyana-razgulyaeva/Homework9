public class Main {
    public static void main(String[] args) {

        double[] payments = {97300, 95400, 92600, 98200, 28900};
        double sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum += payments[i];
        }
        System.out.println("Сумма трат за месяц составляет " + sum + " рублей");

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double payment : payments) {
            if (min > payment) {
                min = payment;
            }
            if (max < payment) {
                max = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. " +
                "Максимальная сумма трат за неделю составила " + max + " рублей");

        double average = sum / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}