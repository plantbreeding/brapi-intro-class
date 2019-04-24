package org.brapi.brapiIntroClassJavaClient.model;

import java.util.Objects;

public class Season   {
  private String season = null;
  private String seasonDbId = null;
  private String year = null;

  public Season season(String season) {
    this.season = season;
    return this;
  }

  /**
   * Name of the season. ex. 'Spring', 'Q2', 'Season A', etc.
   * @return season
  **/

  public String getSeason() {
    return season;
  }

  public void setSeason(String season) {
    this.season = season;
  }

  public Season seasonDbId(String seasonDbId) {
    this.seasonDbId = seasonDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a season
   * @return seasonDbId
  **/

  public String getSeasonDbId() {
    return seasonDbId;
  }

  public void setSeasonDbId(String seasonDbId) {
    this.seasonDbId = seasonDbId;
  }

  public Season year(String year) {
    this.year = year;
    return this;
  }

  /**
   * The 4 digit year of the season.
   * @return year
  **/

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Season season = (Season) o;
    return Objects.equals(this.season, season.season) &&
        Objects.equals(this.seasonDbId, season.seasonDbId) &&
        Objects.equals(this.year, season.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(season, seasonDbId, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Season {\n");
    
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonDbId: ").append(toIndentedString(seasonDbId)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

