import java.util.ArrayList;
import java.util.List;

//Reuse your BlogPost class
//Create a Blog class
//list of BlogPosts
//add BlogPosts to your list
//delete(int) one item at given index
//update(int, BlogPost) one item at the given index and update it with another BlogPost

public class Blog {
  private List<BlogPost> blogPostList;

  public Blog() {
    blogPostList = new ArrayList<>();
  }

  public static void main(String[] args) {

    Blog myPersonalBlog = new Blog();

    BlogPost myBlogPost1 = new BlogPost();
    myBlogPost1.authorname = "John Doe";
    myBlogPost1.title = "Lorem Ipsum";
    myBlogPost1.text = "Lorem ipsum dolor sit amet.";
    myBlogPost1.publicationDate = "2000.05.04.";

    BlogPost myBlogPost2 = new BlogPost();
    myBlogPost1.authorname = "Tim Urban";
    myBlogPost1.title = "Wait but why";
    myBlogPost1.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    myBlogPost1.publicationDate = "2010.10.10.";

    BlogPost myBlogPost3 = new BlogPost();
    myBlogPost1.authorname = "William Turton";
    myBlogPost1.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    myBlogPost1.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want " +
            "to be the center of attention. When I asked to take his picture outside one" +
            " of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
    myBlogPost1.publicationDate = "2017.03.28.";

    myPersonalBlog.addPostToBlog(myBlogPost1);
    myPersonalBlog.addPostToBlog(myBlogPost2);
    myPersonalBlog.addPostToBlog(myBlogPost2);

    myPersonalBlog.printAuthorAndTitle();

    myPersonalBlog.removeBlogPost(1);

    myPersonalBlog.printAuthorAndTitle();

    myPersonalBlog.updateBlogPost(0, myBlogPost2);

    myPersonalBlog.printAuthorAndTitle();
  }

  public List<BlogPost> getBlogPostList() {
    return blogPostList;
  }

  public void addPostToBlog(BlogPost blogPostToAdd) {
    this.blogPostList.add(blogPostToAdd);
  }

  public void removeBlogPost(int index) {
    this.blogPostList.remove(index);
  }

  public void updateBlogPost(int index, BlogPost postToUpdate) {
    this.getBlogPostList().set(index, postToUpdate);
  }

  public void printAuthorAndTitle() {
    System.out.println("There are " + this.blogPostList.size() + " posts in this blog");
    for (BlogPost myPost : this.blogPostList) {
      System.out.println("Author of this post is: " + myPost.authorname);
      System.out.println("Title of the post is: " + myPost.title);
    }
  }
}
