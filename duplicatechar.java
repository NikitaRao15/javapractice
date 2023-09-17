public class duplicatechar {
    public static void removeduplicate(String str){
        String sb="";
        for(int i=0;i<str.length()-1;i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j)){

                }
                
                
            }
            sb=sb+str.charAt(i);
        }
        System.out.println(sb);
    }
    public static void main(String args[]){
        String str="hello";
        removeduplicate(str);
    }
    
}
