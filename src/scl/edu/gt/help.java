package scl.edu.gt;

public class help {

	public static void listaComandos() {
		
		
		CommandList dateCommand = new CommandList();
		
		int cantidadDeComandos = dateCommand.command.length;
		
		System.out.println("___________________________________________________________________________");
		for(int i = 0;i <cantidadDeComandos; i++) {
			
			System.out.println(" #"+ dateCommand.command[i]+ " #");
			System.out.println(" **********************************************");
			System.out.println(" -"+dateCommand.information[i]);
			System.out.println("");
		
		}
		
		
	}
}
