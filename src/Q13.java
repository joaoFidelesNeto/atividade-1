//Atribua um valor a uma variável e verifique se o número está entre 0 e 10.
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = scanner.nextInt();

        if(num > 0 && num < 10){
            System.out.println("o número está entre 0 e 10");
        }else{
            System.out.println(" o número não está entre 0 e 10");
        }

    }
}
