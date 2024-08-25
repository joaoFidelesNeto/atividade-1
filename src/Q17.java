import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = scanner.nextInt();

        if(num % 5 == 0){
            System.out.println("Esse numero é multiplo de 5.");
        }else{
            System.out.println("Esse numero não multiplo de 5.");
        }

    }
}


