package matrices;
public class Ej07_1 
{
	public static void main(String[] args) 
	{
		int NF = 4, NC = 5;
		int[][] matriz = new int[NF][NC];

		rellenar(matriz);
		escribir(matriz);

		// En una nueva:

		int[][] matT;
		matT = darVueltaEnNueva(matriz);
		escribir(matT);

		// En la misma:
		// *** Esta solución solo vale para matrices cuadradas:
		int[][] matriz2 =  {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		escribir(matriz2);
		darVuelta(matriz2);


	}

	public static void rellenar(int[][] matriz) 
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
				System.out.print(matriz[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}			
	//Esta forma solo me vale para matrices cuadradas
	public static void darVuelta(int[][] matriz) 
	{
		int aux;
		
		for (int i = 0; i < matriz.length; i++) 
		{
			// Aqui no puedo hacer un metodo, aunque usara el tipo Integer
			// Tendria que crear mi propia clase Entero
			for(int j=0;j<i;j++)
			{
				aux=matriz[i][j];
				matriz[i][j]=matriz[j][i];
				matriz[j][i]=aux;    	 
		    }
		}
	}

	public static int[][] darVueltaEnNueva(int[][] matriz) 
	{
		// Matriz que tiene número de filas igual al número de columnas de la original
		// y viceversa
		int[][] mT = new int[matriz[0].length][matriz.length];

		for (int i = 0; i < matriz[0].length; i++) 
		{
			for (int j = 0; j < matriz.length; j++)
				mT[i][j] = matriz[j][i];
		}
		return mT;
	}
}

