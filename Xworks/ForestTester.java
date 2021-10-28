class ForestTester{


      public static void main(String[] traveler){
	  
	   Forest forest;
        forest = new Forest("vana","USA","washintan");
	   System.out.println(forest.name);
	   System.out.println(forest.location);
	   System.out.println(forest.state);
	   
	   State  state= new State(31,"Bhommi","Banglore");
	     System.out.println(state.name);
	     System.out.println(state.noOfDistricts);
	     System.out.println(state.cmName);
		 System.out.println(state.CapitalCity);
		 
	  CapitalCity capita =new CapitalCity( "Banglore",987654321,"IT company");
		  
		  System.out.println(capita.name);
	     System.out.println(capita.population);
	     System.out.println(capita.famousFor);
		
	    }


}