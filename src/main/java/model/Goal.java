package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Goal {
    private String goalID;
    private Tag goalTag;
    private String goalTitle;
    private Date creationDate;
    private String goalBody;
    private Image goalImage;
    private ArrayList<Post> goalFeed;

    public Goal(String goalID, Tag goalTag, String goalTitle, String goalBody, Image goalImage) {
        this.goalID = goalID;
        this.goalTag = goalTag;
        this.goalTitle = goalTitle;
        this.creationDate = new Date();
        this.goalBody = goalBody;
        this.goalImage = goalImage;
        this.goalFeed = new ArrayList<>();
    }

    public String getGoalID() {
        return goalID;
    }

    public void setGoalID(String goalID) {
        this.goalID = goalID;
    }

    public Tag getGoalTag() {
        return goalTag;
    }

    public void setGoalTag(Tag goalTag) {
        this.goalTag = goalTag;
    }

    public String getGoalTitle() {
        return goalTitle;
    }

    public void setGoalTitle(String goalTitle) {
        this.goalTitle = goalTitle;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getGoalBody() {
        return goalBody;
    }

    public void setGoalBody(String goalBody) {
        this.goalBody = goalBody;
    }

    public Image getGoalImage() {
        return goalImage;
    }

    public void setGoalImage(Image goalImage) {
        this.goalImage = goalImage;
    }

    public ArrayList<Post> getGoalFeed() {
        return goalFeed;
    }

    public void setGoalFeed(ArrayList<Post> goalFeed) {
        this.goalFeed = goalFeed;
    }

    public void addToGoalFeed(ArrayList<Post> goals) {
        this.goalFeed.addAll(goals);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goal goal = (Goal) o;
        return Objects.equals(goalID, goal.goalID) &&
                Objects.equals(goalTag, goal.goalTag) &&
                Objects.equals(goalTitle, goal.goalTitle) &&
                Objects.equals(creationDate, goal.creationDate) &&
                Objects.equals(goalBody, goal.goalBody) &&
                Objects.equals(goalImage, goal.goalImage) &&
                Objects.equals(goalFeed, goal.goalFeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goalID, goalTag, goalTitle, creationDate, goalBody, goalImage, goalFeed);
    }

    @Override
    public String toString() {
        return "Goal{" +
                "goalID='" + goalID + '\'' +
                ", goalTag=" + goalTag +
                ", goalTitle='" + goalTitle + '\'' +
                ", creationDate=" + creationDate +
                ", goalBody='" + goalBody + '\'' +
                ", goalImage=" + goalImage +
                ", goalFeed=" + goalFeed +
                '}';
    }
}
