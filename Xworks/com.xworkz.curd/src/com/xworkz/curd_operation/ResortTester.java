package com.xworkz.curd_operation;

public class ResortTester {

	

		public static void main(String[] args) {

			Resort Resort = new Resort();
			String cname = Resort.getRlocation();
			System.out.println(cname);

			Resort.addResort("PAI RESORTS ");
			Resort.addResort("Utsav");
			Resort.addResort("mallanad");
			Resort.addResort("sri sai");
			Resort.addResort("coorg wilderness ");

			Resort.displayResort();
		}

	}


