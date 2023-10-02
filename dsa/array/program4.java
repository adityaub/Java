/*Given an array of size N
 * Return the count of pairs(i,j) with Arr[i]+Arr{j}=k
 * Arr:[3,5,2,1,-3,7,8,15,6,13]
 * N:10;
 * k:10
 *
 * Note:i !=j
 * Output:6
 */

class ArrayDemo{
	public static void main(String[] args){
		int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
		
		int N=10;
		int k=10;
		int count=0;
		int itr=0;

		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				itr++;
				if(i!=j){
					if(arr[i]+arr[j]==k)
						count++;
				}
			}
		}
		System.out.println(count);
		System.out.println(itr);
	}
}
