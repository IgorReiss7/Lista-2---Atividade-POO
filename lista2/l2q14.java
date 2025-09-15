import java.util.Scanner;
public class l2q14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite a nota final do aluno: ");
    float nota = input.nextFloat();
    if (nota >10 || nota <0){ /*o || é o "or" em java  */
        System.out.println("Nota inválida, digite novamente");
    }
    else{
    String resultado = (nota>=6) ? "aprovado" : "reprovado";
    
    System.out.println("Sua nota final foi "+nota+", você está "+resultado);
    }
    input.close();
    }
}
