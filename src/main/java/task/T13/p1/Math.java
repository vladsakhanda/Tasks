package task.T13.p1;

class Math {


    private int specialField;


    {
        specialField = 0;

    }


    Math() {

    }

    public void calculateSum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        specialField = sum;
        if (specialField > 10 && specialField < 15) {
            specialField = 0;
        }
    }

    public int getSpecialField() throws Exception {
        if (specialField % 2 == 0) {
            return specialField;
        }
        throw new Exception("Доступ заборонений");


    }
}