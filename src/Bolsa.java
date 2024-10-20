import java.util.Random;

public class Bolsa {
	
	private Objeto bolsaObjetos [] = new Objeto [5];
	private int posicion;
	private Random random = new Random();
	//contructor para inicializar la posicion
	public Bolsa() {
		this.posicion = 0;
	}
	//metodo para añadir el objeto creado de tipo object en el array
	public void add(Objeto e) 
	{
		bolsaObjetos[posicion] = e;
		posicion++;
	}
    //metodo para obtener los datso del array 
	public Objeto [] getObjetos() 
	{
		return bolsaObjetos;
	}
	//metodo para limpiar el array de objetos
	public void clear()
	{
		for (int i = 0; i < bolsaObjetos.length; i++) 
		{
			bolsaObjetos[i]=null;
		}
	}
	//metodo para comprobar el contenido del array con un objeto
	public boolean contains(String nombre) 
	{
		
		for (int i = 0; i < bolsaObjetos.length; i++) 
		{
			if(bolsaObjetos[i].getNombre().equals(nombre)) 
			{
				return true;
			}
		}
		return false;
    }
	//metodo para saber si esta vacia el array
	public boolean isEmpty() 
	 { 
			 if(bolsaObjetos == null)
				 return true;
			 else
				 return false;
	 }
	//metodo para saber cuantos objetos tiene el array	
	public int size() 
	 { 
		 int contador = 0;
		 
		 for (int i = 0; i < bolsaObjetos.length; i++) 
			{
				if(bolsaObjetos[i] != null)
				{
					contador++;
				}
			}
		 return contador;
	 }
	//metodo para extraer un objeto del array de forma aleatoria con un 20% de probabilidad 
	public void extract() 
	 {
		random = new Random();
		boolean exit = false;
		while (!exit) {
			int indice = random.nextInt(bolsaObjetos.length);
			
			if(bolsaObjetos[indice] != null) {
			bolsaObjetos[indice] = null;
			exit = true;
			}
		}
	
	 }

}
