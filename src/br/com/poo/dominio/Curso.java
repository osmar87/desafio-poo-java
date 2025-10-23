package br.com.poo.dominio;

public non-sealed class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
    }

    public Curso(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descrição=" + getDescrição() + ", cargaHoraria=" + cargaHoraria + ", xp="+ calcularXp() +"]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
