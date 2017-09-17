package com.example.offline.model;

public class Comment {

    private String text;
    private boolean syncPending;

    public Comment(String text) {
        this.text = text;
        this.syncPending = true;
    }

    @Override
    public String toString() {
        return String.format("Comment text: %s, syncPending: %s", text, syncPending);
    }
}