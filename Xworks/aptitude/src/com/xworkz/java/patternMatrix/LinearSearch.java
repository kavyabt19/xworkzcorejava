public class LinearSearch {

	
	
	void Search(String []names, String name) {
		
		int index=0;
		boolean temp=false;
		
		for( index=0;index<names.length;index++) {
			
		       if(name.equals(names[index])){
			System.out.println(name+ "is found "+index);
			temp = true;
			break;
		}
}
 if(temp==true){
	 System.out.println(name+ " name found "+index);
 }else{
	 System.out.println(name+ " not found "+index);
 }
	}
     public static void main(String[] args) {

        LinearSearch search = new LinearSearch();
		String []names = {"kavya","gagan","jeevan","lavanya","ananya"};
		String name ="kavya";
		
		search.Search(names,name);
	}
}
