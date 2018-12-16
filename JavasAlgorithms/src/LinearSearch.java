
public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
System.out.println(searchInArray(a, 4));
	}
 public static int searchInArray(int[] arr,int a)
 {
	 //int position=-1;
	 for (int i=0;i<arr.length;i++)
	 {
		 if(arr[i]==a)
			return i;
			
	 }
	return -1;
	 
 }
}
