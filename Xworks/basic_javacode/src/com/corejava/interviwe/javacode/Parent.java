package com.corejava.interviwe.javacode;

public class Parent {
	public  void print() {
		System.out.println("parent");
		 
	 }
}
class child extends Parent{
	public void print() {
		System.out.println("child");
	
}
	class main{
		public  void DoPrint( Parent o) {
			o.print();
		}
	}
	public static void main(String[] args) {

		Parent x=new Parent();
		Parent y=new Parent();
		child z=new child();
		// DoPrint(x);
		// DoPrint(y);
		// DoPrint(z);
	}

}
