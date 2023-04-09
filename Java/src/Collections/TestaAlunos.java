package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
   public static void main(String[] args) {
      Set<String> alunos = new HashSet<>();

      alunos.add("GH");
      alunos.add("BOB");
      alunos.add("Mario");
      // alunos.hashCode();

      boolean ghEsta = alunos.contains("GH");
      System.out.println(ghEsta);

      System.out.println(alunos.size());

      alunos.forEach(aluno -> {
      System.out.println(alunos);
      });

      System.out.println(alunos);

      System.out.println("Passando e copiando uma collection Set para uma arrayList");   
      List<String> alunosEmLista = new ArrayList<>(alunos);
      System.out.println(alunosEmLista);
   }
}
