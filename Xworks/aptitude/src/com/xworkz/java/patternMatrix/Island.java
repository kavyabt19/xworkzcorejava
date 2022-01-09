 class Island {
	
	
	private String name;
	private String ocean;
	private String[] island=new String[5];
	
	
          Island() {
		
		this("Arabian Sea");
		System.out.println("Invoked default Island");
		
		
	}
	
        Island(String ocean){
		
		System.out.println("Invoked default Island");
		this.ocean=ocean;
		
		
	}
}
