import java.util.Scanner;
public class l2q3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite um número para verificar se é par ou impar: ");
    int parouimpar = input.nextInt();
    if (parouimpar%2==0) {
        System.out.println("O número "+parouimpar+" é par");
    }    
    else {
        System.out.println("O número "+parouimpar+" é impar");
    }
    input.close();
    }
}
