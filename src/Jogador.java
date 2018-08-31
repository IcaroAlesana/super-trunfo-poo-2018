import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
    ArrayList<Carta> monte;
    Carta mao;

    public Jogador(){
        this.monte = new ArrayList<Carta>();
    }

    void comprarCarta() {
        Carta c = monte.get(0);
        this.mao = c;
    }

    int escolherCaracteristica(){
        System.out.println("Digite o número correspondente a característica que deseja utilizar: \n1 - Paginas\n2 - Preço\n3 - Capítulos\n4 - Cópias Vendidas\n");
        Scanner s = new Scanner(System.in);
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
