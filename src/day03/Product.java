package day03;

/**
 * 商品类
 * liangzijie
 * @2020.3.4
 */
public class Product {
    //商品名字
    private String productName;
    //商品编号
    private String productCode;
    //商品价格
    private String productprice;
    //商品等级
    private String productRank;
    //商品创建时间
    private String productCreateTime;
    //商品创建者
    private String productCreatePerson;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getProductRank() {
        return productRank;
    }

    public void setProductRank(String productRank) {
        this.productRank = productRank;
    }

    public String getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(String productCreateTime) {
        this.productCreateTime = productCreateTime;
    }

    public String getProductCreatePerson() {
        return productCreatePerson;
    }

    public void setProductCreatePerson(String productCreatePerson) {
        this.productCreatePerson = productCreatePerson;
    }
}
