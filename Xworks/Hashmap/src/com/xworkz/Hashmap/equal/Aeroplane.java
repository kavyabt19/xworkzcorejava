package com.xworkz.Hashmap.equal;

public class Aeroplane {

	private int no;
	 private String company;
	 private String govt;
	 
	 public Aeroplane() {
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
		 if(obj instanceof Aeroplane) {
			 System.out.println("Aeroplane  is the instanceof Aeroplane");
			 Aeroplane  a= (Aeroplane ) obj;
			 System.out.println("casted");
			 String Aeroplane= a.getCompany();
			 if(this.company.equals(Aeroplane )) {
				 System.out.println(" is matched");
				 return true;
			 }
		 }
		 return false;
		 
	 }

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGovt() {
		return govt;
	}

	public void setGovt(String govt) {
		this.govt = govt;
	}
}
