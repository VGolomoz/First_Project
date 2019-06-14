package Task3;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Article WorldWarArticle = new Article("World War", "Text about World War", "World War's links");
        WorldWarArticle.printArticle();

        Article WorldWar2Article = new ArticleCorrector(WorldWarArticle).editArticle("World War2", "Text about World War2", null);
        WorldWar2Article.printArticle();

        WorldWarArticle.printArticle();

    }
}
