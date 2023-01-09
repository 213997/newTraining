package com.onetomany.cropsentity;

import com.onetomany.Farmerentity.Farmer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Crops")
public class CropesEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int C_id;
	String C_quntity;
	String C_TypeOfCropes;
	@OneToMany
	@JoinColumn(name="Fid")
	Farmer ob;
	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {
		C_id = c_id;
	}
	public String getC_quntity() {
		return C_quntity;
	}
	public void setC_quntity(String c_quntity) {
		C_quntity = c_quntity;
	}
	public String getC_TypeOfCropes() {
		return C_TypeOfCropes;
	}
	public void setC_TypeOfCropes(String c_TypeOfCropes) {
		C_TypeOfCropes = c_TypeOfCropes;
	}
	public Farmer getOb() {
		return ob;
	}
	public void setOb(Farmer ob) {
		this.ob = ob;
	}
	public CropesEntity(int c_id, String c_quntity, String c_TypeOfCropes, Farmer ob) {
		super();
		C_id = c_id;
		C_quntity = c_quntity;
		C_TypeOfCropes = c_TypeOfCropes;
		this.ob = ob;
	}
	
	
	
	
	
	
	

}
