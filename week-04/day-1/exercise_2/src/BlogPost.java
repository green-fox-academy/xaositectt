public class BlogPost {
  String authorname;
  String title;
  String text;
  String publicationDate;

  public static void main(String[] args) {
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
  }
}
