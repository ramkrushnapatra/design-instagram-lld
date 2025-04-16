
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User("1", "ram@gmail.com", "123");
        Post post = new Post("2", "mypost", new Date());
        Comment comment = new Comment("3", "my comments", "2", "1");
        post.addComment(comment);
        Instagram instagram = new Instagram(user);
        instagram.createPost(post);
        instagram.showAllPost();
        instagram.checkAllComments();

    }
}
