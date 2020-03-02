package br.com.fiap.domain.exceptions;

public class IdNotInObject extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7394884814243034268L;
	
	public IdNotInObject() {
		super("Id do objeto não informado");
	}
	
}
