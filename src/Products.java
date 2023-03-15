import java.time.LocalDate;
import java.util.Comparator;

public class Products  {
    private String name;
    private Alcohol alcohol;
    private LocalDate localDate;
    private int price;

    public Products(String name, Alcohol alcohol, LocalDate localDate, int price)  {
        this.name = name;
        this.alcohol = alcohol;
        this.localDate = localDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public static Comparator<Products>productsComparator=new Comparator<Products>() {
        @Override
        public int compare(Products o1, Products o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    @Override
    public String toString() {
        return "\nProducts :" +
                "\nname :" + name +
                "\nalcohol=" + alcohol +
                "\n localDate=" + localDate +
                " \n price=" + price
                ;
    }
}
