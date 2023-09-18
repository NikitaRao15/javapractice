import java.util.Arrays;

public class anagram_string {
    public static void anagram(String str,String str1){
        String str3=str.toLowerCase();
        String str4=str1.toLowerCase();
        if(str3.length()==str4.length()){
           char str3array[]=str3.toCharArray();
            char str4array[]=str4.toCharArray();
            Arrays.sort(str3array);
            Arrays.sort(str4array);
            boolean result=Arrays.equals(str3array,str4array);
            if(result){
                System.out.println("anagram");
                }
                else
                {
                    System.out.println("not anagram");
                }
            
        }
      else{
        System.out.println("not anagram");
      }
        }
    public static void main(String args[]){
        String str="race heart";
        String str1="care earth";
        anagram(str,str1);
    }
    
}
