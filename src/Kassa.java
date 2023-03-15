import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kassa implements Methods {

    public Kassa() throws MyException {

    }

    @Override
    public void sortBynameProduct(Person person) throws MyException {

        Collections.sort(person.getProducts(), Products.productsComparator);

    }

    @Override
    public void myMethods(Person person) throws MyException {
        int count = 0;

        try {
            for (Products s : person.getProducts()
            ) {

                if (s.getLocalDate().isBefore(LocalDate.now())) {
                    person.getProducts().remove(s);

                    throw new MyException("\"Просрочный продукт!!!" + s.getName());
                }
            }
        } catch (
                MyException e) {
            System.out.println(e.getMessage());

        }
        LocalDate localDate = LocalDate.now();
        LocalDate ageForAlgohol = localDate.minus(Period.ofYears(18).minus(Period.ofMonths(2)));
        try {
            System.out.println(person.getProducts());
            for (Products s : person.getProducts()
            ) {
                if (s.getAlcohol().equals(Alcohol.ALCOHOL)) {
                    if (person.getLocalDate().isBefore(ageForAlgohol)) {
                        person.getProducts().remove(s);

                    } else {
                        count++;
                        throw new MyException("\"Вы не можете купить алкоголь!!!");

                    }

                }

            }

        } catch (
                MyException e) {
            System.out.println(e.getMessage());

        }

        for (
                Products s : person.getProducts()
        ) {
            int arr = (int) (person.getBalance() - s.getPrice());

            if (arr <= 0) {

                System.out.println("\nВам не хватает " + arr);
                System.out.println("\nУ вас не достачно средств для оплаты !!!" +
                        " \nВыбирайте что убирать ?");

                if (person.getProducts().size() == 2) {
                    System.out.println("\n1." + person.getProducts().get(0).getName());
                    System.out.println("\n2." + person.getProducts().get(1).getName());

                } else if (person.getProducts().size() == 3) {
                    System.out.println("\n1." + person.getProducts().get(0).getName());
                    System.out.println("\n2." + person.getProducts().get(1).getName());
                    System.out.println("\n2." + person.getProducts().get(2).getName());


                } else if (person.getProducts().size() == 4) {
                    System.out.println("\n1." + person.getProducts().get(0).getName());
                    System.out.println("\n2." + person.getProducts().get(1).getName());
                    System.out.println("\n2." + person.getProducts().get(2).getName());
                    System.out.println("\n2." + person.getProducts().get(3).getName());

                }
                int delete = new Scanner(System.in).nextInt();
                if (delete == 1) {
                    arr = arr + person.getProducts().get(0).getPrice();
                    person.getProducts().remove(person.getProducts().get(0));
                    System.out.println(arr);
                    if (arr > 0) {
                        System.out.println("Ваш сдачи :" + arr);
                        System.out.println("Cпосибо за покупку !!");
                        break;
                    }
                } else if (delete == 2) {
                    arr = arr + person.getProducts().get(1).getPrice();
                    person.getProducts().remove(person.getProducts().get(1));
                    if (arr > 0) {
                        System.out.println("Ваш сдачи" + arr);
                        System.out.println("Cпосибо за покупку");
                        break;
                    } else {
                        arr = arr + person.getProducts().get(2).getPrice();
                        person.getProducts().remove(person.getProducts().get(2));
                        if (arr > 0) {
                            System.out.println("Ваш сдачи" + arr);
                            System.out.println("Cпосибо за покупку");
                            break;

                        } else if (arr > 0) {
                            System.out.println("Спосибо за покупку!!!");
                        }
                    }
                }
//            } else if (arr > 0) {
//                if (count == 1) {
//                    break;
            } else {
                System.out.println("Спосибо за покупку !!!  " +
                        "Ваши сдачи :" + arr);
                break;
            }
        }
    }


    @Override
    public void checkproductData(Person person) throws MyException {


//
//        try {else if (
//            for (Products p : products
//            ) {
//                    System.out.println(products.remove(p.getName()));
//
//                } else {
//                    throw new MyException("Invalid product");
//                }
//            }
//        } catch (MyException e) {
//            System.out.println(e.getMessage());
//        }

/*        Сиз кассага келгенинизде продукталардын аттары менен коюш керек лентага( биринчи аты а
                тамгадан башталган продуктылар коюлат). Продукталар текшерип саналат,
        1. эгерде сиз алып жаткан продуктун сактоо мооноту бугун буто турган болсо ал продукту
        сизге сатылбаш керек. (remove)
                2. Эгерде сиз алып жаткан продукт алкогол ичимдиги болсо сиздин паспортунуз текшерилип
        жашынызды сананaп, анан жашыныз 18 чон болсо же болбосо 2 айдан кийин 18ге чыга турган
        болсонуз сизге сатыла берет, андай болбосо ал продукт сизге сатылбайт (remove).
                Продуктун баарын санап чыккандан кийин суммасы айтылат эгерде сиздин акчаныз жетпесе
        сизден сураш керек кассир, «бир нерсени алып салайлыбы?» деп «Ооба» десениз «эмнени»
        деп сурайт, сиз продуктун атын айтасыз, анан канча шт алып салыш керек ошону айтасыз, анан
        ошол продукт сиздин продуктунуздун арасынан алып салышат, акчаныз жетсе толоп кете
        бересиз, болбосо дагы бир нерсени албай калтырып койсонуз болот.
                Ушул тапшырмага дедлайн вторник 18:00 го чейин сонун кылып жасап, баарыныздар коросунор.
                Удачи !*/
    }
}



