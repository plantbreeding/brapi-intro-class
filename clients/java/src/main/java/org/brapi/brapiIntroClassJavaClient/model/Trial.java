package org.brapi.brapiIntroClassJavaClient.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Trial {
	@JsonProperty("active")
	private Boolean active = null;
	
	@JsonProperty("additionalInfo")
	private Map<String, String> additionalInfo = null;
	
	@JsonProperty("commonCropName")
	private String commonCropName = null;
	
	@JsonProperty("documentationURL")
	private String documentationURL = null;
	
	@JsonProperty("endDate")
	private Date endDate = null;
	
	@JsonProperty("programDbId")
	private String programDbId = null;
	
	@JsonProperty("programName")
	private String programName = null;
	
	@JsonProperty("startDate")
	private Date startDate = null;
	
	@JsonProperty("studies")
	private List<TrialStudies> studies = null;
	
	@JsonProperty("trialDbId")
	private String trialDbId = null;
	
	@JsonProperty("trialName")
	private String trialName = null;

	public Trial active(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Is this trail currently active
	 * 
	 * @return active
	 **/

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Trial additionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public Trial putAdditionalInfoItem(String key, String additionalInfoItem) {
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

	public Trial commonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
		return this;
	}

	/**
	 * Common name for the crop associated with this trial
	 * 
	 * @return commonCropName
	 **/

	public String getCommonCropName() {
		return commonCropName;
	}

	public void setCommonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
	}

	public Trial documentationURL(String documentationURL) {
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

	public Trial endDate(Date endDate) {
		this.endDate = endDate;
		return this;
	}

	/**
	 * The date this trial ends
	 * 
	 * @return endDate
	 **/

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Trial programDbId(String programDbId) {
		this.programDbId = programDbId;
		return this;
	}

	/**
	 * A program identifier to search for
	 * 
	 * @return programDbId
	 **/

	public String getProgramDbId() {
		return programDbId;
	}

	public void setProgramDbId(String programDbId) {
		this.programDbId = programDbId;
	}

	public Trial programName(String programName) {
		this.programName = programName;
		return this;
	}

	/**
	 * The human readable name of a program
	 * 
	 * @return programName
	 **/

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public Trial startDate(Date startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * The date this trial started
	 * 
	 * @return startDate
	 **/

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Trial studies(List<TrialStudies> studies) {
		this.studies = studies;
		return this;
	}

	public Trial addStudiesItem(TrialStudies studiesItem) {
		if (this.studies == null) {
			this.studies = new ArrayList<TrialStudies>();
		}
		this.studies.add(studiesItem);
		return this;
	}

	/**
	 * List of studies inside this trial
	 * 
	 * @return studies
	 **/

	public List<TrialStudies> getStudies() {
		return studies;
	}

	public void setStudies(List<TrialStudies> studies) {
		this.studies = studies;
	}

	public Trial trialDbId(String trialDbId) {
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

	public Trial trialName(String trialName) {
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
		Trial trial = (Trial) o;
		return Objects.equals(this.active, trial.active) && Objects.equals(this.additionalInfo, trial.additionalInfo)
				&& Objects.equals(this.commonCropName, trial.commonCropName)
				&& Objects.equals(this.documentationURL, trial.documentationURL)
				&& Objects.equals(this.endDate, trial.endDate) && Objects.equals(this.programDbId, trial.programDbId)
				&& Objects.equals(this.programName, trial.programName)
				&& Objects.equals(this.startDate, trial.startDate) && Objects.equals(this.studies, trial.studies)
				&& Objects.equals(this.trialDbId, trial.trialDbId) && Objects.equals(this.trialName, trial.trialName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(active, additionalInfo, commonCropName, documentationURL, endDate, programDbId, programName,
				startDate, studies, trialDbId, trialName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Trial {\n");

		sb.append("    active: ").append(toIndentedString(active)).append("\n");
		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
		sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
		sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
		sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
		sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    studies: ").append(toIndentedString(studies)).append("\n");
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
