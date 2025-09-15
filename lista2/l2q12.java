import java.util.Scanner;
public class l2q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
         String resultado = (num>= 0) ? "Positivo" : "Negativo";

        System.out.println("O número é: " + resultado);
        input.close();
    }
}
