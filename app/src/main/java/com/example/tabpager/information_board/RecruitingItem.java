package com.example.tabpager.information_board;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

public class RecruitingItem {
    String title;
    String explain;
    String deadline;
    Drawable icon;


    public RecruitingItem(String title, String explain) {
        this.title = title;
        this.explain = explain;
    }

    public RecruitingItem(Drawable icon, String title, String explain, String deadline) {
        this.title = title;
        this.explain = explain;
        this.deadline = deadline;
        this.icon = icon;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }
}
