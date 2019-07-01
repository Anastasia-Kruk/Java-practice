package lessons.lesson19.practice_2.task_5;

public class Sportsmen implements Comparable<Sportsmen> {
    private int number;
    private int speed;
    Medal medal;

    public Sportsmen(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int compareTo(Sportsmen o) {
        if (this.getSpeed() < o.getSpeed()) {
            return 1;
        }
        if (this.getSpeed() > o.getSpeed()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sportsmen{");
        sb.append("number=").append(number);
        sb.append(", speed=").append(speed);
        sb.append('}' + "\n");
        return sb.toString();
    }
}
