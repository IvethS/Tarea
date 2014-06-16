public class MiClase
{
	//Ejercicios realizados en Grupo con Fabricio Laureano.
	//devuelve la suma de a y b
	//en esta funcion solo sume las variables declaradas
	static int sumarNumeros(int a, int b)
	{
		return a+b;
	}
	
	//devuelve la resta de a y b
	//en esta funcion solo reste las variables declaradas
	static int restarNumeros(int a, int b)
	{
		return a-b;
	}
	
	//devuelve la multiplicación de a y b
	//en esta funcion hice la multiplicacion de variables
	static int multiplicarNumeros(int a, int b)
	{
		return a*b;
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	//aqui lo que hace es un calculo que todos los numeros que se dividen en dos
	//devolvera verdadero y si no devolvera falso
	static boolean esPar(int num)
	{
		 if(num%2==0)
	           return true;
	        else
	            return false;
             
		
	}
	
	//devuelve el numero mayor entre a, b o c
	//se obtienen los valores de las variables declaradas, luego hace una comparacion
	//y devuelve el menor de esos numeros
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
	//aqui con la ayuda de la opcion matematica math pow 
   	//podemos hacer el calculo directamente de la potencia
   	//como pueden observar obtiene un resultado y luego devuelve la variable
	static int potencia(int num, int potencia)
	{
		int resultado = (int) Math.pow(num, potencia);
		return resultado;
	}
	
	//devuelve el sumas del arreglo
	//estas lo obtuve con ayuda de: http://www.forosdelweb.com/f13/suma-valores-arreglo-591009/
	static int sumarArreglo(int arreglo[])
	{
		
		
		int sumarArreglo=0; 
		for (int i=0; i< arreglo.length; i++) 
		sumarArreglo+=arreglo[i]; 
		
	
		return sumarArreglo; 
	}
	
	//devuelve el numero mayor de un arreglo
	//Este lo realize con la ayuda de:http://escodigo.com/tutoriales/java/ejercicios-java/numero-mayor-menor-un-arreglo.html 
	//obtiene el arreglo luego calcula el tamaño de ese arreglo y calcula cual de los numeros es el mayor
	//asi es una manera mas facil de compárar los numeros por medio de un arreglo.
	static int getMayorArreglo(int arreglo[])
	{
		int imayor =0;
		for(int i=1;i<arreglo.length;i++)
			if(arreglo[i]>arreglo[imayor])
				imayor = i;
		return arreglo[imayor];
	            
	}
	
	//devuelve el numero menor de un arreglo
	//de la misma forma con la ayuda de este link realice esto: ayuda de:http://escodigo.com/tutoriales/java/ejercicios-java/numero-mayor-menor-un-arreglo.html
	//obtiene el arreglo luego calcula el tamaño de ese arreglo y calcula cual de los numeros es el menor
	static int getMenorArreglo(int arreglo[])
	{
		int imenor =0;
		for(int i=1;i<arreglo.length;i++)
			if(arreglo[i]<arreglo[imenor])
				imenor = i;
		return arreglo[imenor];
	}
	
	//devuelve true si encuentra cadena dentro arreglo
	//en este ejemplo lo que hace es que la comparacion de una variable en especifico 
	//devuelve si contiene texto o simplemente es un numero.
	static boolean existe(String arreglo[],String cadena)
	{
		for(int i=0; i<arreglo.length; i++)
		{
			if(arreglo[i].equals(cadena))
				return true;
		}
		return false;
	}
	
	public static void main(String args[])
	{
		
		
	}
}
