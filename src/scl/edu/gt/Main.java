package scl.edu.gt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*MENSAJE INICIAL DEL PROGRAMA*/
		Img inicio= new Img();
		inicio.Mensaje();
		
		/*ESTADO DEL PROGRAMA*/
		boolean on = true;
		
		/*INCIO DEL PROGRAMA*/
		do {
		
		Scanner inputCommand = new Scanner(System.in);
		System.out.println("");
		System.out.print("{=");
		String output = inputCommand.nextLine();
		
		
		
		
		//INSTANCIAS DE CLASE
		CommandList dateCommand = new CommandList();
		Arithmeticfunctions fa = new Arithmeticfunctions();
		Temas tem = new Temas();
		
		if(output.equals(dateCommand.command[0])) {
			fa.sumar();
		}else if(output.equals(dateCommand.command[1])) {
			fa.restar();
		}else if(output.equals(dateCommand.command[2])) {
			fa.multiplicar();
		}else if(output.equals(dateCommand.command[3])) {
			fa.dividir();
		}else if(output.equals(dateCommand.command[4])) {
			fa.residuo();
		}else if(output.equals(dateCommand.command[5])) {

			help help	= new help();
			
			help.listaComandos();
			
		}else if(output.equals(dateCommand.command[6])) {
			tem.Drives();
		}else if(output.equals(dateCommand.command[7])) {
			tem.Asembler();
		}else if(output.equals(dateCommand.command[8])) {
			tem.Condicionales();
		}else if(output.equals(dateCommand.command[9])) {
			tem.Kernel();
		}else if(output.equals(dateCommand.command[10])){
			tem.Script();
		
		}else if(output.equals(dateCommand.command[11])){
			on = false;
		
		}
		
		else{System.out.println("Ingresa help para ver los comandos displonibles");
			}
		
	}while(on);
		
		System.out.println("Programa finalizado");
		
		
		
		
		
		/*CommandList dateCommand = new CommandList();
		for(int i = 0;i<5;i++) {
		 if(output.equals(dateCommand.command[0])) {
			
	
			 Arithmeticfunctions fa = new Arithmeticfunctions();
			 
				i=6;
			}else {
				System.out.println("false");
			}*/
		}
		
		
		


	}


