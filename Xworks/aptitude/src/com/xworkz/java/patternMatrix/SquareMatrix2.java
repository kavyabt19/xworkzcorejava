class SquareMatrix2 {
	
	public static void main(String[] args) {
		
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
  SquareMatrix2 sq=new SquareMatrix2();
  sq.SquareMatrix(row,col);
	}
  void SquareMatrix(int r, int c) {
		
		for(int row=1;row<=r;row++) {
			for(int col=1;col<=c;col++) {
				if(row == col) {
					System.out.print(row+""+col +"\t");
				}else {
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
	}
}
