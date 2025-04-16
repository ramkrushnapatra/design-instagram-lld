import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private String postId;
    private String text;
    private Date timestamp;
    private List<Comment> commentList;

    public Post(String postId, String text, Date timestamp) {
        this.postId = postId;
        this.text = text;
        this.timestamp = timestamp;
        this.commentList = new ArrayList<>();
    }

    public void addComment(Comment comment){
        commentList.add(comment);
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId='" + postId + '\'' +
                ", text='" + text + '\'' +
                ", timestamp=" + timestamp +
                ", commentList=" + commentList +
                '}';
    }
}
