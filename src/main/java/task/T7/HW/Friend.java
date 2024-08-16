package task.T7.HW;

 class Friend {
    String name;
    int age;
    int yearsOfFriendship;

    {
        name = "Діма";
        age = 15;
        yearsOfFriendship = 5;
    }

    Friend (String name) {
        this.name = name;
    }

    Friend (String name, int age) {
        this.name = name;
        this.age = age;
    }

    Friend (String name, int age, int yearsOfFriendship) {
        this.name = name;
        this.age = age;
        this.yearsOfFriendship = yearsOfFriendship;
    }


    void info() {
        System.out.printf("Ім'я - %s, Посада - %d років, Досвід - %d років.\n", name, age, yearsOfFriendship);
    }
}
