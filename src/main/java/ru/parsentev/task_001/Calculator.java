package ru.parsentev.task_001;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 18.07.2016
 */
public class Calculator {
    private static final Logger log = getLogger(Calculator.class);

    double x;

    public double getResult() {
        return x;
    }

    public void add(double first, double second) {
         x = first + second;
    }

    public void substract(double first, double second) {
        x = first - second;
    }

    public void multiple(double first, double second) {
        x = first * second;
    }

    public void div(double first, double second) {
        if (second == 0) {
            throw new  IllegalStateException();
        } else {
            x = first / second;
        }
    }

    public void expand(double first, double second) {
        x = Math.pow(first, second);
    }
}
