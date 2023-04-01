package ByteBankHerdado;

public class TesteFuncionario {
   
   public static void main(String[] args) {

      Cliente cliente = new Cliente();
      cliente.setSenha(3333);


      Gerente gh = new Gerente();

      gh.setCpf("1885551891");
      gh.setNome("GHABRIEL");
      gh.setSalario(3000);

      System.out.println(gh.getNome());
      System.out.println(gh.getCpf());
   }
}
