import java.util.Scanner;
public class l2q10 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite um número de 1 a 7 para dizermos o dia da semana: ");
    int dia = input.nextInt();
    switch (dia) {
        case 1:
        System.out.println("Digito 1 = Segunda-feira");
        break;
        case 2:
        System.out.println("Digito 2 = Terça-feira ");
        break;
        case(3):
        System.out.println("Digito 3 = Quarta-feira");
        break;
        case(4):
        System.out.println("Digito 4 = Quinta-feira");
        break;
        case(5):
        System.out.println("Digito 5 = Sexta-feira");
        break;
        case(6):
        System.out.println("Digito 6 = Sábado");
        break;
        case (7):
        System.out.println("Digito 7 = Domingo");
        break;
        default:
        System.out.println("Digito inválido, tente novamente");        
        break;
    }
    input.close();
}
}
