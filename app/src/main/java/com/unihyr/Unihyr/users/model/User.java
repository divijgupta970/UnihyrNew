package com.unihyr.Unihyr.users.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User implements Parcelable
{

    @SerializedName("userEmail")
    @Expose
    private String userEmail;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("userBusinesses")
    @Expose
    private List<UserBusiness> userBusinesses = null;
    @SerializedName("organization")
    @Expose
    private Organization organization;
    @SerializedName("registration")
    @Expose
    private Registration registration;
    @SerializedName("userRoles")
    @Expose
    private List<UserRole> userRoles = null;
    @SerializedName("encUserId")
    @Expose
    private String encUserId;
    public final static Parcelable.Creator<User> CREATOR = new Creator<User>() {


        @SuppressWarnings({
                "unchecked"
        })
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        public User[] newArray(int size) {
            return (new User[size]);
        }

    }
            ;

    protected User(Parcel in) {
        this.userEmail = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.userBusinesses, (com.unihyr.Unihyr.users.model.UserBusiness.class.getClassLoader()));
        this.organization = ((Organization) in.readValue((Organization.class.getClassLoader())));
        this.registration = ((Registration) in.readValue((Registration.class.getClassLoader())));
        in.readList(this.userRoles, (com.unihyr.Unihyr.users.model.UserRole.class.getClassLoader()));
        this.encUserId = ((String) in.readValue((String.class.getClassLoader())));
    }

    public User() {
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserBusiness> getUserBusinesses() {
        return userBusinesses;
    }

    public void setUserBusinesses(List<UserBusiness> userBusinesses) {
        this.userBusinesses = userBusinesses;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public String getEncUserId() {
        return encUserId;
    }

    public void setEncUserId(String encUserId) {
        this.encUserId = encUserId;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(userEmail);
        dest.writeValue(name);
        dest.writeList(userBusinesses);
        dest.writeValue(organization);
        dest.writeValue(registration);
        dest.writeList(userRoles);
        dest.writeValue(encUserId);
    }

    public int describeContents() {
        return 0;
    }

}