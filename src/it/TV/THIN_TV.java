package it.TV;

public class THIN_TV {
    /**
     * 电视薄度
     */
    double Thinness;
    /**
     * 品牌
     */
    String Brand;
    /**
     * 价格
     */
    double price;

    public double getThinness() {
        return Thinness;
    }

    public void setThinness(double thinness) {
        Thinness = thinness;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
