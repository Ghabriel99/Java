public class CriaConta {
   public static void main(String[] args) {

      Conta primeiraConta = new Conta(6646, 969060);
      primeiraConta.deposita(300); 
      System.out.println(primeiraConta.getSaldo());

      primeiraConta.deposita(100);
      System.out.println(primeiraConta.getSaldo());

      Conta segundaConta = new Conta(6645, 969061);
      segundaConta.deposita(50);

      System.out.println("A primeira conta tem: " + primeiraConta.getSaldo());
      System.out.println("A segunda conta tem: " + segundaConta.getSaldo());

   }
}