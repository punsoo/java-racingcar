package racing.model;

public class RacingCar implements Comparable<RacingCar> {

    public static final int THRESHOLD_POWER = 4;

    private int position;

    public int move(int power) {
        if (power >= THRESHOLD_POWER) {
            position++;
        }
        return position;
    }

    @Override
    public int compareTo(RacingCar car) {
        return Integer.compare(position, car.position);
    }
}
