/**
 * 
 * 
 * @author Marcelino José Granda Muñoz.
 * @version (a version number or a date)
 */
public class Test
{
    /**
     * imprima todos los múltiplos de 5 entre 10 y 95 
     * (ambos extremos no incluidos).
     */
    public void multiplesOfFive()
    {
        int start = 10;
        int end   = 95;

        while (start < end)
        {
            start++;
            if(start%5 == 0)
            {
                System.out.println(start);
            }

        }
    }

    /**
     * saque por pantalla la suma de los números comprendidos entre el 0 y el 10 
     * (ambos incluidos)
     */
    public void sumValues()
    {
        int start = 0;
        int end   = 10;
        int sum   = 0;

        while(start <= end)
        {
            sum = sum + start;
            start++;
        }
        System.out.println(sum);
    }

    /**
     * reciba dos parámetros enteros a y b y muestre la suma de los valores 
     * comprendidos entre dichos parámetros (ambos incluidos).
     */
    public void sumValuesInterval(int a, int b)
    {
        int sum   = 0;
        
        //cambiamos los valores "a" por "b" 
        //si "a" es mayor que "b"
        if (b < a)
        {
            int aux;
            aux = a;
            a = b;
            b = aux;
        }

        while(a <= b)
        {
            sum = sum + a;
            a++;
        }
        
         System.out.println(sum);
    }

}
