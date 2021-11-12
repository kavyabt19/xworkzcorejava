package com.xworkz.Hashmap.equal;

public class Ipod {
		private String modelNo;
		private int memorySize;

		public Ipod() {
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
				if (obj instanceof Ipod) {
					System.out.println("Ipod is  an instance of ipod ");
					Ipod a = (Ipod) obj;
					System.out.println("Casted");
					String storage = a.getModelNo();
					if (this.modelNo.equals(storage)) {
						System.out.println("Model number have matched");
						return true;
					}

				}
				return false;
		}

		public String getModelNo() {
			return modelNo;

		}

		public void setModelNo(String modelNo) {
			this.modelNo = modelNo;
		}

		public int getMemorySize() {
			return memorySize;
		}

		public void setMemorySize(int memorySize) {
			this.memorySize = memorySize;
		}

	}




