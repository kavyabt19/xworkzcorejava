class PluseIndex{

public static void main(String[] args) {

      
		int num1=Integer.parseInt(args[0]);
		
		int num2=Integer.parseInt(args[1]);
      PluseIndex sq=new PluseIndex();
	  sq.squareMatrix(row,col);
   }
     void squareMatrix(int r,int c){
		 int n=5;
	 int mid(r/2)+1;
	 if(r%2!=0)
	 {
	 for(int row = 1;row <=n;row++){
	  for(int col = 1;col<=n;col++){
		 int mid; 
		  if(row==mid||col==mid){
	  
	 
	  System.out.print(row+""+col+"\t");
	  }else{
		  System.out.print("\t");
	  }
	  
	   }
	   System.out.println();
	 }
  }
	 }






}