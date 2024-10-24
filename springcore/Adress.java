package org.example.springcore;

import org.springframework.stereotype.Component;

@Component
public class Adress {
    private String city;
    private int pincode;

    public String getCity() {
        return city;
    }

    public Adress(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    public Adress() {
        System.out.println("Defaul constructor of Address");
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public void setCity(String city) {
        System.out.println("I am setter of city");
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        System.out.println("I am setter of Pincode");
        this.pincode = pincode;
    }
}
