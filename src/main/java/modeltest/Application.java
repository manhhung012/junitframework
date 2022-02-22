package modeltest;


public class Application {
    private Calulation calulation;

    public boolean check(Long a, Long b) {
        Long sum = calulation.sum(a, b);

        return sum > 10.0;
    }

    public boolean checkAverage(Double a, Double b) {
        Double check = Calulation.average(a, b);
        return check > 5.0;
    }


    public Calulation getCalulation() {
        return calulation;
    }

    public void setCalulation(Calulation calulation) {
        this.calulation = calulation;
    }
}
