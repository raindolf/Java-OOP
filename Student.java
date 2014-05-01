/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise;

/**
 *
 * @author rexo
 */
public class Student {

    private String fn;
    private String ln;
    private String sid;
    int yrOfBirth;

    // private String sid;
    public Student() {

    }

    public int compute() {
        return (2014 - this.yrOfBirth);
    }

    public void setYrOfBirth(int yob) {
        this.yrOfBirth = yob;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public void setln(String ln) {
        this.ln = ln;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getaddress() {
        return "House Number 12, Koliko Street";
    }
 public String getfn() {
        return this.fn;
    }
 public String getln() {
        return this.ln;
    }
 public String getSid() {
        return this.sid;
    }
 

}
