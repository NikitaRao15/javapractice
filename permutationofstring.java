public class permutationofstring {
    public static void removechar(String str,char ch){
        String sb="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){

            }
            else
            sb=sb+str.charAt(i);
        }
        System.out.println(sb);
    }

    public static void main(String args[]){
        String str="hello";
        removechar(str,'l');
    }
    
}
