package model;

import java.util.ArrayList;
import java.util.Objects;

public class Board {
    private String boardID;
    private ArrayList<Goal> goals;
    private ArrayList<Goal> support;

    public Board(String boardID) {
        this.boardID = boardID;
        this.goals = new ArrayList<>();
        this.support = new ArrayList<>();
    }

    public String getBoardID() {
        return boardID;
    }

    public void setBoardID(String boardID) {
        this.boardID = boardID;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }

    public void setGoals(ArrayList<Goal> goals) {
        this.goals = goals;
    }

    public ArrayList<Goal> getSupport() {
        return support;
    }

    public void setSupport(ArrayList<Goal> support) {
        this.support = support;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(boardID, board.boardID) &&
                Objects.equals(goals, board.goals) &&
                Objects.equals(support, board.support);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardID, goals, support);
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardID='" + boardID + '\'' +
                ", goals=" + goals +
                ", support=" + support +
                '}';
    }
}
