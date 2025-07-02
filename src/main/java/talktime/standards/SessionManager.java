/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talktime.standards;

/**
 *
 * @author Gopal
 */
public class SessionManager {
    private static boolean loggedIn = false;
    private static int sno;
    private static String email;
    
    public static boolean isLoggedIn() {
        return loggedIn;
    }
    
    public static void setLoggedIn(boolean loggedIn) {
        SessionManager.loggedIn = loggedIn;
    }
    
    public static int getSno() {
        return sno;
    }
    
    public static void setSno(int sno) {
        SessionManager.sno = sno;
    }
    
    public static String getEmail() {
        return email;
    }
    
    public static void setEmail(String email) {
        SessionManager.email = email;
    }

}
