package xworkzDefault;

class Chocolate extends Cake {

	void displya() {
		System.out.println("Chocolate default modifier");
	}

	public static void main(String[] args) {
		Chocolate chocolate = new Chocolate();
		chocolate.cake();
		chocolate.displya();
	}

}
