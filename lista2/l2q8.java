import java.util.Scanner;
public class l2q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int v1 = input.nextInt();
        System.out.print("Digite um segundo valor: ");
        int v2= input.nextInt();
        System.out.print("Digite um terceiro valor: ");
        int v3 = input.nextInt();
        if (v1>=v2 && v1>=v3){
            System.out.println("O valor "+v1+ " é o maior valor");
        }
        else if (v2>=v1 && v2>=v3){
            System.out.println("O valor "+v2+ " é o maior valor");

        }
        else{
            System.out.println("O valor "+v3+ " é o maior valor");
        }
        input.close();
    }
}
