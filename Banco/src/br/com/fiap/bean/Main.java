package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.setAgencia(01);
		conta1.setNumero(123);
		conta1.setSaldo(100);
		conta1.setTipoConta(TipoConta.Comum);
		conta1.setDataAbertura(Calendar.getInstance());
		
		ContaInvestimento conta2 = new ContaPoupanca();
		
		((Conta)conta2).setAgencia(003);
		((Conta)conta2).setNumero(1235);
		((Conta)conta2).setSaldo(518);
		((Conta)conta2).setDataAbertura(Calendar.getInstance());
		
		List<Conta> contas = new ArrayList<Conta>();
		
		ContaInvestimento conta3 = new ContaPoupanca();
		
		((Conta)conta3).setAgencia(003);
		((Conta)conta3).setNumero(1235);
		((Conta)conta3).setSaldo(518);
		((Conta)conta3).setDataAbertura(Calendar.getInstance());
		
		contas.add(conta1);
		contas.add((Conta)conta2);
		
		contas.add((Conta)conta3);
		
		
		for(Conta conta : contas) {
			System.out.println(conta.getSaldo());
		}
		

		
		
	}

}
