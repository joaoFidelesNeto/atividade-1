import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        double nota = scanner.nextDouble();
        System.out.println("Digite sua segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite sua terceira nota:");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite sua quarta nota:");
        double nota4 = scanner.nextDouble();

        double media = (nota + nota2 + nota3 + nota4) / 4;
        System.out.println("sua media é "+media);
    }
}
