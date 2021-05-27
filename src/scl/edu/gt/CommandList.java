package scl.edu.gt;

public class CommandList {
	
		
  String command		[] = new String[12];
  String information	[] = new String[12];
  
  	int cantidadDeComandos;
  
	CommandList() {
		
	
		command[0]="suma";
	    command[1]="resta";
	    command[2]="multiplicaci�n";
	    command[3]="divisi�n";
	    command[4]="residuo";
	    command[5]="help";
	    command[6]="Drives";
	    command[7]="Asembler";
	    command[8]="Condicionales";
	    command[9]="Kernel";
	    command[10]="Script";
	    command[11]="exit";
	
	    information[0]= "El comando suma: Realiza la suma de dos n�meros,\n ya sean enteros o decimales, y retorna un valor \n por medio de un double";
	    
	    information[1]= "El comando resta: Realiza la resta de dos n�meros,\n ya se enteros o decimales, y retorna un el resultado \n por un double.";
	    
	    information[2]= "El comando multiplicaci�n: Calcular el resultado \n(producto) de sumar un mismo n�mero (multiplicando) tantas\n veces como indica otro n�mero (multiplicador)";
	    
	    information[3]= "El comando Divisi�n: Consiste en averiguar cu�ntas veces \n el divisor est� contenido en el dividendo.";
	    
	    information[4]= "El comando Rediuo: Permite obtener el porcentaje de \n un numero, por medio de dos variables.";
	    
	    information[5]= "El comando help: Permite obtener los comandos disponibles \n del programa, y una breve informacion de los mismos.";
	    
	    information[6]= "Los (DRIVES) son peque�os c�digos que hacen que el cpu \n se conecte con los (perif�ricos)";
	    
	    information[7]= "Consiste en un conjunto de mnem�nicos que representan \n instrucciones b�sicas para los computadores,\n microprocesadores, microcontroladores y \n otros circuitos integrados programables.";
	    
	    information[8]= "Son fragmentos de c�digo que nos permiten condicionar \n datos y proporcionar una respuesta, si la \n condicional se comple o no.";
	    
	    information[9]= "Es el encargado de que el softwre y el Hadware de cualquier \n  ordenador, puedan trabajar juntos en un mismo \n sistema, por lo que administra la memoria \n de los programas y procesos ejecutados.";
	    
	    information[10]="Es un c�digo de programaci�n, usualmente sencillo, que contiene \n comandos u ordenes que se van ejecutando de manera \n secuencial y com�nmente se utilizan para controlar \n el comportamiento de un programa en especifico o \n para interactuar con el sistema operativo.";
	    
	    information[11]= "El comando exit: Permite la finalizaci�n del programa.";
	}

}
