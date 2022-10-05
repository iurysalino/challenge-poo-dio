package br.com.dio.challenge.domain;

public abstract class Contents {

    protected static final double DEFAULT_XP = 10d;
    private String title;
    private String description;

    /**
     * This method is responsable to calculate the experience the courses.
     * @return a numerical value that represents the course experience calculated.
     */
    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
