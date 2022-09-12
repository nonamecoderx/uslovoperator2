import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int date = 2008;
        int clientOS = 1;
        if (clientOS == 0 && date >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && date < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && date >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && date < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    }
