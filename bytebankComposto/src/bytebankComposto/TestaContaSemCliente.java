package bytebankComposto;

public class TestaContaSemCliente {
   public static void main(String[] args) {
	conta contaDaClara = new conta();
	System.out.println(contaDaClara.Saldo);
	
	contaDaClara.titular = new cliente();
	System.out.println(contaDaClara.titular);
	
	contaDaClara.titular.nome = "Clara";
	System.out.println(contaDaClara.titular.nome);
 }
}
