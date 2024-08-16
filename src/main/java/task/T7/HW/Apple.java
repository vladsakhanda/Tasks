package task.T7.HW;

 class Apple {
    String variety;
    String color;
    int weight;

    {
      variety = "Gala";
      color = "Red";
      weight = 200;
    }

    Apple (String variety) {
        this.variety = variety;
    }

    Apple (String variety, String color) {
        this.variety = variety;
        this.color = color;
    }

    Apple (String variety, String color, int weight) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
    }


    void info() {
        System.out.printf("Сорт - %s, Колір - %s, Вага - %d грам.\n", variety, color, weight);
    }

}
