package asignment;

public class asc1 {
public static void bubbleSort(int [] sort_arr, int len){
        
        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(sort_arr[j+1]<sort_arr[j]){

                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;

                }
            }
        }
    }
    
    public static void main( String args[] ) {
        int [] array = {1,23,12,9,30,2,50};
        int len = array.length;
        bubbleSort(array,len);
	for(int i = 0; i<len; ++i){
            System.out.print(array[i] + " ");
        }
	System.out.println();
	int a[]=new int[len];
	for(int i = 0; i<len; ++i){
           a[i]=array[i];
        }
	int count=0,count1=0;
	for(int i=len-1;i>len-3;i--)
	{
		System.out.println(a[i]);
	}
	
	
    }
}
