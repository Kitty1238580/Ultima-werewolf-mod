public abstract class WerewolfSkill {
    protected String name;
    protected String description;
    protected int cooldown; // in seconds
    protected int levelRequired;

    public WerewolfSkill(String name, String description, int cooldown, int levelRequired) {
        this.name = name;
        this.description = description;
        this.cooldown = cooldown;
        this.levelRequired = levelRequired;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCooldown() {
        return cooldown;
    }

    public int getLevelRequired() {
        return levelRequired;
    }

    public abstract void activate(WerewolfPlayer player);
}
