package com.manu.movieconceptappjava;

/**
 * Created by Manu on 1/3/2018.
 */

public class CastModel {

    public CastModel(int imageName, String actorName, String charName) {
        this.imageName = imageName;
        this.actorName = actorName;
        this.charName = charName;
    }

    public int getImageName() {
        return imageName;
    }

    public String getActorName() {
        return actorName;
    }

    public String getCharName() {
        return charName;
    }

    private int imageName;
    private String actorName;
    private String charName;

}
