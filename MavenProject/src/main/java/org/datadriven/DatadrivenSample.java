package org.datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenSample {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\kesarsoft\\eclipse-workspace\\MavenProject\\excel\\datadriven.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet newSheet=w.createSheet("data");
		Row newRow=newSheet.createRow(0);
		Cell newCell=newRow.createCell(0);
		newCell.setCellValue("Selenium");
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		
	}

}
