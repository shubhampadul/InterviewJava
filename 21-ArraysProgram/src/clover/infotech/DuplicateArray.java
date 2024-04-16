package clover.infotech;

public class DuplicateArray {

	public static void main(String[] args) {
		int a[] = {4,5,4,6,8,9,1,1};
		for(int i=0; i< a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
