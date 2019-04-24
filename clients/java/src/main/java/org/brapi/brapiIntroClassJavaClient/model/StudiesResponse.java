package org.brapi.brapiIntroClassJavaClient.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudiesResponse {

	@JsonProperty("metadata")
	private Metadata metadata = null;

	@JsonProperty("result")
	private StudiesResponseResult result = null;

	public StudiesResponse metadata(Metadata metadata) {
		this.metadata = metadata;
		return this;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public StudiesResponse result(StudiesResponseResult result) {
		this.result = result;
		return this;
	}

	public StudiesResponseResult getResult() {
		return result;
	}

	public void setResult(StudiesResponseResult result) {
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
		StudiesResponse studiesResponse = (StudiesResponse) o;
		return Objects.equals(this.metadata, studiesResponse.metadata)
				&& Objects.equals(this.result, studiesResponse.result);
	}

	@Override
	public int hashCode() {
		return Objects.hash(metadata, result);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class StudiesResponse {\n");

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
