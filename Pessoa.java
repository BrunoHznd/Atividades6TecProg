package fatec.pg.Model;

import java.util.Scanner;

public class Pessoa {


	private String nome;
	private int idade;
	private Endereco endereco;
	
	
    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    public String getDados() {
    	
    	return "A pessoa: " + nome + " Que tem " + idade + " anos e mora no endereco e numero da casa é: " + endereco.getEndereco();
    	
    	
    }
    
    public static Pessoa informacoesDaPessoa() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Digite o seu nome");
    	String nome = scanner.nextLine();
    	
    	System.out.println("Digite a sua idade");
    	int idade = scanner.nextInt();
    	
    	System.out.println("Digite o seu endereco");
    	String endereco = scanner.nextLine();
    	
    	System.out.println("Digite o numero");
    	int numero = scanner.nextInt();
    	
    	Endereco enderecoPessoa = new Endereco(endereco, numero);
    	
    	 return new Pessoa(nome, idade, enderecoPessoa);
		
		
	}

}
