package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.homework.selenium.junit.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BookingParisJUnitTest.class,
        SearchJUnitTest.class,
        BookingLondonJUnitTest.class,
        SelectDropdownValuesJUnitTest.class,
        BookingHoverJUnitTest.class,
        BookingPragueJUnitTest.class
})
public class RunnerTests {
}
