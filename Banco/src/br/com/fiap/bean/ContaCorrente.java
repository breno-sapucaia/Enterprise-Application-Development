package br.com.fiap.bean;

public class ContaCorrente extends Conta{
	
	private TipoConta tipoConta;

	@Override
	public double depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		return this.getSaldo();
	}

	@Override
	public double retirar(double retirar) throws Exception {
		if(getTipoConta().equals(TipoConta.Comum) && this.getSaldo() < retirar) {
			throw new Exception("Olha amig�o, n�o vai da n�o");
		}
		
		
		return 0;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
	
	
}
