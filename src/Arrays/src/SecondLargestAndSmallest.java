package Arrays.src;
public class SecondLargestAndSmallest {
    public static int secondLargest(int n, int []a){
        int largest = a[0];
        int slargest = -1;

        for(int i=1;i<n;i++){
            if(a[i]>largest){
                slargest = largest;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>slargest)
            slargest= a[i];
        }
        return slargest;
    }

 public static   int secondSmallest(int n, int []a){
        int smallest = a[0];
        int ssmallest= Integer.MAX_VALUE;

        for(int i=1; i<n;i++){
            if(a[i] < smallest){
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(a[i]!= smallest && a[i] < ssmallest){
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }

    public static void main(String args[]) {
        // Write your code here.
        int n =5;
        int a[] ={1,2,3,4,5};
        int ans[] =new int[]{secondLargest(n, a),secondSmallest(n, a)};
        for(int i:ans)
        System.out.print(i+" "); 
    }
}