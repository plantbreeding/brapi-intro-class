package org.brapi.brapiIntroClassJavaClient.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Study {
	
	@JsonProperty("active")
	private String active = null;
	
	@JsonProperty("additionalInfo")
	private Map<String, String> additionalInfo = null;
	
	@JsonProperty("commonCropName")
	private String commonCropName = null;
	
	@JsonProperty("documentationURL")
	private String documentationURL = null;
	
	@JsonProperty("endDate")
	private Date endDate = null;
	
	@JsonProperty("locationDbId")
	private String locationDbId = null;
	
	@JsonProperty("locationName")
	private String locationName = null;
	
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("programDbId")
	private String programDbId = null;
	
	@JsonProperty("programName")
	private String programName = null;
	
	@JsonProperty("seasons")
	private List<Season> seasons = null;
	
	@JsonProperty("startDate")
	private Date startDate = null;
	
	@JsonProperty("studyDbId")
	private String studyDbId = null;
	
	@JsonProperty("studyName")
	private String studyName = null;
	
	@JsonProperty("studyType")
	private String studyType = null;
	
	@JsonProperty("studyTypeDbId")
	private String studyTypeDbId = null;
	
	@JsonProperty("studyTypeName")
	private String studyTypeName = null;
	
	@JsonProperty("trialDbId")
	private String trialDbId = null;
	
	@JsonProperty("trialName")
	private String trialName = null;

	public Study active(String active) {
		this.active = active;
		return this;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Study additionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public Study putAdditionalInfoItem(String key, String additionalInfoItem) {
		if (this.additionalInfo == null) {
			this.additionalInfo = null;
		}
		this.additionalInfo.put(key, additionalInfoItem);
		return this;
	}

	/**
	 * Additional arbitrary info
	 * 
	 * @return additionalInfo
	 **/

	public Map<String, String> getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public Study commonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
		return this;
	}

	/**
	 * Common name for the crop associated with this study
	 * 
	 * @return commonCropName
	 **/

	public String getCommonCropName() {
		return commonCropName;
	}

	public void setCommonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
	}

	public Study documentationURL(String documentationURL) {
		this.documentationURL = documentationURL;
		return this;
	}

	/**
	 * A URL to the human readable documentation of this object
	 * 
	 * @return documentationURL
	 **/

	public String getDocumentationURL() {
		return documentationURL;
	}

	public void setDocumentationURL(String documentationURL) {
		this.documentationURL = documentationURL;
	}

	public Study endDate(Date endDate) {
		this.endDate = endDate;
		return this;
	}

	/**
	 * The date the study ends
	 * 
	 * @return endDate
	 **/

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Study locationDbId(String locationDbId) {
		this.locationDbId = locationDbId;
		return this;
	}

	/**
	 * The ID which uniquely identifies a location
	 * 
	 * @return locationDbId
	 **/

	public String getLocationDbId() {
		return locationDbId;
	}

	public void setLocationDbId(String locationDbId) {
		this.locationDbId = locationDbId;
	}

	public Study locationName(String locationName) {
		this.locationName = locationName;
		return this;
	}

	/**
	 * The human readable name for a location
	 * 
	 * @return locationName
	 **/

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Study name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * DEPRECATED in v1.3 - Use \"studyName\"
	 * 
	 * @return name
	 **/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Study programDbId(String programDbId) {
		this.programDbId = programDbId;
		return this;
	}

	/**
	 * The ID which uniquely identifies a program within the given database server
	 * 
	 * @return programDbId
	 **/

	public String getProgramDbId() {
		return programDbId;
	}

	public void setProgramDbId(String programDbId) {
		this.programDbId = programDbId;
	}

	public Study programName(String programName) {
		this.programName = programName;
		return this;
	}

	/**
	 * The humane readable name of a program
	 * 
	 * @return programName
	 **/

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public Study seasons(List<Season> seasons) {
		this.seasons = seasons;
		return this;
	}

	public Study addSeasonsItem(Season seasonsItem) {
		if (this.seasons == null) {
			this.seasons = new ArrayList<Season>();
		}
		this.seasons.add(seasonsItem);
		return this;
	}

	/**
	 * List of seasons over which this study was performed.
	 * 
	 * @return seasons
	 **/

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	public Study startDate(Date startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * The date this study started
	 * 
	 * @return startDate
	 **/

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Study studyDbId(String studyDbId) {
		this.studyDbId = studyDbId;
		return this;
	}

	/**
	 * The ID which uniquely identifies a study within the given database server
	 * 
	 * @return studyDbId
	 **/

	public String getStudyDbId() {
		return studyDbId;
	}

	public void setStudyDbId(String studyDbId) {
		this.studyDbId = studyDbId;
	}

	public Study studyName(String studyName) {
		this.studyName = studyName;
		return this;
	}

	/**
	 * The humane readable name of a study
	 * 
	 * @return studyName
	 **/

	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}

	public Study studyType(String studyType) {
		this.studyType = studyType;
		return this;
	}

	/**
	 * DEPRECATED in v1.3 - See \"studyTypeName\"
	 * 
	 * @return studyType
	 **/

	public String getStudyType() {
		return studyType;
	}

	public void setStudyType(String studyType) {
		this.studyType = studyType;
	}

	public Study studyTypeDbId(String studyTypeDbId) {
		this.studyTypeDbId = studyTypeDbId;
		return this;
	}

	/**
	 * The unique identifier of the type of study being performed.
	 * 
	 * @return studyTypeDbId
	 **/

	public String getStudyTypeDbId() {
		return studyTypeDbId;
	}

	public void setStudyTypeDbId(String studyTypeDbId) {
		this.studyTypeDbId = studyTypeDbId;
	}

	public Study studyTypeName(String studyTypeName) {
		this.studyTypeName = studyTypeName;
		return this;
	}

	/**
	 * The name of the type of study being performed. ex. \"Yield Trial\", etc
	 * 
	 * @return studyTypeName
	 **/

	public String getStudyTypeName() {
		return studyTypeName;
	}

	public void setStudyTypeName(String studyTypeName) {
		this.studyTypeName = studyTypeName;
	}

	public Study trialDbId(String trialDbId) {
		this.trialDbId = trialDbId;
		return this;
	}

	/**
	 * The ID which uniquely identifies a trial
	 * 
	 * @return trialDbId
	 **/

	public String getTrialDbId() {
		return trialDbId;
	}

	public void setTrialDbId(String trialDbId) {
		this.trialDbId = trialDbId;
	}

	public Study trialName(String trialName) {
		this.trialName = trialName;
		return this;
	}

	/**
	 * The human readable name of a trial
	 * 
	 * @return trialName
	 **/

	public String getTrialName() {
		return trialName;
	}

	public void setTrialName(String trialName) {
		this.trialName = trialName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Study study = (Study) o;
		return Objects.equals(this.active, study.active) && Objects.equals(this.additionalInfo, study.additionalInfo)
				&& Objects.equals(this.commonCropName, study.commonCropName)
				&& Objects.equals(this.documentationURL, study.documentationURL)
				&& Objects.equals(this.endDate, study.endDate) && Objects.equals(this.locationDbId, study.locationDbId)
				&& Objects.equals(this.locationName, study.locationName) && Objects.equals(this.name, study.name)
				&& Objects.equals(this.programDbId, study.programDbId)
				&& Objects.equals(this.programName, study.programName) && Objects.equals(this.seasons, study.seasons)
				&& Objects.equals(this.startDate, study.startDate) && Objects.equals(this.studyDbId, study.studyDbId)
				&& Objects.equals(this.studyName, study.studyName) && Objects.equals(this.studyType, study.studyType)
				&& Objects.equals(this.studyTypeDbId, study.studyTypeDbId)
				&& Objects.equals(this.studyTypeName, study.studyTypeName)
				&& Objects.equals(this.trialDbId, study.trialDbId) && Objects.equals(this.trialName, study.trialName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(active, additionalInfo, commonCropName, documentationURL, endDate, locationDbId,
				locationName, name, programDbId, programName, seasons, startDate, studyDbId, studyName, studyType,
				studyTypeDbId, studyTypeName, trialDbId, trialName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class StudySummary {\n");

		sb.append("    active: ").append(toIndentedString(active)).append("\n");
		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
		sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
		sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
		sb.append("    locationDbId: ").append(toIndentedString(locationDbId)).append("\n");
		sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
		sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
		sb.append("    seasons: ").append(toIndentedString(seasons)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
		sb.append("    studyName: ").append(toIndentedString(studyName)).append("\n");
		sb.append("    studyType: ").append(toIndentedString(studyType)).append("\n");
		sb.append("    studyTypeDbId: ").append(toIndentedString(studyTypeDbId)).append("\n");
		sb.append("    studyTypeName: ").append(toIndentedString(studyTypeName)).append("\n");
		sb.append("    trialDbId: ").append(toIndentedString(trialDbId)).append("\n");
		sb.append("    trialName: ").append(toIndentedString(trialName)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
