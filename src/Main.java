
public class Main {

	public static void main(String[] args) {

		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Mateus");
		cliente.setCpf("123.456.789-01");
		
		Conta cc = new ContaCorrente(cliente);
		cc.depositar(100); 
		Conta cp = new ContaPoupanca(cliente);
		
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
