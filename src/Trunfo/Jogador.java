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
    	System.out.println("TÌtulo:"+this.mao.nome);
    	System.out.println("Capitulos:"+this.mao.capitulos);
    	System.out.println("CÛpias Vendidas:"+this.mao.copiasVendidas);
    	System.out.println("P·ginas:"+this.mao.paginas);
    	System.out.println("PreÁo:"+this.mao.preco);  	
    }
    
    int escolherCaracteristica(){
        System.out.println("Digite o n√∫mero correspondente a caracter√≠stica que deseja utilizar: \n1 - Paginas\n2 - Pre√ßo\n3 - Cap√≠tulos\n4 - C√≥pias Vendidas\n");
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
