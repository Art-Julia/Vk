package ru.netology.domain;

import ru.netology.manager.WallSearch;

public class Post {
    private int id;
    private int ownerId;
    private int createdBy;
    private int fromId;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly = true;
    private WallSearch wallSearch;
    private String imageUrl;
    private String videoUrl;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private LikesInfo likesInfo;
    private int postDate;
    private SearchPost searchPost;
    private PinPost pinPost;
    private PopularPost popularPost;
    private ViewsCount viewsCount;
    private String postType;
    private Geo geo;
    private int signerId;
    private boolean canDelete = true;
    private boolean canEdit = true;
    private boolean isPinned = true;
    private boolean markedAsAds = true;
    private boolean isFavourite = true;

// + get/set
}
