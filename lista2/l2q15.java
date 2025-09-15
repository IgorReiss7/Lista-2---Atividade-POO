import java.util.Scanner;
public class l2q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor total de uma compra: ");
        double valorcompra = input.nextDouble();
        if (valorcompra>100){
            double valor_final = valorcompra - (valorcompra/10);
            System.out.printf("O valor total das compras com desconto ficou: %.2f%n", valor_final); /* pra usar o 2f precisa por printf e printf é virhula */
        }
        else{
            System.out.printf("O valor total da sua compra ficou: %.2f%n ",valorcompra);
        }
    input.close();
    }
}
