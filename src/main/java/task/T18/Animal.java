package task.T18;

 public abstract   class Animal {
    private String name;
    private int age;
    private String type;

    Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

   public abstract void makeNoise();




}
