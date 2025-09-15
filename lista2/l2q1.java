import java.util.Scanner;

public class l2q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade");
        }

        if (idade >= 18) {
            System.out.println("Maior de idade");
        }

        input.close();
    }
}
