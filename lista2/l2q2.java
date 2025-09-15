import java.util.Scanner;
public class l2q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura atual (em Celsius): ");
        Float temperatura = input.nextFloat();
        if (temperatura > 30)
        System.out.print("Está calor");{
        };
        if (temperatura<=30){
        System.out.print("Está uma temperatura agradável");
        }
        input.close();
    }
}
