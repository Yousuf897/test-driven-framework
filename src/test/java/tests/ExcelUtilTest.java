package tests;

import base.BaseTest;
import com.companyname.utils.ExcelUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExcelUtilTest extends BaseTest {

    @Test
    public void readExcelData() throws IOException {

        // Logging to indicate test progress
        log("Starting the test to read Excel file data...");

        // Reading the Excel file into a List of List of Strings
        List<List<String>> excelData = ExcelUtils.readExcelFile("user-data.xlsx");

        // Assert that the data is not null
        log("Checking that the Excel data is not null...");
        assertNotNull(excelData, "Excel data should not be null.");

        // Assert the number of rows in the Excel data
        log("Verifying the number of rows in the Excel file...");
        assertEquals(4, excelData.size(), "Excel file should contain exactly 4 rows.");

        // Assert the first cell of the first row (should be the header "ID")
        log("Verifying that the first cell in the first row is 'ID'...");
        assertEquals("ID", excelData.get(0).get(0), "The first cell in the first row should contain 'ID'.");

        // Assert the value in the second row and second column (should be "John Doe")
        log("Verifying that the second row and second column has the name 'John Doe'...");
        assertEquals("John Doe", excelData.get(1).get(1), "The second row should have 'John Doe' as the name.");

        // Assert the value in the fourth row and third column (should be "alex.lee@gmail.com")
        log("Verifying that the fourth row and third column has the email 'alex.lee@gmail.com'...");
        assertEquals("alex.lee@gmail.com", excelData.get(3).get(2), "The last row should have 'alex.lee@gmail.com' as the email.");

        // Final log to confirm all assertions passed
        log("All assertions passed. Excel data is correct.");
    }
}
