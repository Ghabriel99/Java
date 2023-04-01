package ByteBankConta;

public class TesteContas {
   public static void main(String[] args) {

      ContaCorrente cc = new ContaCorrente(111, 222);
      cc.deposita(300);

      ContaPoupanca cp = new ContaPoupanca(111, 222);
      cp.deposita(300);

      cc.transfere(100.5, cp);

      System.out.println("CC: " + cc.getSaldo());
      System.out.println("CD: " + cp.getSaldo());
   }
}
