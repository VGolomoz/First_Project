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

    public String getHeadline(){
        return headline;
    }

    public String getText(){
        return text;
    }

    public String getLinks(){
        return links;
    }

    public void edit(String editHeadline, String editText, String editLinks){
    this.headline = editHeadline;
    this.text = editText;
    this.links = editLinks;
    }

    public void printArticle(){
        System.out.println(headline + " " + text + " " + links);
    }

    @Override
    public Article clone() throws CloneNotSupportedException{
        return new Article(this.headline, this.text, this.links);
    }
}
