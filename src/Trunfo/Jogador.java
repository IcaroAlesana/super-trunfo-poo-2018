package Trunfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
    ArrayList<Carta> monte;
    Carta mao;
	private Scanner s;
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

    void mostraCarta() {
    	System.out.println("A carta comprada tem as seguintes caracteristicas:");
    	mao.imprimeCarta();
    }
    
    int escolherCaracteristica(){
        System.out.println("Digite o n�mero correspondente a caracter�stica que deseja utilizar: \n1 - P�ginas\n2 - Pre�o\n3 - Cap�tulos\n4 - C�pias Vendidas\n");
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


