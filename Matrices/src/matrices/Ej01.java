package matrices;
public class Ej01 
{
	public static void main(String[] args) 
	{
		final int NF=4, NC=5;
		
		int [][] matrizA=new int[NF][NC];
		int [][] matrizB=new int[NF][NC];
		int [][] matrizC=new int[NF][NC];
		crear(matrizA);
		escribir(matrizA);
		crear(matrizB);
		escribir(matrizB);
		sumar(matrizA,matrizB,matrizC);
		escribir(matrizC);
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
				System.out.printf("%3d", matriz[i][j]);
			System.out.println();
		}
		System.out.println();
	}

	static void sumar(int[][] m1,int[][] m2,int[][] m3)
	{
		for(int i=0;i<m1.length;i++)
			for(int j=0;j<m1[i].length;j++)
				m3[i][j]=m1[i][j]+m2[i][j];
	}
}


