public class Missing {
    public static void main(String[] args) {
        int[] a={2,3,4,7,11,12};
        int k=8;
        System.out.println(missingEle(a,k));

    }
    static int missingEle(int[] a,int k){
        if(a[a.length-1]-a.length+1<=k){
            return a.length+k;
        }
        int miss=-1;
        int l=0,h=a.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]-mid<=k){
                l=mid+1;
            }
            else {
                h=mid-1;
            }
        }
        return k+l;
    }

}
