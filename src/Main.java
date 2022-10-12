import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Time time = new Time();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Веедите колличество текущих часов: " );
        String hours = scanner.nextLine();
        System.out.println("Веедите колличество текущих минут: ");
        String min = scanner.nextLine();

        int h = Integer.parseInt(hours);
        int m = Integer.parseInt(min);

        System.out.println("Суммарное колличество секунд до конца дня: " + time.restSeconds(h, m));




    }
}