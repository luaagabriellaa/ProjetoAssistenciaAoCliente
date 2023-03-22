package Cliente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente usuario = new Cliente(0, null, null, null, null);
        int start = 0;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Cancelar Pedido");
            System.out.println("2. Recadastrar endereço pedido");
            System.out.println("3. Pedido errado");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            start = sc.nextInt();
            sc.nextLine(); 
            
            switch (start) {
                case 1:
                	usuario.preencherDados();
                    System.out.println("Pedido Cancelado"");
                    break;
                case 2: 
                	usuario.exibirDados();
                	System.out.println("Digite os novos dados do endereço do pedido:");
                	 usuario.preencherDados();
                     System.out.println("Dados do endereço atualizados com sucesso!");
                    break;
                case 3:
                	usuario.exibirDados();
                    System.out.println("O pedido foi enviado para :");
                    break;
                case 4:
                    System.out.println("Encerrando a assistencia ...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (start != 4);
        sc.close();
    }
}