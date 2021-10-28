package com.xworkz.dp.dao;

//import com.xworkz.dp.dto.LawyerDAO;

public class LawyerDAO {

	private LawyerDAO[] lawyerDAO = new LawyerDAO[10];
    private int cap =0;
    
	public LawyerDAO[] getLawyerDAO() {
		return lawyerDAO;
	}

	private void save(LawyerDAO name) {

		if (this.cap < LawyerDAO.length && name != null) {
			LawyerDAO[cap++] = name;
		} else {
			System.err.println("either array is full or you pointing index to null");
		}
	}

	public void delete(int index) {
		
		if(index>=0 && index<this.LawyerDAO.length && LawyerDAO[index]!=null){
			this.LawyerDAO[index]=null;
			System.out.println("index "+index+" is deleted");
		}
		else {
			System.err.println("not able to delete entered index is already null");
		}
		
	}
	
}
