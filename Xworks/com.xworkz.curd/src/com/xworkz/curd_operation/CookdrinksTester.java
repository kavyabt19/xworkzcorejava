package com.xworkz.curd_operation;

public class CookdrinksTester {

	public static void main(String[] args) {
		
		CoolDrinks cooldrinks = new CoolDrinks();
		String cname = cooldrinks.getBrand();
		System.out.println(cname);
		
		cooldrinks.addCoolDrinks("  coko \n"+ "  paper boat \n"+"  fanta \n"+"  zeera \n"+ "  maa \n"+"  pipsi \n"+"  apple");
		cooldrinks.displaycooldrinks(); 
		cooldrinks.deleteCoolDrinks(0);
        cooldrinks.updateCoolDrinks(1 , "paperboat");
                   
	}

}
