package com.xworkz.dp.dto;

public class Table {
	
	 Type type;
	float size ;
	
	Table(Type type,
	float size ){
		
		System.out.println("table is invoked");
		
		
	}
	
	/*Table(Table t){
		
		type=t.type;
		size=t.size;
		
	*/
	
	void disply() {
		
		System.out.println(type + "  \n " +size);
		
		
	}
	
	

public enum Type{
	
	GLASS_TABLE,WOOD_TABLE,PLASTIC_TABLE,METAL_TABLE;
}


	public static void main(String[] args) {

		
		Table table =new Table(Type.GLASS_TABLE,30.5f);
		// table=new Table(table);
		
		table.type=Type.METAL_TABLE;
        table.size=30.5f;
        
        
        table.disply();
        table.disply();
	}

}
