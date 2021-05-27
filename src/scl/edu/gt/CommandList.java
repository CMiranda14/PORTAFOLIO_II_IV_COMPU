package scl.edu.gt;

public class CommandList {
	
		
  String command		[] = new String[12];
  String information	[] = new String[12];
  
  	int cantidadDeComandos;
  
	CommandList() {
		
	
		command[0]="suma";
	    command[1]="resta";
	    command[2]="multiplicación";
	    command[3]="división";
	    command[4]="residuo";
	    command[5]="help";
	    command[6]="Drives";
	    command[7]="Asembler";
	    command[8]="Condicionales";
	    command[9]="Kernel";
	    command[10]="Script";
	    command[11]="exit";
	
	    information[0]= "El comando suma: Realiza la suma de dos números,\n ya sean enteros o decimales, y retorna un valor \n por medio de un double";
	    
	    information[1]= "El comando resta: Realiza la resta de dos números,\n ya se enteros o decimales, y retorna un el resultado \n por un double.";
	    
	    information[2]= "El comando multiplicación: Calcular el resultado \n(producto) de sumar un mismo número (multiplicando) tantas\n veces como indica otro número (multiplicador)";
	    
	    information[3]= "El comando División: Consiste en averiguar cuántas veces \n el divisor está contenido en el dividendo.";
	    
	    information[4]= "El comando Rediuo: Permite obtener el porcentaje de \n un numero, por medio de dos variables.";
	    
	    information[5]= "El comando help: Permite obtener los comandos disponibles \n del programa, y una breve informacion de los mismos.";
	    
	    information[6]= "Los (DRIVES) son pequeños códigos que hacen que el cpu \n se conecte con los (periféricos)";
	    
	    information[7]= "Consiste en un conjunto de mnemónicos que representan \n instrucciones básicas para los computadores,\n microprocesadores, microcontroladores y \n otros circuitos integrados programables.";
	    
	    information[8]= "Son fragmentos de código que nos permiten condicionar \n datos y proporcionar una respuesta, si la \n condicional se comple o no.";
	    
	    information[9]= "Es el encargado de que el softwre y el Hadware de cualquier \n  ordenador, puedan trabajar juntos en un mismo \n sistema, por lo que administra la memoria \n de los programas y procesos ejecutados.";
	    
	    information[10]="Es un código de programación, usualmente sencillo, que contiene \n comandos u ordenes que se van ejecutando de manera \n secuencial y comúnmente se utilizan para controlar \n el comportamiento de un programa en especifico o \n para interactuar con el sistema operativo.";
	    
	    information[11]= "El comando exit: Permite la finalización del programa.";
	}

}
