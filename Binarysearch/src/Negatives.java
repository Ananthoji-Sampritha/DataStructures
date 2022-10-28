import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int[][] mat={
                {4,3,2,-1},
                {7,5,-2,-3},
                {5,-1,-2,-5}
        };
        int cnt=0;
        for(int i=0;i< mat.length;i++){
            cnt+=numNegatives(mat[i]);
        }
        System.out.println(cnt);
    }
    static int numNegatives(int[] a){
        int l=0,h=a.length,mid;
        while(l<h){
            mid=l+(h-l)/2;
            if(a[mid]<0){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return a.length-l;
    }
}
