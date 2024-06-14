package Ex9;

public class Purchase {
    private String article;
    private Double price;

    public Purchase(String article, Double price){
        this.article = article;
        this.price = price;
    }

    public String getArticle() {
        return article;
    }

    public Double getPrice() {
        return price;
    }
}
