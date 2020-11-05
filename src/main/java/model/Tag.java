package model;

import java.util.ArrayList;
import java.util.Objects;

public class Tag {
    private String tagName;
    private ArrayList<Ad> tagAds;

    public Tag(String tagName, ArrayList<Ad> tagAds) {
        this.tagName = tagName;
        this.tagAds = tagAds;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public ArrayList<Ad> getTagAds() {
        return tagAds;
    }

    public void setTagAds(ArrayList<Ad> tagAds) {
        this.tagAds = tagAds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(tagName, tag.tagName) &&
                Objects.equals(tagAds, tag.tagAds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName, tagAds);
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagName='" + tagName + '\'' +
                ", tagAds=" + tagAds +
                '}';
    }
}
