package model;

import java.util.Objects;

public class Ad {
    private String adID;
    private String adName;
    private String adManufacturer;
    private Image adImage;

    public Ad(String adID, String adName, String adManufacturer, Image adImage) {
        this.adID = adID;
        this.adName = adName;
        this.adManufacturer = adManufacturer;
        this.adImage = adImage;
    }

    public String getAdID() {
        return adID;
    }

    public void setAdID(String adID) {
        this.adID = adID;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdManufacturer() {
        return adManufacturer;
    }

    public void setAdManufacturer(String adManufacturer) {
        this.adManufacturer = adManufacturer;
    }

    public Image getAdImage() {
        return adImage;
    }

    public void setAdImage(Image adImage) {
        this.adImage = adImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ad ad = (Ad) o;
        return Objects.equals(adID, ad.adID) &&
                Objects.equals(adName, ad.adName) &&
                Objects.equals(adManufacturer, ad.adManufacturer) &&
                Objects.equals(adImage, ad.adImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adID, adName, adManufacturer, adImage);
    }

    @Override
    public String toString() {
        return "Ad{" +
                "adID='" + adID + '\'' +
                ", adName='" + adName + '\'' +
                ", adManufacturer='" + adManufacturer + '\'' +
                ", adImage=" + adImage +
                '}';
    }
}
