import java.util.Scanner;
public class l2q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a nota do aluno ");
        float nota = input.nextFloat();
         if (nota>=9){
            System.out.println("Conceito A");
        } else if (nota >= 7) {
            System.out.println("Conceito B");
        } else if (nota >= 5) {
            System.out.println("Conceito C");
        } else if (nota >= 3) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }
input.close();
    }
}
