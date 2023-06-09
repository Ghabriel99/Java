package ByteBankHerdado;

public class Gerente extends Funcionario implements Autenticavel{

   private Autenticador util;

   public Gerente() {
      this.util = new Autenticador();
   }

   @Override
   public double getBonificacao() {
      System.out.println("Chamando o método de autenticação do Gerente");

      return super.getSalario();
   }

   @Override
   public void setSenha(int senha) {
      this.util.setSenha(senha);
   }

   @Override
   public boolean autentica(int senha) {
      return this.util.autentica(senha);
   }
}

