package ByteBankHerdado;

public class EditorVideo extends Funcionario{
   public double getBonificacao() {
      System.out.println("Chamando o método de bonificacao do Designer");
      
      return 150;
   }
}
