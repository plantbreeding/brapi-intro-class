package org.brapi.brapiIntroClassJavaClient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class Metadata   {
  @JsonProperty("datafiles")
  private List<String> datafiles = null;

  @JsonProperty("pagination")
  private MetadataPagination pagination = null;

  @JsonProperty("status")
  private List<Status> status = null;

  public Metadata datafiles(List<String> datafiles) {
    this.datafiles = datafiles;
    return this;
  }

  public Metadata addDatafilesItem(String datafilesItem) {
    if (this.datafiles == null) {
      this.datafiles = new ArrayList<String>();
    }
    this.datafiles.add(datafilesItem);
    return this;
  }

  /**
   * The datafiles key contains a list of file paths, which can be relative or complete URLs. These files contain additional information related to the returned object and can be retrieved by a subsequent call. The empty list should be returned if no additional data files are present.
   * @return datafiles
  **/

  public List<String> getDatafiles() {
    return datafiles;
  }

  public void setDatafiles(List<String> datafiles) {
    this.datafiles = datafiles;
  }

  public Metadata pagination(MetadataPagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
  **/

  public MetadataPagination getPagination() {
    return pagination;
  }

  public void setPagination(MetadataPagination pagination) {
    this.pagination = pagination;
  }

  public Metadata status(List<Status> status) {
    this.status = status;
    return this;
  }

  public Metadata addStatusItem(Status statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<Status>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * The status field contains a list of informational status messages from the server. If no status is reported, an empty list should be returned. See Error Reporting for more information.
   * @return status
  **/

  public List<Status> getStatus() {
    return status;
  }

  public void setStatus(List<Status> status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.datafiles, metadata.datafiles) &&
        Objects.equals(this.pagination, metadata.pagination) &&
        Objects.equals(this.status, metadata.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datafiles, pagination, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    datafiles: ").append(toIndentedString(datafiles)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

