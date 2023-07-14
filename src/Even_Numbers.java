
public class Even_Numbers {


public static int[] prefixSum(int arr[]){

    int prefix_array[]=new int[arr.length];
    if(arr[0]%2==0){
        prefix_array[0]=1;
    }
    else{
        prefix_array[0]=0;
    }
    int l=0;
    int r=0;
    for(int i=1;i<arr.length;i++){
    prefix_array[i]+=arr[i]%2==0?prefix_array[i-1]+1:prefix_array[i-1];
    }
    return prefix_array;
    }





    public static void main(String[] args) {
     int arr[]={1,2,3,4,5};
     int range[][]={{0,2},{2,4},{1,4}};
     int pref_array[]=prefixSum(arr);
     int i=0;
     int ans[]=new int[3];
     while (i<range.length){

         int l=range[i][0];
         int r=range[i][1];
         if(l==0){
             ans[i]=pref_array[r];
         }
         else{
             ans[i]=pref_array[r]-pref_array[l-1];
         }

        i++;

     }

        for(int p=0;p<ans.length;p++){
            System.out.println(ans[p]);
        }
    }
}