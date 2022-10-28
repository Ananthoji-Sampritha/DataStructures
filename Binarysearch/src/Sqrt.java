import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(sqrtBS(n));
    }
    static int sqrtBS(int n){
        int l=1;
        int h=n;
        int ans=-1;
        int mid=l+(h-l)/2;
        if (n==1 || n==0){
            return n;
        }
        while(l<=h){
            if(mid>n/mid){
                h=mid-1;
            }
            else{
                if(mid+1>n/(mid+1)){
                    ans=mid;
                    break;
                }
                l=mid+1;
            }
            mid=l+(h-l)/2;

        }
        return ans;
    }
}
