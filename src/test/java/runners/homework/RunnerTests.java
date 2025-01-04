package runners.homework;

import tests.classwork.BookingParisTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.homework.*;

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
