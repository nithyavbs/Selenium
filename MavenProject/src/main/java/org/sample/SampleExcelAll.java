package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcelAll {

	public static void main(String[] args) throws IOException {
		File fileSrc = new File("C:\\Users\\kesarsoft\\eclipse-workspace\\MavenProject\\excel\\SampleDatas.xlsx");

		FileInputStream fis = new FileInputStream(fileSrc);

		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Data");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells()-1; j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
				int cellType = cell.getCellType();
				if (cellType == 1) {
					String strValue = cell.getStringCellValue();
					System.out.println(strValue);
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateValue = cell.getDateCellValue();
					SimpleDateFormat s= new SimpleDateFormat("dd-MM-yyyy");
					String dateFormat = s.format(dateValue);
			System.out.println(dateFormat);
					
				}else {
					double numValue = cell.getNumericCellValue();
					long longValue= (long)numValue;
					String valueOf = String.valueOf(longValue);
					System.out.println(valueOf);
				}
			}
		}
	}
}
