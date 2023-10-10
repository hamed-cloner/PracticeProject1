import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            numbers.add(NumberUtil.numberGenerator());
        }
        Long max = NumberUtil.findMax(numbers);
        System.out.println("Max is = " + max);

        Long min = NumberUtil.findMin(numbers);
        System.out.println("Min is = " + min);
        //TODO call else methods
    }
}
