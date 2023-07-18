import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Nokia 9", "HMD Global",150),
                new Phone("Galaxy S9", "Samsung", 300));

        phoneStream.sorted(new PhoneComparator())
                .forEach(p->System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(), p.getPrice()));
    }
}

// res:
// Galaxy S9 (Samsung) - 300
// iPhone 8 (Apple) - 450
// iPhone X (Apple) - 600
// Nokia 9 (HMD Global) - 150
// Pixel 2 (Google) - 500