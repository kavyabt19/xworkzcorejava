package com.xworkz.Hashmap.equal;

public class NewspaperRunner {

	public static void main(String[] args) {
		 Newspaper   Newspaper= new  Newspaper();
		 Newspaper  Newspaper1 = new  Newspaper();
		 
		 System.out.println( Newspaper.toString());
		 System.out.println( Newspaper.hashCode());
		 
		 Newspaper.setLangvage("Kannada");
		 Newspaper1.setLangvage("english");
			System.out.println( Newspaper.equals( Newspaper1));
			
			 Newspaper.setSince(1999);
			 Newspaper1.setSince(1995);
				System.out.println( Newspaper.equals( Newspaper));
	}
}
