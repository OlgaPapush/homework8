import java.time.LocalDate;




public class Main {


    public static void determineTheYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(" год является високосным ");
        } else {
            System.out.println(" год  не является високосным ");
        }
    }

    public static void printInstallationMassage(int clientDeviseYear, int clientOs) {
        if (clientOs == 0 && clientDeviseYear >= 2015) {
                    System.out.println("Установите  версию на Ios по ссылке");
                }
        if (clientOs == 1 && clientDeviseYear >= 2015) {
                    System.out.println("Установите  версию на Android по ссылке");
                } else {
               System.out.println(" Установите  облегченную версию по ссылке");
        }
    }

    public static void calculateTheTime (int deliveryDistance){
            int deliveryTime;
        if (deliveryDistance <= 20) {
                deliveryTime = 1;
                System.out.println(" Время доставки составляет" + deliveryTime + " дней");
            }

            if ((deliveryDistance >= 20) && (deliveryDistance <= 60)) {
                deliveryTime = 2;
                System.out.println(" Время доставки составляет " + deliveryTime + "дня");
            }

            if ((deliveryDistance >= 60) && (deliveryDistance <= 100)) {
                deliveryTime = 3;
                System.out.println(" Время доставки составляет " + deliveryTime + "дня");
            }

    }
    public static void main(String[] args) {

        // задание 1

        int year = 2020;
        determineTheYear(year);

        // задание 2

          int clientDeviseYear = 2022;
          int clientOs = 1;
          printInstallationMassage( clientDeviseYear,  clientOs);

        // задание 3
        int deliveryDistance = 95;
        calculateTheTime (deliveryDistance);








}




}



