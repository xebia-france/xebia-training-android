package fr.xebia.training.aa.model;

import java.io.Serializable;

/**
 * User: mounirboudraa
 * Date: 13/02/2014
 * Time: 06:14
 */
public class MoviePosters implements Serializable{

    private String thumbnail;
    private String profile;
    private String detailed;
    private String original;

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }
}
