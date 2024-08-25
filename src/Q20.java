import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("quanto voce ganha por hora?");
        int hora = scanner.nextInt();
        System.out.println("quantas horas vc trabalha por dia?");
        int dia = scanner.nextInt();

        double salarioBruto = hora * dia * 30;
        salarioBruto = salarioBruto * 1.1;
        salarioBruto = salarioBruto * 0.8;
        salarioBruto = salarioBruto * 0.5;

        System.out.println("Seu salario liquido é " + salarioBruto);

    }
}
