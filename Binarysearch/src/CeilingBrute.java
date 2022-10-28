public class CeilingBrute {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,9,12,16,18};
        int target= 4;
        System.out.println(binaryCeil(arr,target));

    }
    static int binaryCeil(int[] a,int key){
        int start=0,end=a.length-1,ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]<key){
                start=mid+1;
            }
            else if(a[mid]==key){
                return a[mid];
            }
            else {
                end=mid-1 ;
            }
        }
        return a[start];
    }
}
