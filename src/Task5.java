public class Task5 {
    public static void main(String[] args) {
        //Задание №5. Вариант 1
            /*System.out.println ("Ответ на задание №5:");
        int monthNumber = 8;
                switch (monthNumber) {
            case 1:
                System.out.println("Январь. Зима");
                break;
            case 2:
                System.out.println("Февраль. Зима");
                break;
            case 3:
                System.out.println("Март. Весна");
                break;
            case 4:
                System.out.println("Апрель. Весна");
                break;
            case 5:
                System.out.println("Май. Весна");
                break;
            case 6:
                System.out.println("Июнь. Лето");
                break;
            case 7:
                System.out.println("Июль. Лето");
                break;
            case 8:
                System.out.println("Август. Лето");
                break;
            case 9:
                System.out.println("Сентябрь. Осень");
                break;
            case 10:
                System.out.println("Октябрь. Осень");
                break;
            case 11:
                System.out.println("Ноябрь. Осень");
                break;
            case 12:
                System.out.println("Декабрь. Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");*/
        //Задание №5. Вариант 2
        System.out.println("Ответ на задание №5:");
        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}