package Collections;

public class TestaCursoComAluno {
   public static void main(String[] args) {

      Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");

      Aluno a1 = new Aluno("Rodrigo Turini", 33);
      Aluno a2 = new Aluno("Guilherme", 888);
      Aluno a3 = new Aluno("Ghabriel", 9999);

      javaColecoes.matricula(a1);
      javaColecoes.matricula(a2);
      javaColecoes.matricula(a3);

      System.out.println("Todos os alunos matriculados : ");
      javaColecoes.getAlunos().forEach(a -> {
         System.out.println(a);
      });

      Aluno turini = new Aluno("Rodrigo Turini", 33);
      System.out.println("Esse turini está matriculado?");
      System.out.println(a1.equals(turini));

      System.out.println("O Aluno " + a2 + " está matriculado?");
      System.out.println(javaColecoes.estaMatriculado(a2));
   }
}
