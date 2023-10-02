/*Given an array of size N count the number of elements having atleast 1 element greater than itself
 * Arr:[2,5,1,4,8,0,8,1,3,8]
 * N:10
 * output:7
 */

class ArrayDemo{
	public static void main(String[] args){
		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
		int count=0;
		int N=10;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(arr[i] < arr[j]){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
