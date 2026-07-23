import java.util.*;
public class Countwords{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(countwords(s));
        sc.close();

    }
    public static int countwords(String s){
        int count=1;
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
}