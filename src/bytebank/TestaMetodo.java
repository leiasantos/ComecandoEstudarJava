package bytebank;

public class TestaMetodo {
   public static void main(String[] args) {
	   conta contaDaLeia = new conta();
	   contaDaLeia.saldo = 200;
	   contaDaLeia.deposita(50);
	   System.out.println(contaDaLeia.saldo);
	   
	   boolean retirarDinheiro = contaDaLeia.saca(20);
	   System.out.println(contaDaLeia.saldo);
	   System.out.println(retirarDinheiro);
	   
	   conta contaDaClara = new conta();
	   contaDaClara.deposita(1000);
	   
	   contaDaClara.transfere(300, contaDaLeia);
	   System.out.println(contaDaClara.saldo);
	   System.out.println(contaDaLeia.saldo);
	   
	   contaDaLeia.titular ="Léia Santos";
	   System.out.println(contaDaLeia.titular);
	   
   }
}
