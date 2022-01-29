
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println("xxx Extrato Conta Corrente xxx");
		imprimirinfo();
		
	}


	
}
