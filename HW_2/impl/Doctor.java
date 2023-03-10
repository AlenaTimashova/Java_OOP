package Java_OOP.HW_2.impl;

import Java_OOP.HW_2.Animal;

public class Doctor extends Human {
    private String firstName;
    private String lastName;
    private int room;
    private int telNumber;

    public int getTelNumber() {
        return telNumber;
    }
    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }
    
    public void Cure(Animal animal) {
        System.out.printf("I cure %s %s %n", animal.getType(), animal.getName());
    }

    public void PrescribeMed(Animal animal) {
        System.out.printf("I make a prescription for %s %s %n", animal.getType(), animal.getName());
    } 
    @Override
    public void getIll() {
        System.out.println("Doctor got ill");;
    }

    @Override
    public int getSwimSpeed() {
        return 20;
    }

    @Override
    public int getRunSpeed() {
        return 40;
    }
}