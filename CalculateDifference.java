package lab;

public class CalculateDifference {
	public static void main(String args[]) {
		CalculateDifference ac=new CalculateDifference();
		System.out.println(ac.difference(10));
		
	}
	public int difference(int n) {
		int sum1=0,sum2=0;
		int sum,p;
		for(int i=1;i<=n;i++)
		{
			sum1=sum1+i*i;
			sum2=sum2+i;
			
		}
		p=sum2*sum2;
		sum=sum1-p;
		return sum;
		
	}

}
