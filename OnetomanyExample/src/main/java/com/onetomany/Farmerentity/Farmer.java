package com.onetomany.Farmerentity;

import java.util.List;

import org.hibernate.engine.internal.Cascade;

import com.onetomany.cropsentity.CropesEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Farmer")
public class Farmer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Fid;
	String FName;
	long PhoneNo;
	int NoOflands;
	
	
@OneToMany (cascade=CascadeType.ALL)
private List<CropesEntity> crp;


public Farmer(int fid, String fName, long phoneNo, int noOflands, List<CropesEntity> crp) {
	super();
	Fid = fid;
	FName = fName;
	PhoneNo = phoneNo;
	NoOflands = noOflands;
	this.crp = crp;
}


public int getFid() {
	return Fid;
}


public void setFid(int fid) {
	Fid = fid;
}


public String getFName() {
	return FName;
}


public void setFName(String fName) {
	FName = fName;
}


public long getPhoneNo() {
	return PhoneNo;
}


public void setPhoneNo(long phoneNo) {
	PhoneNo = phoneNo;
}


public int getNoOflands() {
	return NoOflands;
}


public void setNoOflands(int noOflands) {
	NoOflands = noOflands;
}


public List<CropesEntity> getCrp() {
	return crp;
}


public void setCrp(List<CropesEntity> crp) {
	this.crp = crp;
}
	

}
