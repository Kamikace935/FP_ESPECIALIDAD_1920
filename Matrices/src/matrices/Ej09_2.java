package matrices;
public class Ej09_2
{
	public static void main(String[] args) 
	{
		final int NF=20, NC=10;	
		int [][] matriz=new int[NF][NC];
		double [] altmedia=new double[NF];
		double altMedMax;
		
		rellenar(matriz);
		escribir(matriz);
		altMedMax = calcEquipoAltMedia(matriz, altmedia);				
		
		for(int i=0;i<altmedia.length;i++)
		{
			if (altmedia[i] == altMedMax)
				System.out.println("El equipo " + (i+1) +
					" tiene la media más alta: " + altMedMax);			
		}
		
		int[] seleccion=new int[NF];
		//Se guarda el número del jugador	
		crearSeleccion(seleccion, matriz);
					
		System.out.println("La seleccion de los jugadores más altos es: ");
		for(int i=0;i<seleccion.length;i++)
			System.out.println("Equipo "+(i+1)+" Jugador "+ seleccion[i]);
	}
	
	static void rellenar(int[][] matriz)
	{
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(int)((Math.random()*(210-180+1))+180);
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

	static double calcEquipoAltMedia(int[][] mat, double[] aMedia) 
	{	
		int suma;
		double mediaMax= -1;		
	//Creamos un array de las alturas medias
		for(int i=0;i<mat.length;i++)
		{
			suma=0;
			//Guardamos en suma la suma de las alturas para cada fila
			for(int j=0;j<mat[i].length;j++)
			{
				suma=suma+mat[i][j];
			}
		
			aMedia[i] = (double)suma/(mat[i].length);
			//Calculamos la media de cada fila y la guardamos
			//Imprimimos la media
			if (aMedia[i] > mediaMax)
			{
				mediaMax = aMedia[i];
			}
		
		}	
		return mediaMax;
	}

	static void crearSeleccion (int[] sel, int[][] mat) 
	{
		int max, pos;
		for(int i=0;i<mat.length;i++)
		{
			max=mat[i][0];
			pos=0;
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>max)
				{
					max=mat[i][j];
					pos=j;
				}
			}
			sel[i]=pos+1;
		}
	}
}