public class Task4 {
    public static void main(String[] args) {
        //Задание №4
        /*System.out.println ("Ответ на задание №4:");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int deliveryStartInterval = 20;
        int deliveryInterval = 40;
        if (deliveryDistance <= deliveryStartInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int)Math.ceil((deliveryDistance - deliveryStartInterval) / (double)deliveryInterval);
        }
        System.out.println ("Потребуется для доставки дней: " + deliveryDays);*/

        System.out.println("Ответ на задание №4:");
        int start = 20;
        int step = 40;
        int distance = 95;
        int result; //кол во дней
        if (distance < start) {
            result = 1;
        } else {
            result = (Math.abs((distance - start) / step) + 2);
        }
        System.out.println("Потребуется для доставки дней: " + result);
    }
}