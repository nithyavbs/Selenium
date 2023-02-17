package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcelDiff {

	public static void main(String[] args) throws IOException {
File fileSrc= new File("C:\\Users\\kesarsoft\\eclipse-workspace\\MavenProject\\excel\\SampleDatas.xlsx");
		
		FileInputStream fis= new FileInputStream(fileSrc);
		
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Datas");
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(1);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
	}

}
