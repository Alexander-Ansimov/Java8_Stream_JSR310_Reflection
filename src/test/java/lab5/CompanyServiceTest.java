package lab5;

import org.junit.Test;

import java.util.Arrays;

import static lab5.Seniority.*;
import static org.junit.Assert.*;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class CompanyServiceTest {

    @Test
    public void testDefineSeniority() throws Exception {
        Company company = new Company(Arrays.asList(
                new Employee(MIDDLE),
                new Employee(MIDDLE),
                new Employee(MIDDLE),
                new Employee(SENIOR),
                new Employee(SENIOR),
                new Employee(JUNIOR)));

        Seniority seniority = CompanyService.defineSeniority(company);
        System.out.println(seniority);
    }
}