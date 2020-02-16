package matrices;
import java.util.*;
public class Ej07_2
{
	public static void main(String[] args) 
	{
		int NF, NC;
		// Pedir numero de filas y columnas
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce número de filas");
		NF = sc.nextInt();
		System.out.println("Introduce número de columnas");
		NC = sc.nextInt();

		sc.close();

		int[][] mat = new int[NF][NC];

		System.out.println("Por filas:");

		crear(mat);
		escribir(mat);

		System.out.println("Por columnas (solo visualizada):");
		escribirPorCol(mat);

		if (NF == NC) 
		{// Es cuadrada
			System.out.println("Original cuadrada:");
			darVuelta(mat);// se modifica ella misma
			System.out.println("Traspuesta cuadrada:");
			escribir(mat);
		} else{
			int[][] matT = new int[NC][NF];
			System.out.println("Original no cuadrada:");
			matT = darVueltaNoCuad(mat);
			System.out.println("Traspuesta no cuadrada:");
			escribir(matT);
		}
		// Para trasponer una matriz con distinto numero de columnas en las distintas
		// filas:
		int[][] matRara;
		int[][] matDesigual = { { 10, 20 }, { 30, 40, 50 }, { 60 } };

		System.out.println("Traspuesta no cuadrada y distinto numero de columnas:");

		System.out.println("Original");
		escribir(matDesigual);
		System.out.println("Por columnas (solo visualizada):");
		escribirPorCol(matDesigual);
		matRara = darVueltaNoCuad(matDesigual);
		System.out.println("Dada la vuelta");
		escribir(matRara);
	}

	public static int[][] darVueltaNoCuad(int[][] matriz) 
	{
		// Esta forma me vale para matrices no cuadradadas
		// pero obligatoriamente habrá que crear una nueva matriz, por razones
		// obvias
		
		int numColMax = maxColumnas(matriz);

		System.out.println("numColMax -> " + numColMax);
		System.out.println();

		int[][] mT = new int[numColMax][matriz.length];

		for (int j = 0; j < numColMax; j++) 
		{
			for (int i = 0; i < matriz.length; i++)
				try // Por si hay número distinto de columnas en las filas:
				{
					mT[j][i] = matriz[i][j];
				} catch (ArrayIndexOutOfBoundsException e) {
					mT[j][i] = 0;
				}
		}

		return mT;
	}

	public static void darVuelta(int[][] matriz) 
	{
		int aux;
		// Esta forma solo me vale para matrices cuadradadas
		for (int i = 0; i < matriz.length; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				aux = matriz[i][j];
				matriz[i][j] = matriz[j][i];
				matriz[j][i] = aux;
			}
		}
	}

	public static void crear(int[][] matriz) 
	{
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++)
				matriz[i][j] = (int) (Math.random() * 10);
	}

	public static void escribir(int[][] matriz) 
	{
		for (int i = 0; i < matriz.length; i++) 
		{
			for (int j = 0; j < matriz[i].length; j++)
				System.out.printf("%4d", matriz[i][j]);
			System.out.println();
		}
		System.out.println();
	}

	public static void escribirPorCol(int[][] matriz) 
	{
		// Necesito saber el número máximo de columnas en la matriz
		int numColMax = maxColumnas(matriz);

		System.out.println("numColMax -> " + numColMax);
		System.out.println();

		for (int j = 0; j < numColMax; j++) 
		{
			for (int i = 0; i < matriz.length; i++)
				try // Por si hay número distinto de columnas en las filas:
				{
					System.out.printf("%4d", matriz[i][j]);
				} catch (ArrayIndexOutOfBoundsException e) {
					// System.out.println("ArrayIndexOutOfBoundsException");
					System.out.printf("%4d", 0);
				}
			System.out.println();
		}
		System.out.println();
	}

	public static int maxColumnas(int[][] matriz) {
		int numColMax = matriz[0].length;
		for (int i = 1; i < matriz.length; i++)
			if (matriz[i].length > numColMax)
				numColMax = matriz[i].length;

		return numColMax;
	}

}