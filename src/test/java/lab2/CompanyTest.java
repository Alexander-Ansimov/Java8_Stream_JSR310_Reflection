package lab2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 18/05/2016.
 */
public class CompanyTest {

    @Test
    public void testPeek() throws Exception {
        Stream<Employee> employeeStream = Stream.of(new Employee(""));
        List<String> list = employeeStream.sorted((emp1, emp2) ->
                Integer.parseInt(emp2.getSalary()) - Integer.parseInt(emp2.getSalary()))
                .map(Employee::getName).collect(Collectors.toList());
      /*  employeeStream.map(Employee::getCompany)
                .peek(System.out::println)
                .map(Company::getName).parallel().unordered()
                .map(String::length).forEach(System.out::println);
*/
    }

    @Test
    public void testGetIncome() throws Exception {
        Stream<Company> companyStream = Stream.of(
                new Company(new int[]{2, 3, 4}),
                new Company(new int[]{2, 5, 4}),
                new Company(new int[]{2, 5}));

        int sum = companyStream.flatMapToInt
                (company -> IntStream.of(company.getExpenses())).sum();
        Assert.assertEquals(27,sum);


    }
}