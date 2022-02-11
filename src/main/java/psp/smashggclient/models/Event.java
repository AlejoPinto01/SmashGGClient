package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class Event {
    private long id;
    private long tournamentID;
    private long state;
    private long progressMeter;
    private long videogameID;
    private String name;
    private String description;
    private String slug;
    private long entryFee;
    private Object entryCap;
    private Object teamRosterSize;
    private long entrantSizeMin;
    private long entrantSizeMax;
    private long requiredCheckinNum;
    private boolean teamNameAllowed;
    private Object teamManagementDeadline;
    private boolean allowAutoReport;
    private Object tmgEventType;
    private Object templateID;
    private Object gameName;
    private Object playersPerEntry;
    private Object exhibition;
    private Object networkIDS;
    private PlatformID[] platformIDS;
    private Object version;
    private long type;
    private Object formatType;
    private Object teamsFormat;
    private long entrantMode;
    private boolean eventPrivate;
    private long competitionTier;
    private boolean isOnline;
    private boolean hasTasks;
    private Object hasDecks;
    private boolean enableSlippi;
    private boolean hasMatchmaking;
    private boolean isPlaceholder;
    private boolean checkInEnabled;
    private long checkInDuration;
    private long checkInBuffer;
    private long startAt;
    private long endAt;
    private Object startedAt;
    private Object completedAt;
    private Object projectionMode;
    private Long rulesetID;
    private Object requiresVerification;
    private PageConfig pageConfig;
    private Object[] gameModeConfig;
    private Object ffaPointConfig;
    private Object ffaAutoBracketGenerationConfig;
    private Object[] rulesetSettings;
    private String rulesMarkdown;
    private Object matchRulesMarkdown;
    private PrizingInfo prizingInfo;
    private Object deckSubmissionDeadline;
    private boolean deckDeadlineHandled;
    private Object[] stations;
    private Object[] streams;
    private Object[] waves;
    private EventPublishing publishing;
    private Object[] images;
    private long scheduleID;
    private String[] expand;
    private String[] slugs;
    private String typeDisplayStr;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("tournamentId")
    public long getTournamentID() { return tournamentID; }
    @JsonProperty("tournamentId")
    public void setTournamentID(long value) { this.tournamentID = value; }

    @JsonProperty("state")
    public long getState() { return state; }
    @JsonProperty("state")
    public void setState(long value) { this.state = value; }

    @JsonProperty("progressMeter")
    public long getProgressMeter() { return progressMeter; }
    @JsonProperty("progressMeter")
    public void setProgressMeter(long value) { this.progressMeter = value; }

    @JsonProperty("videogameId")
    public long getVideogameID() { return videogameID; }
    @JsonProperty("videogameId")
    public void setVideogameID(long value) { this.videogameID = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("slug")
    public String getSlug() { return slug; }
    @JsonProperty("slug")
    public void setSlug(String value) { this.slug = value; }

    @JsonProperty("entryFee")
    public long getEntryFee() { return entryFee; }
    @JsonProperty("entryFee")
    public void setEntryFee(long value) { this.entryFee = value; }

    @JsonProperty("entryCap")
    public Object getEntryCap() { return entryCap; }
    @JsonProperty("entryCap")
    public void setEntryCap(Object value) { this.entryCap = value; }

    @JsonProperty("teamRosterSize")
    public Object getTeamRosterSize() { return teamRosterSize; }
    @JsonProperty("teamRosterSize")
    public void setTeamRosterSize(Object value) { this.teamRosterSize = value; }

    @JsonProperty("entrantSizeMin")
    public long getEntrantSizeMin() { return entrantSizeMin; }
    @JsonProperty("entrantSizeMin")
    public void setEntrantSizeMin(long value) { this.entrantSizeMin = value; }

    @JsonProperty("entrantSizeMax")
    public long getEntrantSizeMax() { return entrantSizeMax; }
    @JsonProperty("entrantSizeMax")
    public void setEntrantSizeMax(long value) { this.entrantSizeMax = value; }

    @JsonProperty("requiredCheckinNum")
    public long getRequiredCheckinNum() { return requiredCheckinNum; }
    @JsonProperty("requiredCheckinNum")
    public void setRequiredCheckinNum(long value) { this.requiredCheckinNum = value; }

    @JsonProperty("teamNameAllowed")
    public boolean getTeamNameAllowed() { return teamNameAllowed; }
    @JsonProperty("teamNameAllowed")
    public void setTeamNameAllowed(boolean value) { this.teamNameAllowed = value; }

    @JsonProperty("teamManagementDeadline")
    public Object getTeamManagementDeadline() { return teamManagementDeadline; }
    @JsonProperty("teamManagementDeadline")
    public void setTeamManagementDeadline(Object value) { this.teamManagementDeadline = value; }

    @JsonProperty("allowAutoReport")
    public boolean getAllowAutoReport() { return allowAutoReport; }
    @JsonProperty("allowAutoReport")
    public void setAllowAutoReport(boolean value) { this.allowAutoReport = value; }

    @JsonProperty("tmgEventType")
    public Object getTmgEventType() { return tmgEventType; }
    @JsonProperty("tmgEventType")
    public void setTmgEventType(Object value) { this.tmgEventType = value; }

    @JsonProperty("templateId")
    public Object getTemplateID() { return templateID; }
    @JsonProperty("templateId")
    public void setTemplateID(Object value) { this.templateID = value; }

    @JsonProperty("gameName")
    public Object getGameName() { return gameName; }
    @JsonProperty("gameName")
    public void setGameName(Object value) { this.gameName = value; }

    @JsonProperty("playersPerEntry")
    public Object getPlayersPerEntry() { return playersPerEntry; }
    @JsonProperty("playersPerEntry")
    public void setPlayersPerEntry(Object value) { this.playersPerEntry = value; }

    @JsonProperty("exhibition")
    public Object getExhibition() { return exhibition; }
    @JsonProperty("exhibition")
    public void setExhibition(Object value) { this.exhibition = value; }

    @JsonProperty("networkIds")
    public Object getNetworkIDS() { return networkIDS; }
    @JsonProperty("networkIds")
    public void setNetworkIDS(Object value) { this.networkIDS = value; }

    @JsonProperty("platformIds")
    public PlatformID[] getPlatformIDS() { return platformIDS; }
    @JsonProperty("platformIds")
    public void setPlatformIDS(PlatformID[] value) { this.platformIDS = value; }

    @JsonProperty("version")
    public Object getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(Object value) { this.version = value; }

    @JsonProperty("type")
    public long getType() { return type; }
    @JsonProperty("type")
    public void setType(long value) { this.type = value; }

    @JsonProperty("formatType")
    public Object getFormatType() { return formatType; }
    @JsonProperty("formatType")
    public void setFormatType(Object value) { this.formatType = value; }

    @JsonProperty("teamsFormat")
    public Object getTeamsFormat() { return teamsFormat; }
    @JsonProperty("teamsFormat")
    public void setTeamsFormat(Object value) { this.teamsFormat = value; }

    @JsonProperty("entrantMode")
    public long getEntrantMode() { return entrantMode; }
    @JsonProperty("entrantMode")
    public void setEntrantMode(long value) { this.entrantMode = value; }

    @JsonProperty("private")
    public boolean getEventPrivate() { return eventPrivate; }
    @JsonProperty("private")
    public void setEventPrivate(boolean value) { this.eventPrivate = value; }

    @JsonProperty("competitionTier")
    public long getCompetitionTier() { return competitionTier; }
    @JsonProperty("competitionTier")
    public void setCompetitionTier(long value) { this.competitionTier = value; }

    @JsonProperty("isOnline")
    public boolean getIsOnline() { return isOnline; }
    @JsonProperty("isOnline")
    public void setIsOnline(boolean value) { this.isOnline = value; }

    @JsonProperty("hasTasks")
    public boolean getHasTasks() { return hasTasks; }
    @JsonProperty("hasTasks")
    public void setHasTasks(boolean value) { this.hasTasks = value; }

    @JsonProperty("hasDecks")
    public Object getHasDecks() { return hasDecks; }
    @JsonProperty("hasDecks")
    public void setHasDecks(Object value) { this.hasDecks = value; }

    @JsonProperty("enableSlippi")
    public boolean getEnableSlippi() { return enableSlippi; }
    @JsonProperty("enableSlippi")
    public void setEnableSlippi(boolean value) { this.enableSlippi = value; }

    @JsonProperty("hasMatchmaking")
    public boolean getHasMatchmaking() { return hasMatchmaking; }
    @JsonProperty("hasMatchmaking")
    public void setHasMatchmaking(boolean value) { this.hasMatchmaking = value; }

    @JsonProperty("isPlaceholder")
    public boolean getIsPlaceholder() { return isPlaceholder; }
    @JsonProperty("isPlaceholder")
    public void setIsPlaceholder(boolean value) { this.isPlaceholder = value; }

    @JsonProperty("checkInEnabled")
    public boolean getCheckInEnabled() { return checkInEnabled; }
    @JsonProperty("checkInEnabled")
    public void setCheckInEnabled(boolean value) { this.checkInEnabled = value; }

    @JsonProperty("checkInDuration")
    public long getCheckInDuration() { return checkInDuration; }
    @JsonProperty("checkInDuration")
    public void setCheckInDuration(long value) { this.checkInDuration = value; }

    @JsonProperty("checkInBuffer")
    public long getCheckInBuffer() { return checkInBuffer; }
    @JsonProperty("checkInBuffer")
    public void setCheckInBuffer(long value) { this.checkInBuffer = value; }

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

    @JsonProperty("projectionMode")
    public Object getProjectionMode() { return projectionMode; }
    @JsonProperty("projectionMode")
    public void setProjectionMode(Object value) { this.projectionMode = value; }

    @JsonProperty("rulesetId")
    public Long getRulesetID() { return rulesetID; }
    @JsonProperty("rulesetId")
    public void setRulesetID(Long value) { this.rulesetID = value; }

    @JsonProperty("requiresVerification")
    public Object getRequiresVerification() { return requiresVerification; }
    @JsonProperty("requiresVerification")
    public void setRequiresVerification(Object value) { this.requiresVerification = value; }

    @JsonProperty("pageConfig")
    public PageConfig getPageConfig() { return pageConfig; }
    @JsonProperty("pageConfig")
    public void setPageConfig(PageConfig value) { this.pageConfig = value; }

    @JsonProperty("gameModeConfig")
    public Object[] getGameModeConfig() { return gameModeConfig; }
    @JsonProperty("gameModeConfig")
    public void setGameModeConfig(Object[] value) { this.gameModeConfig = value; }

    @JsonProperty("ffaPointConfig")
    public Object getFfaPointConfig() { return ffaPointConfig; }
    @JsonProperty("ffaPointConfig")
    public void setFfaPointConfig(Object value) { this.ffaPointConfig = value; }

    @JsonProperty("ffaAutoBracketGenerationConfig")
    public Object getFfaAutoBracketGenerationConfig() { return ffaAutoBracketGenerationConfig; }
    @JsonProperty("ffaAutoBracketGenerationConfig")
    public void setFfaAutoBracketGenerationConfig(Object value) { this.ffaAutoBracketGenerationConfig = value; }

    @JsonProperty("rulesetSettings")
    public Object[] getRulesetSettings() { return rulesetSettings; }
    @JsonProperty("rulesetSettings")
    public void setRulesetSettings(Object[] value) { this.rulesetSettings = value; }

    @JsonProperty("rulesMarkdown")
    public String getRulesMarkdown() { return rulesMarkdown; }
    @JsonProperty("rulesMarkdown")
    public void setRulesMarkdown(String value) { this.rulesMarkdown = value; }

    @JsonProperty("matchRulesMarkdown")
    public Object getMatchRulesMarkdown() { return matchRulesMarkdown; }
    @JsonProperty("matchRulesMarkdown")
    public void setMatchRulesMarkdown(Object value) { this.matchRulesMarkdown = value; }

    @JsonProperty("prizingInfo")
    public PrizingInfo getPrizingInfo() { return prizingInfo; }
    @JsonProperty("prizingInfo")
    public void setPrizingInfo(PrizingInfo value) { this.prizingInfo = value; }

    @JsonProperty("deckSubmissionDeadline")
    public Object getDeckSubmissionDeadline() { return deckSubmissionDeadline; }
    @JsonProperty("deckSubmissionDeadline")
    public void setDeckSubmissionDeadline(Object value) { this.deckSubmissionDeadline = value; }

    @JsonProperty("deckDeadlineHandled")
    public boolean getDeckDeadlineHandled() { return deckDeadlineHandled; }
    @JsonProperty("deckDeadlineHandled")
    public void setDeckDeadlineHandled(boolean value) { this.deckDeadlineHandled = value; }

    @JsonProperty("stations")
    public Object[] getStations() { return stations; }
    @JsonProperty("stations")
    public void setStations(Object[] value) { this.stations = value; }

    @JsonProperty("streams")
    public Object[] getStreams() { return streams; }
    @JsonProperty("streams")
    public void setStreams(Object[] value) { this.streams = value; }

    @JsonProperty("waves")
    public Object[] getWaves() { return waves; }
    @JsonProperty("waves")
    public void setWaves(Object[] value) { this.waves = value; }

    @JsonProperty("publishing")
    public EventPublishing getPublishing() { return publishing; }
    @JsonProperty("publishing")
    public void setPublishing(EventPublishing value) { this.publishing = value; }

    @JsonProperty("images")
    public Object[] getImages() { return images; }
    @JsonProperty("images")
    public void setImages(Object[] value) { this.images = value; }

    @JsonProperty("scheduleId")
    public long getScheduleID() { return scheduleID; }
    @JsonProperty("scheduleId")
    public void setScheduleID(long value) { this.scheduleID = value; }

    @JsonProperty("expand")
    public String[] getExpand() { return expand; }
    @JsonProperty("expand")
    public void setExpand(String[] value) { this.expand = value; }

    @JsonProperty("slugs")
    public String[] getSlugs() { return slugs; }
    @JsonProperty("slugs")
    public void setSlugs(String[] value) { this.slugs = value; }

    @JsonProperty("typeDisplayStr")
    public String getTypeDisplayStr() { return typeDisplayStr; }
    @JsonProperty("typeDisplayStr")
    public void setTypeDisplayStr(String value) { this.typeDisplayStr = value; }
}
