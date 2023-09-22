package org.Adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Adactin\\target\\TEST CASE.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(6);
		
		Cell cell = row.getCell(6);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
		   String value = cell.getStringCellValue();
		   System.out.println(value);
		} else {
            double d = cell.getNumericCellValue();
            System.out.println(d);
		}
		
		
	}

}
