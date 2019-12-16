package com.unihyr.Unihyr.users.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Role implements Parcelable
{

    @SerializedName("roleName")
    @Expose
    private String roleName;
    @SerializedName("encRoleId")
    @Expose
    private String encRoleId;
    public final static Parcelable.Creator<Role> CREATOR = new Creator<Role>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Role createFromParcel(Parcel in) {
            return new Role(in);
        }

        public Role[] newArray(int size) {
            return (new Role[size]);
        }

    }
            ;

    protected Role(Parcel in) {
        this.roleName = ((String) in.readValue((String.class.getClassLoader())));
        this.encRoleId = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Role() {
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getEncRoleId() {
        return encRoleId;
    }

    public void setEncRoleId(String encRoleId) {
        this.encRoleId = encRoleId;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(roleName);
        dest.writeValue(encRoleId);
    }

    public int describeContents() {
        return 0;
    }

}