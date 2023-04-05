public class MetodosBanco {
   public static void main(String[] args) {
      Conta contaDoPaulo = new Conta(6660, 969060);
      contaDoPaulo.deposita(100);
      contaDoPaulo.deposita(50);
      System.out.println(contaDoPaulo.getSaldo());

      boolean conseguiuRetirar = contaDoPaulo.saca(30);
      System.out.println(contaDoPaulo.getSaldo());
      System.out.println(conseguiuRetirar);

      Conta contaDaMarcela = new Conta(6644, 969063);
      contaDaMarcela.deposita(1000);

      boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo, contaDaMarcela);

      if(sucessoTransferencia) {
         System.out.println("Transferencia realizada com sucesso!");
      } 
      else {
         System.out.println("Faltou dinheiro!");
      }

      System.out.println("Saldo da Marcela: " + contaDaMarcela.getSaldo());
      System.out.println("Saldo do Paulo: " + contaDoPaulo.getSaldo());
   }
}
