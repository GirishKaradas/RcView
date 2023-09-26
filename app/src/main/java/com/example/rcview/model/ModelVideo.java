package com.example.rcview.model;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class ModelVideo implements Serializable {
  private Integer resultCount;

  private List<Results> results;

  public Integer getResultCount() {
    return this.resultCount;
  }

  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }

  public List<Results> getResults() {
    return this.results;
  }

  public void setResults(List<Results> results) {
    this.results = results;
  }

  public static class Results implements Serializable {
    private String artworkUrl100;

    private Integer trackTimeMillis;

    private String country;

    private String previewUrl;

    private Integer artistId;

    private String trackName;

    private String collectionName;

    private String artistViewUrl;

    private Integer discNumber;

    private Integer trackCount;

    private String artworkUrl30;

    private String wrapperType;

    private String currency;

    private Integer collectionId;

    private Boolean isStreamable;

    private String trackExplicitness;

    private String collectionViewUrl;

    private Integer trackNumber;

    private String releaseDate;

    private String kind;

    private Integer trackId;

    private Double collectionPrice;

    private Integer discCount;

    private String primaryGenreName;

    private Double trackPrice;

    private String collectionExplicitness;

    private String trackViewUrl;

    private String artworkUrl60;

    private String trackCensoredName;

    private String artistName;

    private String collectionCensoredName;

    public String getArtworkUrl100() {
      return this.artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
      this.artworkUrl100 = artworkUrl100;
    }

    public Integer getTrackTimeMillis() {
      return this.trackTimeMillis;
    }

    public void setTrackTimeMillis(Integer trackTimeMillis) {
      this.trackTimeMillis = trackTimeMillis;
    }

    public String getCountry() {
      return this.country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    public String getPreviewUrl() {
      return this.previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
      this.previewUrl = previewUrl;
    }

    public Integer getArtistId() {
      return this.artistId;
    }

    public void setArtistId(Integer artistId) {
      this.artistId = artistId;
    }

    public String getTrackName() {
      return this.trackName;
    }

    public void setTrackName(String trackName) {
      this.trackName = trackName;
    }

    public String getCollectionName() {
      return this.collectionName;
    }

    public void setCollectionName(String collectionName) {
      this.collectionName = collectionName;
    }

    public String getArtistViewUrl() {
      return this.artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
      this.artistViewUrl = artistViewUrl;
    }

    public Integer getDiscNumber() {
      return this.discNumber;
    }

    public void setDiscNumber(Integer discNumber) {
      this.discNumber = discNumber;
    }

    public Integer getTrackCount() {
      return this.trackCount;
    }

    public void setTrackCount(Integer trackCount) {
      this.trackCount = trackCount;
    }

    public String getArtworkUrl30() {
      return this.artworkUrl30;
    }

    public void setArtworkUrl30(String artworkUrl30) {
      this.artworkUrl30 = artworkUrl30;
    }

    public String getWrapperType() {
      return this.wrapperType;
    }

    public void setWrapperType(String wrapperType) {
      this.wrapperType = wrapperType;
    }

    public String getCurrency() {
      return this.currency;
    }

    public void setCurrency(String currency) {
      this.currency = currency;
    }

    public Integer getCollectionId() {
      return this.collectionId;
    }

    public void setCollectionId(Integer collectionId) {
      this.collectionId = collectionId;
    }

    public Boolean getIsStreamable() {
      return this.isStreamable;
    }

    public void setIsStreamable(Boolean isStreamable) {
      this.isStreamable = isStreamable;
    }

    public String getTrackExplicitness() {
      return this.trackExplicitness;
    }

    public void setTrackExplicitness(String trackExplicitness) {
      this.trackExplicitness = trackExplicitness;
    }

    public String getCollectionViewUrl() {
      return this.collectionViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
      this.collectionViewUrl = collectionViewUrl;
    }

    public Integer getTrackNumber() {
      return this.trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
      this.trackNumber = trackNumber;
    }

    public String getReleaseDate() {
      return this.releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
      this.releaseDate = releaseDate;
    }

    public String getKind() {
      return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }

    public Integer getTrackId() {
      return this.trackId;
    }

    public void setTrackId(Integer trackId) {
      this.trackId = trackId;
    }

    public Double getCollectionPrice() {
      return this.collectionPrice;
    }

    public void setCollectionPrice(Double collectionPrice) {
      this.collectionPrice = collectionPrice;
    }

    public Integer getDiscCount() {
      return this.discCount;
    }

    public void setDiscCount(Integer discCount) {
      this.discCount = discCount;
    }

    public String getPrimaryGenreName() {
      return this.primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
      this.primaryGenreName = primaryGenreName;
    }

    public Double getTrackPrice() {
      return this.trackPrice;
    }

    public void setTrackPrice(Double trackPrice) {
      this.trackPrice = trackPrice;
    }

    public String getCollectionExplicitness() {
      return this.collectionExplicitness;
    }

    public void setCollectionExplicitness(String collectionExplicitness) {
      this.collectionExplicitness = collectionExplicitness;
    }

    public String getTrackViewUrl() {
      return this.trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
      this.trackViewUrl = trackViewUrl;
    }

    public String getArtworkUrl60() {
      return this.artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
      this.artworkUrl60 = artworkUrl60;
    }

    public String getTrackCensoredName() {
      return this.trackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
      this.trackCensoredName = trackCensoredName;
    }

    public String getArtistName() {
      return this.artistName;
    }

    public void setArtistName(String artistName) {
      this.artistName = artistName;
    }

    public String getCollectionCensoredName() {
      return this.collectionCensoredName;
    }

    public void setCollectionCensoredName(String collectionCensoredName) {
      this.collectionCensoredName = collectionCensoredName;
    }
  }
}
