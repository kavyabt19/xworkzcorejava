package com.xworkz.dp;

import com.xworkz.dp.dto.*;
import com.xworkz.dp.dao.LawyerDAO;
public class LawyerStarter {

	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				LawyerDTO lawywrDTOs = new LawyerDTO();
				lawywrDTOs.setName("Rohit");
				lawywrDTOs.setQualification("LLB");
				lawywrDTOs.setExperience("2 year");
				lawywrDTOs.setGender('M');
				lawywrDTOs.setAge(25);
				lawywrDTOs.setCasesWon(true);
				lawywrDTOs.setCasesLost(false);

				LawyerDTO lawyerDTOs1 = new LawyerDTO("Pacchu", "LLB", "3 Years", 'M', 28, "Suprime", true, false);
				LawyerDTO lawyerDTOs2 = new LawyerDTO("Ramesh", "LLB", "2 Years", 'M', 28, "Suprime", true, false);
				LawyerDTO lawyerDTOs3 = new LawyerDTO("Chetan", "LLB", "3 Years", 'M', 27, "Suprime", true, false);
				LawyerDTO lawyerDTOs4 = new LawyerDTO("Abhi", "LLB", "1 Years", 'M', 24, "Suprime", true, false);

				LawyerDAO ref = new LawyerDAO();
				ref.save(lawyerDTOs1);
				ref.save(lawyerDTOs3);

				LawyerDAO dao1 = new LawyerDAO();
				dao1.save(lawyerDTOs1);

				dao1.save(new LawyerDTO("Pranu", "LLB", "2 Year", 'M', 26, "Heigh", true, false), 3);

				LawyerDTO[] ref1 = ref.getLawyerDTOs();
				for (int fire = 0; fire < ref1.length; fire++) {
					LawyerDTO ref2 = ref1[fire];
					if (ref2 != null)

					{
						System.out.println(ref2.getName());
						System.out.println(ref2.getQualification());
						System.out.println(ref2.getExperience());
						System.out.println(ref2.getGender());
						System.out.println(ref2.getAge());
						System.out.println(ref2.getCourtType());
						System.out.println(ref2.isCasesWon());
						System.out.println(ref2.isCasesLost());

						System.err.println("~~~~~~~~~~~~~~~");
					} else {
						System.out.println("Reference is pointing to null".concat(String.valueOf(fire)));
					}

					ref.delete(0);
					// ref.display();

					boolean ref3 = dao1.searchByName("Pacchu");
					System.out.println(ref3);

					boolean ref4 = dao1.searchByCasesWon(25);
					System.out.println(ref4);

					String ref5 = dao1.getQualificationByName("Pranu");
					System.out.println(ref5);

					String ref6 = dao1.getExpByName("Pranu");
					System.out.println(ref6);
				}

			}

		}

		



