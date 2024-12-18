package people;

public abstract class Engineer extends Person {

    private int skill;
    private int experience;

    public Engineer(int age, int experience, int skill) {
        super(age);
        this.experience = experience;
        this.skill = skill;
    }

    public int getSkill() {
        return skill;
    }

    public int getExperience() {
        return experience;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
