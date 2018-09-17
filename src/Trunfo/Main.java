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
        while (r.monte != null && j.monte != null) {
            g.iniciarRodada();

            j.mao.imprimeCarta();
            r.mao.imprimeCarta();
            if (j.vez == true) {
                i = g.compararCaracteristicas(j);
            } else {
                i = g.compararCaracteristicas(r);
            }
            g.entregaVencedor(i);

            int restantes = j.monte.size();
            System.out.println("Restantes do jogador: " + restantes + "\n");
            restantes = r.monte.size();
            System.out.println("Restantes do computador: " + restantes + "\n");
        }

        if (r.monte == null) {
            System.out.println("\n\nO vencedor é o jogador!!!");
        } else {
            System.out.println("\n\nO vencedor é o computador!!!");
        }


    }
}
 