package matrices;
public class Ej06_1 
{
	public static void main(String[] args) 
	{
		final int NF=4, NC=5;
		int [][] matriz=new int[NF][NC];
		//int [][] matriz= {{1, 2, 3},{4, 5, 6 }};
		int [] columnas=new int[NC];
		int [] filas=new int[NF];
		
		rellenar(matriz);
		escribir(matriz);
		
		rellenarFilCol(matriz, filas, columnas);
					
		escribir(matriz, filas, columnas);				
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
				col[j]=col[j]+mat[i][j];
				fil[i]=fil[i]+mat[i][j];
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

	static void escribir(int[][] matriz, int [] fil, int[] colum){
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
				System.out.printf ("%4d", matriz[i][j], "  ");
			System.out.printf ("%4d %n", fil[i]);//Completa filas
			// ** La columna añadida es la suma de las filas **
			//System.out.println();
		}
		for(int i=0;i<matriz[0].length;i++)
			System.out.printf("%4d", colum[i], " ");//Completa columnas
		// ** La fila añadida es la suma de las columnas **
	}
}


