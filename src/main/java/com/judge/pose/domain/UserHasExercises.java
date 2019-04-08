package com.judge.pose.domain;

public class UserHasExercises {
    private Integer userId;

    private Integer exercisesId;

    private Integer lastImage;

    public UserHasExercises(Integer userId, Integer exercisesId, Integer lastImage) {
        this.userId = userId;
        this.exercisesId = exercisesId;
        this.lastImage = lastImage;
    }

    public UserHasExercises() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExercisesId() {
        return exercisesId;
    }

    public void setExercisesId(Integer exercisesId) {
        this.exercisesId = exercisesId;
    }

    public Integer getLastImage() {
        return lastImage;
    }

    public void setLastImage(Integer lastImage) {
        this.lastImage = lastImage;
    }
}