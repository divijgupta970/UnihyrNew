package com.unihyr.Unihyr.users.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserBusiness implements Parcelable
{

    @SerializedName("business")
    @Expose
    private Business business;
    @SerializedName("encUserBusinessId")
    @Expose
    private String encUserBusinessId;
    public final static Parcelable.Creator<UserBusiness> CREATOR = new Creator<UserBusiness>() {


        @SuppressWarnings({
                "unchecked"
        })
        public UserBusiness createFromParcel(Parcel in) {
            return new UserBusiness(in);
        }

        public UserBusiness[] newArray(int size) {
            return (new UserBusiness[size]);
        }

    }
            ;

    protected UserBusiness(Parcel in) {
        this.business = ((Business) in.readValue((Business.class.getClassLoader())));
        this.encUserBusinessId = ((String) in.readValue((String.class.getClassLoader())));
    }

    public UserBusiness() {
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public String getEncUserBusinessId() {
        return encUserBusinessId;
    }

    public void setEncUserBusinessId(String encUserBusinessId) {
        this.encUserBusinessId = encUserBusinessId;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(business);
        dest.writeValue(encUserBusinessId);
    }

    public int describeContents() {
        return 0;
    }

}