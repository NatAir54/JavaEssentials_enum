package task_2;

public enum Animals {
    ELEPHANT(15), TIGER(20), LION(3), CROCODILE(6);

    private int age;

    Animals (int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + ", " + age + " years\n";
    }
}
