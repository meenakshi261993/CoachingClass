import com.coaching.statistics.Employee;
import com.coaching.english.EnglishCourse;
import com.coaching.maths.MathCourse;
import com.coaching.statistics.StatisticsCourse;

import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;

public class Student {

    private static Logger studentLogging = Logger.getLogger(Student.class.getName());

    public static void main(String args[]) {

        testAndPrintPrimeNumbers();
        testAndPrintPrimeNumbersOfAnInteger();
        testAndPrintFibonacci();
        testAndPrintSortedArray();
        testIntegerInString();
        testAndPrintVowelsFromWord();
        testAndPrintSubstring();
        testPalindrome();
        List<Employee> testEmployeeList = addEmployeeDetails();
        StatisticsCourse statisticsCourse = new StatisticsCourse(testEmployeeList);
        testAndPrintGetEmployeeDetailsBasedOnAge(statisticsCourse);
        testAndPrintGetEmployeeBasedOnJoiningDate(statisticsCourse);
        testAndPrintGetEmployeeDetailsMap(statisticsCourse);


    }

    private  static List<Employee>  addEmployeeDetails(){
        List<Employee> employeeList = new ArrayList<>();
        Employee  empJhon = new Employee("Jhon",1,20,200.0,"java", LocalDate.parse("2018-04-01"));
        Employee  empJoseph = new Employee("Joseph",2,30,200.0,"java", LocalDate.parse("2019-04-01"));
        Employee  empMark = new Employee("mark",3,40,400.0,"java", LocalDate.parse("2017-04-01"));
        Employee  empJoy = new Employee("joy",4,43,500.0,"java", LocalDate.parse("2016-04-01"));
        Employee  empReddy = new Employee("reddy",5,34,200.0,"java", LocalDate.parse("2020-04-01"));
        Employee  empVini = new Employee("vini",6,37,200.0,"java", LocalDate.parse("2015-04-01"));
        Employee  empMeena = new Employee("meena",7,50,200.0,"java", LocalDate.parse("2018-05-01"));
        employeeList.add(empJhon);
        employeeList.add(empJoseph);
        employeeList.add(empMark);
        employeeList.add(empJoy);
        employeeList.add(empReddy);
        employeeList.add(empVini);
        employeeList.add(empMeena);
        return employeeList;
    }
    private static void testAndPrintPrimeNumbers() {
        List<Integer> primeList = MathCourse.primeNumbers(10);
        studentLogging.info("Printing the prime numbers till given an Integer \n" +primeList);
    }

    private static void testAndPrintPrimeNumbersOfAnInteger() {
        List<Integer> primeNumList = MathCourse.primeNumbersOfAnInteger(10);
        studentLogging.info("Printing the prime numbers of a given Integer \n" +primeNumList);
    }

    private static void testAndPrintFibonacci() {
        List<Integer> fibNumsList = MathCourse.fibonacciSeries(5);
        studentLogging.info("Printing the fibonacci series till given an Integer \n" +fibNumsList);
    }
    private static void testAndPrintSortedArray() {
        int[] A = {1, 5, 3, 2, 4};
        int[] testArray = MathCourse.sortingArray(A);
        studentLogging.info("Printing the sorted array " + Arrays.toString(testArray));

    }

    private static void testIntegerInString() {
        Double sqrtNum = MathCourse.integerCheck("test4");
        studentLogging.info("Printing the sqrt of an integer present in string " +sqrtNum);
    }

    private static void testAndPrintVowelsFromWord() {
        List<Character> vowelsList = EnglishCourse.checkVowels("abc");
        studentLogging.info("Printing the vowels list from a given word \n" +vowelsList );
    }

    private static void testAndPrintSubstring() {
        String subString = EnglishCourse.getSubString("testing", 4);
        studentLogging.info("Printing the substring from given word and length " +subString);
    }

    private static void testPalindrome() {
        boolean checkPalindromeFlag = EnglishCourse.palindrome("aba");
        studentLogging.info("Checking given string is palindrome or not " +checkPalindromeFlag);
    }
    private static void testAndPrintGetEmployeeDetailsBasedOnAge(StatisticsCourse statisticsCourse){
        Set<Employee> employeeListBasedOnAge = statisticsCourse.getEmployeeDetailsBasedOnAge();
        studentLogging.info("Employee details who's age is between 30-40  \n" +employeeListBasedOnAge.toString()+ " \n Count of the Employees" +employeeListBasedOnAge.size());
    }

    private static void testAndPrintGetEmployeeBasedOnJoiningDate(StatisticsCourse statisticsCourse){
        List<Employee> employeeListBasedOnJoinDate = statisticsCourse.getEmployeeBasedOnJoiningDate();
        studentLogging.info("Employee details who joined after 1st april 2018 are \n" +employeeListBasedOnJoinDate.toString()+ " \n Count of the Employees " +employeeListBasedOnJoinDate.size());
    }

    private static void testAndPrintGetEmployeeDetailsMap(StatisticsCourse statisticsCourse) {
        Map<Integer, String> employeeListAsMap = statisticsCourse.getEmployeeDetailsMap();
        studentLogging.info("Employee details in the form of map \n" +employeeListAsMap.toString()+ " \n Count of the Employees" +employeeListAsMap.size());
    }

}
