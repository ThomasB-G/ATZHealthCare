/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register;

/**
 *
 * @author russell
 */
public class User {
    private String name;
    private String address;
    private String gender;
    private String username;
    private String password;
    private String phoneNumber;
    private int age;

    public User(String name, String address, String gender, String username, String password, String phoneNumber, int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", address=" + address + ", gender=" + gender + ", username=" + username + ", password=" + password + ", phoneNumber=" + phoneNumber + ", age=" + age + '}';
    }
    
    
}
