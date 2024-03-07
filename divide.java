public class divide {

    public static void printarry(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.err.println();

    }

    public static void margeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
         int mid=(si +ei)/2;
         margeSort(arr, si, mid);  //left part
         margeSort(arr, mid+1, ei);  //right part
         marge(arr, si, mid,ei);
    }

    public static void marge(int arr[],int si,int mid,int ei){
              int temp[]=new int [ei-si+1];
              int i=si; 
              int j=mid+1;
              int k=0;

              while(i<=mid && j<=ei){
                if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++; 
                }
                else{
                    temp[k]=arr[j];
                    j++; 
                }
                k++;
                }
             // left part
                while(i<=mid){
                    temp[k++]=arr[i++];
                }

            // right part
                while(j<=ei){
                    temp[k++]=arr[j++];
                  }
               
            // copy temp to original arr
              for(k=0,i=si; k<temp.length; k++ , i++){
                arr[i]=temp[k];
              }
              }   
    public static void main(String[] args) {
     int arr[]={3,7,4,9,2,7,5,0};
     margeSort(arr, 0, arr.length-1);  //left part
     printarry(arr);
    }
    }
