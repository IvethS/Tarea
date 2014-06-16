public class MiClase
{
	//devuelve la suma de a y b
	static int sumarNumeros(int a, int b)
	{
		return a+b;
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	{
		return a-b;
	}
	
	//devuelve la multiplicación de a y b
	static int multiplicarNumeros(int a, int b)
	{
		return a*b;
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	static boolean esPar(int num)
	{
		 if(num%2==0)
	           return true;
	        else
	            return false;
             
		
	}
	
	//devuelve el numero mayor entre a, b o c
	static int getMayor(int a, int b, int c)
	{
		  if(a > b)
	           if(a>c)
	              return a;
	           else
	              return c;
	        else if(b>c)
	              return b;
	                else
	              return c;
	}
	
	//devuelve num elevado a la potencia
	static int potencia(int num, int potencia)
	{
		int resultado = (int) Math.pow(num, potencia);
		return resultado;
	}
	
	//devuelve el sumas del arreglo
	static int sumarArreglo(int arreglo[])
	{
		
		
		int sumarArreglo=0; 
		for (int i=0; i< arreglo.length; i++) 
		sumarArreglo+=arreglo[i]; 
		
	
		return sumarArreglo; 
	}
	
	//devuelve el numero mayor de un arreglo
	static int getMayorArreglo(int arreglo[])
	{
		int imayor =0;
		for(int i=1;i<arreglo.length;i++)
			if(arreglo[i]>arreglo[imayor])
				imayor = i;
		return arreglo[imayor];
	            
	}
	
	//devuelve el numero menor de un arreglo
	static int getMenorArreglo(int arreglo[])
	{
		int imenor =0;
		for(int i=1;i<arreglo.length;i++)
			if(arreglo[i]<arreglo[imenor])
				imenor = i;
		return arreglo[imenor];
	}
	
	//devuelve true si encuentra cadena dentro arreglo
	static boolean existe(String arreglo[],String cadena)
	{
		for(int x =0; x<arreglo.length; x++)
		{
			if(arreglo[x].equals(cadena))
				return true;
		}
		return false;
	}
	
	public static void main(String args[])
	{
		
		
	}
}
