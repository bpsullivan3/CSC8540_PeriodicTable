package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Element {
    private String name;
    private int at_num;
    private double at_weight;
    private double boiling_pt;
    private double melting_pt;
    private String desc;
    private String image_link;

    public Element(String key){
        //TODO Use key to lookup data in MySQL Database

        String url = "FILLER";
        String user = "csc8540";
        String password = "chem";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            String query = "SELECT * FROM Elements WHERE Element_Name = " + key;
            ResultSet rs = st.executeQuery(query);

            name = rs.getString(2);
            at_num = rs.getInt(3);
            at_weight = rs.getDouble(4);
            boiling_pt = rs.getDouble(5);
            melting_pt = rs.getDouble(6);
            desc = rs.getString(7);
            image_link = rs.getString(8);

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public String getName(){
        return name;
    }

    public int getAt_num(){
        return at_num;
    }

    public double getAt_weight() {
        return at_weight;
    }

    public double getBoiling_pt(){
        return boiling_pt;
    }

    public double getMelting_pt(){
        return melting_pt;
    }

    public String getDesc(){
        return desc;
    }

    public String getImage_Link(){
        return image_link;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAt_num(int at_num) {
        this.at_num = at_num;
    }

    public void setAt_weight(double at_weight) {
        this.at_weight = at_weight;
    }

    public void setBoiling_pt(double boiling_pt) {
        this.boiling_pt = boiling_pt;
    }

    public void setMelting_pt(double melting_pt) {
        this.melting_pt = melting_pt;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage_Link(String image_link) {
        this.image_link = image_link;
    }

}
