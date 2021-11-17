package com.xworkz.Hospital;

import com.xworkz.HospitalAdmitRule.HospitalAdmitRule;
import com.xworkz.HospitalDischargeRule.HospitalDischargeRule;

public class Hospital {

	private String StateName;
	private String location;
	private boolean govt;
	private HospitalAdmitRule hospitalAdmitRule;
	private HospitalDischargeRule hospitalDischargeRule;

	public Hospital() {
		System.out.println("Invoked Hospital ");
	}

	public Hospital(String stateName, String location, boolean govt, HospitalAdmitRule hospitalAdmitRule,
			HospitalDischargeRule hospitalDischargeRule) {
		super();
		StateName = stateName;
		this.location = location;
		this.govt = govt;
		this.hospitalAdmitRule = hospitalAdmitRule;
		this.hospitalDischargeRule = hospitalDischargeRule;
	}

	public void admitPatient() {
		System.out.println("invoked admitPatient method");
		if (this.hospitalAdmitRule != null) {
			System.out.println(" p a");
			String reg = this.hospitalAdmitRule.register();
			if (reg == "uu") {
				double pay = this.hospitalAdmitRule.payAdvance();
				boolean Vinc = this.hospitalAdmitRule.validInsurance();
				if (pay == 0 && Vinc) {
					System.out.println("vaild for validInsurance");
				} else {
					System.err.println("not valid validInsurance");
				}
			} else {
				System.out.println("registerd");
			}
		} else {
			System.out.println("passing null value");
		}
	}

	public void dischargePatient() {
		System.out.println("invoked dischargePatient ");
		if (this.hospitalDischargeRule != null) {
			System.out.println("p d");
			double payBill = this.hospitalDischargeRule.payBill();
			boolean dis = this.hospitalDischargeRule.discount();
			if (payBill == 10000 && dis) {
				System.out.println("bill payed");

			} else {
				System.out.println(" due bill payment");
			}
		} else {
			System.out.println("passing null value");
		}
	}

}
