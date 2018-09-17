package Trunfo;

public class Jogo{
    Baralho baralho;
    Jogador jogador;
    JogadorBot bot;
    int venc = 2;
     
    public Jogo(Baralho baralho, Jogador jogador, JogadorBot bot) {
        this.baralho = baralho;
        this.jogador = jogador;
        this.bot = bot;
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

    //Testa se o supertrunfo pode ser usado em favor do dono da carta
    int testeSuperTrunfo() {
    	int superTrunfoVenc=0;
    	if(jogador.mao.codigo.equals("Super Trunfo") == true &&  bot.mao.codigo != "1a" && bot.mao.codigo != "2a" && bot.mao.codigo != "3a" && bot.mao.codigo != "4a" && bot.mao.codigo != "5a" && bot.mao.codigo != "6a" && bot.mao.codigo != "7a" && bot.mao.codigo != "8a") {
    		superTrunfoVenc =2;
    	}else{
	    	if(bot.mao.codigo.equals("Super Trunfo") == true && jogador.mao.codigo != "1a" && jogador.mao.codigo != "2a" && jogador.mao.codigo != "3a" && jogador.mao.codigo != "4a" && jogador.mao.codigo != "5a" && jogador.mao.codigo != "6a" && jogador.mao.codigo != "7a" && jogador.mao.codigo != "8a") {
	    			superTrunfoVenc = 1;
	    	}else {
	    		superTrunfoVenc = 0;
	    	}
    	}
		return superTrunfoVenc;
    }
    
    void compararCaracteristicas(){
    	int result = 0; 
        int i;			
        int repet=0;	
        
        //Teste se a carta super trunfo foi usada e se ela ganhou
        if(testeSuperTrunfo() == 0) {  
        	
        	//Se não foi ultilizada a carta como benefício, começa a comparação da caracteristica escolida 
	        do {
	        	
	        	//Testa se a rotina já rodou, oque significa que houve empate
	        	if(repet >0) {
	        		empate();
	        	}
	    
	        	//Testa o vencedor da última rodada
	        	if(venc == 1) {
	        		
	        		//Se o vencedor foi o jogador, ele escolhe a caracteristica
	        		i= jogador.escolherCaracteristica();
	        	} else {
	        		
	        		//Se fooi o bot idem
	        		i=bot.escolherCaracteristica();
	        	}
	      
	        	//Etapa de comparação das caracteristicas 0=empate 1= bot 2= jogador
	        	switch(i){
	        
	        	case 1: 
	        		if(bot.mao.paginas == jogador.mao.paginas) {
	        			result=0; 		
	        		}else{
	        			if(bot.mao.paginas > jogador.mao.paginas){
	        				result=1;	
	        			}else{
	        				result=2; 	
	        			}
	        		}
	        	break;
	        	case 2:
	        		if(bot.mao.preco == jogador.mao.preco) {
	        			result=0; 		
	        		}else{
	        			if(bot.mao.preco> jogador.mao.preco){
	        				result=1;	
	        			}else{
	        				result=2; 	
	        			}
	        		}	
	        	break;
	        	case 3:
	        		if(bot.mao.capitulos == jogador.mao.capitulos) {
	        			result=0; 		
	        		}else{
	        			if(bot.mao.capitulos > jogador.mao.capitulos){
	        				result=1;	
	        			}else{
	        				result=2; 	
	        			}
	        		}	
	        	break;	         
	        	case 4:
	        		if(bot.mao.copiasVendidas == jogador.mao.copiasVendidas) {
	        			result=0; 	
	        		}else{
	        			if(bot.mao.copiasVendidas> jogador.mao.copiasVendidas){
	        				result=1;	
	        			}else{
	        				result=2; 	
	        			}
	        		}	
	        	break;
	        	}   
	        
	        	//Incrementa repet para identificar o empate
	        	repet++;
	        
	        	//Se não foi empate é definido o vencedor
	        	if(result != 0) {  
	        		venc = result; 
	        	}
	       
	        	//Executa enquando der empate
	        	}while(result==0); 
        
        }else {
        	//Se foi usada a carta super trunfo, para o vencedor
        	venc = testeSuperTrunfo();
        }
    }
   
    void entregaVencedor(){
    	
    	int i;
    	i=venc;
    	if(i==1) {
    		System.out.println("  ");
    		System.out.println("Você perdeu sua Carta:");
    		System.out.println("  ");
    		bot.receberMao(jogador.entregarMao());
    	}else {
    		System.out.println("  ");
    		System.out.println("Você ganhou uma Carta:");
    		System.out.println("  ");
    		jogador.receberMao(bot.entregarMao());
    		
    	}
    }
     
}
