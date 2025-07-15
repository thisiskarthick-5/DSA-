public class Main{
    public static void main(String[] args){
        
        int arr[] = {12,3,4,5,67,7,8,9};
        int target = 34;
        int left = 0;
        int high = arr.length - 1;
        
        int res = binary(arr,target,left,high);
        if(res != -1){
            System.out.println("the element found at : " + (res + 1));
        }
        else{
            System.out.println("element not found");
        }
    }
    
    public static int binary(int[] arr , int target , int left , int high){
        int mid = (left + high) / 2;
        while(left <= high){
            if(target == arr[mid]){
                return mid;
                
            }
            
            else if(target > arr[mid]){
                return binary(arr , target , mid + 1 , high);
            }
            
            else{
                return binary(arr, target , left , mid - 1);
            }
        }
        
        return -1;
        
      
        
    }
}
