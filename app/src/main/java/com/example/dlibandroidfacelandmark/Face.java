package com.example.dlibandroidfacelandmark;

import org.opencv.core.Rect;

import java.util.ArrayList;

public class Face {
    private Rect rect;
    private ArrayList<Position> positions;
    private int[] boundingBox;

    Face(Rect rect) {
        setBoundingBox(rect);
        this.positions = new ArrayList<>();
    }

    private void setBoundingBox(Rect r) {
        this.rect = r;
        this.boundingBox    = new int[4];
        this.boundingBox[0] = this.rect.x;
        this.boundingBox[1] = this.rect.y;
        this.boundingBox[2] = this.rect.width;
        this.boundingBox[3] = this.rect.height;
    }

    public int[] getBoundingBox() {
        return this.boundingBox;
    }

    public void setPositions(ArrayList<Position> positions) {
        this.positions = new ArrayList<>(positions);
    }

    public ArrayList<Position> getPositions() {
        return this.positions;
    }

    public void addPosition(int x, int y) {
        Position p = new Position(x, y);
        this.positions.add(p);
    }

    public ArrayList<Position> getChin() {
        return (ArrayList<Position>) this.positions.subList(0, 17);
    }

    public ArrayList<Position> getRightEyeBrow() {
        return (ArrayList<Position>) this.positions.subList(17, 22);
    }

    public ArrayList<Position> getLeftEyeBrow() {
        return (ArrayList<Position>) this.positions.subList(22, 27);
    }

    public ArrayList<Position> getNose() {
        return (ArrayList<Position>) this.positions.subList(28, 36);
    }

    public ArrayList<Position> getRightEye() {
        return (ArrayList<Position>) this.positions.subList(36, 42);
    }

    public ArrayList<Position> getLeftEye() {
        return (ArrayList<Position>) this.positions.subList(42, 48);
    }

    public ArrayList<Position> getMouth() {
        return (ArrayList<Position>) this.positions.subList(49, 68);
    }

}
