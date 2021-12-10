package com.segundo;

import com.primero.Notas;

public class Calificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notas nota1=new Notas(5.5f);
		Notas nota2=new Notas(4.2f);
		Notas nota3=new Notas(8.1f);
		Notas nota4=new Notas(9.8f);
		
		System.out.println(nota1.getNota());
		System.out.println(nota2.getNota());
		System.out.println(nota3.getNota());
		System.out.println(nota4.getNota());
	}

}
