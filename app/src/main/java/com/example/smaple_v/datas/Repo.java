package com.example.smaple_v.datas;

import com.google.gson.annotations.Expose;

public class Repo implements Comparable<Repo> {

    @Expose
    @com.google.gson.annotations.SerializedName("forks_count")
    public int forksCount;
    @Expose
    @com.google.gson.annotations.SerializedName("has_pages")
    public boolean hasPages;
    @Expose
    @com.google.gson.annotations.SerializedName("has_wiki")
    public boolean hasWiki;
    @Expose
    @com.google.gson.annotations.SerializedName("has_downloads")
    public boolean hasDownloads;
    @Expose
    @com.google.gson.annotations.SerializedName("has_projects")
    public boolean hasProjects;
    @Expose
    @com.google.gson.annotations.SerializedName("has_issues")
    public boolean hasIssues;
    @Expose
    @com.google.gson.annotations.SerializedName("language")
    public String language;
    @Expose
    @com.google.gson.annotations.SerializedName("watchers_count")
    public int watchersCount;
    @Expose
    @com.google.gson.annotations.SerializedName("stargazers_count")
    public int stargazersCount;
    @Expose
    @com.google.gson.annotations.SerializedName("size")
    public int size;
    @Expose
    @com.google.gson.annotations.SerializedName("homepage")
    public String homepage;
    @Expose
    @com.google.gson.annotations.SerializedName("svn_url")
    public String svnUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("clone_url")
    public String cloneUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("ssh_url")
    public String sshUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("git_url")
    public String gitUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("pushed_at")
    public String pushedAt;
    @Expose
    @com.google.gson.annotations.SerializedName("updated_at")
    public String updatedAt;
    @Expose
    @com.google.gson.annotations.SerializedName("created_at")
    public String createdAt;
    @Expose
    @com.google.gson.annotations.SerializedName("deployments_url")
    public String deploymentsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("releases_url")
    public String releasesUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("labels_url")
    public String labelsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("notifications_url")
    public String notificationsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("milestones_url")
    public String milestonesUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("pulls_url")
    public String pullsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("issues_url")
    public String issuesUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("downloads_url")
    public String downloadsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("archive_url")
    public String archiveUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("merges_url")
    public String mergesUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("compare_url")
    public String compareUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("contents_url")
    public String contentsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("issue_comment_url")
    public String issueCommentUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("comments_url")
    public String commentsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("git_commits_url")
    public String gitCommitsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("commits_url")
    public String commitsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("subscription_url")
    public String subscriptionUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("subscribers_url")
    public String subscribersUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("contributors_url")
    public String contributorsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("stargazers_url")
    public String stargazersUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("languages_url")
    public String languagesUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("statuses_url")
    public String statusesUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("trees_url")
    public String treesUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("git_refs_url")
    public String gitRefsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("git_tags_url")
    public String gitTagsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("blobs_url")
    public String blobsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("tags_url")
    public String tagsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("branches_url")
    public String branchesUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("assignees_url")
    public String assigneesUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("events_url")
    public String eventsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("issue_events_url")
    public String issueEventsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("hooks_url")
    public String hooksUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("teams_url")
    public String teamsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("collaborators_url")
    public String collaboratorsUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("keys_url")
    public String keysUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("forks_url")
    public String forksUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("url")
    public String url;
    @Expose
    @com.google.gson.annotations.SerializedName("fork")
    public boolean fork;
    @Expose
    @com.google.gson.annotations.SerializedName("description")
    public String description;
    @Expose
    @com.google.gson.annotations.SerializedName("html_url")
    public String htmlUrl;
    @Expose
    @com.google.gson.annotations.SerializedName("owner")
    public Owner owner;
    @Expose
    @com.google.gson.annotations.SerializedName("private")
    public boolean isPrivate;
    @Expose
    @com.google.gson.annotations.SerializedName("full_name")
    public String fullName;
    @Expose
    @com.google.gson.annotations.SerializedName("name")
    public String name;
    @Expose
    @com.google.gson.annotations.SerializedName("node_id")
    public String nodeId;
    @Expose
    @com.google.gson.annotations.SerializedName("id")
    public int id;

    @Override
    public int compareTo(Repo o) {
        if (this.stargazersCount < o.stargazersCount) {
            return 1;
        } else if (this.stargazersCount > o.stargazersCount) {
            return -1;
        }
        return 0;
    }

}
