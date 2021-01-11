/**
 * Created on 25.12.2020
 *
 * @author me
 * Обработка исключения реализована в {@link SourceData#getValue}.
 */
public class Task7 {
    public static void main(String[] args) {
        Operation.getOperation(new SourceData())
                .calculate()
                .printResult();
    }
}
