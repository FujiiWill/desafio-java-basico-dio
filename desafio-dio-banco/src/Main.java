
public class Main {
	public static void main(String[] args) {
		Cliente Wiliam = new Cliente();
		Wiliam.setNome("Wiliam");
		
		Conta cc = new ContaCorrente(Wiliam);
		Conta poupanca = new ContaPoupanca(Wiliam);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
