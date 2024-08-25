import java.util.Scanner;

public class Q14e15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Esse numero é par");
        } else {
            System.out.println("Esse numero é impar");
        }
    }
}