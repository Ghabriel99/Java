package Collections;

public class Aluno {
   private String nome;
   private int numeroMatricula;


   public Aluno(String nome, int numeroMatricula) {
      if (nome == null) {
         throw new NullPointerException("name cant be null");
      }

      this.nome = nome;
      this.numeroMatricula = numeroMatricula;
   }

   public String getNome() {
      return nome;
   }

   public int getNumeroMatricula() {
      return numeroMatricula;
   }

   public boolean equals(Object obj) {
      Aluno outro = (Aluno) obj;
      return this.nome.equals(outro.nome);
   }

   @Override
   public int hashCode() {
      return this.nome.hashCode();
   }

   @Override
   public String toString() {
      
      return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
   }
}
