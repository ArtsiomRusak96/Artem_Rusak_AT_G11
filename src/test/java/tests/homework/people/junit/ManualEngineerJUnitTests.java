package tests.homework.people.junit;

import org.junit.Test;
import people.ManualEngineer;

import static org.junit.Assert.assertEquals;

public class ManualEngineerJUnitTests {

    @Test
    public void checkGettingAgeTest() {
        ManualEngineer manualEngineer = new ManualEngineer(23, 2, 3);
        assertEquals("The age of manual engineer should be:", 23, manualEngineer.getAge());
    }

    @Test
    public void checkGettingExperienceTest() {
        ManualEngineer manualEngineer = new ManualEngineer(31, 7, 11);
        assertEquals("The experience of manual engineer should be:", 7, manualEngineer.getExperience());
    }

    @Test
    public void checkGettingSkillTest() {
        ManualEngineer manualEngineer = new ManualEngineer(29, 10, 4);
        assertEquals("The skill of manual engineer should be:", 20, manualEngineer.getSkill());
    }

    @Test
    public void checkSettingAgeTest() {
        ManualEngineer manualEngineer = new ManualEngineer(15, 33, 6);
        manualEngineer.setAge(42);
        assertEquals("The age of manual engineer should be:", 42, manualEngineer.getAge());
    }

    @Test
    public void checkSettingExperienceTest() {
        ManualEngineer manualEngineer = new ManualEngineer(7, 10, 44);
        manualEngineer.setExperience(1);
        assertEquals("The experience of manual engineer should be:", 1, manualEngineer.getExperience());
    }

    @Test
    public void checkSettingSkillTest() {
        ManualEngineer manualEngineer = new ManualEngineer(100, 55, 90);
        manualEngineer.setSkill(14);
        assertEquals("The skill of manual engineer should be:", 14, manualEngineer.getSkill());
    }
}
