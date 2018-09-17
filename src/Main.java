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
      
        j.mostraBaralho();
        
        g.venc = 1;
        	
       do {
        	j.comprarCarta();
        	r.comprarCarta();
        	j.mostraCarta();
        	r.mostraCarta();
            g.compararCaracteristicas();
            //System.out.println("Carta:"+g.testeSuperTrunfo());
            g.entregaVencedor();       
       }while(j.monte.isEmpty() != true && r.monte.isEmpty() != true);
       
    }
    
}
 
