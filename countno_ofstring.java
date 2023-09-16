public class countno_ofstring {
    public static int countword(String str){
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' '){
                count++;
            }
           
        }
        int totalword=str.length()-count;

        return totalword;

    }
    public static void main(String args[]){
        String str="nikki  ita   rao";
        System.out.println(countword(str));
    }
    
}
