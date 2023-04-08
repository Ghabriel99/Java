package Collections;

import java.util.List;

public class TestaCurso {
   public static void main(String[] args) {
      Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");

      List <Aula> aulas = javaColecoes.getAulas();

      // aulas.add(new Aula("Trabalhando com arraylist", 21));
      javaColecoes.adiciona(new Aula("Trabalhando com arraylist", 30));
      javaColecoes.adiciona(new Aula("POO", 22));

      System.out.println(javaColecoes.getAulas());

      System.out.println(aulas);
   }
}
