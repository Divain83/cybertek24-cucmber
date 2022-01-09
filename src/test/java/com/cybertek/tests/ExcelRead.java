package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelRead {
    @Test
    public void readingFromExcel() throws IOException {
        //Open excel workbook using XSSF

        XSSFWorkbook workbook = new XSSFWorkbook("Employees.xlsx");

        // Goto worksheet. pass the worksheet name
        XSSFSheet worksheet = workbook.getSheet("data");
        // print Mike
        System.out.println(worksheet.getRow(1).getCell(0));
        //print Romanenko
        System.out.println(worksheet.getRow(3).getCell(1));

    }
}
