package br.senai.sp.jandira;

import java.util.Scanner;

public class MediasFinais {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("+-----------------------------------+");
	    System.out.println("|             MÉDIA FINAL           |");
	    System.out.println("+-----------------------------------+");
	    System.out.print("A turma têm quantos alunos? ");
	    int alunos=teclado.nextInt();
	    
		int lin=0;
		String resposta="S";
	    String aluno[][]=new String [alunos][2];
	    double nota[][]=new double [alunos][35];
	    
	    while(resposta.equals("S")) {
	    	
		    System.out.println("-------------------------------------");
		    System.out.print("Digite o nome do aluno: ");
		    aluno [lin][0]=teclado.next();
		    System.out.print("Digite a nota do 1˚ bimestre: ");
		    nota [lin][0]=teclado.nextDouble();
		    System.out.print("Digite a nota do 2˚ bimestre: ");
		    nota [lin][1]=teclado.nextDouble();
		    System.out.print("Digite a nota do 3˚ bimestre: ");
		    nota [lin][2]=teclado.nextDouble();
		    System.out.print("Digite a nota do 4˚ bimestre: ");
		    nota [lin][3]=teclado.nextDouble();
		    nota [lin][4]=(nota[lin][0]+nota[lin][1]+nota[lin][2]+nota[lin][3])/4;
		    System.out.println();
		    System.out.print("Deseja cadastrar outro aluno?(S/N) ");
		    resposta=teclado.next();
		   
		    if (nota[lin] [4] >= 5) {
	
		    	aluno[lin] [1] = "Aprovado";
	
		    } else {
	
		    	aluno[lin] [1] = "Reprovado";
	
		    }lin++;
		    
	    }

	    System.out.println();
	    System.out.println("**************************************************************");
	    System.out.println();
	    System.out.println("+------------------------------------------------------------+");
	    System.out.println("|                     LISTA GERAL DA TURMA                   |");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	    System.out.println("+------------------------------------------------------------+");
	    System.out.printf("%-10s %7s %7s %7s %7s %7s %10s %n", "Nome", "1ºNota", "2ºNota", "3ºNota", "4ºNota", "Média", "Situação");
	    System.out.println("--------------------------------------------------------------");

	    for (int i = 0; i <alunos; i++) {

	    	System.out.printf("%-10s %6s %7s %7s %7s %7s %10s %n", aluno[i][0],nota[i][0],nota[i][1],nota[i][2],nota[i][3],nota[i][4],aluno [i][1]);            

	    }
	    
	}

}