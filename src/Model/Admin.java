package Model;

import Util.Verify;

public class Admin implements Verify {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
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


    @Override
    public boolean verifyUser(String username, String password) {
       if (username.equals(this.username) && password.equals(this.password)) {
           return true;
       }
       return false;
    }

    @Override
    public void login() {
        if (verifyUser(this.username,this.password)){
            //Aqui se implementa el login
        }
        logout();

    }

    @Override
    public void logout() {


    }
}
