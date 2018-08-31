public class Jogo {
    Baralho baralho;
    Jogador jogador;
    JogadorBot bot;

    public Jogo(Baralho baralho, Jogador jogador, JogadorBot bot) {
        this.baralho = baralho;
        this.jogador = jogador;
        this.bot = bot;
    }

    void distribuirCartas() {


    }

    void iniciarRodada() {
        jogador.comprarCarta();
        bot.comprarCarta();
    }

    void compararCaracteristicas(){

    }


}
