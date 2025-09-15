import java.util.Scanner;
public class l2q9 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("===== MENU =====");
        System.out.println("--".repeat(20));
        System.out.println("1 – Cadastrar usuário");
        System.out.println("2 – Listar usuários");
        System.out.println("3 – Excluir usuário");
        System.out.println("4 – Sair");
        System.out.print("Escolha uma opção: ");
        int opção = input.nextInt();
        switch (opção) {
            case 1:
                System.out.print("Opção escolhida -> Cadastrar usuário");
                break;
            case 2:
                System.out.print("Opção escolhida -> Listar usuário");
                break;
            case 3:
                System.out.print("Opção escolhida -> Excluir usuário");
                    break;
            case 4:
                System.out.print("Encerrando...");
                break;
            default:
                  System.out.print("Opção inválida");
                break;
        }
    input.close();
    }
}
