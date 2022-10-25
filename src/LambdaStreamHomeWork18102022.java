import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStreamHomeWork18102022 {
    public static void main(String[] args) {
        List<Cars> carModels = new ArrayList<>();

        carModels.add(new Cars(1, "BMW", 180000f));
        carModels.add(new Cars(2, "PORCHE", 300000f));
        carModels.add(new Cars(3, "NISSAN", 128000f));
        carModels.add(new Cars(4, "OPEL", 28000f));
        List<Float> modelsPrices = carModels.stream()
//                .allMatch(p -> p.price)
                .filter(p -> p.price < 30000)
                .filter(p -> p.id > 2)
                .map(p -> p.price + 45)
//                .map(p -> p.)
                .collect(Collectors.toList());

        System.out.println(modelsPrices);
    }
}
