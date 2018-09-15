package Trunfo;

public class Jogo{
    Baralho baralho;
    Jogador jogador;
    JogadorBot bot;

    public Jogo(Baralho baralho, Jogador jogador, JogadorBot bot) {
        this.baralho = baralho;
        this.jogador = jogador;
        this.bot = bot;
    }

    void distribuirCartas(){
    	int i;
    	for(i=0;i<12;i++) {
    		jogador.monte.add(baralho.cartas.get(i));
    	}
    	for(i=12;i<32;i++) {
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
    
    int compararCaracteristicas(){
    	int result = 0;
        int i;
        int r;
        int repet=0;
        
        do {
        
        if(repet >0) {
           	empate();
        }
        
        i= jogador.escolherCaracteristica();
       
        switch(i){
        case 1: 
        	if(bot.mao.paginas == jogador.mao.paginas) {
        		result=0; 		//Empate
        	}else{
        		if(bot.mao.paginas > jogador.mao.paginas){
        			result=1;	//Bot Vence
        		}else{
        			result=2; 	//Jogador Vence
        		}
        	}
        case 2:
        	if(bot.mao.preco == jogador.mao.preco) {
        		result=0; 		//Empate
        	}else{
        		if(bot.mao.preco> jogador.mao.preco){
        			result=1;	//Bot Vence
          	  	}else{
          	  		result=2; 	//Jogador Vence
          	    }
        	}	
        case 3:
            if(bot.mao.capitulos == jogador.mao.capitulos) {
            	result=0; 		//Empate
            }else{
          	  	if(bot.mao.capitulos > jogador.mao.capitulos){
          	  		result=1;	//Bot Vence
            	}else{
            		result=2; 	//Jogador Vence
            	}
             }	
        case 4:
             if(bot.mao.copiasVendidas == jogador.mao.copiasVendidas) {
            	 result=0; 		//Empate
             }else {
            	 if(bot.mao.copiasVendidas> jogador.mao.copiasVendidas){
            		 result=1;	//Bot Vence
             	 }else{
             		result=2; 	//Jogador Vence
             	 }
              }	
        	}        
        repet++;
        return result;
        
        
        } while (result==0 && ) ; //Executa enquando der empate
    }
    
    void entregaVencedor(){
    	int i;
    	i=compararCaracteristicas();
    	if(i==1) {
    		bot.receberMao(jogador.entregarMao());
    	}else {
    		jogador.receberMao(bot.entregarMao());
    		
    	}
    }  
}
