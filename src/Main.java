import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MyException {

        Products products1 = new Products("Alma", Alcohol.NOALCOHOL, LocalDate.of(2025, 3, 25), 150);
        Products products2 = new Products("Arak", Alcohol.ALCOHOL, LocalDate.of(2024, 1, 12), 200);
        Products products3 = new Products("nan", Alcohol.NOALCOHOL, LocalDate.of(2023, 4, 14), 15);
        Products products4 = new Products("Arpa", Alcohol.ALCOHOL, LocalDate.of(2024, 7, 1), 100);
        Products products5 = new Products("mai", Alcohol.NOALCOHOL, LocalDate.of(2024, 12, 1), 120);
        Products products6 = new Products("Vino", Alcohol.NOALCOHOL, LocalDate.of(2024, 9, 1), 150);
        List<Products> products = new ArrayList<>(List.of(products1, products2, products3));
        List<Products> products0 = new ArrayList<>(List.of(products4, products5, products6));
        Person person = new Person("Matmusa", 2312, 1000, LocalDate.of(2007, 10, 12), products);
        Person person2 = new Person("Marapat", 1234, 100, LocalDate.of(2001, 10, 12), products);
        Person person3 = new Person("Tursunai", 2367, 230, LocalDate.of(2002, 10, 12), products0);
        Person person4 = new Person("Manas", 2344, 200, LocalDate.of(1995, 10, 12), products0);

        List<Person> people = new ArrayList<>(List.of(person, person2, person3, person4));
        Kassa kassa = new Kassa();

        // kassa.sortBynameProduct(person);
        kassa.myMethods(person3);
        //  kassa.checkproductData(person3);

    }
}