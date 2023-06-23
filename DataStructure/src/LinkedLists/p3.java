package LinkedLists;
import java.util.Scanner;
public class p3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[100];
		System.out.println("enter size:");
		int len=s.nextInt();int count=0;
		System.out.println("enter elements:");
		for(int i=0;i<len;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter target:");
		int target=s.nextInt();
		for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(arr[j+1]<arr[j]){

                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;

                }
            }
        }
		for(int i=len-1;count<target;i--)
		{
			System.out.println(arr[i]);
			count++;
		}
		
	}
}
