import java.util.Scanner;
public class l2q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Digite o lado 1: ");
        int lado1 = input.nextInt();

        System.out.print("Digite o lado 2: ");
        int lado2 = input.nextInt();

        System.out.print("Digite o lado 3: ");
        int lado3 = input.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero (3 lados iguais)");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo Isósceles (2 lados iguais)");
    } else {
            System.out.println("Triângulo Escaleno (3 lados diferentes)");
    }

        input.close();
    }
}
