package com.xworkz.Hashmap.equal;

public class Bag {


		private String brand;
		private float price;
		private BagColor color;
		private int sections;
		
		public Bag() {
			System.out.println("Invoked no argument constructor");
		}

		@Override
		public String toString() {
			System.out.println("Invoked to String Method");
			return super.toString();
		};

		@Override
		public int hashCode() {
			System.out.println("Invoked hashcode method");
			return 100;
		}
		@Override
		public boolean equals(Object obj) {
			System.out.println("Invoked equals method");
			if (obj == null) {
				System.out.println("You have passed null value");
					return false;
			}
				if (obj instanceof Bag) {
					System.out.println("Bag is  an instance of Bag ");
					Bag a = (Bag) obj;
					System.out.println("Casted");
					String storage = a.getBrand();
					if (this.brand.equals(storage)) {
						System.out.println("brand  have matched");
						return true;
					}

				}
				return false;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public BagColor getColor() {
			return color;
		}

		public void setColor(BagColor color) {
			this.color = color;
		}

		public int getSections() {
			return sections;
		}

		public void setSections(int sections) {
			this.sections = sections;
		}
		

	}


