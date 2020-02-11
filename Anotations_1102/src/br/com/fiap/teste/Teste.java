package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Produto;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Produto prod = new Produto();
		
		
		Field[] atrr = prod.getClass().getDeclaredFields();
		
		for(Field a: atrr) {
			System.out.println(a.getName());
			Coluna anotacao = a.getAnnotation(Coluna.class);
			System.out.println(anotacao);
			System.out.println(a.getName() + " - "+ anotacao.nome() + "  - Chave - " + anotacao.chave());
		}
		
		Method[] metodos = prod.getClass().getDeclaredMethods();
		for(Method m: metodos) {
			System.out.println(m);
		}
		
	}

}
