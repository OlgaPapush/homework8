public class Main {
    public static void main(String[] args) {

        // задание 1
        public class YearParam {
            static int YearCheck(int year) {

                if ((year % 4 == 0) && year % 100 != 0) {
                    System.out.println(year + " високосный год");
                } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                    System.out.println(year + " викокосный год");
                } else {
                    System.out.println(year + " не високосный год");
                }
                return year;
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите год:");
                int yearNumb = scanner.nextInt();
                YearCheck(yearNumb);
            }
             // задание 2

            public class newOS {
            static void OSCheck (int ClientOS, int clientDeviceYear)
            {
            int year = LocalDate.now (). getYear();
            if (clientDeviceYear <= year){
            System.out.println (" Установите облегченную версию приложения для IOS по ссылке");
            break;
            }
                case 1:
                    if (clientDeviceYear <= year){
                        System.out.println( " становите облегченную версию для Android по ссылке");
                        break;
                    }
                default:
                    System.out.println("Установите версию приложения по ссылке");
            }

            }
            //задание 3
            public class newDelivery {
                static void deliveryTime(int deliveryDistance)
                {
                    int DeliveryTime;

                    if (deliveryDistance <= 20)
                    {
                        DeliveryTime = 1;
                        System.out.println("Потребуется дней: " + DeliveryTime);
                    }
                    else if ((deliveryDistance >= 20) && (deliveryDistance <= 60))
                    {
                        DeliveryTime = 2;
                        System.out.println("Потребуется дней: " + DeliveryTime);
                    }
                    else
                    {
                        DeliveryTime = 3;
                        System.out.println("Потребуется дней: " + DeliveryTime);
                    }
                }
                public static void main (String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Введите расстояние:");
                    int deliveryDist = scanner.nextInt();
                    deliveryTime(deliveryDist);
                }
            }
        }
        }
    }