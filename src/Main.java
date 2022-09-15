import java.time.LocalDate;
class Homework{

public class Main {
    private static int year;

    public static void main(String[] args) {


        // задание 1

        theDeterminantOfTheYear(year = 2020);
    }

    private static void theDeterminantOfTheYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)) {
            System.out.println(" Високосный год");
        } else {
            System.out.println(" Не високосный год");
        }
        // задание 2


        private static void printInstallationMassage( int devise,int clientDeviceYear);{
            String stringForOutput = " ";
            if ( clientDeviceYear >= 2015) {
                stringForOutput = "Установите  облегченную версию  по ссылке";
            } else {
                stringForOutput =" Установите   версию по ссылке";
                if (devise == 1 ) {
                    stringForOutput = "Установите  версию на Android по ссылке";
                } else {
                    stringForOutput = " Установите   версию   на iOs по ссылке";
                }
            }

        }
// задание 3
        public static int deliveryTime ( int [] deliveryDistance); {
        if (deliveryDistance = 20);
        System.out.println ( " Время доставки составляет" + deliveryTime + " день") ;
         return 1;
        }

        { if (( deliveryDistance >= 20) && (deliveryDistance <=60 ));
                    System.out.println ( " Время доставки составляет" + deliveryTime + " дня") ;
        return 2;
        }

        {if (( deliveryDistance >= 60 ) && ( deliveryDistance <=100));
         System.out.println ( " Время доставки составляет" + deliveryTime + " дня") ;
        return 3;
        }






        }

    }



}



