public class Flower {
    private String nameFlower;
    private String flowerColor;    //цвет
    private String country;   // страна
    private double cost;    // стоимость
    int lifeSpan;  // срок стояния

    public Flower(String nameFlower, String flowerColor, String country, double cost, int lifeSpan) {
        this.nameFlower = nameFlower;
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;

    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = " Белый";

        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null) {
            this.country = country;
        } else {
            this.country = " Россия";

        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (cost <= 0) {
            this.cost = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
}
