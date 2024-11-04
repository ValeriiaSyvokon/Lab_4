// Main.java
public class Main {
    public static void main(String[] args) {
        //використання веб-фабрики
        ReportFactory webFactory = new WebReportFactory();
        ReportGenerator webGenerator = new ReportGenerator(webFactory);
        webGenerator.generateReports();

        //використання мобільної фабрики
        ReportFactory mobileFactory = new MobileReportFactory();
        ReportGenerator mobileGenerator = new ReportGenerator(mobileFactory);
        mobileGenerator.generateReports();

        //використання десктопної фабрики
        ReportFactory desktopFactory = new DesktopReportFactory();
        ReportGenerator desktopGenerator = new ReportGenerator(desktopFactory);
        desktopGenerator.generateReports();
    }
}