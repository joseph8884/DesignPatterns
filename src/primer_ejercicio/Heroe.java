package primer_ejercicio;

import java.util.List;

public class Heroe implements Prototype {
    private String name;
    private String visualAppearance;
    private List<String> abilities;
    private int experience;
    private int level;
    private int skillPoints;

    public Heroe(String name, String visualAppearance, List<String> abilities, int experience, int level, int skillPoints) {
        this.name = name;
        this.visualAppearance = visualAppearance;
        this.abilities = abilities;
        this.experience = experience;
        this.level = level;
        this.skillPoints = skillPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisualAppearance(String visualAppearance) {
        this.visualAppearance = visualAppearance;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    public String getName() {
        return name;
    }

    public String getVisualAppearance() {
        return visualAppearance;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    @Override
    public Heroe clone() {
        return new Heroe(name, visualAppearance, abilities, experience, level, skillPoints);
    }
    public String toString() {
        return "Heroe{" +
                "name='" + name + '\'' +
                ", visualAppearance='" + visualAppearance + '\'' +
                ", abilities=" + abilities +
                ", experience=" + experience +
                ", level=" + level +
                ", skillPoints=" + skillPoints +
                '}';
    }
}
