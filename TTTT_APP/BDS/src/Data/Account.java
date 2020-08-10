/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author admin
 */
public class Account {
    private String usernameNV;
    private String passwordNV;
    private String chucvuNV;

    public Account(String usernameNV, String passwordNV, String chucvuNV) {
        this.usernameNV = usernameNV;
        this.passwordNV = passwordNV;
        this.chucvuNV = chucvuNV;
    }

    public String getUsernameNV() {
        return usernameNV;
    }

    public void setUsernameNV(String usernameNV) {
        this.usernameNV = usernameNV;
    }

    public String getPasswordNV() {
        return passwordNV;
    }

    public void setPasswordNV(String passwordNV) {
        this.passwordNV = passwordNV;
    }

    public String getChucvuNV() {
        return chucvuNV;
    }

    public void setChucvuNV(String chucvuNV) {
        this.chucvuNV = chucvuNV;
    }

    @Override
    public String toString() {
        return "Account{" + "usernameNV=" + usernameNV + ", passwordNV=" + passwordNV + ", chucvuNV=" + chucvuNV + '}';
    }
    
    
    
}
