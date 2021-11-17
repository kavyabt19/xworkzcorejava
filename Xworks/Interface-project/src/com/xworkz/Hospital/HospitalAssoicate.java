package com.xworkz.Hospital;

import com.xworkz.HospitalAdmitRule.HospitalAdmitRule;
import com.xworkz.HospitalDischargeRule.HospitalDischargeRule;

public class HospitalAssoicate implements HospitalAdmitRule ,HospitalDischargeRule{



@Override
public String register() {
	return null;
}

@Override
public double payAdvance() {
	return 10000;
}

@Override
public boolean validInsurance() {
	return false;
}

@Override
public double payBill() {
	return 100000;
}

@Override
public boolean discount() {
	return false;
}
}
