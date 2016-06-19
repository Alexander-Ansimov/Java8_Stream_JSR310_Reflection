package lab3;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static lab3.Gender.FEMALE;
import static lab3.Gender.MALE;
import static org.junit.Assert.*;

/**
 * Created by Evegeny on 18/05/2016.
 */
public class PersonTest {
    Stream<Person> stream;

    @Before
    public void setUp() throws Exception {
        stream = Stream.of(new Person(MALE, 2),
                (new Person(MALE, 1)),
                new Person(Gender.FEMALE, 3),
                new Person(Gender.FEMALE, 2),
                new Person(Gender.SHEMALE, 9));

    }

    @Test
    public void testGroupBy() throws Exception {
        Map<Gender, List<Person>> map = stream.collect(Collectors.groupingBy(Person::getGender));
        int manTotal = map.get(MALE).stream().map(Person::getIncome).reduce((a,b)->a+b).get();
        int womanTotal = map.get(FEMALE).stream().mapToInt(Person::getIncome).sum();
        System.out.println("man " + manTotal);
        System.out.println("woman " + womanTotal);
    }

    @Test
    public void testGetIncomeByPartitionBy() throws Exception {
        Map<Boolean, List<Person>> map = stream.filter(p -> p.getGender() == MALE || p.getGender() == FEMALE).
                collect(Collectors.partitioningBy(p -> p.getGender() == MALE));
        int manTotal = map.get(true).stream().mapToInt(Person::getIncome).sum();
        int womanTotal = map.get(false).stream().mapToInt(Person::getIncome).sum();
        System.out.println("man " + manTotal);
        System.out.println("woman " + womanTotal);

    }

    @Test
    public void testGetIncomeWithOneIteration() throws Exception {


        Optional<Total> totalOptional = stream.map(person -> {
            if (person.getGender() == MALE) {
                return new Total(person.getIncome(), 0);
            }
            if (person.getGender() == FEMALE) {
                return new Total(0, person.getIncome());
            }
            return new Total();
        }).reduce(Total::merge);
        if (totalOptional.isPresent()) {
            System.out.println("man " + totalOptional.get().getMaleSum());
            System.out.println("woman " + totalOptional.get().getFemaleSum());
        }


    }
}