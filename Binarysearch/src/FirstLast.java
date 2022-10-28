public class FirstLast{
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        int target=7;
        System.out.println(binaryFirst(arr,target,true));
        System.out.println(binaryFirst(arr,target,false));
    }
    static int binaryFirst(int[] ar,int target,boolean index){
        int l=0,ans=-1;
        int h=ar.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(ar[mid]<target){
                l=mid+1;
            }
            else if(ar[mid]>target){
                h=mid-1;
            }
            else{
                ans=mid;
                if(index){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return ans;

    }


}

