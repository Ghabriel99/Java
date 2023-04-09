package Collections;

public class TestaBuscaAlunosNoCurso {
   public static void main(String[] args) {
      Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");


      Aluno a1 = new Aluno("Rodrigo Turini", 5617);
      Aluno a2 = new Aluno("Guilherme", 888);
      Aluno a3 = new Aluno("Ghabriel", 9999);

      javaColecoes.matricula(a1);
      javaColecoes.matricula(a2);
      javaColecoes.matricula(a3);

      System.out.println("Quem é o aluno com a matricula 5617?");
      Aluno aluno = javaColecoes.buscaMatriculado(5617);
      System.out.println("Aluno: " + aluno);
   }
}
