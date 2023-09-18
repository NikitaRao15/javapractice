public class bit_at_ith {
    public static void setIthBit(int num,int pos)
{
    //set ith bit..
    System.out.println(num|(1<<pos));

}

public static void clearIthBit(int num,int pos){
    //clear ith bit...
    System.out.println(num & (~ (1<<pos)));  
}
public static void updateIthBit(int num,int pos,int newbit){
    //update ith bit..
int clearbit=num & (~(1<<pos));
int setbit=clearbit|(newbit<<pos);
System.out.println(setbit); 
}
    public static void main(String args[])
    {
        int num=10;
        int pos=1;
//get ith bit...
        if((num&(1<<pos))==0)
        {
            System.out.println("no at ith position is 0");
        }
else{
    System.out.println("no at ith pos is 1");
}
setIthBit(num,pos);
clearIthBit(num,pos);
updateIthBit(num,pos,0);
    }
}  

