package com.unihyr.Unihyr.drives_management.model;

public class Drive {
    private String drdrive,drlocation,drpostion,drcontactperson,date_time;
    private int Candiadate,shortlisted,rejected,no_show;
    public Drive(String drdrive, String drlocation, String drpostion, String drcontactperson, String date_time, int candiadate, int shortlisted, int rejected, int no_show) {
        this.drdrive = drdrive;
        this.drlocation = drlocation;
        this.drpostion = drpostion;
        this.drcontactperson = drcontactperson;
        this.date_time = date_time;
        Candiadate = candiadate;
        this.shortlisted = shortlisted;
        this.rejected = rejected;
        this.no_show = no_show;
    }

    public String getDrdrive() {
        return drdrive;
    }

    public void setDrdrive(String drdrive) {
        this.drdrive = drdrive;
    }

    public String getDrlocation() {
        return drlocation;
    }

    public void setDrlocation(String drlocation) {
        this.drlocation = drlocation;
    }

    public String getDrpostion() {
        return drpostion;
    }

    public void setDrpostion(String drpostion) {
        this.drpostion = drpostion;
    }

    public String getDrcontactperson() {
        return drcontactperson;
    }

    public void setDrcontactperson(String drcontactperson) {
        this.drcontactperson = drcontactperson;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public int getCandiadate() {
        return Candiadate;
    }

    public void setCandiadate(int candiadate) {
        Candiadate = candiadate;
    }

    public int getShortlisted() {
        return shortlisted;
    }

    public void setShortlisted(int shortlisted) {
        this.shortlisted = shortlisted;
    }

    public int getRejected() {
        return rejected;
    }

    public void setRejected(int rejected) {
        this.rejected = rejected;
    }

    public int getNo_show() {
        return no_show;
    }

    public void setNo_show(int no_show) {
        this.no_show = no_show;
    }
}
