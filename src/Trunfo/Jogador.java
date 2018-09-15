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
    	System.out.println("T�tulo:"+this.mao.nome);
    	System.out.println("Capitulos:"+this.mao.capitulos);
    	System.out.println("C�pias Vendidas:"+this.mao.copiasVendidas);
    	System.out.println("P�ginas:"+this.mao.paginas);
    	System.out.println("Pre�o:"+this.mao.preco);  	
    }
    
    int escolherCaracteristica(){
        System.out.println("Digite o número correspondente a característica que deseja utilizar: \n1 - Paginas\n2 - Preço\n3 - Capítulos\n4 - Cópias Vendidas\n");
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
