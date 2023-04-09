package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
   public static void main(String[] args) {
      Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");

      List <Aula> aulasImutaveis = javaColecoes.getAulas();
      System.out.println(aulasImutaveis);

      // aulas.add(new Aula("Trabalhando com arraylist", 21));
      javaColecoes.adiciona(new Aula("Trabalhando com arraylist", 30));
      javaColecoes.adiciona(new Aula("Criando uma aula", 20));
      javaColecoes.adiciona(new Aula("POO", 22));

      List<Aula> aulas = new ArrayList<>(aulasImutaveis);

      Collections.sort(aulas);
      System.out.println(aulas);
      System.out.println(javaColecoes.getTempoTotal());
   }
}
