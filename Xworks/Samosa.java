class Samosa{
 
   float cost ;
   boolean taste ;
   Samosasize size;
   String[] ingredients;
   
   Samosa(float cost,boolean taste){
   System.out.println("Created using  float,boolean");
   this.cost=cost;
   this.taste=taste;
   
   }
   Samosa(Samosasize size,String[] ingredients){
   System.out.println("Created using  SamosaSize ,,String[]");
   this.cost=cost;
   this.ingredients=ingredients;
   }
   Samosa(float cost,boolean taste, Samosasize size,String[] ingredients){
   
   this(cost,taste);
   this.size=size;
   this.ingredients=ingredients;
   System.out.println("Created using float,boolean,Samosas	ize,String[]");
   }


}