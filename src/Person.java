import java.time.LocalDate;
import java.util.List;

public class Person  {
    private String name;
    private int id;
    private double balance;
    private LocalDate localDate;
    private List<Products>products;

    public Person(String name, int id, double balance, LocalDate localDate, List<Products> products) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.localDate = localDate;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "\nPerson :" +
                "\nname :" + name +
                "\n id :" + id +
                "\nbalance :"+
                "\nlocalDate :" + localDate +
                "\n products :" + products
                ;
    }
}
