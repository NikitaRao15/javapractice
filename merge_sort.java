public class merge_sort{

    public static  void merge(int arr[],int s,int mid,int e){
        int n1=mid-s+1;
        int n2=e-mid;

        int a[]=new int[n1];
        int b[]=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=arr[s+i];
        }
        for(int i=0;i<n2;i++){
            b[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=s;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                arr[k]=a[i];
                k++;
                i++;
            }
            else{
                arr[k]=b[j];
                k++;
                j++;

            }
        }
        while(i<n1)
        {
            arr[k]=a[i];
            k++;
            i++;
        }
         while(j<n2)
        {
            arr[k]=b[i];
            k++;
            j++;
        }

    }

    public static void mergeSort(int arr[],int s,int e){
        if(s<e){
            int mid=(s+e)/2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid+1, e);
            merge(arr,s,mid , e);

        }
    }
    public static void main(String args[]){
        int arr[]={5,3,0,8,1,9,4};
        mergeSort(arr,0,7);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}