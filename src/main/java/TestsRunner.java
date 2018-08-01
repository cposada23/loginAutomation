import config.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utiles.ExcelUtility;

import java.util.ArrayList;

public class TestsRunner {
    private static Logger logger = LogManager.getLogger(TestsRunner.class.getName());
    public static void main(String[] args) throws Exception {
        logger.info("************************************************************");
        logger.info("*                                                          *");
        logger.info("*                  TESTS STRARTING                         *");
        logger.info("*                                                          *");
        logger.info("************************************************************");


        ExcelUtility.setExcelFile(Constants.excelPath);
        ArrayList<String> testCases = ExcelUtility.getTests(Constants.testCasesSheet);
        logTestCases(testCases);
    }

    private static void logTestCases(ArrayList<String> testCases) {
        logger.info("****** TEST CASES *******");
        for (String testCase :
                testCases) {
            logger.info("Test Case: " + testCase);
        }
    }
}
