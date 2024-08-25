import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = scanner.nextInt();

        if (num % 3 == 0) {
            System.out.println("Esse numero é multiplo de 3.");
        } else {
            System.out.println("Esse numero não é multiplo de 3");
        }

    }
}