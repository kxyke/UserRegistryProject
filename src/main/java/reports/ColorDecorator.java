package reports;

public class ColorDecorator extends ReportDecorator {
    public ColorDecorator(Report report) {
        super(report);
    }

    public String generate() {
        return "\u001B[31m" + super.generate() + "\u001B[0m"; // Cor vermelha
    }
}
