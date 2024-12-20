package com.companyname.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExcelUtils {

    /**
     * Reads an Excel file and returns its content as a list of lists of strings.
     * Each list of strings represents a row in the Excel file.
     *
     * @param fileName the name of the Excel file to read (located in the resources folder)
     * @return a List of List of Strings where each inner list represents a row in the Excel file
     * @throws IOException if there is an issue reading the file
     */
    public static List<List<String>> readExcelFile(String fileName) throws IOException {
        // Initialize a list to hold the Excel data (rows of strings)
        List<List<String>> exelData = new ArrayList<>();

        // Load the Excel file from the resources folder using the provided file name
        FileInputStream fis = new FileInputStream(new File(
                Objects.requireNonNull(ExcelUtils.class
                                .getClassLoader()  // Get the class loader of the ExcelUtils class
                                .getResource(fileName))  // Get the resource file with the given file name
                        .getFile()  // Get the absolute path of the file
        ));

        String path =
                Objects.requireNonNull(ExcelUtils.class
                                .getClassLoader()  // Get the class loader of the ExcelUtils class
                                .getResource(fileName))  // Get the resource file with the given file name
                        .getPath(); // Get the absolute path of the file

        System.out.println("Excel Path" + path );

        // Create a Workbook object to interact with the Excel file (XSSF is for .xlsx files)
        Workbook workbook = new XSSFWorkbook(fis);

        // Get the first sheet of the workbook (0-indexed)
        Sheet sheet = workbook.getSheetAt(0);

        // Iterate over each row in the sheet
        for (Row row : sheet) {
            // Create a list to hold the data for each cell in the row
            List<String> rowData = new ArrayList<>();

            // Iterate over each cell in the row
            for (Cell cell : row) {
                // Add the cell's string representation to the rowData list
                rowData.add(cell.toString());
            }

            // Add the rowData (which contains all cell data of the row) to the exelData list
            exelData.add(rowData);
        }

        // Close the workbook and file input stream to release resources
        workbook.close();
        fis.close();

        // Return the populated list containing all rows of the Excel file
        return exelData;
    }
}
