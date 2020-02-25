package lab;

public class SumCalculator {
	public static void main(String args[]) {
		
		SumCalculator ab=new SumCalculator();
		
		System.out.println(ab.Natural(10));
	}
	public int Natural(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			if(i%3==0||i%5==0) 
			{
			sum=sum+i;
            }
		}
			return sum;
			
		}
			
	}
	


