package br.com.poo.dominio;

import java.time.LocalDate;

public non-sealed class Mentoria extends Conteudo{
    
    private LocalDate data;

    public Mentoria(LocalDate data) {
        this.data = data;
    }


    public Mentoria() {
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titutlo=" + getTitulo() + ", descrição=" + getDescrição() + ", data=" + data + ", xp= "+ calcularXp() +"]";
    }


    @Override
    public double calcularXp() {
        return (XP_PADRAO + 20d);
    }
    
}
