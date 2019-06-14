package Task3;

public class Article implements Cloneable {

    private String headline;
    private String text;
    private String links;

    public Article(String headline, String text, String links){
        this.headline = headline;
        this.text = text;
        this.links = links;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public void printArticle(){
        System.out.println("Headline: " + headline);
        System.out.println("Text: " + text);
        System.out.println("Links: " + links);
        System.out.println("===========================");
    }

    @Override
    public Article clone() throws CloneNotSupportedException{

        Article copy = (Article) super.clone();
        return copy;
          }
}
