package matrices;
public class Ej05
{
	public static void main(String[] args) 
	{
		final int NF=5, NC=5;
		int [][] matriz=new int[NF][NC];	
		int suma=0;
		
		rellena(matriz);
		System.out.println("Matriz original");
		escribir(matriz);
		
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
			{
				if(i<j) // Por encima de la diagonal ppal
					matriz[i][j]=matriz[i][j]*matriz[i][j];
				else if(i>j)// Por debajo de la diagonal ppal
			        suma=suma+matriz[i][j];
				else
					matriz[i][j]++; 				
		    }
		}
		
		System.out.println("Matriz modificada, pendiente de multiplicar por 2 la diagonal inversa");
		escribir(matriz);
		System.out.println("La suma de los elementos de debajo de la diagonal principal es "+suma);
		// Multiplicar por 2 los elementos de la diagonal inversa
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
			{
				if( i+j == NF-1) 
					matriz[i][j] = matriz[i][j]*2;
			}
		}	
		
		System.out.println();
		System.out.println("Matriz modificada, multiplicada por 2 la diagonal inversa");
		escribir(matriz);
	}
	//Se podría mejorar haciendo un método por cada tratamiento de los pedidos.
	static void rellena(int[][] matriz)
	{
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(int)(Math.random()*10);
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
}