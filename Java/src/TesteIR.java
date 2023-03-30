public class TesteIR {
   public static void main(String[] args) {

      double salario = 4000.0;

      if (salario > 1903.99 && salario <= 2826.65) {
         System.out.println("A sua alíquota é de 7.5%");
         System.out.println("Parcela a deduzir será de R$ 142,80");
      }

      if (salario > 2826.65 && salario <= 3751.05) {
         System.out.println("A sua alíquota é de 15%");
         System.out.println("Parcela a deduzir será de R$ 354,80");
      }

      if (salario > 3751.05 && salario <= 4664.68) {
         System.out.println("A sua alíquota é de 22.5%");
         System.out.println("Parcela a deduzir será de R$ 636,13");
      }

      if (salario > 4664.68) {
         System.out.println("A sua alíquota é de 27.5%");
         System.out.println("Parcela a deduzir será de R$ 869,36");
      }
   }
}
