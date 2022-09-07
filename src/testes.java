import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class testes {
	public static void main (String args[]) {
		
		int varX=0, varY=0;
		
		String a = "NESW";
		for (int i=0; i < a.length(); i++)
			
		{
			if (a.charAt(i)=='N')
				varY=varY+1;
			else if (a.charAt(i)=='E')
				varX=varX+1;
		
		    System.out.println("Char " + i + " is " + a.charAt(i));
		    
		    
		    }	
		if(varX==2)
	    	System.out.println(varY+"AAAAAAAAAAAAAAAAAAAa");
	    else
	     System.out.println(varX+"AA");
	}
}
