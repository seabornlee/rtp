public class Fan {
    private int grade;

    public void turnTo(int grade) {
        this.grade = grade;
    }

    public boolean isRunning() {
        return grade != 0;
    }
}
