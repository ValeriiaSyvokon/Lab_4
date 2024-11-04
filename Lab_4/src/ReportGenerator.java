// ReportGenerator.java
public class ReportGenerator {
    private final ReportFactory reportFactory;

    public ReportGenerator(ReportFactory reportFactory) {
        this.reportFactory = reportFactory;
    }

    public void generateReports() {
        Report financialReport = reportFactory.createFinancialReport();
        financialReport.generate();

        Report marketingReport = reportFactory.createMarketingReport();
        marketingReport.generate();

        Report hrReport = reportFactory.createHRReport();
        hrReport.generate();
    }
}