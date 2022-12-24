package bytebankComposto;

public class TestaBanco {
   public static void main(String[] args) {
	   cliente leia = new cliente();
	   leia.nome = "Leia Santos";
	   leia.cpf = "222.222.222-22";
	   leia.profissao = "Desenhista";
	   
	   conta contaDaLeia = new conta();
	   contaDaLeia.deposita(100);
	   
	   
	   
	   contaDaLeia.titular = leia;
	   System.out.println(contaDaLeia.titular.nome);
	   
   }
}
