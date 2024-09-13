package cn.har01d.alist_tvbox.dto.emby;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Objects;

@Data
public class EmbyItem {
    @JsonProperty("Id")
    private String id;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("CollectionType")
    private String collectionType;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Overview")
    private String overview;

    @JsonProperty("ProductionYear")
    private Integer year;

    @JsonProperty("IndexNumber")
    private Integer indexNumber;

    @JsonProperty("SeriesId")
    private String seriesId;

    @JsonProperty("SeriesName")
    private String seriesName;

    @JsonProperty("SeasonId")
    private String seasonId;

    @JsonProperty("SeasonName")
    private String seasonName;

    @JsonProperty("ImageTags")
    private ImageTags imageTags;

    @JsonProperty("CommunityRating")
    private Double rating;

    @Data
    public static class ImageTags {
        @JsonProperty("Primary")
        private String primary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmbyItem embyItem = (EmbyItem) o;
        return Objects.equals(id, embyItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
