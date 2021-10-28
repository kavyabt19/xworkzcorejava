class SaloonRunner{

public static void main(String[] chair){

      Saloon saloon =new Saloon();
	  
	  
	  saloon.name="Green Trends";
	  saloon.location="BTM";
	  saloon.openTime=9.0f;
	  saloon.closeTime=9.0f;
	  saloon.branch=SaloonBranch.BTM;
	  
	  
	  Saloon saloon1=new Saloon();
	  saloon1.name="xyz";
	  saloon1.location="MGROAD";
	  saloon1.openTime=9.0f;
	  saloon1.closeTime=9.0f;
	  saloon1.branch=SaloonBranch.MGROAD;
	  
	  saloon.haircut();
	  saloon1.haircut();
	  

   }


}







