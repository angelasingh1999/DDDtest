package com.vcentry.lab.inputReader;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class InputReader {



   public static Object[][] data = null;



   public static boolean verifyRunMode(String TestCaseName) throws IOException {



       // XSSF - .xlxs, HSSF - .xls
        XSSFWorkbook workbook = new XSSFWorkbook(
                new FileInputStream(new File("src/test/resources/com/vcentry/lab/inputs/inputcontroller.xlsx")));
        XSSFSheet TcSheetHome = workbook.getSheet("Home");



       int TcrowHome = TcSheetHome.getLastRowNum();
        for (int k = 1; k <= TcrowHome; k++) {



           String RunMode = TcSheetHome.getRow(k).getCell(2).getStringCellValue();
            String TCNameHome = TcSheetHome.getRow(k).getCell(0).getStringCellValue();
            if (RunMode.equals("Y") & TCNameHome.equals(TestCaseName)) {
                return true;
            }
        }
        return false;
    }



   public static Object[][] verifyMultiData(String TestCaseName) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(
                new FileInputStream(new File("src/test/resources/com/vcentry/lab/inputs/inputcontroller.xlsx")));
        XSSFSheet TcSheetHome = workbook.getSheet("Home");
        int TcrowHome = TcSheetHome.getLastRowNum();



       for (int k = 1; k <= TcrowHome; k++) {
            String TCNameHome = TcSheetHome.getRow(k).getCell(0).getStringCellValue();
            if (TCNameHome.equals(TestCaseName)) {
                String RunForData = TcSheetHome.getRow(k).getCell(3).getStringCellValue();
                if (RunForData.equals("Y")) {
                    collectMultiData(TestCaseName);
                    break;
                } else {
                    collectSingleData(TestCaseName);
                    break;
                }
            }
        }



       return data;
    }



   public static Object[][] collectSingleData(String TestCaseName) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook(new FileInputStream(new File("src/test/resources/com/vcentry/lab/inputs/inputcontroller.xlsx")));
        XSSFSheet TcSheet=workbook.getSheet(TestCaseName);
        int TcRow=TcSheet.getLastRowNum();
        data=new Object[1][TcRow+1];
        for (int i=0;i<=TcRow;i++)
        {
            Cell Cell=TcSheet.getRow(i).getCell(5);
            TcSheet.getRow(i).getCell(5).setCellType(CellType.STRING);
            data[0][i]=TcSheet.getRow(i).getCell(5).getStringCellValue();
        }
        return data;    
    }




    public static Object[][] collectMultiData(String TestCaseName) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook(new FileInputStream(new File("src/test/resources/com/vcentry/lab/inputs/multiData.xlsx")));
        XSSFSheet TcSheet=workbook.getSheet(TestCaseName);
        int TcRow=TcSheet.getLastRowNum();
        int TcCol=TcSheet.getRow(1).getLastCellNum();
        data=new Object[TcCol][TcRow+1];
        for (int i=0;i<=TcRow;i++)
        {
            for (int j=0;j<TcCol;j++)
        {
        Cell Cell=TcSheet.getRow(i).getCell(j);
        TcSheet.getRow(i).getCell(j).setCellType(CellType.STRING);
        data[j][i]=TcSheet.getRow(i).getCell(j).getStringCellValue();
        }
    }
    return data;
    }
}      