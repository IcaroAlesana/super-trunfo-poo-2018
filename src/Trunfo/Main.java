package Trunfo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Baralho b = new Baralho();
        
        //Inicializa Jogadores
        JogadorBot r = new JogadorBot();
        Jogador j = new Jogador();
        j.setVez(true);

        //Inicializa Jogo
        Jogo g = new Jogo(b , j, r);
 

        int i;
        int continua=1;
        while (r.monte != null && j.monte != null && continua !=0) {
            
        	g.iniciarRodada();       
           
            j.mostraCarta();
            //r.mostraCarta(); //Teste para verificar se o resultado está certo
             
            if (j.vez == true) {
                i = g.compararCaracteristicas(j);
            } else {
                i = g.compararCaracteristicas(r);
            }
            g.entregaVencedor(i);
            
            int restantes = j.monte.size();
            System.out.println("Cartas restantes: "+restantes);
            continua = g.continuar();
        }
        
        if (r.monte == null) {
            System.out.println("\n\nO vencedor é o jogador!!!");
        } else {
        	if(j.monte == null) {
        		System.out.println("\n\nO vencedor é o computador!!!");
        	}else {
        		System.out.println("Desistência");
        	}
            
        }


    }
}
 
