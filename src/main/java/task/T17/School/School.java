package task.T17.School;

public class School {
    private String name;
    private Director director;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
