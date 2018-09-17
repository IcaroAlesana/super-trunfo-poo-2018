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
        Carta c =  monte.get(0);
        monte.remove(0);
        this.mao = c;
    }

    void mostraBaralho() {
    int i;
  		System.out.println("");
    	System.out.println("---------------");
      	System.out.println("");
    	System.out.println("Seu Baralho:");
        System.out.println(" ");
        for (i=0;i<this.monte.size();i++) {
        	System.out.println("Carta "+ i+": "+monte.get(i).nome);
        }
    }

    void mostraCarta() {
  		System.out.println("");
    	System.out.println("---------------");
      	System.out.println("");
    	System.out.println("A carta comprada tem as seguintes caracteristicas:");
    	System.out.println("");
    	System.out.println("Título:          "+this.mao.nome);
       	System.out.println("Páginas:         "+this.mao.paginas);
       	System.out.println("Preço:           "+this.mao.preco);  
    	System.out.println("Capitulos:       "+this.mao.capitulos);
    	System.out.println("Cópias Vendidas: "+this.mao.copiasVendidas);
    	System.out.println("Código:          "+this.mao.codigo);
    }
    
    int escolherCaracteristica(){ 
      	System.out.println("");
    	System.out.println("---------------");
      	System.out.println("");
        System.out.println("Digite o nÃºmero correspondente a caracterÃ­stica que deseja utilizar:");
        System.out.println("");
        System.out.println("1 - Paginas \n2 - PreÃ§o\n3 - CapÃ­tulos\n4 - CÃ³pias Vendidas\n");
        Scanner s = new Scanner(System.in);
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
