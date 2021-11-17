package com.xworkz.rules.indian;

import com.xworkz.Temple.DevoteeRules;
import com.xworkz.Temple.PublicDevoteeRule;
import com.xworkz.Temple.TempleAssociation;

public class TempleScanner {

	public static void main(String[] args) {

		 DevoteeRules dev = new PublicDevoteeRule();
		 
		 TempleAssociation temple = new TempleAssociation(dev,"ickon");
		 temple.allowDevotee();
	}

}
