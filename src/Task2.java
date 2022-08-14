public class Task2 {
    public static void main(String[] args) {
        //Задание №2
        System.out.println("Ответ на задание №2:");
        int clientOS = 1; //0 - iOS, 1- Android
        int clientDeviceYear = 2018; //clientDeviceYear >= 2015 - new smartfone

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        }
    }
}