package Tercero;

public class Main {
	
	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.setEdad(10);
		p.setNombre("pepe");
		p.setTelefono(7712345);
		
		System.out.print("Edad: "+p.getEdad()+" Nombre: "+p.getNombre()+" Telefono: "+p.getTelefono());
		
	}

}
