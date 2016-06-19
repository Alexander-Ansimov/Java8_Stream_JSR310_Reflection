package lab4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class CompanyService {
    public static Map<Company, List<Employee>> getCompanyWithEmployees(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getCompany));
    }

    public static Map<Company, Integer> getCompanyWithNumberEmployees(Map<Company, List<Employee>> map) {
        return map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().size()));
    }

    public static Map<Company, Integer> getCompanyWithExpenses(Map<Company, List<Employee>> map) {
        return map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream()
                .mapToInt(Employee::getSalary).sum()));
    }


}
