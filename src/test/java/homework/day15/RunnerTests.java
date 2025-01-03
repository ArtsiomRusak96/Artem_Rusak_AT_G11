package homework.day15;

import classwork.day15.BookingParisTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BookingParisTest.class,
        SearchTest.class,
        BookingLondonTest.class,
        SelectDropdownValuesTest.class,
        BookingHoverTest.class,
        BookingPrahaTest.class
})
public class RunnerTests {
}
