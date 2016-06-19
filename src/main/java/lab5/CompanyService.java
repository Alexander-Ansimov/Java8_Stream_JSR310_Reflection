package lab5;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class CompanyService {
    public static Seniority defineSeniority(Company company) {
        Map<Seniority, Long> map = company.getEmployees().stream()
                .collect(Collectors
                        .groupingBy(Employee::getSeniority,
                                Collectors.counting()));
        Seniority seniority = map.entrySet().stream().
                max(Map.Entry.comparingByValue()).get().getKey();
        return seniority;
    }
}
