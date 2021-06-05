package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity{
	private int Id;
	private String FirstName;
	private String LastName;
	private LocalDate DateOfBirth;
	private String NationalityId;

	public Customer() {

	}

	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		this.Id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.DateOfBirth = dateOfBirth;
		this.NationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
