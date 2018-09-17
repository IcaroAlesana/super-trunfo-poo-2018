package Trunfo;

public class Carta {
    String nome;
    int preco;
    int paginas;
    int capitulos;
    int copiasVendidas;
    String codigo;
    
    
    public Carta(String nome, int preco, int paginas, int capitulos, int copiasVendidas, String codigo){
        this.nome = nome;
        this.preco = preco;
        this.paginas = paginas;
        this.capitulos = capitulos;
        this.copiasVendidas = copiasVendidas;
        this.codigo = codigo;
    }

    public void imprimeCarta(){

        System.out.println("Nome: " +this.nome + "\n" + "Pre�o: " + this.preco + "\n" + "N� de P�ginas: " + this.paginas + "\n" + "N� de Cap�tulos: " + this.capitulos + "\n" + "C�pias vendidas: " + this.copiasVendidas + "\n" + "C�digo: " + this.codigo + "\n\n");
    }
}
