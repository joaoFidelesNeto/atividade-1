import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = scanner.nextInt();

        if(num % 7 == 0){
            System.out.println("Esse numero é multiplo de 7.");
        }else{
            System.out.println("Esse numero não multiplo de 7.");
        }

    }
}
