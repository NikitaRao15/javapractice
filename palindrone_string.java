public class palindrone_string {
    public static void main(String args[])
    {
        String str="mam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("String is palindrone which is:" + str);
        }
        else{
            System.out.println("String isn't palindrone");
        }
    }
    
}
