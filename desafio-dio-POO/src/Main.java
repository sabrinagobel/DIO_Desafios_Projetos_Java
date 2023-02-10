import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descrição mentoria");
        mentoria1.setData(LocalDate.now());

/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev maria = new Dev();
        maria.setNome("Maria");
        maria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + maria.getNome() + maria.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + maria.getNome() + maria.getConteudosConcluidos());
        System.out.println("XP: " + maria.getNome() + maria.calcularTotalXp());
        maria.progredir();
        maria.progredir();
        System.out.println("Conteudos Inscritos " + maria.getNome() + maria.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + maria.getNome() + maria.getConteudosConcluidos());
        System.out.println("XP: " + maria.getNome() + maria.calcularTotalXp());


        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + joao.getNome() + joao.getConteudosInscritos());



    }
}
