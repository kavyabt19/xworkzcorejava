package com.xworkz.dp.dto;

public class Files {
	
	//no return type,no param
	public static void fileName()
	{
		System.out.println("certificate fiels");
		
	}
	
	////no return type,with param
	public static void StudiInfo(String stream) {
		
		System.out.println("student information   "+stream);
	}

	////with return type,no param
	
	
	public static float cgpa(){
		
		return 7.5f;
	}
	
	
	//with return type,with param
	
	public static float totalCgpa(float a,float b,float c,float d) {
		
		return(a+b+c+d);
		
	}
	
    public static float totalCgpa(float a,float b,float c) {
		
		return(a+b+c);
		
	}
	
	public static void main(String[] args) {

		
		Files.fileName();
		String stream="BE";
		Files.StudiInfo(stream);
		float cgpano =Files.cgpa();
		System.out.println(cgpano);
		float TCgpa =Files.totalCgpa(6.5f, 8.9f, 7.5f);
		System.out.println(TCgpa);
		float TCgpa1 = Files.totalCgpa(7.8f, 8.9f, 9.0f, 5.9f)	;
		System.out.println(TCgpa1);
	}

}
