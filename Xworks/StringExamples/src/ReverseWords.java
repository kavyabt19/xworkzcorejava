
public class ReverseWords {

	public static void main(String[] args) {

		
		String str= "Hello kavya";
		String[] strArray=str.split("  ");
		
		for(String a: strArray) {
			System.out.println(a);
		}
		
		for(int i=0;i<2;i++) {
			char[] s1 =strArray[i].toCharArray();
			for(int j =s1.length-1 ; j>=0; j--) {
				System.out.println(s1[j]);
			}
			System.out.println();
		}
	}

}
