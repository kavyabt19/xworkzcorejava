package com.xworkz.Hospital;

public class HospitalTester {

	public static void main(String[] args) {

		Hospital hospital=new Hospital("karnataka", "banglore", false, null, null);
		hospital.admitPatient();
		hospital.dischargePatient();

}
}
