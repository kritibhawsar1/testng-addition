package baseTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

        @Override
        public void onTestStart(ITestResult result) {      //run on start of each test method
            // TODO Auto-generated method stub
                System.out.println("<Test> started");
        }

        @Override
        public void onTestSuccess(ITestResult result) {
            // TODO Auto-generated method stub
            System.out.println("Success of test cases and its details are : "+result.getName());
        }

        @Override
        public void onTestFailure(ITestResult result) {
            // TODO Auto-generated method stub
            System.out.println("Failure of test cases and its details are : "+result.getName());
        }

        @Override
        public void onTestSkipped(ITestResult result) {
            // TODO Auto-generated method stub
            System.out.println("Skip of test cases and its details are : "+result.getName());
        }

        @Override
        public void onStart(ITestContext context) {   //runs on start of each <Test>
            // TODO Auto-generated method stub
                System.out.println("onStart Method "+context.getName());
        }

        @Override
        public void onFinish(ITestContext context) {   //runs on finish of each <Test>
            // TODO Auto-generated method stub
                System.out.println("onFinish Method "+context.getName());
        }
}
