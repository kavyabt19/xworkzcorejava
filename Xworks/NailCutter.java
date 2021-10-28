class NailCutter{
	
	String color;
	float size;
	String shape;
	int layer;
	NailCutterBrand brand;
	
	
	void cut(){
		
		System.out.println("Invoke cutter");
		System.out.println(color);
		System.out.println(size);
		System.out.println(brand);
		
	}
	
	void shaper(){
      
	  System.out.println("Invoke Shaper");
       System.out.println(shape);
		System.out.println(layer);
	}
}