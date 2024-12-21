package people.junit;

import org.junit.Test;
import people.AutomatedEngineer;

import static org.junit.Assert.assertEquals;


public class AutomatedEngineerJUnitTests {

    @Test
    public void checkGettingAgeTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(26, 6, 3);
        assertEquals("The age of automated engineer should be:", 26, automatedEngineer.getAge());
    }

    @Test
    public void checkGettingExperienceTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(42, 14, 6);
        assertEquals("The experience of automated engineer should be:", 14, automatedEngineer.getExperience());
    }

    @Test
    public void checkGettingSkillTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(30, 4, 2);
        assertEquals("The skill of automated engineer should be:", 12, automatedEngineer.getSkill());
    }

    @Test
    public void checkSettingAgeTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(18, 1, 0);
        automatedEngineer.setAge(55);
        assertEquals("The age of automated engineer should be:", 55, automatedEngineer.getAge());
    }

    @Test
    public void checkSettingExperienceTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(2, 3, 4);
        automatedEngineer.setExperience(17);
        assertEquals("The experience of automated engineer should be:", 17, automatedEngineer.getExperience());
    }

    @Test
    public void checkSettingSkillTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(99, 58, 189);
        automatedEngineer.setSkill(7);
        assertEquals("The skill of automated engineer should be:", 7, automatedEngineer.getSkill());
    }
}
