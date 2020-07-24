import java.util.Scanner;


public class Main {
	
	public static void main(String args[]) {
		//Para entender todo dibuja una matriz en una hoja cuadriculada y ve bajando desde los extremos de la primera fila
		//en simultaneo formando una X los valores de la matriz y en base a esa intruccion esta programado
		
		Scanner teclado = new Scanner(System.in);
		int filas = 0, columnas = 0;
		
		System.out.print("[*] Generar Matriz Cuadratica => ");
		
		//seteamos los valores para poder crear la matriz
		filas = teclado.nextInt();
		teclado.close();
		columnas = filas;
		
		//creamos la matriz con la cantidad de filas y columnas que le hemos ingresado
		int matrices[][] = new int[filas][columnas];
		
		System.out.println("\n-> MATRIZ CUADRATICA " + filas + " X " + columnas + " <-");
		System.out.println("------------------------------");
		
		//seteamos la matriz con valores aleatorios
		for(int indiceFila=0;indiceFila<filas;indiceFila++) {
			
			for(int indicecolumna=0;indicecolumna<columnas;indicecolumna++) {
				
				matrices[indiceFila][indicecolumna] = (int) Math.floor(Math.random()*10);
				
			}
			
		}
		
		System.out.println("");
		
		//recorremos la matriz y mostramos los valores
		for(int indiceFila=0;indiceFila<filas;indiceFila++) {
			
			for(int indicecolumna=0;indicecolumna<columnas;indicecolumna++) {
			
				System.out.print(matrices[indiceFila][indicecolumna] + " ");
			
			}
			
			//salto de linea por cada fila recorrida
			System.out.println("");
		
		}
		
		
		System.out.println();
		System.out.println("[*] Formando una X en base a los valores de la matriz [*]");
		System.out.println("--------------------------------------------------------\n");
				
		//Vamos a obtener los valores de la matriz que formen una X  
		
		//indice que va a rrecorrer de forma inversa el lado de la esquina izquierda de la matriz (/)
		int n = filas-1;
		
		//recorremos los elementos de las filas y columnas
		for(int fil=0;fil<filas;fil++) {
			for(int col=0;col<columnas;col++) {
				//la primera posicion de cada fila y columna nos devolvera los valores de forma de diagonal inversa (\)
				//debemos evaluarlo para que nos devuelva los valores de forma diagonal invera (\)
				if(col==fil) {
					System.out.print(matrices[fil][col]);	
				}else if(col==n){ 
					//si la columna que evalua cada posicion de cada fila para que muestre la forma (\) es igual al indice que recorre de forma inversa
					//imprima los valores para que formen (/)
					System.out.print(matrices[fil][col]);
					//descontamos para que continue de forma inversa
					--n;
				}else {
					//si ya obtuvimos los valores anteriores o aun no llegan segun su posicion , solo imprimira un espacio
					//es el responsable de dar la forma de X
					System.out.print(" ");
				}
			}
			
			//salto de linea para que se empieze a mostrar los valores de la siguiente fila
			System.out.println("");
			
			//evaluamos si la matriz es impar para que nos permita mostrar solo el elemento que se intersecta
			//ya que cuando la matriz es par los indices recorren normalmente sus posiciones y permite mostrar la interseccion
			if(fil==n && filas%2!=0) {
				//decrementamos el indice que recorre de manera inversa (/)
				--n;
			}
		}
	}

}
