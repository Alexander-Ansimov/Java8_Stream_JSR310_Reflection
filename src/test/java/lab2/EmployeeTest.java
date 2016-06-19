package lab2;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 18/05/2016.
 */
public class EmployeeTest {

    @Test
    public void testGetSalary() throws Exception {
        Stream<Employee> stream = Stream.of(new Employee("10"), new Employee("20"), new Employee("25"));
        Stream<Company> epam =
                stream.map(employee ->{
                    System.out.println(123);
                   return new Company("Epam", 10000);
                });

        IntStream intStream = stream.mapToInt(employee -> Integer.parseInt(employee.getSalary()));
        int sum = intStream.sum();
        OptionalDouble average = intStream.average();
        System.out.println(average.getAsDouble());
        Assert.assertEquals(55,sum);

    }
}