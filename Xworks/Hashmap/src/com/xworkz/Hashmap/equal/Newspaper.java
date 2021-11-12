package com.xworkz.Hashmap.equal;

public class Newspaper {

	private int since;
	 private String langvage;
	 private String name;
	 
	 public Newspaper() {
			System.out.println("Invoked no arg constructor");
			
		}
		
		public String toString() {
			System.out.println("Invoked to string method");
			return super.toString();
		}
		public int hashcode() {
			System.out.println("Invoked  hashcode method");
			return 50000;
		}
	 public boolean equal(Object obj) {
		 System.out.println("Invoked equal method");
		 if(obj==null) {
			 System.out.println("you have passed null value");
			 return false;
		 }
		 if(obj instanceof Newspaper) {
			 System.out.println("Aeroplane  is the instanceof Aeroplane");
			 Newspaper a= (Newspaper ) obj;
			 System.out.println("casted");
			 String Newspaper= a.getLangvage();
			 if(this.langvage.equals(Newspaper )) {
				 System.out.println(" is matched");
				 return true;
			 }
		 }
		 return false;
		 
	 }

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public String getLangvage() {
		return langvage;
	}

	public void setLangvage(String langvage) {
		this.langvage = langvage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
