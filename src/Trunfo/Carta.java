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

        System.out.println("Nome: " +this.nome + "\n" + "Nº de páginas: " + this.paginas + "\n" + "Preço: " + this.preco + "\n" + "Nº de Capítulos: " + this.capitulos + "\n" + "Cópias vendidas: " + this.copiasVendidas + "\n" + "Código: " + this.codigo + "\n\n");
    }
}
