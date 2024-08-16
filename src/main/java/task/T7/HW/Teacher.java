package task.T7.HW;

 class Teacher {
    String name;
    String position;
    int experience;

    {
        name = "Мар'я Іванівна";
        position = "Метематічка";
        experience = 20;
    }

    Teacher (String name) {
        this.name = name;
    }

    Teacher (String name, String position) {
        this.name = name;
        this.position = position;
    }

    Teacher (String name, String position, int experience) {
        this.name = name;
        this.position = position;
        this.experience = experience;
    }


    void info() {
        System.out.printf("Ім'я - %s, Посада - %s, Досвід - %d років.\n", name, position, experience);
    }

}
