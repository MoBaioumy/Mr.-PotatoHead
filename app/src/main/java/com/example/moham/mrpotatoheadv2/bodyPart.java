package com.example.moham.mrpotatoheadv2;

public class bodyPart {
    private String name;
    private int id, checkboxId;
    private Boolean visable;

    public bodyPart(String name, int id, int checkboxId) {
        this.name = name;
        this.id = id;
        this.checkboxId = checkboxId;
        this.visable = false;
    }


    public void setVisable(Boolean visable) {
        this.visable = visable;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getCheckboxId() {
        return checkboxId;
    }

    public Boolean getVisable() {
        return visable;
    }
}
