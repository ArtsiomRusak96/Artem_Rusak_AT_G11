package tests.homework.people.junit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import people.AutomatedEngineer;
import people.Engineer;
import people.ManualEngineer;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParameterizedTests {

    private Engineer engineer;
    private int expectedAge;
    private int expectedExperience;
    private int expectedSkill;

    public ParameterizedTests(Engineer engineer, int expectedAge, int expectedExperience, int expectedSkill) {
        this.engineer = engineer;
        this.expectedAge = expectedAge;
        this.expectedExperience = expectedExperience;
        this.expectedSkill = expectedSkill;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> engineers() {

        AutomatedEngineer ae = new AutomatedEngineer(31, 7, 10);
        ManualEngineer me = new ManualEngineer(24, 3, 2);

        return Arrays.asList(new Object[][] {
                {ae, ae.getAge(), ae.getExperience(), ae.getSkill()},
                {me, me.getAge(), me.getExperience(), me.getSkill()}
        });
    }

    @Test
    public void checkGettingAgeTest() {
        assertEquals("The age of engineer should be:", expectedAge, engineer.getAge());
    }

    @Test
    public void checkGettingExperienceTest() {
        assertEquals("The experience of engineer should be:", expectedExperience, engineer.getExperience());
    }

    @Test
    public void checkGettingSkillTest() {
        assertEquals("The skill of engineer should be:", expectedSkill, engineer.getSkill());
    }

    @Test
    public void checkSettingAgeTest() {
        engineer.setAge(44);
        assertEquals("The age of engineer should be:", 44, engineer.getAge());
    }

    @Test
    public void checkSettingExperienceTest() {
        engineer.setExperience(12);
        assertEquals("The experience of engineer should be:", 12, engineer.getExperience());
    }

    @Test
    public void checkSettingSkillTest() {
        engineer.setSkill(19);
        assertEquals("The skill of engineer should be:", 19, engineer.getSkill());
    }
}
