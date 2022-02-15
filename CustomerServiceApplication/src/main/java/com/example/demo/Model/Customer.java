package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="customers")
@Data
public class Customer {
    @Id
        private String customerId;
        private String customerName;
        private int age;
        private String city;
        private String emailid;
        //private int phonenumber;


    public Customer( String customerName, int age, String city, String emailid) {
        this.customerName = customerName;
        this.age = age;
        this.city = city;
        this.emailid = emailid;
        //this.phonenumber = phonenumber;
    }
    public Customer() {
        }
}
