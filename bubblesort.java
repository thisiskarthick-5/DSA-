public class Main{
    public static void main(String[] args){
        
        int arr[] = {8,7,5,2,3};
        int len = arr.length;
        int temp = 0;
        
        System.out.println("before sorting");
        
        for(int a : arr){
            System.out.print(a + " ");
        }
        
        
        for(int i = 0 ; i < len ; i ++){
            for(int j = 0 ; j < len - i - 1 ; j ++){
                
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                
                System.out.println("");
        
        
        for(int a : arr){
            System.out.print(a + " ");
        }
            }
        }
        
        System.out.println("");
        System.out.println("after sorting");
        
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
