package com.xworkz.curd_operation;

public class IslandStater {

	public static void main(String[] args) {

		Island island = new Island();
		String cname = island.getOcean();
		System.out.println(cname);

		island.addIsland("lakshadweep");
		
		island.addIsland("Majuli");

		island.addIsland("Golden");

		island.addIsland(" St. Mary's  "+"\n Havelock "+"\n Divar ");
	
		island.displayIsland();
	}

}
