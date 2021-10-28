package com.xworkz.curd_operation;

public class Rocket {
	
	
		private String Rocket_name;
		private String launch_date = new String();
		private String[] rocket= new String[5];
		private int counter;

		public Rocket() {

			this("Jul 22, 2019");
			System.out.println("Invoked default Rocket");

		}

		public String getlaunch_date() {
			return launch_date;
		}

		public Rocket(String launch_date) {

			System.out.println("Invoked default Rocket");
			this.launch_date = launch_date;

		}

		public void addRocket(String Rocket_name) {

			System.out.println(" invoked addRocket");
			System.out.println(" name ".concat(Rocket_name));
			if (this.counter < 5) {

				this.rocket[this.counter] = Rocket_name;
				this.counter++;

			} else {

				System.err.println("array is full");
			}
		}

		public void displayRocket() {

			System.out.println("invoked displayRocket");
			for (int i = 0; i < this.rocket.length; i++) {
				String name1 = this.rocket[i];
				System.out.println(name1);
			}

		}

	}



