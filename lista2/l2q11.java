import java.util.Scanner;
public class l2q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = input.next().charAt(0);
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("É uma vogal");
            break;
            default:
            System.out.println("Não é vogal");
            break;   
    }
input.close();
}
}
  