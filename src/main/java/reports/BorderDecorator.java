package reports;

public class BorderDecorator extends ReportDecorator {
    public BorderDecorator(Report report) {
        super(report);
    }

    public String generate() {
        return "=========\n" + super.generate() + "\n=========";
    }
}
