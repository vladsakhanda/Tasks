package task.T20.HW.Task1;

public class Doctor {
    private String name;
    private int age;
    private String specialization;

    Doctor(String name, int age, String specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        String space = " ";
        return name + space + age + space + specialization;
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == null || obj.getClass() != this.getClass()) {
        return false;
      }
      Doctor doctor = (Doctor) obj;
        return this.name == doctor.name && this.age == doctor.age && this.specialization == doctor.specialization;
    }

    @Override
    public int hashCode() {
        int nameHash = name != null ? name.hashCode() : 0;
        int specializationHash = specialization != null ? specialization.hashCode() : 0;
        return (age * (age + nameHash + specializationHash)) * (age+23);

    }
}
