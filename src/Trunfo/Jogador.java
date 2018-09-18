package Trunfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
    ArrayList<Carta> monte;
    Carta mao;
	private Scanner s;
	private Scanner enter;
	boolean vez;

    public Jogador(){
        this.monte = new ArrayList<Carta>();
        this.vez = false;
    }

   void comprarCarta() {
        Carta c = monte.get(0);
        this.mao = c;
        monte.remove(0);
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
    	System.out.println("A carta comprada tem as seguintes caracteristicas:");
        System.out.println("");
    	mao.imprimeCarta();
    }
    
    int escolherCaracteristica(){
        System.out.println("Digite o número correspondente a característica que deseja utilizar: \n1 - Páginas\n2 - Preço\n3 - Capítulos\n4 - Cópias Vendidas\n");
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

    void setVez(boolean b){
        this.vez = b;
    }
}


