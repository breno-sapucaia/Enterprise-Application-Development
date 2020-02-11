package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Mant�m a anota��o at� a execu��o do c�digo.
@Retention(RetentionPolicy.RUNTIME)
//Determina que a anota��o pode ser usada em atributos e metodos.
@Target({ ElementType.FIELD, ElementType.METHOD})
public @interface Coluna {
	String nome();
	boolean chave() default false;
}
