package com.xworkz.Temple;

public class TempleAssociation {

	private DevoteeRules devoteeRules;
	private String name;

	public TempleAssociation() {
		System.out.println("Invoked TempleAssociation no-args const ");
	}

	public TempleAssociation(DevoteeRules devoteeRules,String name) {
		super();
		this.devoteeRules=devoteeRules;
		this.name=name;
	}

	public void allowDevotee() {
		System.out.println("Invoked allowDevotee");
		if (this.devoteeRules != null) {
			System.out.println("passing good");
			boolean slip = this.devoteeRules.SlipperOff();
			if (slip) {
				boolean silence = this.devoteeRules.MaintanSilenc();
				boolean clean = this.devoteeRules.MaintainClean();
				if (silence && clean) {
					System.out.println("good devotee");
				} else {
					System.err.println("bad devotee");
				}

			} else {
				System.err.println("foot");
			}
		} else {
			System.out.println("hhhh");
		}
	}

}
