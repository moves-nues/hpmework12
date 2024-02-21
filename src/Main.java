import java.sql.SQLOutput;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        char clientOS = 0;
        if (clientOS == 0) {
            out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 1) {
                out.println("Установите версию приложения для iOS по ссылке");
            }
        }


        int clientDeviceYear = 2017;
        int clientOs = 0;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            out.println("Установить обычную версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            out.println("Установите облегченную версию приложения для iOS по ссылке");
        }


        int year = 1948;
        if (year % 4 == 0) {
            out.println(+year + " год является високосным");
        } else if (year % 4 != 0) {
            out.println(+year + " год не является високосным");
        }


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            out.println("Потребются сутки, чтобы проехать " + deliveryDistance + " км");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            out.println("Потребуется двое суток, чтобы проехать " + deliveryDistance + " км");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            out.println("Потребуется еще трое суток, чтобы проехать " + deliveryDistance + " км");
        } else {
            out.println("Доставки нет");
        }


        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                out.println("Зимнее время");
                break;
            case 3:
            case 4:
            case 5:
                out.println("Весеннее время");
                break;
            case 6:
            case 7:
            case 8:
                out.println("Летнее время");
                break;
            case 9:
            case 10:
            case 11:
                out.println("Осеннее время");
                break;
            default:
                out.println("Такого месяца не существует");
            }




    }
}

