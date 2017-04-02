package com.example.sairam.firebase;

/**
 * Created by sai ram on 02-04-2017.
 */

public class Users {
    private String u_id;
    private String pass;


    public Users(){}
    public Users(String u_id,String pass) {
        this.u_id = u_id;
        this.pass=pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getU_id() {

        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }
}
