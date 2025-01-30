package extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;


public class ExtentReportManager {

    public static ExtentReports extentreports;
    public static ExtentReports reportMechanism(String filePath, String reportName, String documentTitle){

        ExtentSparkReporter esr = new ExtentSparkReporter(filePath);
        esr.config().setReportName(reportName);
        esr.config().setDocumentTitle(documentTitle);
        esr.config().setTheme(Theme.STANDARD);
        esr.config().setEncoding("utf-8");

        extentreports = new ExtentReports();
        extentreports.attachReporter(esr);
        return extentreports;

    }

    public static String getReportnameWithTimestamp(){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-hh-mm-ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedTime = dateTimeFormatter.format(localDateTime);
        String reportName = "TestReport_"+formattedTime+".html";
        return reportName;




    }
}
