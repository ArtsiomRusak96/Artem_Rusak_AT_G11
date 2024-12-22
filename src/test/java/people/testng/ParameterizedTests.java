package people.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import people.AutomatedEngineer;
import people.Engineer;
import people.ManualEngineer;

import static org.testng.Assert.assertEquals;

public class ParameterizedTests {

    AutomatedEngineer ae = new AutomatedEngineer(36, 9, 12);
    ManualEngineer me = new ManualEngineer(28, 7, 9);

    @DataProvider(name = "engineer")
    public Object[][] engineer() {
        return new Object[][] {
                {ae},
                {me}
        };
    }

    @DataProvider(name = "engineerAge")
    public Object[][] engineersWithAge() {
        return new Object[][] {
                {ae, ae.getAge()},
                {me, me.getAge()}
        };
    }

    @DataProvider(name = "engineerExperience")
    public Object[][] engineersWithExperience() {
        return new Object[][] {
                {ae, ae.getExperience()},
                {me, me.getExperience()}
            };
    }

    @DataProvider(name = "engineerSkill")
    public Object[][] engineersWithSkill() {
        return new Object[][] {
                {ae, ae.getSkill()},
                {me, me.getSkill()}
        };
    }

    @Test(dataProvider = "engineerAge")
    public void checkGettingAgeTest(Engineer engineer, int expectedAge) {
        assertEquals(engineer.getAge(), expectedAge, "The age of engineer should be:");
    }

    @Test(dataProvider = "engineerExperience")
    public void checkGettingExperienceTest(Engineer engineer, int expectedExperience) {
        assertEquals(engineer.getExperience(), expectedExperience, "The experience of engineer should be:");
    }

    @Test(dataProvider = "engineerSkill")
    public void checkGettingSkillTest(Engineer engineer, int expectedSkill) {
        assertEquals(engineer.getSkill(), expectedSkill, "The skill of engineer should be:");
    }

    @Test(dataProvider = "engineer")
    public void checkSettingAgeTest(Engineer engineer) {
        engineer.setAge(29);
        assertEquals(engineer.getAge(), 29, "The age of engineer should be:");
    }

    @Test(dataProvider = "engineer")
    public void checkSettingExperienceTest(Engineer engineer) {
        engineer.setExperience(5);
        assertEquals(engineer.getExperience(), 5, "The experience of engineer should be:");
    }

    @Test(dataProvider = "engineer")
    public void checkSettingSkillTest(Engineer engineer) {
        engineer.setSkill(4);
        assertEquals(engineer.getSkill(), 4, "The skill of engineer should be:");
    }
}
