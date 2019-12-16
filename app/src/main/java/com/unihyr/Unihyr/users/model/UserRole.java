package com.unihyr.Unihyr.users.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserRole implements Parcelable
{

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("role")
    @Expose
    private Role role;
    @SerializedName("encUserRoleId")
    @Expose
    private String encUserRoleId;
    public final static Parcelable.Creator<UserRole> CREATOR = new Creator<UserRole>() {


        @SuppressWarnings({
                "unchecked"
        })
        public UserRole createFromParcel(Parcel in) {
            return new UserRole(in);
        }

        public UserRole[] newArray(int size) {
            return (new UserRole[size]);
        }

    }
            ;

    protected UserRole(Parcel in) {
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.role = ((Role) in.readValue((Role.class.getClassLoader())));
        this.encUserRoleId = ((String) in.readValue((String.class.getClassLoader())));
    }

    public UserRole() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEncUserRoleId() {
        return encUserRoleId;
    }

    public void setEncUserRoleId(String encUserRoleId) {
        this.encUserRoleId = encUserRoleId;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(role);
        dest.writeValue(encUserRoleId);
    }

    public int describeContents() {
        return 0;
    }

}