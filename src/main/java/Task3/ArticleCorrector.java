package Task3;

public class ArticleCorrector {

    private Article article;

    public ArticleCorrector(Article article){
        this.article = article;
    }

    public Article editArticle(String newHeadline, String newText, String newLinks) throws CloneNotSupportedException {

        Article correctedArticle = this.article.clone();

        if (newHeadline != null) correctedArticle.setHeadline(newHeadline);
        if (newText != null) correctedArticle.setText(newText);
        if (newLinks != null) correctedArticle.setLinks(newLinks);

        return correctedArticle;
    }

}
