package com.unihyr.Unihyr.positions.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Position implements Parcelable
{

    @SerializedName("postId")
    @Expose
    private Long postId;
    @SerializedName("jobCode")
    @Expose
    private String jobCode;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("function")
    @Expose
    private String function;
    @SerializedName("exp_min")
    @Expose
    private Long expMin;
    @SerializedName("exp_max")
    @Expose
    private Long expMax;
    @SerializedName("ctc_min")
    @Expose
    private Double ctcMin;
    @SerializedName("ctc_max")
    @Expose
    private Double ctcMax;
    @SerializedName("feePercent")
    @Expose
    private Object feePercent;
    @SerializedName("referralFee")
    @Expose
    private Object referralFee;
    @SerializedName("max_hike_percentage")
    @Expose
    private Object maxHikePercentage;
    @SerializedName("effectiveFeePercent")
    @Expose
    private Object effectiveFeePercent;
    @SerializedName("isFeeFixed")
    @Expose
    private Object isFeeFixed;
    @SerializedName("criteria")
    @Expose
    private Object criteria;
    @SerializedName("comment")
    @Expose
    private Object comment;
    @SerializedName("uploadjd")
    @Expose
    private String uploadjd;
    @SerializedName("uploadsamplecv")
    @Expose
    private String uploadsamplecv;
    @SerializedName("uploadjdaudio")
    @Expose
    private Object uploadjdaudio;
    @SerializedName("additionalDoc")
    @Expose
    private Object additionalDoc;
    @SerializedName("additionDetail")
    @Expose
    private Object additionDetail;
    @SerializedName("required_offerdocs")
    @Expose
    private Object requiredOfferdocs;
    @SerializedName("published")
    @Expose
    private Long published;
    @SerializedName("closeDate")
    @Expose
    private Object closeDate;
    @SerializedName("drive_enabled_at")
    @Expose
    private Object driveEnabledAt;
    @SerializedName("joinCloseDate")
    @Expose
    private Object joinCloseDate;
    @SerializedName("openAgainDate")
    @Expose
    private Object openAgainDate;
    @SerializedName("noOfPosts")
    @Expose
    private Long noOfPosts;
    @SerializedName("noOfPostsFilled")
    @Expose
    private Object noOfPostsFilled;
    @SerializedName("noOfPostsJoined")
    @Expose
    private Object noOfPostsJoined;
    @SerializedName("qualification_ug")
    @Expose
    private String qualificationUg;
    @SerializedName("qualification_pg")
    @Expose
    private Object qualificationPg;
    @SerializedName("profileParDay")
    @Expose
    private Object profileParDay;
    @SerializedName("updateInfo")
    @Expose
    private Object updateInfo;
    @SerializedName("editSummary")
    @Expose
    private Object editSummary;
    @SerializedName("jdtext")
    @Expose
    private Object jdtext;
    @SerializedName("variablePayComment")
    @Expose
    private Object variablePayComment;
    @SerializedName("locationPostCount")
    @Expose
    private Object locationPostCount;
    @SerializedName("isDocRequired")
    @Expose
    private Object isDocRequired;
    @SerializedName("additionalDocMsg")
    @Expose
    private Object additionalDocMsg;
    @SerializedName("recommendedKeywords")
    @Expose
    private Object recommendedKeywords;
    @SerializedName("targetCompanies")
    @Expose
    private Object targetCompanies;
    @SerializedName("shiftTiming")
    @Expose
    private Object shiftTiming;
    @SerializedName("relocationAssistance")
    @Expose
    private Boolean relocationAssistance;
    @SerializedName("companyTransport")
    @Expose
    private Boolean companyTransport;
    @SerializedName("noPoach")
    @Expose
    private Object noPoach;
    @SerializedName("certifications")
    @Expose
    private Object certifications;
    @SerializedName("travelAmount")
    @Expose
    private Object travelAmount;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("visa")
    @Expose
    private Boolean visa;
    @SerializedName("visaCountry")
    @Expose
    private Object visaCountry;
    @SerializedName("passport")
    @Expose
    private Boolean passport;
    @SerializedName("interviewStages")
    @Expose
    private Object interviewStages;
    @SerializedName("diversityPreferences")
    @Expose
    private Object diversityPreferences;
    @SerializedName("mandatoryKeyword")
    @Expose
    private String mandatoryKeyword;
    @SerializedName("expectedKeyword")
    @Expose
    private Object expectedKeyword;
    @SerializedName("pauseDate")
    @Expose
    private Object pauseDate;
    @SerializedName("workingDays")
    @Expose
    private Object workingDays;
    @SerializedName("inactive_reason")
    @Expose
    private Object inactiveReason;
    @SerializedName("isFullTimeReq")
    @Expose
    private Boolean isFullTimeReq;
    @SerializedName("isFullTimeReqPg")
    @Expose
    private Boolean isFullTimeReqPg;
    @SerializedName("screeningRequired")
    @Expose
    private Object screeningRequired;
    @SerializedName("video_int_question")
    @Expose
    private Object videoIntQuestion;
    @SerializedName("isVideoReq")
    @Expose
    private Object isVideoReq;
    @SerializedName("isExclusive")
    @Expose
    private Object isExclusive;
    @SerializedName("createDate")
    @Expose
    private Long createDate;
    @SerializedName("modifyDate")
    @Expose
    private Long modifyDate;
    @SerializedName("activateDate")
    @Expose
    private Long activateDate;
    @SerializedName("deactivateDate")
    @Expose
    private Object deactivateDate;
    @SerializedName("deleteDate")
    @Expose
    private Object deleteDate;
    @SerializedName("verifyDate")
    @Expose
    private Object verifyDate;
    @SerializedName("validationDate")
    @Expose
    private Long validationDate;
    @SerializedName("approvalDate")
    @Expose
    private Long approvalDate;
    @SerializedName("approvalrejectDate")
    @Expose
    private Object approvalrejectDate;
    @SerializedName("validationrejectDate")
    @Expose
    private Object validationrejectDate;
    @SerializedName("sendprofileauto")
    @Expose
    private Object sendprofileauto;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("initiator")
    @Expose
    private Object initiator;
    @SerializedName("approver")
    @Expose
    private Object approver;
    @SerializedName("validator")
    @Expose
    private Object validator;
    @SerializedName("modifier")
    @Expose
    private Object modifier;
    @SerializedName("spoc")
    @Expose
    private Object spoc;
    @SerializedName("business")
    @Expose
    private Object business;
    @SerializedName("assessment")
    @Expose
    private Object assessment;
    @SerializedName("postusers")
    @Expose
    private Object postusers;
    @SerializedName("active")
    @Expose
    private Boolean active;
    public final static Parcelable.Creator<Position> CREATOR = new Creator<Position>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Position createFromParcel(Parcel in) {
            return new Position(in);
        }

        public Position[] newArray(int size) {
            return (new Position[size]);
        }

    }
            ;

    protected Position(Parcel in) {
        this.postId = ((Long) in.readValue((Long.class.getClassLoader())));
        this.jobCode = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.function = ((String) in.readValue((String.class.getClassLoader())));
        this.expMin = ((Long) in.readValue((Long.class.getClassLoader())));
        this.expMax = ((Long) in.readValue((Long.class.getClassLoader())));
        this.ctcMin = ((Double) in.readValue((Double.class.getClassLoader())));
        this.ctcMax = ((Double) in.readValue((Double.class.getClassLoader())));
        this.feePercent = ((Object) in.readValue((Object.class.getClassLoader())));
        this.referralFee = ((Object) in.readValue((Object.class.getClassLoader())));
        this.maxHikePercentage = ((Object) in.readValue((Object.class.getClassLoader())));
        this.effectiveFeePercent = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isFeeFixed = ((Object) in.readValue((Object.class.getClassLoader())));
        this.criteria = ((Object) in.readValue((Object.class.getClassLoader())));
        this.comment = ((Object) in.readValue((Object.class.getClassLoader())));
        this.uploadjd = ((String) in.readValue((String.class.getClassLoader())));
        this.uploadsamplecv = ((String) in.readValue((String.class.getClassLoader())));
        this.uploadjdaudio = ((Object) in.readValue((Object.class.getClassLoader())));
        this.additionalDoc = ((Object) in.readValue((Object.class.getClassLoader())));
        this.additionDetail = ((Object) in.readValue((Object.class.getClassLoader())));
        this.requiredOfferdocs = ((Object) in.readValue((Object.class.getClassLoader())));
        this.published = ((Long) in.readValue((Long.class.getClassLoader())));
        this.closeDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.driveEnabledAt = ((Object) in.readValue((Object.class.getClassLoader())));
        this.joinCloseDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.openAgainDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.noOfPosts = ((Long) in.readValue((Long.class.getClassLoader())));
        this.noOfPostsFilled = ((Object) in.readValue((Object.class.getClassLoader())));
        this.noOfPostsJoined = ((Object) in.readValue((Object.class.getClassLoader())));
        this.qualificationUg = ((String) in.readValue((String.class.getClassLoader())));
        this.qualificationPg = ((Object) in.readValue((Object.class.getClassLoader())));
        this.profileParDay = ((Object) in.readValue((Object.class.getClassLoader())));
        this.updateInfo = ((Object) in.readValue((Object.class.getClassLoader())));
        this.editSummary = ((Object) in.readValue((Object.class.getClassLoader())));
        this.jdtext = ((Object) in.readValue((Object.class.getClassLoader())));
        this.variablePayComment = ((Object) in.readValue((Object.class.getClassLoader())));
        this.locationPostCount = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isDocRequired = ((Object) in.readValue((Object.class.getClassLoader())));
        this.additionalDocMsg = ((Object) in.readValue((Object.class.getClassLoader())));
        this.recommendedKeywords = ((Object) in.readValue((Object.class.getClassLoader())));
        this.targetCompanies = ((Object) in.readValue((Object.class.getClassLoader())));
        this.shiftTiming = ((Object) in.readValue((Object.class.getClassLoader())));
        this.relocationAssistance = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.companyTransport = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.noPoach = ((Object) in.readValue((Object.class.getClassLoader())));
        this.certifications = ((Object) in.readValue((Object.class.getClassLoader())));
        this.travelAmount = ((Object) in.readValue((Object.class.getClassLoader())));
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        this.visa = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.visaCountry = ((Object) in.readValue((Object.class.getClassLoader())));
        this.passport = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.interviewStages = ((Object) in.readValue((Object.class.getClassLoader())));
        this.diversityPreferences = ((Object) in.readValue((Object.class.getClassLoader())));
        this.mandatoryKeyword = ((String) in.readValue((String.class.getClassLoader())));
        this.expectedKeyword = ((Object) in.readValue((Object.class.getClassLoader())));
        this.pauseDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.workingDays = ((Object) in.readValue((Object.class.getClassLoader())));
        this.inactiveReason = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isFullTimeReq = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isFullTimeReqPg = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.screeningRequired = ((Object) in.readValue((Object.class.getClassLoader())));
        this.videoIntQuestion = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isVideoReq = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isExclusive = ((Object) in.readValue((Object.class.getClassLoader())));
        this.createDate = ((Long) in.readValue((Long.class.getClassLoader())));
        this.modifyDate = ((Long) in.readValue((Long.class.getClassLoader())));
        this.activateDate = ((Long) in.readValue((Long.class.getClassLoader())));
        this.deactivateDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.deleteDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.verifyDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.validationDate = ((Long) in.readValue((Long.class.getClassLoader())));
        this.approvalDate = ((Long) in.readValue((Long.class.getClassLoader())));
        this.approvalrejectDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.validationrejectDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.sendprofileauto = ((Object) in.readValue((Object.class.getClassLoader())));
        this.designation = ((String) in.readValue((String.class.getClassLoader())));
        this.initiator = ((Object) in.readValue((Object.class.getClassLoader())));
        this.approver = ((Object) in.readValue((Object.class.getClassLoader())));
        this.validator = ((Object) in.readValue((Object.class.getClassLoader())));
        this.modifier = ((Object) in.readValue((Object.class.getClassLoader())));
        this.spoc = ((Object) in.readValue((Object.class.getClassLoader())));
        this.business = ((Object) in.readValue((Object.class.getClassLoader())));
        this.assessment = ((Object) in.readValue((Object.class.getClassLoader())));
        this.postusers = ((Object) in.readValue((Object.class.getClassLoader())));
        this.active = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public Position() {
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Long getExpMin() {
        return expMin;
    }

    public void setExpMin(Long expMin) {
        this.expMin = expMin;
    }

    public Long getExpMax() {
        return expMax;
    }

    public void setExpMax(Long expMax) {
        this.expMax = expMax;
    }

    public Double getCtcMin() {
        return ctcMin;
    }

    public void setCtcMin(Double ctcMin) {
        this.ctcMin = ctcMin;
    }

    public Double getCtcMax() {
        return ctcMax;
    }

    public void setCtcMax(Double ctcMax) {
        this.ctcMax = ctcMax;
    }

    public Object getFeePercent() {
        return feePercent;
    }

    public void setFeePercent(Object feePercent) {
        this.feePercent = feePercent;
    }

    public Object getReferralFee() {
        return referralFee;
    }

    public void setReferralFee(Object referralFee) {
        this.referralFee = referralFee;
    }

    public Object getMaxHikePercentage() {
        return maxHikePercentage;
    }

    public void setMaxHikePercentage(Object maxHikePercentage) {
        this.maxHikePercentage = maxHikePercentage;
    }

    public Object getEffectiveFeePercent() {
        return effectiveFeePercent;
    }

    public void setEffectiveFeePercent(Object effectiveFeePercent) {
        this.effectiveFeePercent = effectiveFeePercent;
    }

    public Object getIsFeeFixed() {
        return isFeeFixed;
    }

    public void setIsFeeFixed(Object isFeeFixed) {
        this.isFeeFixed = isFeeFixed;
    }

    public Object getCriteria() {
        return criteria;
    }

    public void setCriteria(Object criteria) {
        this.criteria = criteria;
    }

    public Object getComment() {
        return comment;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }

    public String getUploadjd() {
        return uploadjd;
    }

    public void setUploadjd(String uploadjd) {
        this.uploadjd = uploadjd;
    }

    public String getUploadsamplecv() {
        return uploadsamplecv;
    }

    public void setUploadsamplecv(String uploadsamplecv) {
        this.uploadsamplecv = uploadsamplecv;
    }

    public Object getUploadjdaudio() {
        return uploadjdaudio;
    }

    public void setUploadjdaudio(Object uploadjdaudio) {
        this.uploadjdaudio = uploadjdaudio;
    }

    public Object getAdditionalDoc() {
        return additionalDoc;
    }

    public void setAdditionalDoc(Object additionalDoc) {
        this.additionalDoc = additionalDoc;
    }

    public Object getAdditionDetail() {
        return additionDetail;
    }

    public void setAdditionDetail(Object additionDetail) {
        this.additionDetail = additionDetail;
    }

    public Object getRequiredOfferdocs() {
        return requiredOfferdocs;
    }

    public void setRequiredOfferdocs(Object requiredOfferdocs) {
        this.requiredOfferdocs = requiredOfferdocs;
    }

    public Long getPublished() {
        return published;
    }

    public void setPublished(Long published) {
        this.published = published;
    }

    public Object getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Object closeDate) {
        this.closeDate = closeDate;
    }

    public Object getDriveEnabledAt() {
        return driveEnabledAt;
    }

    public void setDriveEnabledAt(Object driveEnabledAt) {
        this.driveEnabledAt = driveEnabledAt;
    }

    public Object getJoinCloseDate() {
        return joinCloseDate;
    }

    public void setJoinCloseDate(Object joinCloseDate) {
        this.joinCloseDate = joinCloseDate;
    }

    public Object getOpenAgainDate() {
        return openAgainDate;
    }

    public void setOpenAgainDate(Object openAgainDate) {
        this.openAgainDate = openAgainDate;
    }

    public Long getNoOfPosts() {
        return noOfPosts;
    }

    public void setNoOfPosts(Long noOfPosts) {
        this.noOfPosts = noOfPosts;
    }

    public Object getNoOfPostsFilled() {
        return noOfPostsFilled;
    }

    public void setNoOfPostsFilled(Object noOfPostsFilled) {
        this.noOfPostsFilled = noOfPostsFilled;
    }

    public Object getNoOfPostsJoined() {
        return noOfPostsJoined;
    }

    public void setNoOfPostsJoined(Object noOfPostsJoined) {
        this.noOfPostsJoined = noOfPostsJoined;
    }

    public String getQualificationUg() {
        return qualificationUg;
    }

    public void setQualificationUg(String qualificationUg) {
        this.qualificationUg = qualificationUg;
    }

    public Object getQualificationPg() {
        return qualificationPg;
    }

    public void setQualificationPg(Object qualificationPg) {
        this.qualificationPg = qualificationPg;
    }

    public Object getProfileParDay() {
        return profileParDay;
    }

    public void setProfileParDay(Object profileParDay) {
        this.profileParDay = profileParDay;
    }

    public Object getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(Object updateInfo) {
        this.updateInfo = updateInfo;
    }

    public Object getEditSummary() {
        return editSummary;
    }

    public void setEditSummary(Object editSummary) {
        this.editSummary = editSummary;
    }

    public Object getJdtext() {
        return jdtext;
    }

    public void setJdtext(Object jdtext) {
        this.jdtext = jdtext;
    }

    public Object getVariablePayComment() {
        return variablePayComment;
    }

    public void setVariablePayComment(Object variablePayComment) {
        this.variablePayComment = variablePayComment;
    }

    public Object getLocationPostCount() {
        return locationPostCount;
    }

    public void setLocationPostCount(Object locationPostCount) {
        this.locationPostCount = locationPostCount;
    }

    public Object getIsDocRequired() {
        return isDocRequired;
    }

    public void setIsDocRequired(Object isDocRequired) {
        this.isDocRequired = isDocRequired;
    }

    public Object getAdditionalDocMsg() {
        return additionalDocMsg;
    }

    public void setAdditionalDocMsg(Object additionalDocMsg) {
        this.additionalDocMsg = additionalDocMsg;
    }

    public Object getRecommendedKeywords() {
        return recommendedKeywords;
    }

    public void setRecommendedKeywords(Object recommendedKeywords) {
        this.recommendedKeywords = recommendedKeywords;
    }

    public Object getTargetCompanies() {
        return targetCompanies;
    }

    public void setTargetCompanies(Object targetCompanies) {
        this.targetCompanies = targetCompanies;
    }

    public Object getShiftTiming() {
        return shiftTiming;
    }

    public void setShiftTiming(Object shiftTiming) {
        this.shiftTiming = shiftTiming;
    }

    public Boolean getRelocationAssistance() {
        return relocationAssistance;
    }

    public void setRelocationAssistance(Boolean relocationAssistance) {
        this.relocationAssistance = relocationAssistance;
    }

    public Boolean getCompanyTransport() {
        return companyTransport;
    }

    public void setCompanyTransport(Boolean companyTransport) {
        this.companyTransport = companyTransport;
    }

    public Object getNoPoach() {
        return noPoach;
    }

    public void setNoPoach(Object noPoach) {
        this.noPoach = noPoach;
    }

    public Object getCertifications() {
        return certifications;
    }

    public void setCertifications(Object certifications) {
        this.certifications = certifications;
    }

    public Object getTravelAmount() {
        return travelAmount;
    }

    public void setTravelAmount(Object travelAmount) {
        this.travelAmount = travelAmount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getVisa() {
        return visa;
    }

    public void setVisa(Boolean visa) {
        this.visa = visa;
    }

    public Object getVisaCountry() {
        return visaCountry;
    }

    public void setVisaCountry(Object visaCountry) {
        this.visaCountry = visaCountry;
    }

    public Boolean getPassport() {
        return passport;
    }

    public void setPassport(Boolean passport) {
        this.passport = passport;
    }

    public Object getInterviewStages() {
        return interviewStages;
    }

    public void setInterviewStages(Object interviewStages) {
        this.interviewStages = interviewStages;
    }

    public Object getDiversityPreferences() {
        return diversityPreferences;
    }

    public void setDiversityPreferences(Object diversityPreferences) {
        this.diversityPreferences = diversityPreferences;
    }

    public String getMandatoryKeyword() {
        return mandatoryKeyword;
    }

    public void setMandatoryKeyword(String mandatoryKeyword) {
        this.mandatoryKeyword = mandatoryKeyword;
    }

    public Object getExpectedKeyword() {
        return expectedKeyword;
    }

    public void setExpectedKeyword(Object expectedKeyword) {
        this.expectedKeyword = expectedKeyword;
    }

    public Object getPauseDate() {
        return pauseDate;
    }

    public void setPauseDate(Object pauseDate) {
        this.pauseDate = pauseDate;
    }

    public Object getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(Object workingDays) {
        this.workingDays = workingDays;
    }

    public Object getInactiveReason() {
        return inactiveReason;
    }

    public void setInactiveReason(Object inactiveReason) {
        this.inactiveReason = inactiveReason;
    }

    public Boolean getIsFullTimeReq() {
        return isFullTimeReq;
    }

    public void setIsFullTimeReq(Boolean isFullTimeReq) {
        this.isFullTimeReq = isFullTimeReq;
    }

    public Boolean getIsFullTimeReqPg() {
        return isFullTimeReqPg;
    }

    public void setIsFullTimeReqPg(Boolean isFullTimeReqPg) {
        this.isFullTimeReqPg = isFullTimeReqPg;
    }

    public Object getScreeningRequired() {
        return screeningRequired;
    }

    public void setScreeningRequired(Object screeningRequired) {
        this.screeningRequired = screeningRequired;
    }

    public Object getVideoIntQuestion() {
        return videoIntQuestion;
    }

    public void setVideoIntQuestion(Object videoIntQuestion) {
        this.videoIntQuestion = videoIntQuestion;
    }

    public Object getIsVideoReq() {
        return isVideoReq;
    }

    public void setIsVideoReq(Object isVideoReq) {
        this.isVideoReq = isVideoReq;
    }

    public Object getIsExclusive() {
        return isExclusive;
    }

    public void setIsExclusive(Object isExclusive) {
        this.isExclusive = isExclusive;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Long modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getActivateDate() {
        return activateDate;
    }

    public void setActivateDate(Long activateDate) {
        this.activateDate = activateDate;
    }

    public Object getDeactivateDate() {
        return deactivateDate;
    }

    public void setDeactivateDate(Object deactivateDate) {
        this.deactivateDate = deactivateDate;
    }

    public Object getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Object deleteDate) {
        this.deleteDate = deleteDate;
    }

    public Object getVerifyDate() {
        return verifyDate;
    }

    public void setVerifyDate(Object verifyDate) {
        this.verifyDate = verifyDate;
    }

    public Long getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(Long validationDate) {
        this.validationDate = validationDate;
    }

    public Long getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Long approvalDate) {
        this.approvalDate = approvalDate;
    }

    public Object getApprovalrejectDate() {
        return approvalrejectDate;
    }

    public void setApprovalrejectDate(Object approvalrejectDate) {
        this.approvalrejectDate = approvalrejectDate;
    }

    public Object getValidationrejectDate() {
        return validationrejectDate;
    }

    public void setValidationrejectDate(Object validationrejectDate) {
        this.validationrejectDate = validationrejectDate;
    }

    public Object getSendprofileauto() {
        return sendprofileauto;
    }

    public void setSendprofileauto(Object sendprofileauto) {
        this.sendprofileauto = sendprofileauto;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Object getInitiator() {
        return initiator;
    }

    public void setInitiator(Object initiator) {
        this.initiator = initiator;
    }

    public Object getApprover() {
        return approver;
    }

    public void setApprover(Object approver) {
        this.approver = approver;
    }

    public Object getValidator() {
        return validator;
    }

    public void setValidator(Object validator) {
        this.validator = validator;
    }

    public Object getModifier() {
        return modifier;
    }

    public void setModifier(Object modifier) {
        this.modifier = modifier;
    }

    public Object getSpoc() {
        return spoc;
    }

    public void setSpoc(Object spoc) {
        this.spoc = spoc;
    }

    public Object getBusiness() {
        return business;
    }

    public void setBusiness(Object business) {
        this.business = business;
    }

    public Object getAssessment() {
        return assessment;
    }

    public void setAssessment(Object assessment) {
        this.assessment = assessment;
    }

    public Object getPostusers() {
        return postusers;
    }

    public void setPostusers(Object postusers) {
        this.postusers = postusers;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(postId);
        dest.writeValue(jobCode);
        dest.writeValue(title);
        dest.writeValue(function);
        dest.writeValue(expMin);
        dest.writeValue(expMax);
        dest.writeValue(ctcMin);
        dest.writeValue(ctcMax);
        dest.writeValue(feePercent);
        dest.writeValue(referralFee);
        dest.writeValue(maxHikePercentage);
        dest.writeValue(effectiveFeePercent);
        dest.writeValue(isFeeFixed);
        dest.writeValue(criteria);
        dest.writeValue(comment);
        dest.writeValue(uploadjd);
        dest.writeValue(uploadsamplecv);
        dest.writeValue(uploadjdaudio);
        dest.writeValue(additionalDoc);
        dest.writeValue(additionDetail);
        dest.writeValue(requiredOfferdocs);
        dest.writeValue(published);
        dest.writeValue(closeDate);
        dest.writeValue(driveEnabledAt);
        dest.writeValue(joinCloseDate);
        dest.writeValue(openAgainDate);
        dest.writeValue(noOfPosts);
        dest.writeValue(noOfPostsFilled);
        dest.writeValue(noOfPostsJoined);
        dest.writeValue(qualificationUg);
        dest.writeValue(qualificationPg);
        dest.writeValue(profileParDay);
        dest.writeValue(updateInfo);
        dest.writeValue(editSummary);
        dest.writeValue(jdtext);
        dest.writeValue(variablePayComment);
        dest.writeValue(locationPostCount);
        dest.writeValue(isDocRequired);
        dest.writeValue(additionalDocMsg);
        dest.writeValue(recommendedKeywords);
        dest.writeValue(targetCompanies);
        dest.writeValue(shiftTiming);
        dest.writeValue(relocationAssistance);
        dest.writeValue(companyTransport);
        dest.writeValue(noPoach);
        dest.writeValue(certifications);
        dest.writeValue(travelAmount);
        dest.writeValue(location);
        dest.writeValue(visa);
        dest.writeValue(visaCountry);
        dest.writeValue(passport);
        dest.writeValue(interviewStages);
        dest.writeValue(diversityPreferences);
        dest.writeValue(mandatoryKeyword);
        dest.writeValue(expectedKeyword);
        dest.writeValue(pauseDate);
        dest.writeValue(workingDays);
        dest.writeValue(inactiveReason);
        dest.writeValue(isFullTimeReq);
        dest.writeValue(isFullTimeReqPg);
        dest.writeValue(screeningRequired);
        dest.writeValue(videoIntQuestion);
        dest.writeValue(isVideoReq);
        dest.writeValue(isExclusive);
        dest.writeValue(createDate);
        dest.writeValue(modifyDate);
        dest.writeValue(activateDate);
        dest.writeValue(deactivateDate);
        dest.writeValue(deleteDate);
        dest.writeValue(verifyDate);
        dest.writeValue(validationDate);
        dest.writeValue(approvalDate);
        dest.writeValue(approvalrejectDate);
        dest.writeValue(validationrejectDate);
        dest.writeValue(sendprofileauto);
        dest.writeValue(designation);
        dest.writeValue(initiator);
        dest.writeValue(approver);
        dest.writeValue(validator);
        dest.writeValue(modifier);
        dest.writeValue(spoc);
        dest.writeValue(business);
        dest.writeValue(assessment);
        dest.writeValue(postusers);
        dest.writeValue(active);
    }

    public int describeContents() {
        return 0;
    }

}