package com.nttdata.JavaLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CreateExcel extends ExcelCreation {

	File path;
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet = new XSSFSheet();
	XSSFSheet sheet1;
	int lastRow;
	Workbook wb;
	void logic() throws Exception {

		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println(localDate);
		LocalDate ll = LocalDate.parse("2020-02-02");

		int year = ll.getYear();
		int month = ll.getMonthValue();
		int day = ll.getDayOfMonth();
		String sDay = String.valueOf(day);
		String sMonth = String.valueOf(month);
		String sYear = String.valueOf(year);

		String dateMonth = date + " " + month;

		System.out.println("Year : " + year + ", Month : " + month + ", Day : " + day);

		String exYear = "EDI270_" + sYear + ".xlsx";

		// Sheet creation every month 1st date
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
		DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("MMMM", Locale.ENGLISH);
		LocalDate ld = LocalDate.parse(localDate.toString(), dft);
		String mt = dft1.format(ld);
		System.out.println(mt);
		

//		if (exYear.equals("SomeName_" + sYear + ".xls")) {
			
			File path = new File("C:/" + exYear);
			if (path.exists()) {
				//int lastRow = sheet.getLastRowNum();
				XSSFRow row = sheet.createRow(0);
				XSSFCell cell = row.createCell(0);
				cell.setCellValue("HEy");
				System.out.println("Exits");
				

			} else {
				if (sDay.equals("1"))

				{// Date is 1 create new sheet

					System.out.println("Create new Excel Sheet...");// pass month//
																	// value in text
																	// //
																	// format.{mt}

					

					

					System.out.println("Sheets Has been Created successfully");

					

				}

				wb = new HSSFWorkbook();
				OutputStream fileOut = new FileOutputStream(exYear);
				Sheet sheet2 = wb.createSheet(mt);
				System.out.println("Created sheet for:"+mt);
				wb.write(fileOut);
				

			}

			if (sDay.equals("1"))

			{// Date is 1 create new sheet

				System.out.println("Create new Excel Sheet...");// pass month//
																// value in text
																// //
																// format.{mt}

				

				

				System.out.println("Sheets Has been Created successfully");

				

			}

			else { // Date is not 1, then insert data into new row.

			}
		} /*else {
			// create new excel file.
			// pass year value and month value in text format.{mt}

		}
*/
	

	public static void main(String[] args) throws Exception {
		CreateExcel ob = new CreateExcel();
		ob.logic();
	}

}
