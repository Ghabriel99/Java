package ByteBankHerdado;

public class TesteFuncionario {
   
   public static void main(String[] args) {

      Funcionario gh = new Funcionario();

      gh.setCpf("1885551891");
      gh.setNome("GHABRIEL");

      System.out.println(gh.getNome());
      System.out.println(gh.getCpf());
   }
}
