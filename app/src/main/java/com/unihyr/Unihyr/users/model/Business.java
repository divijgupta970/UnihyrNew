package com.unihyr.Unihyr.users.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Business implements Parcelable
{

    @SerializedName("businessName")
    @Expose
    private String businessName;
    @SerializedName("encBusinessId")
    @Expose
    private String encBusinessId;
    public final static Parcelable.Creator<Business> CREATOR = new Creator<Business>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Business createFromParcel(Parcel in) {
            return new Business(in);
        }

        public Business[] newArray(int size) {
            return (new Business[size]);
        }

    }
            ;

    protected Business(Parcel in) {
        this.businessName = ((String) in.readValue((String.class.getClassLoader())));
        this.encBusinessId = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Business() {
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getEncBusinessId() {
        return encBusinessId;
    }

    public void setEncBusinessId(String encBusinessId) {
        this.encBusinessId = encBusinessId;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(businessName);
        dest.writeValue(encBusinessId);
    }

    public int describeContents() {
        return 0;
    }

}