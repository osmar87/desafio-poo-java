package br.com.poo.dominio;

public sealed abstract class Conteudo permits Curso, Mentoria {

    protected final double XP_PADRAO = 10d;
    private String titulo;
    private String descrição;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public abstract double calcularXp();
}
