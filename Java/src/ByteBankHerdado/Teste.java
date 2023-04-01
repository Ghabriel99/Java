package ByteBankHerdado;

public class Teste {
   public static void main(String[] args) {

      Autenticavel referencia = new Administrador();
      referencia.autentica(3333);

      Gerente g1 = new Gerente();
      g1.setCpf("555555");
      g1.setNome("gh");
      g1.setSalario(5000);

      System.out.println(g1.getNome());
      System.out.println(g1.getCpf());
      System.out.println(g1.getSalario());

      g1.setSenha(3333);
      boolean autenticou = g1.autentica(3333);

      System.out.println(autenticou);

      System.out.println(g1.getBonificacao());
   }
}
