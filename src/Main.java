import java.io.File;

public class Main {

    public static void main(String[] args) {

        Baralho b = new Baralho();
        System.out.println(b.cartas.get(31).nome + "\n");

        JogadorBot j = new JogadorBot();

        int i = j.escolherCaracteristica();

        System.out.println("Escolha: " + i);
    }
}
