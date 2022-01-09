class Revers{

   public static void main(String[] args){
   String str = "KAVYA",strng="";
   
    char ch;
	
	for(int i=0;i<str.length();i++){
	
	ch=str.charAt(i);
	strng = ch+strng;
	
	}
   System.out.println(strng);

  }
}