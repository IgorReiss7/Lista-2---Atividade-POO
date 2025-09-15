import java.util.Scanner;
public class l2q13 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite sua idade: ");
    int idade = input.nextInt();
    String resultado = (idade>=18) ? "maior de idade" : "menor de idade";
    System.out.println("Sua idade é "+idade+", você é "+resultado);
input.close();    
 }
}
