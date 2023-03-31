public class Conta {
   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;

   public Conta(int agencia, int numero){
      this.agencia = agencia;
      this.numero = numero;
      this.saldo = 100; //toda conta começa com o saldo de 100 reais
      Conta.total ++;
      System.out.println("Criando uma conta!");
   };

   private static int total = 0;


   public void deposita(double valor) {
      this.saldo += valor;
   }

   public boolean saca(double valor) {
      if (this.saldo >= valor) {
         this.saldo -= valor;
         return true;
      } else {
         return false;
      }
   }

   public boolean transfere(double valor, Conta destino, Conta origem ) {
      if(this.saldo >= valor) {
         this.saldo -= valor;
         destino.deposita(valor);
         return true;
      }
      return false;
   }

   public double getSaldo() {
      return this.saldo;
   }

   public int getNumero() {
      return this.numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }

   public int getAgencia() {
      return this.agencia;
   }

   public void setTitular(Cliente titular) {
      this.titular = titular;
   }

   public Cliente getTitular() {
      return this.titular;
   }

   public static int getTotal() {
      return Conta.total;
   }
}
