package org.brapi.brapiIntroClassJavaClient.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TrialsResponse {
	@JsonProperty("metadata")
	private Metadata metadata = null;
	
	@JsonProperty("result")
	private TrialsResponseResult result = null;

	public TrialsResponse metadata(Metadata metadata) {
		this.metadata = metadata;
		return this;
	}

	/**
	 * Get metadata
	 * 
	 * @return metadata
	 **/

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public TrialsResponse result(TrialsResponseResult result) {
		this.result = result;
		return this;
	}

	/**
	 * Get result
	 * 
	 * @return result
	 **/

	public TrialsResponseResult getResult() {
		return result;
	}

	public void setResult(TrialsResponseResult result) {
		this.result = result;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TrialsResponse trialsResponse = (TrialsResponse) o;
		return Objects.equals(this.metadata, trialsResponse.metadata)
				&& Objects.equals(this.result, trialsResponse.result);
	}

	@Override
	public int hashCode() {
		return Objects.hash(metadata, result);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TrialsResponse {\n");

		sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
		sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
