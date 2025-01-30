package extentreports;


import com.aventstack.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.ITestListener;

import java.time.format.DateTimeFormatter;

public class Setup implements ITestListener {

private static ExtentReports extentReports;

    public void onStart(ITestContext context) {

        String fileName = ExtentReportManager.getReportnameWithTimestamp();
        String reportFullpath= System.getProperty("user.dir") + "\\Reports\\" +fileName;
        extentReports = ExtentReportManager.reportMechanism(reportFullpath, "Test API Automation Report", "Test Execution Report")

    }

    public void onFinish(ITestContext context) {
        if (extentReports!=null){
            extentReports.flush();
        }
    }



}
