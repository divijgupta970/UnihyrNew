package com.unihyr.Unihyr.positions.viewposition.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ViewPosition implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("submittedBy")
    @Expose
    private String submittedBy;
    @SerializedName("selectedChannel")
    @Expose
    private String selectedChannel;
    @SerializedName("contact")
    @Expose
    private String contact;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("currentRole")
    @Expose
    private Object currentRole;
    @SerializedName("currentOrg")
    @Expose
    private Object currentOrg;
    @SerializedName("exp")
    @Expose
    private String exp;
    @SerializedName("noticePeriod")
    @Expose
    private String noticePeriod;
    public final static Parcelable.Creator<ViewPosition> CREATOR = new Creator<ViewPosition>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ViewPosition createFromParcel(Parcel in) {
            return new ViewPosition(in);
        }

        public ViewPosition[] newArray(int size) {
            return (new ViewPosition[size]);
        }

    }
            ;

    protected ViewPosition(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.submittedBy = ((String) in.readValue((String.class.getClassLoader())));
        this.selectedChannel = ((String) in.readValue((String.class.getClassLoader())));
        this.contact = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.currentRole = ((Object) in.readValue((Object.class.getClassLoader())));
        this.currentOrg = ((Object) in.readValue((Object.class.getClassLoader())));
        this.exp = ((String) in.readValue((String.class.getClassLoader())));
        this.noticePeriod = ((String) in.readValue((String.class.getClassLoader())));
    }

    public ViewPosition() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getSelectedChannel() {
        return selectedChannel;
    }

    public void setSelectedChannel(String selectedChannel) {
        this.selectedChannel = selectedChannel;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(Object currentRole) {
        this.currentRole = currentRole;
    }

    public Object getCurrentOrg() {
        return currentOrg;
    }

    public void setCurrentOrg(Object currentOrg) {
        this.currentOrg = currentOrg;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(String noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(submittedBy);
        dest.writeValue(selectedChannel);
        dest.writeValue(contact);
        dest.writeValue(status);
        dest.writeValue(currentRole);
        dest.writeValue(currentOrg);
        dest.writeValue(exp);
        dest.writeValue(noticePeriod);
    }

    public int describeContents() {
        return 0;
    }

}