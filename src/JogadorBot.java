package Trunfo;

import java.util.Random;

public class JogadorBot extends Jogador{

    @Override
    int escolherCaracteristica() {
        int min = 1;
        int max = 4;

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
