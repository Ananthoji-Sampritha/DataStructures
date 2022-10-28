import java.util.Scanner;

public class sUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(change(s1, s2));
    }
        static String change(String s1, String s2){
            int i=0;
            String res="";
            while(i<s1.length() && i<s2.length() ){
                res+=(s1.charAt(i));
                res+=(s2.charAt(i));
                i++;
            }
            while (i<s1.length()){
                res+=(s1.charAt(i));
                i++;

            }
            while(i<s2.length()){
                res+=(s2.charAt(i));
                i++;
            }
            return  res;

        }



    }

