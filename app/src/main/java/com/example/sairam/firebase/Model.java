package com.example.sairam.firebase;

import java.io.Serializable;

/**
 * Created by mac on 02/04/17.
 */

public class Model implements Serializable {

    String UPD1,UPD3,UPD7,UPW6;
    String SPD1,SPD3,SPD7,SPW6;
    String DD1,DD3,DD7,DW6;
    String VD1,VD3,VD7,VW6;



    Model(String UPD1,String UPD3,String UPD7,String UPW6,
          String SPD1,String SPD3,String SPD7,String SPW6,
          String DD1,String DD3,String DD7,String DW6,
          String VD1,String VD3,String VD7,String VW6
    )
    {
        this.UPD1 = UPD1;
        this.UPD3 = UPD3;
        this.UPD7 = UPD7;
        this.UPW6 = UPW6;

        this.SPD1 = SPD1;
        this.SPD3 = SPD3;
        this.SPD7 = SPD7;
        this.SPW6 = SPW6;

        this.DD1 = DD1;
        this.DD3 = DD3;
        this.DD7 = DD7;
        this.DW6 = DW6;

        this.VD1 = VD1;
        this.VD3 = VD3;
        this.VD7 = VD7;
        this.VW6 = VW6;

    }



    public String getSPD1() {
        return SPD1;
    }

    public void setSPD1(String SPD1) {
        this.SPD1 = SPD1;
    }

    public String getSPD3() {
        return SPD3;
    }

    public void setSPD3(String SPD3) {
        this.SPD3 = SPD3;
    }

    public String getSPD7() {
        return SPD7;
    }

    public void setSPD7(String SPD7) {
        this.SPD7 = SPD7;
    }

    public String getSPW6() {
        return SPW6;
    }

    public void setSPW6(String SPW6) {
        this.SPW6 = SPW6;
    }






    public String getUPD1() {
        return UPD1;
    }

    public void setUPD1(String UPD1) {
        this.UPD1 = UPD1;
    }


    public String getUPD3() {
        return UPD3;
    }

    public void setUPD3(String UPD3) {
        this.UPD3 = UPD3;
    }

    public String getUPD7() {
        return UPD7;
    }

    public void setUPD7(String UPD7) {
        this.UPD7 = UPD7;
    }


    public String getUPW6() {
        return UPW6;
    }

    public void setUPW6(String UPW6) {
        this.UPW6 = UPW6;
    }



//TEST
    String helth;
     String social;

    public String getHelth() {
        return helth;
    }

    public void setHelth(String helth) {
        this.helth = helth;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }
}
