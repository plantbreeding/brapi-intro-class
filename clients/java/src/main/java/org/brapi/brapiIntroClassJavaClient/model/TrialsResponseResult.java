package org.brapi.brapiIntroClassJavaClient.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class TrialsResponseResult {
	@JsonProperty("data")
	private List<Trial> data = null;

	public TrialsResponseResult data(List<Trial> data) {
		this.data = data;
		return this;
	}

	public TrialsResponseResult addDataItem(Trial dataItem) {
		if (this.data == null) {
			this.data = new ArrayList<Trial>();
		}
		this.data.add(dataItem);
		return this;
	}

	/**
	 * Get data
	 * 
	 * @return data
	 **/

	public List<Trial> getData() {
		return data;
	}

	public void setData(List<Trial> data) {
		this.data = data;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TrialsResponseResult trialsResponseResult = (TrialsResponseResult) o;
		return Objects.equals(this.data, trialsResponseResult.data);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TrialsResponseResult {\n");

		sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
