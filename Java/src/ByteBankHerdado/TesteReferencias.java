package ByteBankHerdado;

public class TesteReferencias {
   public static void main(String[] args) {
      
      Gerente g1 = new Gerente();

      g1.setNome("kakato");
      g1.setSalario(3000);

      Funcionario f = new Funcionario();
      f.setNome("bob");;
      f.setSalario(2200);

      Designer d = new Designer();
      d.setSalario(1800);

      ControleBonificacao controle = new ControleBonificacao();
      controle.registra(g1);
      controle.registra(f);
      controle.registra(d);

      System.out.println(controle.getSoma());

   }   
}
