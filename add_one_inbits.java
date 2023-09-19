public class add_one_inbits {
    public static void main(String args[]){
        int num=0;
        if((num & 1)==0 && num!=0){
            num=num|(1<<0);
            System.out.println("addition of 1 in even no is : "+num);
        }
        System.out.println("addition of 1 in odd no is : "+ -(~num));
    }
    
}
