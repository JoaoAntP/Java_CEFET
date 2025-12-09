// Pessoa.java
public class Pessoa {
    private String nome;
    private int idade;
    
    /* Construtor padrão explícito.
    Funciona exatamente igual ao exemplo onde não existe um construtor,
    ou seja, o construtor padrão está implícito.
    Instanciação pelo construtor padrão: nome com null e idade com 0 */
    
    public Pessoa() {
        // Construtor vazio - valores padrão
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    // Adicionando setters para funcionar
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

// Principal.java (COM ERRO - corrigido)
public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade()); // Será null e 0
    }
}