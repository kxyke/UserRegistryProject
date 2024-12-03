package tests;

import reports.*;

public class DecoratorTest {
    public static void main(String[] args) {
        Report report = new BasicReport();
        Report decoratedReport = new HeaderDecorator(new BorderDecorator(new ColorDecorator(report)));

        System.out.println(decoratedReport.generate());
    }
}
