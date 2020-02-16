package matrices;
public class Ej03 
{
	public static void main(String[] args) 
	{
		final int NF=8, NC=8;
		
		int [][] matriz=new int[NF][NC];
		int [][] identica1=new int[NF][NC];
		int  identica2[][], identica3[][]; // Creamos solo las referencias
			
		crear(matriz);
		System.out.println("MATRIZ ORIGINAL 1");
		escribir(matriz);
		
		/*FORMA 1*/
		creaIdentica(matriz, identica1);
		
		/*FORMA 2*/
		identica3 = creaIdentica(matriz);
		
		/*FORMA 3*/
		identica2=matriz.clone();
		
		System.out.println("FORMA 1");
		escribir(identica1);
		System.out.println("FORMA 2");
		escribir(identica2);
		System.out.println("FORMA 3");
		escribir(identica3);
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

	static void creaIdentica(int[][] mat, int[][] identica)
	{
		for(int i=0;i<mat.length;i++)
			for(int j=0;j<mat[i].length;j++)
				identica[i][j]=mat[i][j];
	}

	static int[][] creaIdentica(int[][] mat) 
	{
		int[][] nueva = new int[mat.length][mat[0].length];
		for(int i=0;i<mat.length;i++)
			for(int j=0;j<mat[i].length;j++)
				nueva[i][j]=mat[i][j];
		return nueva;
	}
}


