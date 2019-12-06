package com.example.lifeofgeoff;

import android.graphics.PointF;

public class FaceData {
    private int id;

    //Face Dimensions
    private PointF position;
    private float width;
    private float height;

    // Head orientation
    private float eulerY;
    private float eulerZ;

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public PointF getPosition() {
        return position;
    }

    public void setPosition(PointF newPosition) {
        position = newPosition;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float newWidth) {
        width = newWidth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float newHeight) {
        height = newHeight;
    }

    public float getEulerY() {
        return eulerY;
    }

    public void setEulerY(float newEulerY) {
        eulerY = newEulerY;
    }

    public float getEulerZ() {
        return eulerZ;
    }

    public void setEulerZ(float newEulerZ) {
        eulerZ = newEulerZ;
    }
}
