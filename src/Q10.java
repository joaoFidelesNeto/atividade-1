public class Q10 {
    public static void main(String[] args) {

        double saldo =  500.50;
        System.out.println("saldo inicial: " + saldo);

        saldo = saldo +  300.25;
        System.out.println("saldo com o acrescimo de 300.25: " + saldo);

        double retirada = 150.75;
        System.out.println("Valor retirado: " + retirada);

        saldo = saldo - retirada;
        System.out.println("Novo saldo:"+saldo);

    }
}
