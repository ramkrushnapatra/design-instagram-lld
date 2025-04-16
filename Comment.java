public class Comment {
    private String commentId;
    private String postId;
    private String comment;
    private String userId;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId='" + commentId + '\'' +
                ", postId='" + postId + '\'' +
                ", comment='" + comment + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public Comment(String commentId, String comment, String postId, String userId) {
        this.commentId = commentId;
        this.comment = comment;
        this.postId = postId;
        this.userId = userId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }
}
