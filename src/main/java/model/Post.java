package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Post {
    private String postID;
    private String postOwnerUserName;
    private Image postOwnerProfilePic;
    private Date datePosted;
    private String postBody;
    private ArrayList<Image> postImages;

    public Post(String postID, String postOwnerUserName, Image postOwnerProfilePic, Date datePosted, String postBody,
                ArrayList<Image> postImages) {
        this.postID = postID;
        this.postOwnerUserName = postOwnerUserName;
        this.postOwnerProfilePic = postOwnerProfilePic;
        this.datePosted = datePosted;
        this.postBody = postBody;
        this.postImages = postImages;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getPostOwnerUserName() {
        return postOwnerUserName;
    }

    public void setPostOwnerUserName(String postOwnerUserName) {
        this.postOwnerUserName = postOwnerUserName;
    }

    public Image getPostOwnerProfilePic() {
        return postOwnerProfilePic;
    }

    public void setPostOwnerProfilePic(Image postOwnerProfilePic) {
        this.postOwnerProfilePic = postOwnerProfilePic;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public ArrayList<Image> getPostImages() {
        return postImages;
    }

    public void setPostImages(ArrayList<Image> postImages) {
        this.postImages = postImages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(postID, post.postID) &&
                Objects.equals(postOwnerUserName, post.postOwnerUserName) &&
                Objects.equals(postOwnerProfilePic, post.postOwnerProfilePic) &&
                Objects.equals(datePosted, post.datePosted) &&
                Objects.equals(postBody, post.postBody) &&
                Objects.equals(postImages, post.postImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postID, postOwnerUserName, postOwnerProfilePic, datePosted, postBody, postImages);
    }

    @Override
    public String toString() {
        return "Post{" +
                "postID='" + postID + '\'' +
                ", postOwnerUserName='" + postOwnerUserName + '\'' +
                ", postOwnerProfilePic=" + postOwnerProfilePic +
                ", datePosted=" + datePosted +
                ", postBody='" + postBody + '\'' +
                ", postImages=" + postImages +
                '}';
    }
}
