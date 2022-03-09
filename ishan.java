import java.util.*;
public abstract class Ishan implements inter{


    public boolean getWatched(int a)
    {
        int sr = (int)Math.sqrt(a);

        if((sr * sr) == a)
        	return true;
        else
        	return false;
    }

    public static void main (String[]args)
		{
			//System.out.println("hello");


		}

}

	interface inter
		{
			final int a = (int)(Math.random() * 100);

			public boolean getWatched();


		}


