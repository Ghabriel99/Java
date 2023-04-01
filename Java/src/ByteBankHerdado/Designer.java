package ByteBankHerdado;

public class Designer extends Funcionario{
   public double getBonificacao() {
      System.out.println("Chamando o método de bonificacao do Designer");
      
      return super.getBonificacao() + 100;
   }
}
