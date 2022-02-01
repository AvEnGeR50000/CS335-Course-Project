public class RevArr {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 3, 5, 7, 9};
		
        System.out.println("Array in reverse order: ");  
		
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
} 
