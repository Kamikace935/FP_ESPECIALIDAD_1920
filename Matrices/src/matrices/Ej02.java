package matrices;
public class Ej02 
{
	public static void main(String[] args) 
	{
		final int NF=4, NC=5;
		int [][] matrizA=new int[NF][NC];
		int num=(int)(Math.random()*10);
		
		crear(matrizA);
		escribir(matrizA);
		
		int res[] = buscar(matrizA, num);
	    int i = res[0];
	    int j = res[1];
	    	    
		if (i != -1 && j != -1)
			System.out.println("El numero "+ num +" esta en la posicion " + (i+1) + "," + (j+1));
	    else 
	    	System.out.println("El numero "+ num +" no esta en la matriz");	
	}
	
	static void crear(int[][] matriz)
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
				System.out.print(matriz[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}

	static int[] buscar(int[][] matriz, int n)
	{
		boolean encont = false;
		int resultado[] ={-1, -1};
		
		for(int i=0;i<matriz.length && !encont;i++)
		{
			for(int j=0;j<matriz[i].length && !encont;j++)
			{
				if (matriz[i][j] == n) 
				{
					resultado[0] = i;
					resultado[1] = j;
					encont = true;
				}
			}		
		}	  
		return resultado;
	}	
}




