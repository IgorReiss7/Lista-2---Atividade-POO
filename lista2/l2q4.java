import java.util.Scanner;
public class l2q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a nota final do aluno: ");
        float notafinal = input.nextFloat();
        if (notafinal>6){
            System.out.println("Sua nota final foi "+notafinal+" você está aprovado, parabéns!");
        }
        else{
            System.out.println("Sua nota final foi "+notafinal+" você está reprovado");
        }
            input.close();
    }
}
