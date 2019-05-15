package com.example.smaple_v.datas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner {
    @Expose
    @SerializedName("site_admin")
    public boolean siteAdmin;
    @Expose
    @SerializedName("type")
    public String type;
    @Expose
    @SerializedName("received_events_url")
    public String receivedEventsUrl;
    @Expose
    @SerializedName("events_url")
    public String eventsUrl;
    @Expose
    @SerializedName("repos_url")
    public String reposUrl;
    @Expose
    @SerializedName("organizations_url")
    public String organizationsUrl;
    @Expose
    @SerializedName("subscriptions_url")
    public String subscriptionsUrl;
    @Expose
    @SerializedName("starred_url")
    public String starredUrl;
    @Expose
    @SerializedName("gists_url")
    public String gistsUrl;
    @Expose
    @SerializedName("following_url")
    public String followingUrl;
    @Expose
    @SerializedName("followers_url")
    public String followersUrl;
    @Expose
    @SerializedName("html_url")
    public String htmlUrl;
    @Expose
    @SerializedName("url")
    public String url;
    @Expose
    @SerializedName("gravatar_id")
    public String gravatarId;
    @Expose
    @SerializedName("avatar_url")
    public String avatarUrl;
    @Expose
    @SerializedName("node_id")
    public String nodeId;
    @Expose
    @SerializedName("id")
    public int id;
    @Expose
    @SerializedName("login")
    public String login;
}
