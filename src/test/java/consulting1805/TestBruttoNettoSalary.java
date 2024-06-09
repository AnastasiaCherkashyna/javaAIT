package consulting1805;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public enum TestBruttoNettoSalary {
    TEST_1000(1000, 1000),
    TEST_2500 (2500, 2375),
    TEST_4200(4200, 3780),
    TEST_7000(7000, 5950);


    private  final double brutto;
    private final double expected;

    TestBruttoNettoSalary(double brutto, double expected) {
        this.brutto = brutto;
        this.expected = expected;
    }

    public double getBrutto() {
        return brutto;
    }

    public double getExpected() {
        return expected;
    }
}
