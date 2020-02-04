package br.com.fiap.bean;

public class ContaPoupanca extends Conta implements ContaInvestimento{

	private Float taxa;
	private final Float RENDIMENTO = 0.05f;
	
	
	@Override
	public double depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		return this.getSaldo();
	}

	@Override
	public double retirar(double retirar) {
		if(retirar > this.getSaldo()) {
			System.out.println("saldo insuficiente"); 
			return 0;
		}
		this.setSaldo(this.getSaldo() - (retirar + taxa));
		return retirar;
	}

	@Override
	public double calculaRetornoInvestimento() {
		
		return this.getSaldo() * (1+this.RENDIMENTO);
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	
	
}
