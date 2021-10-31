class Square1{

   public static void main(String[] args) {

      Square1 sq=new Square1();
	  sq.squareMatrix();
   }
     void squareMatrix(){
	 
	 for(int row = 1;row <=5;row++){
	  for(int col = 1;col<=5;col++){
	  
	  if(row==1||row==5||col==1||col==5){
	  System.out.print(row+""+col+"\t");
	  }else{
		  System.out.print("\t");
	  }
	  
	   }
	   System.out.println();
	 }
  }



}