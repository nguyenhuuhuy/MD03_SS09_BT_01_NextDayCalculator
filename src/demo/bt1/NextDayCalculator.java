package demo.bt1;

import java.time.LocalDate;

public class NextDayCalculator {
//    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.of(2023,3,31);
////        System.out.println(localDate);
//        System.out.println(NextDayCalculator(localDate));
//
//    }
    public static LocalDate NextDayCalculator(LocalDate localDate) {

        return localDate.plusDays(1);
    }
}
