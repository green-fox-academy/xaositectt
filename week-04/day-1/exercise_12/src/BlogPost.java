public class BlogPost {
  String authorname;
  String title;
  String text;
  String publicationDate;

  public BlogPost() {
    this.authorname = "John Doe";
    this.title = "New Blogpost";
    this.text = "Here is the text of the blogpost";
    this.publicationDate = "2017";
  }

  public BlogPost(String authorname, String title, String text, String publicationDate) {
    this.authorname = authorname;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public String getAuthorname() {
    return authorname;
  }

  public void setAuthorname(String authorname) {
    this.authorname = authorname;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }
}
