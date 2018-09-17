package Trunfo;

import java.util.Collections;

public class Jogo{
    Baralho baralho;
    Jogador jogador;
    JogadorBot bot;

    public Jogo(Baralho baralho, Jogador jogador, JogadorBot bot) {
        this.baralho = baralho;
        this.jogador = jogador;
        this.bot = bot;
		Collections.shuffle(this.baralho.cartas);
        distribuirCartas();
    }

    void distribuirCartas(){
    	int i;
    	for(i=0;i<16;i++) {
    		jogador.monte.add(baralho.cartas.get(i));
    	}
    	for(i=16;i<32;i++) {
    		bot.monte.add(baralho.cartas.get(i));
    	} 
    }    
    
    void iniciarRodada(){
        jogador.comprarCarta();
        bot.comprarCarta();
    }

    void empate() {
    	System.out.println("Empate! Escolha outra caracteristica:");
    }
    
    int compararCaracteristicas(Jogador j){
    	int result = 0;
        int i;

        i = j.escolherCaracteristica();
			System.out.println("Caracteristica Escolhida: " + i +"\n");
       
        switch (i) {
			case 1:
				if (bot.mao.paginas == jogador.mao.paginas) {
					compararCaracteristicas(j);      //Empate
				} else {
					if (bot.mao.paginas > jogador.mao.paginas) {
						result = 1;    //Bot Vence
						return result;
					} else {
						result = 2;    //Jogador Vence
						return result;
					}
				}

			case 2:
				if (bot.mao.preco == jogador.mao.preco) {
					compararCaracteristicas(j);        //Empate
				} else {
					if (bot.mao.preco > jogador.mao.preco) {
						result = 1;    //Bot Vence
						return result;
					} else {
						result = 2;    //Jogador Vence
						return result;
					}
				}
			case 3:
				if (bot.mao.capitulos == jogador.mao.capitulos) {
					compararCaracteristicas(j);        //Empate
				} else {
					if (bot.mao.capitulos > jogador.mao.capitulos) {
						result = 1;    //Bot Vence
						return result;
					} else {
						result = 2;    //Jogador Vence
						return result;
					}
				}
			case 4:
				if (bot.mao.copiasVendidas == jogador.mao.copiasVendidas) {
					compararCaracteristicas(j);         //Empate
				} else {
					if (bot.mao.copiasVendidas > jogador.mao.copiasVendidas) {
						result = 1;    //Bot Vence
						return result;
					} else {
						result = 2;    //Jogador Vence
						return result;
					}
				}
			default:
				System.out.println("Opcao invalida: " + i);
				compararCaracteristicas(j);
		}

		return result;
    }
    
    void entregaVencedor(int i){
    	if(i==1) {
    		bot.receberMao(jogador.entregarMao());
			System.out.println("Bot venceu!\n");
			jogador.setVez(false);
			bot.setVez(true);
    	}else {
    		jogador.receberMao(bot.entregarMao());
			System.out.println("Jogador venceu!\n");
			jogador.setVez(true);
			bot.setVez(false);
    	}
    }  
}
