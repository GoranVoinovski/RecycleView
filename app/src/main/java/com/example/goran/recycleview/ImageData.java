package com.example.goran.recycleview;

import java.io.Serializable;

/**
 * Created by goran on 14.12.17.
 */

public class ImageData implements Serializable{

 private String likes;
 private String favorites;
 private String tags;
 private String previewURL;
 private String webURL;
 private String userURL;

    public ImageData(String previewURL) {
        this.previewURL = previewURL;

    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    public String getUserURL() {
        return userURL;
    }

    public void setUserURL(String userURL) {
        this.userURL = userURL;
    }
}
