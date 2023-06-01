package br.com.alura.minhasMusicas.modelo;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;

    private String Cantor;

    public String getCantor() {
        return Cantor;
    }

    public void setCantor(String cantor) {
        Cantor = cantor;
    }

    public void curte(){
      this.totalCurtidas++;
    }

    public void reporduzir(){
       this.totalReproducoes++;
    }


    // Aqui ficará os set e get


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }
}
