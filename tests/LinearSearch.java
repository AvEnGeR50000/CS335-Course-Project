public class LinearSearch{    
    public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] arr = {2,3,5,7,11,13};    
        int key = 5;    
        System.out.println(key+" is found at index: "+linearSearch(arr, key));    
    }    
} 
