package Trunfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
    ArrayList<Carta> monte;
    Carta mao;
	private Scanner s;

    public Jogador(){
        this.monte = new ArrayList<Carta>();
    }

    void comprarCarta() {
        Carta c = monte.get(0);
        this.mao = c;
    }

    void mostraCarta() {
    	System.out.println("A carta comprada tem as seguintes caracteristicas:");
    	System.out.println("Título:"+this.mao.nome);
    	System.out.println("Capitulos:"+this.mao.capitulos);
    	System.out.println("Cópias Vendidas:"+this.mao.copiasVendidas);
    	System.out.println("Páginas:"+this.mao.paginas);
    	System.out.println("Preço:"+this.mao.preco);  	
    }
    
    int escolherCaracteristica(){
        System.out.println("Digite o nÃºmero correspondente a caracterÃ­stica que deseja utilizar: \n1 - Paginas\n2 - PreÃ§o\n3 - CapÃ­tulos\n4 - CÃ³pias Vendidas\n");
        s = new Scanner(System.in);
        //Scanner s = new Scanner(System.in);
        int escolha = s.nextInt();
        return escolha;
    }

    
    Carta entregarMao(){
        Carta c = this.mao;
        this.mao = null;
        return c;
    }

    void receberMao(Carta cartaOponente) {
        this.monte.add(this.mao);
        this.mao = null;
        this.monte.add(cartaOponente);
    }
}
