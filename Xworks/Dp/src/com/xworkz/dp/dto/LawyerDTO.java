package com.xworkz.dp.dto;

public class LawyerDTO {
	
	
		private String name;
		private String qualification;
		private String experience;
		private char gender;
		private int age;
		private String courtType;
		private boolean casesWon;
		private boolean casesLost;

		public LawyerDTO() {
			System.out.println("invoked no args const");
		}

		public LawyerDTO(String name, String qualification, String experience, char gender, int age, String courtType,
				boolean casesWon, boolean casesLost) {
			super();
			this.name = name;
			this.qualification = qualification;
			this.experience = experience;
			this.gender = gender;
			this.age = age;
			this.courtType = courtType;
			this.casesWon = casesWon;
			this.casesLost = casesLost;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public String getExperience() {
			return experience;
		}

		public void setExperience(String experience) {
			this.experience = experience;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getCourtType() {
			return courtType;
		}

		public void setCourtType(String courtType) {
			this.courtType = courtType;
		}

		public boolean isCasesWon() {
			return casesWon;
		}

		public void setCasesWon(boolean casesWon) {
			this.casesWon = casesWon;
		}

		public boolean isCasesLost() {
			return casesLost;
		}

		public void setCasesLost(boolean casesLost) {
			this.casesLost = casesLost;
		}

	}



