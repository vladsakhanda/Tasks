//package Task.T3;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import task.T3.Arrays;
//
//import static org.junit.Assert.assertEquals;
//
//public class ArraysTest {
//    // Припускається, що у вас є клас Arrays з методами func1, func2 і func3
//    private final Arrays arrays = new Arrays();
//
//    @ParameterizedTest
//    @DisplayName("Test func1: Find minimum and maximum values in the array")
//    @CsvSource({
//            "'7,3,9,2,4', 2, 9",
//            "'1,2,3,4,5', 1, 5",
//            "'100,-100,50,0', -100, 100"
//    })
//    public void testFunc1(String arrayInput, int expectedMin, int expectedMax) {
//        int[] numbers = Arrays.stream(arrayInput.split(","))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        // Вивід у консоль мінімального та максимального значення масиву
//        System.out.println("Маєте масив: " + Arrays.toString(numbers));
//        int minElement = arrays.func1(numbers);
//        int maxElement = arrays.func1(numbers);
//        System.out.println("Мінімальний елемент: " + minElement);
//        System.out.println("Максимальний елемент: " + maxElement);
//
//        // Перевірка правильності результатів
//        assertEquals(expectedMin, minElement);
//        assertEquals(expectedMax, maxElement);
//    }
//
//    @ParameterizedTest
//    @DisplayName("Test func2: Count unique values in the array")
//    @CsvSource({
//            "'1,2,2,3,4,4,4,5', 5",
//            "'1,1,1,1', 1",
//            "'3,3,3,3,3', 1"
//    })
//    public void testFunc2(String arrayInput, int expectedUniqueCount) {
//        int[] numbers = Arrays.stream(arrayInput.split(","))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        // Вивід у консоль кількості унікальних значень масиву
//        System.out.println("Маєте масив: " + Arrays.toString(numbers));
//        int uniqueCount = arrays.func2(numbers);
//        System.out.println("Кількість унікальних значень: " + uniqueCount);
//
//        // Перевірка правильності результатів
//        assertEquals(expectedUniqueCount, uniqueCount);
//    }
//
//    @ParameterizedTest
//    @DisplayName("Test func3: Sort array in ascending order")
//    @CsvSource({
//            "'9,3,7,2,4', '2,3,4,7,9'",
//            "'5,1,2,4,3', '1,2,3,4,5'",
//            "'3,2,1', '1,2,3'"
//    })
//    public void testFunc3(String arrayInput, String expectedSortedOutput) {
//        int[] numbers = Arrays.stream(arrayInput.split(","))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        // Вивід у консоль відсортованого масиву
//        System.out.println("Маєте масив: " + Arrays.toString(numbers));
//        int[] sortedNumbers = arrays.func3(numbers);
//        System.out.println("Відсортований масив: " + Arrays.toString(sortedNumbers));
//
//        // Перевірка правильності результатів
//        int[] expectedSorted = Arrays.stream(expectedSortedOutput.split(","))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        assertEquals(Arrays.toString(expectedSorted), Arrays.toString(sortedNumbers));
//    }
//}
