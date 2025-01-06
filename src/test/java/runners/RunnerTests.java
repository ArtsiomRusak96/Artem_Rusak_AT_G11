package runners;

import tests.homework.selenium.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BookingParisTest.class,
        SearchTest.class,
        BookingLondonTest.class,
        SelectDropdownValuesTest.class,
        BookingHoverTest.class,
        BookingPragueTest.class
})
public class RunnerTests {
}
