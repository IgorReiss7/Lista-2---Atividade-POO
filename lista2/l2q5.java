import java.util.Scanner;
public class l2q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número ");
        float n1 = input.nextFloat();
        System.out.print("Digite mais um número ");
        float n2 = input.nextFloat();
        if (n1>n2){
            System.out.println(n1 +" é maior que "+ n2);
        }
        else{
            System.out.println(n2 + " é maior que "+ n1);
        }
            input.close();
    }
}
