package flower;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerName != null && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Ромашка";
        }

        setFlowerColor(flowerColor);

        setCountry(country);

        setCost(cost);

        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public void setCountry(String country) {
        if (country != null && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }

    @Override
    public String toString() {
        return "Название цветка - " + flowerName + ", цвет - " + flowerColor + ", страна выращивания - " + country + ", стоимость за 1 ед. - " + cost + " руб., продолжительность жизни - " + lifeSpan + " дней.";
    }
}
