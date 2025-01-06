package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.homework.people.junit.AutomatedEngineerJUnitTests;
import tests.homework.people.junit.ManualEngineerJUnitTests;
import tests.homework.people.junit.ParameterizedTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomatedEngineerJUnitTests.class,
        ManualEngineerJUnitTests.class,
        ParameterizedTests.class
})

public class RunnerPeopleTests {

}
