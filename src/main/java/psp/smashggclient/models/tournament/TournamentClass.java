package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class TournamentClass {
    private long id;
    private Object seriesID;
    private long ownerID;
    private long state;
    private long progressMeter;
    private String name;
    private String slug;
    private String shortSlug;
    private Object venueFee;
    private long processingFee;
    private double processingBase;
    private Object tiebreakOrder;
    private Object timezone;
    private boolean tournamentPrivate;
    private boolean published;
    private boolean testMode;
    private boolean sandboxMode;
    private boolean publicSeeding;
    private long tournamentType;
    private boolean hasOnlineEvents;
    private boolean includeQRCode;
    private boolean approved;
    private long startAt;
    private long endAt;
    private Object startedAt;
    private Object completedAt;
    private long registrationClosesAt;
    private long eventRegistrationClosesAt;
    private Object teamCreationClosesAt;
    private Object stripeMode;
    private String paypalMode;
    private String paypalApp;
    private String city;
    private String addrState;
    private String postalCode;
    private String countryCode;
    private String mapsPlaceID;
    private double lat;
    private double lng;
    private Object monitoringRequestedBy;
    private List<Object> links;
    private Object venueName;
    private String venueAddress;
    private Object region;
    private Object hashtag;
    private Object showCity;
    private long attendeeLocationInfo;
    private long attendeeContactInfo;
    private AttendeeFieldConfig attendeeFieldConfig;
    private Object attendeeRequirements;
    private boolean notifyAdmins;
    private boolean publicAttendees;
    private boolean hideAdmins;
    private Object registrationMarkdown;
    private Object gettingThere;
    private String rules;
    private Object prizes;
    private Object contactInfo;
    private boolean includeInstructions;
    private Object emailInstructions;
    private boolean includeDirections;
    private Object emailDirections;
    private boolean includeMap;
    private boolean includeQRCheckIn;
    private Object qrCodeRedirect;
    private String qrCodeRedirectType;
    private Object emailNote;
    private boolean includeNote;
    private String primaryContact;
    private String primaryContactType;
    private Object contactEmail;
    private Object contactTwitter;
    private Object contactPhone;
    private String currency;
    private Object onsitePaymentMode;
    private Object stripePublishableKey;
    private String paypalPayerID;
    private Object customEmailText;
    private List<Object> registrationOptions;
    private LimitsByType limitsByType;
    private TournamentPublishing publishing;
    private List<Object> trackingPixels;
    private Object generatedTabs;
    private String defaultTab;
    private List<Object> fees;
    private List<Object> customMarkdown;
    private Object videoURL;
    private Object details;
    private boolean isCentralized;
    private List<Image> images;
    private long scheduleID;
    private List<String> expand;
    private List<Object> userData;
    private List<Long> eventIDS;
    private String regionDisplayName;
    private String locationDisplayName;
    private List<Object> onlineEvents;
    private boolean hasTaskEvents;
    private TaskEvents taskEvents;
    private boolean supportsPayPal;
    private List<String> slugs;
    private String permissionType;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("seriesId")
    public Object getSeriesID() { return seriesID; }
    @JsonProperty("seriesId")
    public void setSeriesID(Object value) { this.seriesID = value; }

    @JsonProperty("ownerId")
    public long getOwnerID() { return ownerID; }
    @JsonProperty("ownerId")
    public void setOwnerID(long value) { this.ownerID = value; }

    @JsonProperty("state")
    public long getState() { return state; }
    @JsonProperty("state")
    public void setState(long value) { this.state = value; }

    @JsonProperty("progressMeter")
    public long getProgressMeter() { return progressMeter; }
    @JsonProperty("progressMeter")
    public void setProgressMeter(long value) { this.progressMeter = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("slug")
    public String getSlug() { return slug; }
    @JsonProperty("slug")
    public void setSlug(String value) { this.slug = value; }

    @JsonProperty("shortSlug")
    public String getShortSlug() { return shortSlug; }
    @JsonProperty("shortSlug")
    public void setShortSlug(String value) { this.shortSlug = value; }

    @JsonProperty("venueFee")
    public Object getVenueFee() { return venueFee; }
    @JsonProperty("venueFee")
    public void setVenueFee(Object value) { this.venueFee = value; }

    @JsonProperty("processingFee")
    public long getProcessingFee() { return processingFee; }
    @JsonProperty("processingFee")
    public void setProcessingFee(long value) { this.processingFee = value; }

    @JsonProperty("processingBase")
    public double getProcessingBase() { return processingBase; }
    @JsonProperty("processingBase")
    public void setProcessingBase(double value) { this.processingBase = value; }

    @JsonProperty("tiebreakOrder")
    public Object getTiebreakOrder() { return tiebreakOrder; }
    @JsonProperty("tiebreakOrder")
    public void setTiebreakOrder(Object value) { this.tiebreakOrder = value; }

    @JsonProperty("timezone")
    public Object getTimezone() { return timezone; }
    @JsonProperty("timezone")
    public void setTimezone(Object value) { this.timezone = value; }

    @JsonProperty("private")
    public boolean getTournamentPrivate() { return tournamentPrivate; }
    @JsonProperty("private")
    public void setTournamentPrivate(boolean value) { this.tournamentPrivate = value; }

    @JsonProperty("published")
    public boolean getPublished() { return published; }
    @JsonProperty("published")
    public void setPublished(boolean value) { this.published = value; }

    @JsonProperty("testMode")
    public boolean getTestMode() { return testMode; }
    @JsonProperty("testMode")
    public void setTestMode(boolean value) { this.testMode = value; }

    @JsonProperty("sandboxMode")
    public boolean getSandboxMode() { return sandboxMode; }
    @JsonProperty("sandboxMode")
    public void setSandboxMode(boolean value) { this.sandboxMode = value; }

    @JsonProperty("publicSeeding")
    public boolean getPublicSeeding() { return publicSeeding; }
    @JsonProperty("publicSeeding")
    public void setPublicSeeding(boolean value) { this.publicSeeding = value; }

    @JsonProperty("tournamentType")
    public long getTournamentType() { return tournamentType; }
    @JsonProperty("tournamentType")
    public void setTournamentType(long value) { this.tournamentType = value; }

    @JsonProperty("hasOnlineEvents")
    public boolean getHasOnlineEvents() { return hasOnlineEvents; }
    @JsonProperty("hasOnlineEvents")
    public void setHasOnlineEvents(boolean value) { this.hasOnlineEvents = value; }

    @JsonProperty("includeQRCode")
    public boolean getIncludeQRCode() { return includeQRCode; }
    @JsonProperty("includeQRCode")
    public void setIncludeQRCode(boolean value) { this.includeQRCode = value; }

    @JsonProperty("approved")
    public boolean getApproved() { return approved; }
    @JsonProperty("approved")
    public void setApproved(boolean value) { this.approved = value; }

    @JsonProperty("startAt")
    public long getStartAt() { return startAt; }
    @JsonProperty("startAt")
    public void setStartAt(long value) { this.startAt = value; }

    @JsonProperty("endAt")
    public long getEndAt() { return endAt; }
    @JsonProperty("endAt")
    public void setEndAt(long value) { this.endAt = value; }

    @JsonProperty("startedAt")
    public Object getStartedAt() { return startedAt; }
    @JsonProperty("startedAt")
    public void setStartedAt(Object value) { this.startedAt = value; }

    @JsonProperty("completedAt")
    public Object getCompletedAt() { return completedAt; }
    @JsonProperty("completedAt")
    public void setCompletedAt(Object value) { this.completedAt = value; }

    @JsonProperty("registrationClosesAt")
    public long getRegistrationClosesAt() { return registrationClosesAt; }
    @JsonProperty("registrationClosesAt")
    public void setRegistrationClosesAt(long value) { this.registrationClosesAt = value; }

    @JsonProperty("eventRegistrationClosesAt")
    public long getEventRegistrationClosesAt() { return eventRegistrationClosesAt; }
    @JsonProperty("eventRegistrationClosesAt")
    public void setEventRegistrationClosesAt(long value) { this.eventRegistrationClosesAt = value; }

    @JsonProperty("teamCreationClosesAt")
    public Object getTeamCreationClosesAt() { return teamCreationClosesAt; }
    @JsonProperty("teamCreationClosesAt")
    public void setTeamCreationClosesAt(Object value) { this.teamCreationClosesAt = value; }

    @JsonProperty("stripeMode")
    public Object getStripeMode() { return stripeMode; }
    @JsonProperty("stripeMode")
    public void setStripeMode(Object value) { this.stripeMode = value; }

    @JsonProperty("paypalMode")
    public String getPaypalMode() { return paypalMode; }
    @JsonProperty("paypalMode")
    public void setPaypalMode(String value) { this.paypalMode = value; }

    @JsonProperty("paypalApp")
    public String getPaypalApp() { return paypalApp; }
    @JsonProperty("paypalApp")
    public void setPaypalApp(String value) { this.paypalApp = value; }

    @JsonProperty("city")
    public String getCity() { return city; }
    @JsonProperty("city")
    public void setCity(String value) { this.city = value; }

    @JsonProperty("addrState")
    public String getAddrState() { return addrState; }
    @JsonProperty("addrState")
    public void setAddrState(String value) { this.addrState = value; }

    @JsonProperty("postalCode")
    public String getPostalCode() { return postalCode; }
    @JsonProperty("postalCode")
    public void setPostalCode(String value) { this.postalCode = value; }

    @JsonProperty("countryCode")
    public String getCountryCode() { return countryCode; }
    @JsonProperty("countryCode")
    public void setCountryCode(String value) { this.countryCode = value; }

    @JsonProperty("mapsPlaceId")
    public String getMapsPlaceID() { return mapsPlaceID; }
    @JsonProperty("mapsPlaceId")
    public void setMapsPlaceID(String value) { this.mapsPlaceID = value; }

    @JsonProperty("lat")
    public double getLat() { return lat; }
    @JsonProperty("lat")
    public void setLat(double value) { this.lat = value; }

    @JsonProperty("lng")
    public double getLng() { return lng; }
    @JsonProperty("lng")
    public void setLng(double value) { this.lng = value; }

    @JsonProperty("monitoringRequestedBy")
    public Object getMonitoringRequestedBy() { return monitoringRequestedBy; }
    @JsonProperty("monitoringRequestedBy")
    public void setMonitoringRequestedBy(Object value) { this.monitoringRequestedBy = value; }

    @JsonProperty("links")
    public List<Object> getLinks() { return links; }
    @JsonProperty("links")
    public void setLinks(List<Object> value) { this.links = value; }

    @JsonProperty("venueName")
    public Object getVenueName() { return venueName; }
    @JsonProperty("venueName")
    public void setVenueName(Object value) { this.venueName = value; }

    @JsonProperty("venueAddress")
    public String getVenueAddress() { return venueAddress; }
    @JsonProperty("venueAddress")
    public void setVenueAddress(String value) { this.venueAddress = value; }

    @JsonProperty("region")
    public Object getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(Object value) { this.region = value; }

    @JsonProperty("hashtag")
    public Object getHashtag() { return hashtag; }
    @JsonProperty("hashtag")
    public void setHashtag(Object value) { this.hashtag = value; }

    @JsonProperty("showCity")
    public Object getShowCity() { return showCity; }
    @JsonProperty("showCity")
    public void setShowCity(Object value) { this.showCity = value; }

    @JsonProperty("attendeeLocationInfo")
    public long getAttendeeLocationInfo() { return attendeeLocationInfo; }
    @JsonProperty("attendeeLocationInfo")
    public void setAttendeeLocationInfo(long value) { this.attendeeLocationInfo = value; }

    @JsonProperty("attendeeContactInfo")
    public long getAttendeeContactInfo() { return attendeeContactInfo; }
    @JsonProperty("attendeeContactInfo")
    public void setAttendeeContactInfo(long value) { this.attendeeContactInfo = value; }

    @JsonProperty("attendeeFieldConfig")
    public AttendeeFieldConfig getAttendeeFieldConfig() { return attendeeFieldConfig; }
    @JsonProperty("attendeeFieldConfig")
    public void setAttendeeFieldConfig(AttendeeFieldConfig value) { this.attendeeFieldConfig = value; }

    @JsonProperty("attendeeRequirements")
    public Object getAttendeeRequirements() { return attendeeRequirements; }
    @JsonProperty("attendeeRequirements")
    public void setAttendeeRequirements(Object value) { this.attendeeRequirements = value; }

    @JsonProperty("notifyAdmins")
    public boolean getNotifyAdmins() { return notifyAdmins; }
    @JsonProperty("notifyAdmins")
    public void setNotifyAdmins(boolean value) { this.notifyAdmins = value; }

    @JsonProperty("publicAttendees")
    public boolean getPublicAttendees() { return publicAttendees; }
    @JsonProperty("publicAttendees")
    public void setPublicAttendees(boolean value) { this.publicAttendees = value; }

    @JsonProperty("hideAdmins")
    public boolean getHideAdmins() { return hideAdmins; }
    @JsonProperty("hideAdmins")
    public void setHideAdmins(boolean value) { this.hideAdmins = value; }

    @JsonProperty("registrationMarkdown")
    public Object getRegistrationMarkdown() { return registrationMarkdown; }
    @JsonProperty("registrationMarkdown")
    public void setRegistrationMarkdown(Object value) { this.registrationMarkdown = value; }

    @JsonProperty("gettingThere")
    public Object getGettingThere() { return gettingThere; }
    @JsonProperty("gettingThere")
    public void setGettingThere(Object value) { this.gettingThere = value; }

    @JsonProperty("rules")
    public String getRules() { return rules; }
    @JsonProperty("rules")
    public void setRules(String value) { this.rules = value; }

    @JsonProperty("prizes")
    public Object getPrizes() { return prizes; }
    @JsonProperty("prizes")
    public void setPrizes(Object value) { this.prizes = value; }

    @JsonProperty("contactInfo")
    public Object getContactInfo() { return contactInfo; }
    @JsonProperty("contactInfo")
    public void setContactInfo(Object value) { this.contactInfo = value; }

    @JsonProperty("includeInstructions")
    public boolean getIncludeInstructions() { return includeInstructions; }
    @JsonProperty("includeInstructions")
    public void setIncludeInstructions(boolean value) { this.includeInstructions = value; }

    @JsonProperty("emailInstructions")
    public Object getEmailInstructions() { return emailInstructions; }
    @JsonProperty("emailInstructions")
    public void setEmailInstructions(Object value) { this.emailInstructions = value; }

    @JsonProperty("includeDirections")
    public boolean getIncludeDirections() { return includeDirections; }
    @JsonProperty("includeDirections")
    public void setIncludeDirections(boolean value) { this.includeDirections = value; }

    @JsonProperty("emailDirections")
    public Object getEmailDirections() { return emailDirections; }
    @JsonProperty("emailDirections")
    public void setEmailDirections(Object value) { this.emailDirections = value; }

    @JsonProperty("includeMap")
    public boolean getIncludeMap() { return includeMap; }
    @JsonProperty("includeMap")
    public void setIncludeMap(boolean value) { this.includeMap = value; }

    @JsonProperty("includeQRCheckIn")
    public boolean getIncludeQRCheckIn() { return includeQRCheckIn; }
    @JsonProperty("includeQRCheckIn")
    public void setIncludeQRCheckIn(boolean value) { this.includeQRCheckIn = value; }

    @JsonProperty("qrCodeRedirect")
    public Object getQrCodeRedirect() { return qrCodeRedirect; }
    @JsonProperty("qrCodeRedirect")
    public void setQrCodeRedirect(Object value) { this.qrCodeRedirect = value; }

    @JsonProperty("qrCodeRedirectType")
    public String getQrCodeRedirectType() { return qrCodeRedirectType; }
    @JsonProperty("qrCodeRedirectType")
    public void setQrCodeRedirectType(String value) { this.qrCodeRedirectType = value; }

    @JsonProperty("emailNote")
    public Object getEmailNote() { return emailNote; }
    @JsonProperty("emailNote")
    public void setEmailNote(Object value) { this.emailNote = value; }

    @JsonProperty("includeNote")
    public boolean getIncludeNote() { return includeNote; }
    @JsonProperty("includeNote")
    public void setIncludeNote(boolean value) { this.includeNote = value; }

    @JsonProperty("primaryContact")
    public String getPrimaryContact() { return primaryContact; }
    @JsonProperty("primaryContact")
    public void setPrimaryContact(String value) { this.primaryContact = value; }

    @JsonProperty("primaryContactType")
    public String getPrimaryContactType() { return primaryContactType; }
    @JsonProperty("primaryContactType")
    public void setPrimaryContactType(String value) { this.primaryContactType = value; }

    @JsonProperty("contactEmail")
    public Object getContactEmail() { return contactEmail; }
    @JsonProperty("contactEmail")
    public void setContactEmail(Object value) { this.contactEmail = value; }

    @JsonProperty("contactTwitter")
    public Object getContactTwitter() { return contactTwitter; }
    @JsonProperty("contactTwitter")
    public void setContactTwitter(Object value) { this.contactTwitter = value; }

    @JsonProperty("contactPhone")
    public Object getContactPhone() { return contactPhone; }
    @JsonProperty("contactPhone")
    public void setContactPhone(Object value) { this.contactPhone = value; }

    @JsonProperty("currency")
    public String getCurrency() { return currency; }
    @JsonProperty("currency")
    public void setCurrency(String value) { this.currency = value; }

    @JsonProperty("onsitePaymentMode")
    public Object getOnsitePaymentMode() { return onsitePaymentMode; }
    @JsonProperty("onsitePaymentMode")
    public void setOnsitePaymentMode(Object value) { this.onsitePaymentMode = value; }

    @JsonProperty("stripePublishableKey")
    public Object getStripePublishableKey() { return stripePublishableKey; }
    @JsonProperty("stripePublishableKey")
    public void setStripePublishableKey(Object value) { this.stripePublishableKey = value; }

    @JsonProperty("paypalPayerId")
    public String getPaypalPayerID() { return paypalPayerID; }
    @JsonProperty("paypalPayerId")
    public void setPaypalPayerID(String value) { this.paypalPayerID = value; }

    @JsonProperty("customEmailText")
    public Object getCustomEmailText() { return customEmailText; }
    @JsonProperty("customEmailText")
    public void setCustomEmailText(Object value) { this.customEmailText = value; }

    @JsonProperty("registrationOptions")
    public List<Object> getRegistrationOptions() { return registrationOptions; }
    @JsonProperty("registrationOptions")
    public void setRegistrationOptions(List<Object> value) { this.registrationOptions = value; }

    @JsonProperty("limitsByType")
    public LimitsByType getLimitsByType() { return limitsByType; }
    @JsonProperty("limitsByType")
    public void setLimitsByType(LimitsByType value) { this.limitsByType = value; }

    @JsonProperty("publishing")
    public TournamentPublishing getPublishing() { return publishing; }
    @JsonProperty("publishing")
    public void setPublishing(TournamentPublishing value) { this.publishing = value; }

    @JsonProperty("trackingPixels")
    public List<Object> getTrackingPixels() { return trackingPixels; }
    @JsonProperty("trackingPixels")
    public void setTrackingPixels(List<Object> value) { this.trackingPixels = value; }

    @JsonProperty("generatedTabs")
    public Object getGeneratedTabs() { return generatedTabs; }
    @JsonProperty("generatedTabs")
    public void setGeneratedTabs(Object value) { this.generatedTabs = value; }

    @JsonProperty("defaultTab")
    public String getDefaultTab() { return defaultTab; }
    @JsonProperty("defaultTab")
    public void setDefaultTab(String value) { this.defaultTab = value; }

    @JsonProperty("fees")
    public List<Object> getFees() { return fees; }
    @JsonProperty("fees")
    public void setFees(List<Object> value) { this.fees = value; }

    @JsonProperty("customMarkdown")
    public List<Object> getCustomMarkdown() { return customMarkdown; }
    @JsonProperty("customMarkdown")
    public void setCustomMarkdown(List<Object> value) { this.customMarkdown = value; }

    @JsonProperty("videoUrl")
    public Object getVideoURL() { return videoURL; }
    @JsonProperty("videoUrl")
    public void setVideoURL(Object value) { this.videoURL = value; }

    @JsonProperty("details")
    public Object getDetails() { return details; }
    @JsonProperty("details")
    public void setDetails(Object value) { this.details = value; }

    @JsonProperty("isCentralized")
    public boolean getIsCentralized() { return isCentralized; }
    @JsonProperty("isCentralized")
    public void setIsCentralized(boolean value) { this.isCentralized = value; }

    @JsonProperty("images")
    public List<Image> getImages() { return images; }
    @JsonProperty("images")
    public void setImages(List<Image> value) { this.images = value; }

    @JsonProperty("scheduleId")
    public long getScheduleID() { return scheduleID; }
    @JsonProperty("scheduleId")
    public void setScheduleID(long value) { this.scheduleID = value; }

    @JsonProperty("expand")
    public List<String> getExpand() { return expand; }
    @JsonProperty("expand")
    public void setExpand(List<String> value) { this.expand = value; }

    @JsonProperty("userData")
    public List<Object> getUserData() { return userData; }
    @JsonProperty("userData")
    public void setUserData(List<Object> value) { this.userData = value; }

    @JsonProperty("eventIds")
    public List<Long> getEventIDS() { return eventIDS; }
    @JsonProperty("eventIds")
    public void setEventIDS(List<Long> value) { this.eventIDS = value; }

    @JsonProperty("regionDisplayName")
    public String getRegionDisplayName() { return regionDisplayName; }
    @JsonProperty("regionDisplayName")
    public void setRegionDisplayName(String value) { this.regionDisplayName = value; }

    @JsonProperty("locationDisplayName")
    public String getLocationDisplayName() { return locationDisplayName; }
    @JsonProperty("locationDisplayName")
    public void setLocationDisplayName(String value) { this.locationDisplayName = value; }

    @JsonProperty("onlineEvents")
    public List<Object> getOnlineEvents() { return onlineEvents; }
    @JsonProperty("onlineEvents")
    public void setOnlineEvents(List<Object> value) { this.onlineEvents = value; }

    @JsonProperty("hasTaskEvents")
    public boolean getHasTaskEvents() { return hasTaskEvents; }
    @JsonProperty("hasTaskEvents")
    public void setHasTaskEvents(boolean value) { this.hasTaskEvents = value; }

    @JsonProperty("taskEvents")
    public TaskEvents getTaskEvents() { return taskEvents; }
    @JsonProperty("taskEvents")
    public void setTaskEvents(TaskEvents value) { this.taskEvents = value; }

    @JsonProperty("supportsPayPal")
    public boolean getSupportsPayPal() { return supportsPayPal; }
    @JsonProperty("supportsPayPal")
    public void setSupportsPayPal(boolean value) { this.supportsPayPal = value; }

    @JsonProperty("slugs")
    public List<String> getSlugs() { return slugs; }
    @JsonProperty("slugs")
    public void setSlugs(List<String> value) { this.slugs = value; }

    @JsonProperty("permissionType")
    public String getPermissionType() { return permissionType; }
    @JsonProperty("permissionType")
    public void setPermissionType(String value) { this.permissionType = value; }
}
