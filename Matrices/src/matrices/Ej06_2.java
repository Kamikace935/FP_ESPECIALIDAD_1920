package matrices;
public class Ej06_2 
{
	public static void main(String[] args) 
	{		
		final int NF=4, NC=5;
		int [][] matriz=new int[NF][NC];
		//int [][] matriz= {{1, 2, 3},{4, 5, 6 }};
		int [] filas=new int[NC];
		int [] columnas=new int[NF];
		
		rellenar(matriz);
		escribir(matriz);
		
		rellenarFilCol(matriz, filas, columnas);
					
		escribir(matriz,filas, columnas);				
	}
	
	static void rellenar(int[][] matriz)
	{
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(int)(Math.random()*10);
	}

	static void rellenarFilCol(int[][] mat, int[] fil, int[] col) 
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{		
				fil[j]=fil[j]+mat[i][j]; // Es la suma de la columna j
				col[i]=col[i]+mat[i][j]; // Es la suma de la fila i
				// ** La columna añadida es la suma de las filas **
				// ** La fila añadida es la suma de las columnas **
				// Para ver como se van rellenando en cada bucle:
				System.out.println("fil[ " +  j + " ]");
				System.out.println(fil[j]);
				System.out.println("col[ " +  i + " ]");
				System.out.println(col[i]);
			}
		}
	}

	static void escribir(int[][] matriz)
	{
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
				System.out.printf("%4d", matriz[i][j]);
			System.out.println();
		}
		System.out.println();
	}

	static void escribir(int[][] matriz, int [] fila, int[] columna)
	{
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
				System.out.print(matriz[i][j]+"  ");
			System.out.println(columna[i]);//Suma de los elementos de la fila i
		}
		for(int i=0;i<matriz[0].length;i++)
			System.out.print(fila[i]+" ");//suma de cada columna i
	}
}

