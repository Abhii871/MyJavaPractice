package com.nttdata.JavaLearning;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelCreation {

	void newExcel() throws Exception {
		try {
			Workbook wb = new HSSFWorkbook();
			// An output stream accepts output bytes and sends them to sink.
			OutputStream fileOut = new FileOutputStream("Geeks.xlsx");
			wb.write(fileOut);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	void excelExists() throws Exception {
		try {

		} catch (Exception e) {
		}

	}

}
