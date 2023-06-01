package br.com.alura.minhasMusicas.principal;

import br.com.alura.minhasMusicas.modelo.Musicas;
import br.com.alura.minhasMusicas.modelo.PodCast;

public class Principal {
    public static void main(String[] args) {
        Musicas musicas = new Musicas();
        musicas.setTitulo("rap");
        musicas.setCantor("Tupac");

        for (int i = 0; i < 1000; i++) {
            musicas.reporduzir();
        }

        for (int i = 0; i < 50; i++) {
            musicas.curte();
        }
        PodCast meuPodcast = new PodCast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcos Mendes");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reporduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
    }
}
