package com.xworkz.Hashmap.equal;

public class Watch {


			private String brand;
			private float price;
			private WatchType type;
			
			
			public Watch() {
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
				return 1000;
			}
			@Override
			public boolean equals(Object obj) {
				System.out.println("Invoked equals method");
				if (obj == null) {
					System.out.println("You have passed null value");
						return false;
				}
					if (obj instanceof Watch) {
						System.out.println("Watch is  an instance of Watch ");
						Watch a = (Watch) obj;
						System.out.println("Casted");
						String WatchType = a.getBrand();
						if (this.brand.equals(WatchType)) {
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

			public WatchType getType() {
				return type;
			}

			public void setType(WatchType type) {
				this.type = type;
			}

		

			
			

		}




