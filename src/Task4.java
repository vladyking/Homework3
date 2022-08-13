public class Task4
{
    public static void main(String[] args)
    {
        //Задание №4
        System.out.println ("Ответ на задание №4:");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int deliveryStartInterval = 20;
        int deliveryInterval = 40;
        if (deliveryDistance <= deliveryStartInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int)Math.ceil((deliveryDistance - deliveryStartInterval) / (double)deliveryInterval);
        }
        System.out.println ("Потребуется для доставки дней: " + deliveryDays);
    }
}