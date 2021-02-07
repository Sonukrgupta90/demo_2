import java.util.*;
import java.lang.*;
public class multi_thread extends Thread
{
    public void run()
    {
        try
        {
            
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(200);
        }
        }

        catch(InterruptedException y)
        {

        }
    }
    public static void main(String args[])
    {
        multi_thread e = new multi_thread();

        System.out.println(" \033[0;32m");
        e.start();
    
    }

    
}
