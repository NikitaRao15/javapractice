
public class bit_manipulation {
    public static void main(String[] args) {
        // int sizeInBytes = Long.BYTES; // BYTES is a constant representing the size of an int in bytes
        // int sizeInBits = Integer.SIZE;   // SIZE is a constant representing the size of an int in bits

    //     System.out.println("Size of int (in bytes): " + sizeInBytes);
    //     System.out.println("Size of int (in bits): " + sizeInBits);

    //         // Write your code here
    //  System.out.println("Size of int (in bytes): " +Integer.BYTES );
    //  System.out.println("Size of int (in bits): " + Long.BYTES);
    //  System.out.println("Size of int (in bits): " + Float.BYTES);
    //  System.out.println("Size of int (in bits): " + Double.BYTES);
    //  System.out.println("Size of int (in bits): " + Character.BYTES);

    //

//Scanner sc=new Scanner (System.in);
int num=89;
int bit=1;
if((num & bit) == 1)
{
System.out.println("odd no.");
}
else{
    System.out.println("even no");
}

}


    
}
