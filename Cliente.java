public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Cliente(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
}

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return produto.getPreco() * quantidade;
    }
}

public class Produto {
    private String nome;
    private String descricao;
    private double preco;

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}

public class Chatbot {
    private String nome;
    private String[] respostas;

    public Chatbot(String nome, String[] respostas) {
        this.nome = nome;
        this.respostas = respostas;
    }

    public String getResposta() {
        Random rand = new Random();
        int index = rand.nextInt(respostas.length);
        return respostas[index];
    }
}

public class Atendente {
    private String nome;
    private String telefone;
    private String email;

    public Atendente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void atenderPedido(Pedido pedido) {
        // lógica de atendimento ao pedido
    }
}
public void preencherDadosdoPedido() {
    
	  Scanner scEntrada = new Scanner(System.in);
	  
	  System.out.println("Digite o nome do cliente: ");	     
	  this.nome = scEntrada.nextLine();
	      
	  System.out.println("Digite o e-mail do cliente: ");	     
	  this.email = scEntrada.nextLine();
	     
	  System.out.println("Digite o ID do pedido: ");	     
	  this.id = scEntrada.nextInt();
	     
	  scEntrada.nextLine(); 
	     
	  System.out.println("Digite o endereço do cliente: ");	     
	  this.endereco = scEntrada.nextLine();
	     
	  System.out.println("Digite o telefone do cliente: ");	     
	  this.telefone = scEntrada.nextLine();
	     
	  scEntrada.close(); 
}
public void exibirDados() {
    System.out.println("Nome: " + this.nome);
    System.out.println("E-mail: " + this.email);
    System.out.println("Endereço: " + this.endereco);
    System.out.println("Telefone: " + this.telefone);
}
public class SistemaDeAjudaAoCliente {
    public static void main(String[] args) {
        // Criação do cliente
        Cliente cliente = new Cliente("Rafael", "Rua 4, 123", "55612-000", "joao@example.com");

        // Criação do produto
        Produto produto = new Produto("Camiseta", "Camiseta Branca", 50.00);

        // Criação do pedido
        Pedido pedido = new Pedido(cliente, produto, 2);

        // Cálculo do valor total do pedido
        double valorTotal = pedido.calcularValorTotal();

        // Criação do chatbot
        Chatbot chatbot = new Chatbot("Chatbot de Ajuda", new String[] {"O que você precisa de ajuda?", "Em que posso ajudar?"});

        // Exibição de mensagem de boas-vindas
        System.out.println("Bem-vindo ao sistema de ajuda ao cliente!");

        // Exibição de mensagem do chatbot
        System.out.println(chatbot.getResposta());

        // Criação do atendente
        Atendente atendente = new Atendente("Maria", "987654321", "maria@example.com");

        // Atendimento do pedido pelo atendente
        atendente.atenderPedido(pedido);

        // Exibição de mensagem de encerramento
        System.out.println("Obrigado por utilizar o nosso sistema de ajuda ao cliente!");
    }
}


