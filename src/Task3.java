public class Task3
{
    public static void main(String[] args)
    {
        //Задание №2
        System.out.println ("Ответ на задание №3:");
        int year = 2022;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println (year + " год является високосным годом\n");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println (year + " год является високосным годом\n");
        } else if (year % 100 == 0) {
            System.out.println (year + " год НЕ является високосным годом\n");
        } else {
            System.out.println (year + " год НЕ является високосным годом\n");
        }
    }
}