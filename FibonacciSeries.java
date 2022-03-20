package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
			
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		
		System.out.println(firstNum);
		
		for(int i=2;i<range;i++)
		{
			sum=secNum+firstNum;	
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
			
		}
		
		
	}

}
