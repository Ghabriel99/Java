package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

   private String nome;
   private String instrutor;
   private List<Aula> aulas = new LinkedList<Aula>();
   private Set<Aluno> alunos = new LinkedHashSet<>();
   private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

   public Curso(String nome, String instrutor) {
      this.nome = nome;
      this.instrutor = instrutor;
   }

   public String getNome() {
      return nome;
   }

   public String getInstrutor() {
      return instrutor;
   }

   public List<Aula> getAulas() {
      return Collections.unmodifiableList(aulas);
   }

   public void adiciona(Aula aula) {
      this.aulas.add(aula);
   }

   public int getTempoTotal() {
      int tempoTotal = 0;
      for (Aula aula : aulas) {
         tempoTotal += aula.getTempo();
      }
      return tempoTotal;
   }

   public void matricula(Aluno aluno) {
      this.alunos.add(aluno); // adiciona no Set de alunos
      this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno); // cria a relação no Map
   }

   public Set<Aluno> getAlunos() {
      return Collections.unmodifiableSet(alunos); // uma cópia imodificavel dos alunos
   }

   public boolean estaMatriculado(Aluno aluno) {
      return this.alunos.contains(aluno);
   }

   public Aluno buscaMatriculado(int num) {
      if (!matriculaParaAluno.containsKey(num)) {
         throw new NoSuchElementException("Matricula " + num + " não encontrada");
      }
      return this.matriculaParaAluno.get(num); // retorna apenas o matriculado selecionado pela key do hashMap
   }
}
