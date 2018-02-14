package com.gabr0.pomodoro.model;

public enum AttemptKind {
    FOCUS(25 * 60, "Tiempo de trabajo!"),
    BREAK(5 * 60, "Tiempo de descanso");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int totalSeconds, String displayName) {
        mTotalSeconds = totalSeconds;
        mDisplayName = displayName;
    }

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    public void setTotalSeconds(int totalSeconds) {
        mTotalSeconds = totalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
