// Pessoa.java
public class Pessoa {
    private String nome;
    private int idade;
    
    /* Construtor não padrão.
    Instanciação pelo construtor não padrão: 
    nome e idade com os parâmetros recebidos */
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public String getNome() {
        return this.nome;
    }
}

// Principal.java (PRECISA SER AJUSTADO)
public class Principal {
    public static void main(String[] args) {
        // Agora precisa passar parâmetros no construtor
        Pessoa p = new Pessoa("Maria", 18);
        System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade());
    }
}