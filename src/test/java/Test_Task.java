import com.ARK_Project.Compresser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


//Тест только для функции в классе Compresser, не для проверки main
public class Test_Task {

    Compresser compresser = new Compresser();

    @Test
    public void Test_base() {
        int[] result = new int[]{1, 2, 1};//ожидаемый результат
        int[] input = new int[]{1, 1, 2, 2, 2, 2, 1, 1};

        assertArrayEquals(result, compresser.compress_numbers(input));

    }

    ;

    @Test
    public void Test_with_zeros() {
        int[] result = new int[]{1, 0, 2, 1};//ожидаемый результат
        int[] input = new int[]{1, 0, 2, 2, 2, 2, 1, 1};

        assertArrayEquals(result, compresser.compress_numbers(input));

    }

    ;

    @Test
    public void Test_with_many_same_symbols() {
        //содержит 257 единиц
        int[] result = new int[]{1};//ожидаемый результат
        int[] input = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(result, compresser.compress_numbers(input));
    }

    @Test
    public void Test_with_negative_numbers() {
        int[] result = new int[]{1, 0, 2, -2, 2, 1};//ожидаемый результат
        int[] input = new int[]{1, 0, 2, 2, -2, 2, 1, 1};
        assertArrayEquals(result, compresser.compress_numbers(input));

    }
    @Test
    public void Test_null() {
        int[] result = new int[]{};//ожидаемый результат
        int[] input = new int[]{};
        assertArrayEquals(result, compresser.compress_numbers(input));

    }
    @Test
    public void Test_with_big_numbers(){
        int[] result = new int[]{2147483647,-2147483648};//ожидаемый результат
        int[] input = new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        assertArrayEquals(result, compresser.compress_numbers(input));
    }


}
