import java.util.ArrayList;
import java.util.List;

public class Instagram {
    private User user;
    private List<Post> postList;

    public Instagram(User user) {
        this.user = user;
        postList= new ArrayList<>();
    }

    public void createPost(Post post){
        postList.add(post);
    }

    public void showAllPost(){
        if(postList.isEmpty()){
            System.out.println("no post available");
            return;
        }
        for(Post post:postList){
            System.out.println("post"+post.toString());
        }
    }

    public void checkAllComments(){
        if(postList.isEmpty()){
            System.out.println("no post available");
            return;
        }
        for(Post post:postList){
            List<Comment>commentList=post.getCommentList();
            if(commentList.isEmpty()){
                System.out.println("no comment available for this post");
                continue;
            }
            for(Comment comment:commentList){
                System.out.println("comments"+comment.toString());
            }
        }
    }
}
