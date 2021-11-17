package com.xworkz.Temple;

public class PublicDevoteeRule implements DevoteeRules  {

	@Override
	public boolean SlipperOff() {
		System.out.println("Invoked SlipperOff");
		return null;
	}

	@Override
	public boolean MaintanSilenc() {
		System.out.println("Invoked MaintanSilenc");
		return true;
	}

	@Override
	public boolean MaintainClean() {
		System.out.println("Invoked MaintanClean");
		return true;
	}

}
