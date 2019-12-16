package com.unihyr.Unihyr.users.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Organization implements Parcelable
{

    @SerializedName("organizationName")
    @Expose
    private String organizationName;
    @SerializedName("encOrganizationId")
    @Expose
    private String encOrganizationId;
    public final static Parcelable.Creator<Organization> CREATOR = new Creator<Organization>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Organization createFromParcel(Parcel in) {
            return new Organization(in);
        }

        public Organization[] newArray(int size) {
            return (new Organization[size]);
        }

    }
            ;

    protected Organization(Parcel in) {
        this.organizationName = ((String) in.readValue((String.class.getClassLoader())));
        this.encOrganizationId = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Organization() {
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getEncOrganizationId() {
        return encOrganizationId;
    }

    public void setEncOrganizationId(String encOrganizationId) {
        this.encOrganizationId = encOrganizationId;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(organizationName);
        dest.writeValue(encOrganizationId);
    }

    public int describeContents() {
        return 0;
    }

}