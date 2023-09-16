

public class String_compression {

    //O(n)

    public static String compression(String str){
     StringBuilder strnew =new StringBuilder("");

        for(int i=0;i<str.length();i++){
           Integer count=1;
           while(str.charAt(i)==str.charAt(i+1) && i<str.length()-1 )
           {
            count++;
            i++; 
           }
           //strnew+=str.charAt(i);
           strnew.append(str.charAt(i));
           if(count>1)
           {
            strnew.append(count.toString());
            //strnew +=count.toString();
           }
        }

        return strnew.toString();
    }
    public static void main(String args[])
    {
        String str="aaabbccdddd";
       System.out.println(compression(str));

    }
    
}
