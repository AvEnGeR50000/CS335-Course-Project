public class Factorial{  
	// Print factorial of a number
	public static void main(String args[]){  
		int i,fact=1;  
		int num=8;
  
		for(i=1;i<=num;i++){    
			fact=fact*i;    
		}    
  
		System.out.println("Factorial of "+num+" is : "+fact);    
	}  
}    
