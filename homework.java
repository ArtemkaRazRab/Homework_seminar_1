import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        Scanner n = new Scanner(System.in);
        n.hasNextInt();
        int i = n.nextInt();
        System.out.println(Math.abs(0.5 * i * (i + 1)));
        iScanner.close();
    }
}
