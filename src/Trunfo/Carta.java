package Trunfo;

public class Carta {
    String nome;
    int paginas;
    int preco;
    int capitulos;
    int copiasVendidas;
    
    
    public Carta(String nome, int paginas, int preco, int capitulos, int copiasVendidas){
        this.nome = nome;
        this.paginas = paginas;
        this.preco = preco;
        this.capitulos = capitulos;
        this.copiasVendidas = copiasVendidas;
    }
}
