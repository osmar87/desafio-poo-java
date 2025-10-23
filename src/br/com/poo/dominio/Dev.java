package br.com.poo.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;

    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootCamop(BootCamp bootCamp){
        this.conteudosIncritos.addAll(bootCamp.getConteudo());
        bootCamp.getDevInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        System.out.println(conteudo);

        if ( conteudo.isPresent() ){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
        } else {
            System.err.println("Você não esta inscrito em nem um condeudo");
        }
    }

    public double calcularTotalXp() {
       return this.conteudosConcluidos
        .stream()
        .mapToDouble(Conteudo -> Conteudo.calcularXp())
        .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dev dev = (Dev) obj;

        return Objects.equals(nome, dev.nome) &&  Objects.equals(conteudosIncritos, dev.conteudosIncritos )&& Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
     }

    @Override
    public int hashCode() {
      
        return Objects.hash(nome, conteudosIncritos, conteudosConcluidos);
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

    
}
