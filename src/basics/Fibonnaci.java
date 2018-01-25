package basics;

import java.util.Scanner;

public class Fibonnaci {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		int res=0;
		int[] arr = {1,2,8,4,5};
		//System.out.println("Enter your fibonacci spot");
		//n=in.nextInt();
//		res=calcFiboOrig(n);
		
		
		//res=calcRecrusionFibo(n);
		//System.out.println("The number is: " + res);
		System.out.println("Enter your number");
		n=in.nextInt();
		//res=summerize(n);
		//res=factorial(n);
		res=recFactorial(n);
		//System.out.println("The sum is: " + res);
		res=maxArr(arr);
		System.out.println("max value in the array is: " + res);
		res=minArr(arr);
		System.out.println("min value in the array is: " + res);
		res=avgArr(arr);
		System.out.println("avg value is: " +res );
		in.close();
	}

	
	public static int calcFiboOrig (int n)
	{
		int fib0=0;
		int fib1=1;
		
		int i;
		int result=0;
		
			if(n==1) {
				return fib0;
			}
			if(n==2) {
				return fib1;
			}
			if (n>2) { 
			for (i=0; i<n-2;i++)
			{
				result= fib0+fib1;
				fib0=fib1;
				fib1=result;
			
			}
		}
			return result;
	}
	
	public static int calcRecrusionFibo(int n) {
		
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 1;
	}
	
		return calcRecrusionFibo(n-1) + calcRecrusionFibo(n-2);

}
	
	public static int summerize(int n) {
		
		int i=0;
		int sum=0;
		for ( i=1;i<=n;i++) {
			
		
			sum= i+ sum;
		}
		return sum;
	}
	
	public static int factorial(int n) {
		
		int i=0;
		int mul=1;
		for(i=1; i<=n;i++) {
			mul=mul * i;
			
		}
		return mul;
	}
	
	public static int recFactorial(int n) {
		
		if (n==0)
			return 1;
		return n* factorial(n-1);
	}


 public static int maxArr(int[] array){
	 
	 int tmp=array[0];
	 for(int i=0; i<array.length;i++){
		
		 if(array[i]>tmp)
			 tmp=array[i];
	 }
	return tmp;
 }
 
 public static int minArr(int[] array){
	 
	 int tmp=array[0];
	 for(int i=0; i<array.length;i++){
		
		 if(array[i]<tmp)
			 tmp=array[i];
	 }
	return tmp;
 }
 
 public static int avgArr(int[] array ) {
	 int i=0;
	 int sum=0;
	 int avg=0;
	 for(i=0;i<array.length;i++){
		 sum=sum + array[i];
		 
	 }
	 avg=sum/ array.length;
	 return avg;
 }
}