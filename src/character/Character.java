package character;

public abstract class Character {
    private String name;
    private Stats stats;
    private String job;

    public Character(String name){
        this.name = name;
        this.stats = new Stats();
    }

    public abstract void attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
