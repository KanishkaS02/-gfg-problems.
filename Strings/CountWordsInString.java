import java.util.*;
public class CountWordsInString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(countwords(s));
        sc.close();

    }
    public static int countwords(String s){
        s=s.trim();
        int count=1;
        if(s.length()==0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count+=1;
            }
        }
        return count;
    }
}