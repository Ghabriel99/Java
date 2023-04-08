package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
   public static void main(String[] args) {
      String aula1 = "Conhecendo mais listas";
      String aula2 = "Modelando a classe Aula";
      String aula3 = "Aumentando nosso conhecimento";

      ArrayList<String> aulas = new ArrayList<>();
      aulas.add(aula1);
      aulas.add(aula2);
      aulas.add(aula3);

      System.out.println(aulas);

      // aulas.remove(0); remove o primeiro
      //aulas.get(0); mostra o primeiro

      for(String aula : aulas) {
         System.out.println("Aula: " + aula);
      }

      System.out.println();
      System.out.println("Percorrendo o for com o size");
      
      for(int i=0; i<aulas.size(); i++) {
         System.out.println("aula: " + aulas.get(i));
      }

      System.out.println(aulas.size());

      System.out.println("Percorrendo o for com o forEach");

      aulas.forEach(aula -> {
         System.out.println("percorrendo: ");
         System.out.println("Aula " + aula);
      });

      Collections.sort(aulas);
      System.out.println("Depois de ordenado: ");
      System.out.println(aulas);
   }
}
