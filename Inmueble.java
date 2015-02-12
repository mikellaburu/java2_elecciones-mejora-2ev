import java.util.Scanner;


public class Inmueble extends EspacioPublico{

	private int id;
	private String tipo;
	private String direccion;
	private int metros;
	Scanner sc = new Scanner(System.in);
	String cadena;
	int num;
	public Inmueble(){}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															public void setId(int i){
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															this.id=i;
	}
	public int getId() {
		return id;
		
	}protected void crearCenso(){
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
		public void setTipo(String t)
	{
	this.tipo=t;
	}
	public String getTipo()
	{
	return tipo;
	}
	public void setDireccion(String d) {
																																																																																																																																																																																																																																																																																																																																																																																																		this.direccion=d;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setMetros(int m) {
		this.metros=m;
	}
	public int getMetros()
	{
	return metros;
	}
	protected void crearInmueble(){
		System.out.print("\nID del inmueble: ");
		num = sc.nextInt();
		setId(num);
		System.out.print("\nTipo de inmueble: ");
		cadena = sc.next();
		setTipo(cadena);
		System.out.print("\nLa direccion del inmueble: ");
		cadena = sc.next();
		setDireccion(cadena);
		System.out.print("\nMetros del inmueble: ");
		num = sc.nextInt();
		setMetros(num);
		System.out.println("-----------Informacion del inmueble-----------");
		System.out.println("El ID del inmueble es: " + getId()+ "");
		System.out.println("El tipo de inmueble es: " + getTipo()+ "");
		System.out.println("La dirrecion del inmueble es: " + getDireccion()+ "");
		System.out.println("Los metros del inmueble son: " + getMetros()+ "\n");
	}
	
}
