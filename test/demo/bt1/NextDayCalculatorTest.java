package demo.bt1;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class NextDayCalculatorTest {
    //logic ngày
    @Test
    public void nextDayCalculator() {
        LocalDate localDate = LocalDate.of(2018,1,1);
        LocalDate expected = LocalDate.of(2018,1,2);
        
        LocalDate result = NextDayCalculator.NextDayCalculator(localDate);
        assertEquals(expected,result);
    }
    // logic tháng
    @Test
    public void nextMonthCalculator() {
        LocalDate localDate = LocalDate.of(2018,1,31);
        LocalDate expected = LocalDate.of(2018,2,1);
        LocalDate result = NextDayCalculator.NextDayCalculator(localDate);
        assertEquals(expected,result);
    }
    // logic năm nhuận
    @Test
    public void nextLeapYearCalculator() {
        LocalDate localDate = LocalDate.of(2018,2,28);
        LocalDate expected = localDate.of(2018,3,1);
        LocalDate result = NextDayCalculator.NextDayCalculator(localDate);
        assertEquals(expected,result);
    }
    // logic năm không nhuận
    @Test
    public void nextNotLeapYearCalculator() {
        LocalDate localDate = LocalDate.of(2000,2,28);

        LocalDate expected = localDate.of(2000,3,1);

        LocalDate result = NextDayCalculator.NextDayCalculator(localDate);
        assertEquals(expected,result);
    }
    // logic năm
    @Test
    public void nextYearCalculator() {
        LocalDate localDate = LocalDate.of(2018,12,31);

        LocalDate expected = localDate.of(2019,1,1);

        LocalDate result = NextDayCalculator.NextDayCalculator(localDate);
        assertEquals(expected,result);
    }

}