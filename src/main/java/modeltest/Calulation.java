package modeltest;

import modeltest.ICaculation;

public class Calulation implements ICaculation {
    @Override
    public Long sum(Long a, Long b) {
        return a + b;
    }
}
