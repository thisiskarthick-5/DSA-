public class Main{
    public static void main(String[] args){
        
        int arr[] = {9,7,3,2,6,9};
        int len = arr.length;
        int minindex = -1;
        int temp =  0;
        
        System.out.println("before swapping");
        for(int i = 0 ; i < len ; i ++){
            System.out.print(arr[i] + " ");
        }
        
        //9,7,3,2,6,9
        
        for(int a = 0 ; a < len - 1 ;a ++ ){
            minindex = a;
            for(int j = a + 1; j < len ; j ++){
                if(arr[minindex] > arr[j]){
                    minindex = j;
                }
            }
            
            
            temp = arr[minindex];
            arr[minindex] = arr[a];
            arr[a] = temp;
            
            System.out.println(" ");
            for(int i = 0 ; i < len ; i ++){
            System.out.print(arr[i] + " ");
        }
        
        }
        
        System.out.println(" ");
        System.out.println("After swapping");
        for(int i = 0 ; i < len ; i ++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
