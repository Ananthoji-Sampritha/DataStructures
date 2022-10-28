public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={48,46,32,30,26,24,19,12,9,6,3,1};
        int target=12;
        System.out.println(agnosticBS(arr,arr.length,target));

    }
    static int agnosticBS(int[] a, int n,int key){
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==key){
                return mid+1;
            }
            if(a[0]<a[n-1]){
                if(a[mid]>key){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(a[mid]>key){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }

        }
        return -1;
    }
}
