package JavaExcecoes;

public class Fluxo {

   public static void main(String[] args) {
      System.out.println("Ini do main");
      try {
         metodo1();
      } catch(ArithmeticException | MinhaExcecao ex) {
         String msg = ex.getMessage();
         System.out.println("Arithimetic excepttion" + msg);
         ex.printStackTrace();
      }
      
      System.out.println("Fim do main");
   }

   private static void metodo1() {
      System.out.println("Ini do metodo1");
      try {
         metodo2();
      } catch (Exception e) {
         System.out.println(e);
      }
      
      System.out.println("Fim do metodo1");
   }

   private static void metodo2() {
      System.out.println("Ini do metodo2");
      throw new MinhaExcecao("deu b.o");
      // System.out.println("Fim do metodo2");
   }
}
