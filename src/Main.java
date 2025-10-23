import java.time.LocalDate;

import br.com.poo.dominio.BootCamp;
import br.com.poo.dominio.Curso;
import br.com.poo.dominio.Dev;
import br.com.poo.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrição("Curso de Java do zero");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring boot");
        curso2.setDescrição("Curso de Spring boot do zero");
        curso2.setCargaHoraria(8);

      
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescrição("Mentoria de Java");
        mentoria.setData(LocalDate.now());
       
        BootCamp bootCamp = new BootCamp();

        bootCamp.setNome("Bootcamp Java");
        bootCamp.setDescricao("Descrição BootCamp Java Develope");
        bootCamp.getConteudo().add(mentoria);
        bootCamp.getConteudo().add(curso1);
        bootCamp.getConteudo().add(curso2);

        Dev dev1 = new Dev();
        dev1.setNome("JOSÉ");
        dev1.inscreverBootCamop(bootCamp);
        dev1.progredir();
        
        System.out.println("Condeuto do "+ dev1.getNome() +" "+ dev1.getConteudosIncritos());
        System.out.println("Condeuto concluidos de "+ dev1.getNome() +" "+ dev1.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.setNome("MARIA");
        dev2.inscreverBootCamop(bootCamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();


        System.out.println("Condeuto do "+ dev2.getNome() +" "+ dev2.getConteudosIncritos());
        System.out.println("Condeuto concluidos de "+ dev2.getNome() +" "+ dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularTotalXp());


        
    }
}
