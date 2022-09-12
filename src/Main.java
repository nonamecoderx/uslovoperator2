import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int year = 2024;
        boolean hiYear = (year % 4) == 0 || (year % 100) == 0;
        if (hiYear) {
            System.out.println("Год високосный");
        } else {System.out.println("Год не високосный");
        }
        }
        }

