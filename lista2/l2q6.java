import java.util.Scanner;
public class l2q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();
        if (idade<=12){
            System.out.println("Sua idade é "+idade+", você é criança");
        }
        else if (idade>12 && idade <=17){ /*o && é o "and" */
            System.out.println("Sua idade é "+idade+", você é adolescente");
        }
        else if (idade >=18 && idade <=59){
            System.out.println("Sua idade é "+idade+", você é adulto");
        }
        else{
            System.out.println("Sua idade é "+idade+", você é idoso");
        }
        input.close();
    }
}
