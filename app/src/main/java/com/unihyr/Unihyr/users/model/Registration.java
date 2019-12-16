
package com.unihyr.Unihyr.users.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Registration implements Parcelable
{

    @SerializedName("contact")
    @Expose
    private String contact;
    @SerializedName("createdAt")
    @Expose
    private Long createdAt;
    @SerializedName("encRegistrationId")
    @Expose
    private String encRegistrationId;
    public final static Parcelable.Creator<Registration> CREATOR = new Creator<Registration>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Registration createFromParcel(Parcel in) {
            return new Registration(in);
        }

        public Registration[] newArray(int size) {
            return (new Registration[size]);
        }

    }
            ;

    protected Registration(Parcel in) {
        this.contact = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((Long) in.readValue((Long.class.getClassLoader())));
        this.encRegistrationId = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Registration() {
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getEncRegistrationId() {
        return encRegistrationId;
    }

    public void setEncRegistrationId(String encRegistrationId) {
        this.encRegistrationId = encRegistrationId;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(contact);
        dest.writeValue(createdAt);
        dest.writeValue(encRegistrationId);
    }

    public int describeContents() {
        return 0;
    }

}