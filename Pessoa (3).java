// Pessoa.java
public class Pessoa {
    private String nome;
    private int idade;
    
    /* Omitido o construtor da classe Pessoa. 
    Instanciação pelo construtor padrão implícito:
    nome com null e idade com 0 */
    
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