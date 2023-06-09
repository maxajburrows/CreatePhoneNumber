import java.util.Arrays;
import java.util.stream.Collectors;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        String str = Arrays.stream(numbers)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());
        return String.format("(%s) %s-%s", str.substring(0,3), str.substring(3,6), str.substring(6,10));
    }
}
