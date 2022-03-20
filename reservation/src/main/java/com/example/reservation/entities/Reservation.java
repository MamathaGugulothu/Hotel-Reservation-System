package com.example.reservation.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reservation 
{
@Id
private long id;
private String Name;
private long Mobileno;
private String Address,City,State;
private long pincode;
private String proof;
private long proofid;
public long getId()
{
	return id;
}

public void setId(long id)
{
	this.id = id;
}

public String getName() 
{
	return Name;
}

public void setName(String name)
{
	Name = name;
}

public long getMobileno()
{
	return Mobileno;
}

public void setMobileno(long mobileno) 
{
	Mobileno = mobileno;
}

public String getAddress() 
{
	return Address;
}

public void setAddress(String address)
{
	Address = address;
}

public String getCity() 
{
	return City;
}

public void setCity(String city) 
{
	City = city;
}

public String getState()
{
	return State;
}

public void setState(String state)
{
	State = state;
}

public long getPincode()
{
	return pincode;
}

public void setPincode(long pincode)
{
	this.pincode = pincode;
}

public String getProof()
{
	return proof;
}

public void setProof(String proof) 
{
	this.proof = proof;
}

public long getProofid()
{
	return proofid;
}

public void setProofid(long proofid)
{
	this.proofid = proofid;
}
public Reservation()
	{
	super();
	// TODO Auto-generated constructor stub
}

	public Reservation(long id, String name, long mobileno, String address, String city, String state, long pincode,
			String proof, long proofid) {
		super();
		this.id = id;
		Name = name;
		Mobileno = mobileno;
		Address = address;
		City = city;
		State = state;
		this.pincode = pincode;
		this.proof = proof;
		this.proofid = proofid;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", Name=" + Name + ", Mobileno=" + Mobileno + ", Address=" + Address
				+ ", City=" + City + ", State=" + State + ", pincode=" + pincode + ", proof=" + proof + ", proofid="
				+ proofid + "]";
	}

	public static void main(String[] args) {

	}

}
