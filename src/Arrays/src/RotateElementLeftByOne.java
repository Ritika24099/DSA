package Arrays.src;
public class RotateElementLeftByOne {

    public static int[] rotateArray(int[] arr, int n) {
        
        int temp= arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
            
        }
        arr[n-1]=temp;
        
        return arr;

    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans [] =rotateArray(arr,5);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
