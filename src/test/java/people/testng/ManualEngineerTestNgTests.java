package people.testng;

import org.testng.annotations.Test;
import people.ManualEngineer;

import static org.testng.Assert.assertEquals;

public class ManualEngineerTestNgTests {

    @Test
    public void checkGettingAgeTest() {
        ManualEngineer manualEngineer = new ManualEngineer(30, 9, 17);
        assertEquals(manualEngineer.getAge(), 30, "The age of manual engineer should be:");
    }

    @Test
    public void checkGettingExperienceTest() {
        ManualEngineer manualEngineer = new ManualEngineer(17, 1, 3);
        assertEquals(manualEngineer.getExperience(), 1, "The experience of manual engineer should be:");
    }

    @Test
    public void checkGettingSkillTest() {
        ManualEngineer manualEngineer = new ManualEngineer(22, 4, 10);
        assertEquals(manualEngineer.getSkill(), 8, "The skill of manual engineer should be:");
    }

    @Test
    public void checkSettingAgeTest() {
        ManualEngineer manualEngineer = new ManualEngineer(26, 2, 9);
        manualEngineer.setAge(29);
        assertEquals(manualEngineer.getAge(), 29, "The age of manual engineer should be:");
    }

    @Test
    public void checkSettingExperienceTest() {
        ManualEngineer manualEngineer = new ManualEngineer(11, 10, 98);
        manualEngineer.setExperience(0);
        assertEquals(manualEngineer.getExperience(), 0, "The experience of manual engineer should be:");
    }

    @Test
    public void checkSettingSkillTest() {
        ManualEngineer manualEngineer = new ManualEngineer(145, 101, 458);
        manualEngineer.setSkill(121);
        assertEquals(manualEngineer.getSkill(), 121, "The skill of manual engineer should be:");
    }
}
