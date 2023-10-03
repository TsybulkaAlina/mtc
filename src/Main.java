public class Main {
    public static void main(String[] args) {
        int currentBalance = 180; // Начальная сумма на счету у клиента
        int topUpAmount = 2700; // Сумма пополнения

        int bonus = 0; // Изначально бонус равен 0
        int fullHundreds = topUpAmount / 100; //Количество полных сотен в сумме пополнения

        if (topUpAmount > 1000) {
            bonus = fullHundreds * 1; // За каждую полную сотню дается 1 рубль бонуса
        }

        int totalBalance = currentBalance + topUpAmount + bonus; // Итоговая сумма на счету клиента

        System.out.println("Итоговый счет:" + totalBalance + " рублей");
        System.out.println("Бонусные рубли:" + bonus + " рублей");

        // Итоговый счет:2907 рублей
        // Бонусные рубли:27 рублей
    }
}

