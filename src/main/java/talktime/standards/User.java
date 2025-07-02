/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talktime.standards;

import java.util.Date;

/**
 *
 * @author Gopal
 */
public class User {
    private int userId;
    private String username;
    private String email;
    private String pass;
    private String phone;
    private String gender;
    private String bio;
    private String dob;
    private Date reg_date;

    public User() { }

    public User(int userId,
                String username,
                String email,
                String pass,
                String phone,
                String gender,
                Date reg_date,
                String dob,
                String bio) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
        this.gender = gender;
        this.reg_date = reg_date;
        this.bio=bio;
        this.dob=dob;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }
    
    public String getBio(){
        return bio;
    }
    public void setBio(String bio){
        this.bio=bio;
    }
     public String getdob(){
        return dob;
    }
    public void setdob(String dob){
        this.dob=dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", reg_date=" + reg_date + '\'' +
                ", bio=" + bio + '\'' +
                ", dob=" + dob +               
                '}';
    }
}
