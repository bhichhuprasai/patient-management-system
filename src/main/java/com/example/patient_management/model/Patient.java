package com.example.patient_management.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patients")
public class Patient {

    @Id
    private String id;
    private String name;
    private int age;
    private String disease;
    private String phone;

    public Patient() {}

    public Patient(String name, int age, String disease, String phone) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.phone = phone;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
