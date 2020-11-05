package model;

import java.util.Objects;

public class Image {
    private String imageID;
    private long image;

    public Image(String imageID, long image) {
        this.imageID = imageID;
        this.image = image;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public long getImage() {
        return image;
    }

    public void setImage(long image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image1 = (Image) o;
        return image == image1.image &&
                Objects.equals(imageID, image1.imageID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageID, image);
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageID='" + imageID + '\'' +
                ", image=" + image +
                '}';
    }
}
