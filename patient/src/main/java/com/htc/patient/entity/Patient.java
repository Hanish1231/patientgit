package com.htc.patient.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

	@Id
	private long patientId;
	private String patientFirstName;
	private String patientLastName;
	private long phoneNumber;
	private long emergencyNumber;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(long patientId, String patientFirstName, String patientLastName, long phoneNumber,
			long emergencyNumber) {
		super();
		this.patientId = patientId;
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.phoneNumber = phoneNumber;
		this.emergencyNumber = emergencyNumber;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getEmergencyNumber() {
		return emergencyNumber;
	}

	public void setEmergencyNumber(long emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (patientId ^ (patientId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (patientId != other.patientId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientFirstName=" + patientFirstName + ", patientLastName="
				+ patientLastName + ", phoneNumber=" + phoneNumber + ", emergencyNumber=" + emergencyNumber + "]";
	}
}
