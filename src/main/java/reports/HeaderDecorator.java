package reports;

public class HeaderDecorator extends ReportDecorator {
    public HeaderDecorator(Report report) {
        super(report);
    }

    public String generate() {
        return "Header: Company Name\n" + super.generate();
    }
}
