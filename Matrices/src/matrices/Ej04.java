package matrices;
public class Ej04 
{
	public static void main(String[] args) 
	{
		final int NF=6, NC=8;
		int [][] matriz=new int[NF][NC];
		int max,min;
		rellenar(matriz);
		escribir(matriz);
		

		int res[] = calcMaxMin(matriz);
	    max = res[0];
	    min = res[1];
	    	    		
		System.out.println("El valor maximo de la matriz es "+max+" y el minimo es " + min);	
	}
	
	static void rellenar(int[][] matriz)
	{
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(int)(Math.random()*100 +1);
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

	static int[] calcMaxMin(int[][] mat) 
	{
		int[] res = {-1, -1};
		int max=mat[0][0];
		int min=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(max<mat[i][j])
					max=mat[i][j];
				if(min>mat[i][j])
					min=mat[i][j];
			}
		}
		res[0]=max;
		res[1]=min;
		return (res);
	}
}


