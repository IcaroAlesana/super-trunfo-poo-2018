package Trunfo;

import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Baralho {
    ArrayList<Carta> cartas;

    //construtor inicializa o arraylist e le o baralho a partir de um arquivo txt.
    public Baralho(){
        Scanner s;
        this.cartas = new ArrayList<Carta>();
        try {
            s = new Scanner(new File("livros.txt"));
            for(int i = 0; i<32; i++){
                this.cartas.add(new Carta(s.nextLine(), Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine()), s.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

