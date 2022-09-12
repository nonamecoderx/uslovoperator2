import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
      int deliveryDistance = 95;
      int zoneOne = 20;
      int zoneTwo = 60;
      int zoneThree = 100;
      boolean dayThree = (deliveryDistance < zoneThree && deliveryDistance > zoneTwo);
      boolean dayTwo = (deliveryDistance > zoneOne && deliveryDistance < zoneTwo);
      boolean dayOne = (deliveryDistance < zoneOne);
      boolean dayMore = (deliveryDistance > zoneThree);
      if (dayThree) {
          System.out.println("Потребуется дней: 3");
      } else if (dayTwo) {
              System.out.println("Потребуется дней: 2");
          } else if (dayOne) {
          System.out.println("Потребуется дней: 1");
      } else if (dayMore) {
          System.out.println("Доставка от 3 дней");
      }
      }
}