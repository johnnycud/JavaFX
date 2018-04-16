package com.teamtreehouse.pomodoro.model;

public enum AttemptKind {
    FOCUS(25*60),
    BREAK(5*60);

    AttemptKind(int totalSeconds) {
        mTotalSeconds = totalSeconds;
    }

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    private int mTotalSeconds;


}
