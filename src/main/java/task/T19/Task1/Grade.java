package task.T19.Task1;

enum Grade {
    A("Excellent"),
    B("Good"),
    C("Fair"),
    D("Sufficient"),
    F("Failing");

    private String description;

    Grade(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

