package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass1 {
    public static void main(String[] args) {
//        Predicate<Integer> val= x->x%2==0;
//        boolean result = val.test(11);
//        System.out.println(result);

//       Predicate<String> val = str->str.equals("mike");
//        boolean result = val.test("miked");
//        System.out.println(result);

//        List<Integer> number = Arrays.asList(10, 12, 1, 5, 16, 19, 20);
//        List<Integer> evenNumbers = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenNumbers);

//         List<Integer> number = Arrays.asList(10, 12, 1, 5, 16, 19, 20);
//         List<Integer> evenNumbers = number.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
//         System.out.println(evenNumbers);

//        List<String> number = Arrays.asList("mike", "adam","mike","stallin");
//        List<String> data = number.stream().filter(s -> s.startsWith("m") ).collect(Collectors.toList());
//        System.out.println(data);


//        List<String> number = Arrays.asList("mike", "adam","mike","stallin");
//        List<String> data1 = number.stream().filter(s -> s.startsWith("a") ).collect(Collectors.toList());
//        List<String> data2 = number.stream().filter(s -> s.equals("mike") ).collect(Collectors.toList());
//        List<String> data3 = number.stream().filter(s -> s.endsWith("n") ).collect(Collectors.toList());
//        System.out.println(data1);
//        System.out.println(data2);
//        System.out.println(data3);

//        Function<String, Integer> result= str->str.length();
//        Integer val= result.apply("mike");
//        System.out.println(val);

//        Function<Integer, Integer> result= i->i+10;
//        Integer val= result.apply(30);
//        System.out.println(val);

//        List<Integer> data = Arrays.asList(10,20,30,40,60,90);
//        List<Integer>newNumbers = data.stream().map(i -> i+10).collect(Collectors.toList());
//        System.out.println(newNumbers);

//        List<String> data = Arrays.asList("mike","stallin","adam");
//        List<String>newData = data.stream().map(i -> i.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data = Arrays.asList("mike","stallin","adam");
//        List<String>newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

//        List<Integer> data = Arrays.asList(15,3,60,100,1);
//        List<Integer>newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

//        List<Integer> data = Arrays.asList(15,3,60,100,1,15,100,60);
//        List<Integer>newData = data.stream().sorted().distinct().collect(Collectors.toList());
//        System.out.println(newData);

//        List<Integer> data = Arrays.asList(15,3,60,100,1,15,100,60);
//        List<Integer>newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);

//        Consumer<Integer>result =number-> System.out.println(number);
//        result.accept(100);

//        List<String> names= Arrays.asList("mike","adam","sam");
//        Consumer<String>val = name-> System.out.println(name);
//        names.forEach(val);

        // System.out.println(new Random().nextInt(200));

//        Supplier<Integer> x= ()->new Random().nextInt(500);
//        Integer y = x.get();
//        System.out.println(y);

//        List<Login> logins = Arrays.asList(
//                new Login("mike", "testing"),
//                new Login("stallin", "testing"),
//                new Login("adam", "testing")
//        );
//       // System.out.println(logins);
//
//        List<LoginDto>dtos = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
//        System.out.println(dtos);
//    }
//    static LoginDto mapToDto(Login login){
//
//        LoginDto dto = new LoginDto();
//        dto.setUserName(login.getUserName());
//        dto.setPassword(login.getPassword());
//        return dto;
//    }

//        List<Employee> employees = Arrays.asList(
//
//                new Employee("mike", 30, "chennai"),
//                new Employee("stallin", 25, "chennai"),
//                new Employee("adam", 31, "pune"),
//                new Employee("sam", 34, "Patna")
//        );
//        List<Employee> emps = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());
//        for (Employee  e: emps){
//            System.out.println(e.getName());
//            System.out.println(e.getCity());
//            System.out.println(e.getAge());
//
//            }

//        List<Integer> numbers = Arrays.asList(10, 12, 5, 6, 7, 8, 9);
//        List<Integer> data = numbers.stream().filter(n1 -> n1 % 2!=0).map(n2 ->n2 * n2).collect(Collectors.toList());
//        System.out.println(data);

//        List<Integer> numbers = Arrays.asList(10, 12, 5, 6, 7, 8, 9);
//        List<Integer> data = numbers.stream().filter(n1 -> n1 % 2==0).map(n2 ->n2 * n2).collect(Collectors.toList());
//        System.out.println(data);

//        List<Employee> employees = Arrays.asList(
//
//                new Employee("mike", 30, "chennai"),
//                new Employee("stallin", 25, "chennai"),
//                new Employee("adam", 31 , "pune"),
//                new Employee("sam", 34, "Patna")
//        );
//
//        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));
//        System.out.println(collect);


//        List<Employee> employees = Arrays.asList(
//
//                new Employee("mike", 30, "chennai"),
//                new Employee("stallin", 25, "chennai"),
//                new Employee("adam", 34, "pune"),
//                new Employee("sam", 34, "Patna")
//        );
//w
//        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));
//        System.out.println(collect);


//        List<Employee> employees = Arrays.asList(
//
//                new Employee("mike", 30, "chennai"),
//                new Employee("stallin", 25, "chennai"),
//                new Employee("adam", 34, "pune"),
//                new Employee("sam", 34, "Patna")
//        );
//
//        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));
//        System.out.println(collect);
//        for (Employee employee:employees){
//            List<Employee> employees1 = collect.get(employee.getAge());
//            for (Employee x:employees1){
//                System.out.println(x.getAge());
//                System.out.println(x.getCity());
//                System.out.println(x.getName());
//            }
//        }

//        List<Employee> employees = Arrays.asList(
//
//                new Employee("mike", 30, "chennai"),
//                new Employee("stallin", 25, "chennai"),
//                new Employee("adam", 34, "pune"),
//                new Employee("sam", 34, "Patna")
//        );
//
//        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));
//
//        for (Map.Entry<Integer,List<Employee>> entry :collect.entrySet()){
//            int age = entry.getKey();
//            List<Employee> employeeWithAge = entry.getValue();
//            System.out.println("age:"+age+"----");
//
//            for (Employee e: employeeWithAge){
//                System.out.println(e.getName());
//                System.out.println(e.getCity());
//            }
//        }
        List<Employee> employees = Arrays.asList(

                new Employee("mike", 30, "chennai"),
                new Employee("stallin", 25, "chennai"),
                new Employee("adam", 34, "pune"),
                new Employee("sam", 34, "Patna")
        );

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));

        for (Map.Entry<String,List<Employee>> entry :collect.entrySet()){
            String City  = entry.getKey();
            List<Employee> employeesWithAge = entry.getValue();
            System.out.println("City:"+City+"----");

            for (Employee e: employeesWithAge){
                System.out.println(e.getName());
                System.out.println(e.getCity());
            }
        }

    }
    }

