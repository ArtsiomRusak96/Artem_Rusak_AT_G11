package people.testng;

import org.testng.annotations.Test;
import people.AutomatedEngineer;

import static org.testng.Assert.assertEquals;

public class AutomatedEngineerTestNgTests {

    @Test
    public void checkGettingAgeTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(20, 1, 4);
        assertEquals(automatedEngineer.getAge(), 20, "The age of automated engineer should be:");
    }

    @Test
    public void checkGettingExperienceTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(41, 12, 9);
        assertEquals(automatedEngineer.getExperience(), 12, "The experience of automated engineer should be:");
    }

    @Test
    public void checkGettingSkillTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(17, 1, 8);
        assertEquals(automatedEngineer.getSkill(), 3, "The skill of automated engineer should be:");
    }

    @Test
    public void checkSettingAgeTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(11, 12, 98);
        automatedEngineer.setAge(32);
        assertEquals(automatedEngineer.getAge(), 32, "The age of automated engineer should be:");
    }

    @Test
    public void checkSettingExperienceTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(44, 2, 52);
        automatedEngineer.setExperience(23);
        assertEquals(automatedEngineer.getExperience(), 23, "The experience of automated engineer should be:");
    }

    @Test
    public void checkSettingSkillTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(31, 14, 0);
        automatedEngineer.setSkill(7);
        assertEquals(automatedEngineer.getSkill(), 7, "The skill of automated engineer should be:");
    }
}
