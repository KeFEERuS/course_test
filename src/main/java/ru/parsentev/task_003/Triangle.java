package ru.parsentev.task_003;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean exists() {
        boolean ext = true;
        if (first == second && first == third) ext = false;
        if (first.getPositionX() == second.getPositionX() && first.getPositionX() == third.getPositionX()) {
            ext = false;
        } else if (first.getPositionY() == second.getPositionY() && first.getPositionY() == third.getPositionY()) ext = false;
        return ext;
    }

    public double area() {
        double S = 0;
        if (first == second && first == third) throw new IllegalStateException();
        if (first.getPositionX() == second.getPositionX() && first.getPositionX() == third.getPositionX()) {
            throw new IllegalStateException();
        } else if (first.getPositionY() == second.getPositionY() && first.getPositionY() == third.getPositionY()) {
            throw new IllegalStateException();
        } else S = (first.distanceTo(second) * first.distanceTo(third)) / 2;
        return S;
    }
}
