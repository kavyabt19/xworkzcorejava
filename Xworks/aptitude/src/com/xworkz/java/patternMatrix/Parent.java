public class LinearSearch {

	public static void main(String[] args) {

		String []names = {"kavya","gagan","jeevan","lavanya","ananya"};
		String name ="kavya";
	}
	
	void Search(String []names, String name) {
		
		for(int index=0;index<names.length;index++) {
			
		       if(name.equals(index))
			System.out.println(name+ "is found "+index);
		}
}
}
