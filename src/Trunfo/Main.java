package Trunfo;

public class Main {

    public static void main(String[] args) {

        Baralho b = new Baralho();
        
        //Inicializa Jogadores
        JogadorBot r = new JogadorBot();
        Jogador j = new Jogador();
        
        //Distribuição de cartas
        Jogo g = new Jogo(b , j, r);
        g.distribuirCartas();
          
        //Mostra o baralho
        int i;
        System.out.println("Seu Baralho:");
        for (i=0;i<12;i++) {
        	System.out.println("Carta: "+j.monte.get(i).nome);
        }        
        	System.out.println(" ");
        	System.out.println(" ");
        	System.out.println(" ");
        do {
        	j.comprarCarta();
        	r.comprarCarta();
        	j.mostraCarta();
        	g.entregaVencedor();
        }while(j.monte.isEmpty() || r.monte.isEmpty());
    }
}
 