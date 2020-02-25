package lab;
import java.util.ArrayList;

public class IncreasingNo {
			public static boolean checkNumber(int n) 
		{ 
			
		    if(n==0) 
		    return false; 
		    
		    int temp = n;
		    ArrayList<Integer> array = new ArrayList<Integer>();
		    do{
		        array.add(temp % 10);
		        temp /= 10;
		    } while  (temp > 0);
		    
		    int flag=0;
		    for (int i=1;i<array.size();i++) {
		    	if(array.get(i)<array.get(i-1)){
		    	flag=1;}
		    }
		    if (flag==1)
		    {
		    	return true;
		    }
		    else
		    	return false;
	
		} 
		public static void main(String[]args)
		{	
			int x=10;
			System.out.print(checkNumber(x));
		}
}
/*
public class Exercise4 {
	public static boolean checkNumber(int n) 
	{ 
	    if(n==0) 
	    return false; 
	  
	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
	       (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
	} 
	public static void main(String[]args)
	{
		
		int x=10;
		System.out.print(checkNumber(x));
	}

}*/