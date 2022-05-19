public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Andriod по ссылке");
        }

        char clientOS1 = 'i';
        int clientDeviceYear = 2013;
        if (clientOS1 == 'a' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 'a' && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 'i' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        int year = 1999;
        int devision4 = year % 4;
        int devision100 = year % 100;
        int devision400 = year % 400;
        if (devision4 == 0 && devision100 != 0) {
            System.out.println(year + " является високосным");
        } else if (devision400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else {
            System.out.println("Потребуется " + ((deliveryDistance - 20)/40 + 1) + " дней");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Месяц принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Месяц принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Месяц принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}