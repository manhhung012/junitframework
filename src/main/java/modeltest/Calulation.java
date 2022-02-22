package modeltest;

import modeltest.ICaculation;

public class Calulation implements ICaculation {
    @Override
    public Long sum(Long a, Long b) {
        return a + b;
    }

    public static Double average(Double a, Double b) {
        return (a + b) / 2;
    }

    private Long tru(Long a, Long b) {
        return a - b;
    }
}
