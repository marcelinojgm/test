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
}
