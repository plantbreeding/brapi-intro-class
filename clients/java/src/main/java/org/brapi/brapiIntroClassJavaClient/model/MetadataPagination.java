package org.brapi.brapiIntroClassJavaClient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MetadataPagination   {
  @JsonProperty("currentPage")
  private Integer currentPage = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("totalCount")
  private Integer totalCount = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public MetadataPagination currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Get currentPage
   * @return currentPage
  **/

  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public MetadataPagination pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  **/

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public MetadataPagination totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
  **/

  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public MetadataPagination totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  **/

  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataPagination metadataPagination = (MetadataPagination) o;
    return Objects.equals(this.currentPage, metadataPagination.currentPage) &&
        Objects.equals(this.pageSize, metadataPagination.pageSize) &&
        Objects.equals(this.totalCount, metadataPagination.totalCount) &&
        Objects.equals(this.totalPages, metadataPagination.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, pageSize, totalCount, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataPagination {\n");
    
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

