package bytebank;

public class TesteReferencias {
    public static void main(String[] args) {
    	conta primeiraConta = new conta();
    	primeiraConta.saldo = 300;
    	
 
    	System.out.println("saldo da primeira: " + primeiraConta.saldo);
    	
    	
    	conta segundaConta = primeiraConta;
    	System.out.println("saldo da segunda conta: " + segundaConta.saldo);
    	
    	
    	if(primeiraConta == segundaConta) {
    		System.out.println("sao a mesma conta");
    	}
    	
    	
    }
}
