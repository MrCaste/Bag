import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner scanner;
	Bolsa bag;
	Objeto objeto;

	//Main donde se hace el menu y se llama a los metodos trabajando con objetos con un do while
	public static void main(String[] args) {
		Main app = new Main();
		boolean exit = false;

		app.scanner = new Scanner(System.in);

		System.out.println("\nIntroduzca la opcion a elegir");

		do {
			System.out.println("\n----- Menu -----\n");
			System.out.println("Opcion 1: Agregar Objetos");
			System.out.println("OPCION 2: eliminar todos los elementos");
			System.out.println("Opcion 3: comprobar elemento");
			System.out.println("Opcion 4: Indicar si hay elementos o no");
			System.out.println("Opcion 5: Cuantos elementos hay en la bolsa");
			System.out.println("Opcion 6: Extraer un elemento");
			System.out.println("Opcion 7: Salir");
			int opcion = app.scanner.nextInt();

			switch (opcion) {
			case 1:
				app.addObjeto();
				break;
			case 2:
				app.eliminar();
				break;
			case 3:
				app.comprobar();
				break;
			case 4:
				app.vacia();
				break;
			case 5:
				app.size();
				break;
			case 6:
				app.extraerObjeto();
				break;
			case 7:
				exit = true;
				System.out.println("Finalizando...");
				break;

			default:
				System.err.println("Opcion erronea, inserte una opcion valida");
				break;
			}
		} while (!exit);

		app.scanner.close();
	}

	//metodo donde se crea un objeto nuevo donde se piden los atributos por parametros llamando al metodo de la clase Bolsa para guardarlo en el array
	public void addObjeto() {
		bag = new Bolsa();
		System.out.print("Introduce los 5 Objetos:");
		scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			String nombreObjeto = scanner.nextLine();
			String caracteristica = scanner.nextLine();

			Objeto objeto = new Objeto(nombreObjeto, caracteristica);
			bag.add(objeto);
		}
		System.out.println("Los objetos son: " + Arrays.toString(bag.getObjetos()));

	}
	//metodo para eliminar todos los objetos 
	public void eliminar() {
		bag.clear();
		System.out.println("Todos los objetos han sido eliminados");
		System.out.println(Arrays.toString(bag.getObjetos()));
	}
	//metodo para comprobar si un objeto esta en la bolsa
	public void comprobar() {
		scanner = new Scanner(System.in);
		System.out.println("Indique el objeto a comprobar: ");
		String nombre = scanner.nextLine();

		if (bag.contains(nombre) == true) {
			System.out.println("El objeto esta en la bolsa");
		} else
			System.out.println("El objeto no esta en la bolsa");
	}
	//metodo para comprobar si la bolsa esta vacia o no
	public void vacia() {
		
		bag = new Bolsa();
		if (bag.isEmpty() == true) {
			System.out.println("Esta vacia");
		} else
			System.out.println("No esta vacia");
	}
	//metodo para saber cuantos objetos tiene la bolsa
	public void size() {
		System.out.println("Hay " + bag.size() + " elementos en la bolsa");
	}
	//metodo para extraer un objeto de forma aleatoria con un 20% de probabilidad
	public void extraerObjeto() {
		bag.extract();
		System.out.println(Arrays.toString(bag.getObjetos()));
	}

}
