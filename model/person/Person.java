package model.person;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {
    private final int id;
    private final String fullName;
    private String address;
    private String phone;
    private String email;
    private final LocalDate dateOfBirth;

    protected Person(int id, String fullName, String address, String phone, String email, LocalDate dateOfBirth) {
        validate(id, fullName, dateOfBirth, phone, email);
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    protected Person(int id, String fullName, LocalDate dateOfBirth) {
        validate(id, fullName, dateOfBirth);
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    private void validate(int id, String fullName, LocalDate dateOfBirth ) {
        try {
            if (id < 0) {
                throw new IllegalArgumentException("ID cannot be negative.");
            }
            if (fullName.contains("123456789/\\!@#$%^&*()_+={}[]|><,`~")) {
                throw new IllegalArgumentException("Name cannot contain only letters");
            }
            if(dateOfBirth.getYear() > LocalDate.now().getYear()){
                throw new IllegalArgumentException("Year cannot exceed the curent year ");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
            throw e;
        }
    }
    private void validate(int id, String fullName, LocalDate dateOfBirth, String phone, String email) {
        try {
            if (id < 0) {
                throw new IllegalArgumentException("ID cannot be negative.");
            }
            if (fullName.contains("0-9/\\!@#$%^&*()_+={}[]|><,`~")) {
                throw new IllegalArgumentException("Name cannot contain only letters");
            }
            if(dateOfBirth.getYear() > LocalDate.now().getYear()){
                throw new IllegalArgumentException("Year cannot exceed the curent year ");
            }
            if (phone == null || phone.isEmpty() || phone.matches("[0-9\\s\\-()]+")) {
                throw new  IllegalArgumentException("Phone number can't contain any letters");
            }
            if(email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
                throw new  IllegalArgumentException("Mail is invalid");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
            throw e;
        }
    }

    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public int getAge() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.dateOfBirth, today);
        return period.getYears();
    }
    
    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("id=").append(id);
        sb.append(", fullName='").append(fullName).append("'");
        sb.append(", address='").append(address).append("'");
        sb.append(", phone='").append(phone).append("'");
        sb.append(", email='").append(email).append("'");
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append("}");
        return sb.toString();
    }
}
