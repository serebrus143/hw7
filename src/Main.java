public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int accumulation = 2_459_000;
        int deposit = 15_000;
        double sum = 0;
        int month = 0;
        double percent = 1 / 100D;
        while (sum <= accumulation) {
            month++;
            sum += sum * percent;
            sum += deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int mortality = 8;
        int fertility = 17;
        int years = 10;
        int currentYear = 2024;
        for (int year = currentYear + 1; year <= currentYear + years; year++) {
            population += (fertility - mortality) * population / 1_000;
            System.out.println("Год " + year + ", численность населения состовляет " + population);
        }
        System.out.println("Задача 4");
        percent = 7 / 100D;
        sum = 15_000;
        month = 0;
        while (sum < 12_000_000) {
            month++;
            sum += sum * percent;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача 5");
        percent = 7 / 100D;
        sum = 15_000;
        month = 0;
        while (sum < 12_000_000) {
            month++;
            sum += sum * percent;
            if (month % 6 == 0)
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача 6");
        sum = 15_000;
        month = 0;
        int monthSix = 9 * 12;
        while (month < monthSix) {
            month++;
            sum += sum * percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println("Задача 7");
        int firstFriday = 5;
        for (int friday = firstFriday; friday <= 31; friday +=7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача 8");
        currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int period = 79;
        int startPeriod = 0;
        for (int year = startPeriod; year <= endYear; year += period) {
            if (year >= startYear) {
                System.out.println(year);
            }
        }
    }
}