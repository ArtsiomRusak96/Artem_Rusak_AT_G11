package tests.homework.people.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomatedEngineerJUnitTests.class,
        ManualEngineerJUnitTests.class,
        ParameterizedTests.class
})

public class RunnerJUnit {

}
