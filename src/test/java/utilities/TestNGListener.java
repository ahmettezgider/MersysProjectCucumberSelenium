package utilities;


import com.cucumber.listener.Reporter;
import org.testng.*;

import java.util.Arrays;

public class TestNGListener implements ITestListener, ISuiteListener, IClassListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {

    }


    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Reporter.setTestRunnerOutput("Test failure, Time : " + iTestResult.getStartMillis() + " - " + iTestResult.getEndMillis());
        Reporter.setTestRunnerOutput("<br>Name : " + iTestResult.getName());
        Reporter.setTestRunnerOutput("<br>TestName : " + iTestResult.getTestName());
        Reporter.setTestRunnerOutput("<br>Status : " + iTestResult.getStatus());
        Reporter.setTestRunnerOutput("<br>Method : " + iTestResult.getMethod());
        Reporter.setTestRunnerOutput("<br>TestClass : " + iTestResult.getTestClass());
        Reporter.setTestRunnerOutput("<br>TestContext : " + iTestResult.getTestContext());
        Reporter.setTestRunnerOutput("<br>Parameters : " + Arrays.toString(iTestResult.getParameters()));
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Reporter.setTestRunnerOutput("Test Skipped, Time : " + iTestResult.getStartMillis() + " - " + iTestResult.getEndMillis());
        Reporter.setTestRunnerOutput("<br>Name : " + iTestResult.getName());
        Reporter.setTestRunnerOutput("<br>TestName : " + iTestResult.getTestName());
        Reporter.setTestRunnerOutput("<br>Status : " + iTestResult.getStatus());
        Reporter.setTestRunnerOutput("<br>Method : " + iTestResult.getMethod());
        Reporter.setTestRunnerOutput("<br>TestClass : " + iTestResult.getTestClass());
        Reporter.setTestRunnerOutput("<br>TestContext : " + iTestResult.getTestContext());
        Reporter.setTestRunnerOutput("<br>Parameters : " + Arrays.toString(iTestResult.getParameters()));

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Override
    public void onStart(ISuite iSuite) {

    }

    @Override
    public void onFinish(ISuite iSuite) {

    }

    @Override
    public void onBeforeClass(ITestClass iTestClass) {

    }

    @Override
    public void onAfterClass(ITestClass iTestClass) {

    }
}
