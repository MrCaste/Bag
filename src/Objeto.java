
public class Objeto {
	
	private String nombre;
	private String caracteristica;
	
	
	public Objeto(String nombre, String caracteristica) {
		super();
		this.nombre = nombre;
		this.caracteristica = caracteristica;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCaracteristica() {
		return caracteristica;
	}


	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	//metodo to string para imprimir el contenido del array con los parametros de cada objeto
	@Override
	public String toString() {
		return "Object [nombre=" + nombre + ", caracteristica=" + caracteristica + "]";
	}
	
	

}
