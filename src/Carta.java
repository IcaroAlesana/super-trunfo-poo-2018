package Trunfo;

public class Carta {
    String nome;
    int paginas;
    int preco;
    int capitulos;
    int copiasVendidas;
    String codigo;
    
    public Carta(String nome, int paginas, int preco, int capitulos, int copiasVendidas, String codigo){
        this.nome = nome;
        this.paginas = paginas;
        this.preco = preco;
        this.capitulos = capitulos;
        this.copiasVendidas = copiasVendidas;
        this.codigo = codigo;
    }
}
