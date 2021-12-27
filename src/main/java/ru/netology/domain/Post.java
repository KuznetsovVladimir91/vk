package ru.netology.domain;

public class Post {

    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int DateOfPosting;
    private String message;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;

    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;

}
