package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
   public static void main(String[] args) {

      Aula a1 = new Aula("Revisitando as ArraysLists", 21);
      Aula a2 = new Aula("Lista de objetos", 15);
      Aula a3 = new Aula("Relacionamento de listas e objetos", 18);

      ArrayList<Aula> aulas = new ArrayList<>();
      aulas.add(a1);
      aulas.add(a2);
      aulas.add(a3);

      // antes de ordenar:
      System.out.println(aulas);

      Collections.sort(aulas);

      // depois de ordenar:
      System.out.println(aulas);

      // depois de ordenar pelo tempo:
      aulas.sort(Comparator.comparing(Aula::getTempo));
   }
}
