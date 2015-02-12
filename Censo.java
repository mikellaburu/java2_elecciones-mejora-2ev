
public class Censo extends EspacioPublico{

	protected void crearCenso(){
		try{
		File listaPartido = new File("/home/zubiri/workspace/eleccionesAnt/EleccionesAnt/src/elecciones/censo.txt");
		FileInputStream fis = new FileInputStream(listaPartido);
		InputStreamReader isr = new InputStreamReader(fis, "UTF8");
		BufferedReader br = new BufferedReader(isr);
		String linea;
		linea = br.readLine();
		String [] campos = null;
		System.out.println("\ntus partidos...");
		while(linea!=null){
		campos = linea.split(",");
		int edad = Integer.parseInt(campos[3]);
		if( edad >= 18){
		System.out.println("-----------Informacion del censo-----------");
		System.out.println("nombre: "+campos[0]);
		System.out.println("apellido: "+campos[1]);
		System.out.println("DNI: "+campos[2]);
		System.out.println("edad: "+campos[3]);
		System.out.println("sexo: "+campos[4]);
		System.out.println("telefono: "+campos[5]);
		System.out.println("ciudad: "+campos[6]);
		}
		linea = br.readLine();
		}
		}catch(Exception ioe){
		System.out.println("Error: "+ioe);
		}
		}
	
	
}
