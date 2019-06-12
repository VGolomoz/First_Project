package Task3;

public class EditClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        Article someArticle = new Article("Some Headline", "Some Text", "Some links");
        someArticle.printArticle();

        Article editArticle = someArticle.clone();
        editArticle.printArticle();

        editArticle.edit("Edit Article", "Edit Some Text", "Edit links");
        editArticle.printArticle();

    }
}
