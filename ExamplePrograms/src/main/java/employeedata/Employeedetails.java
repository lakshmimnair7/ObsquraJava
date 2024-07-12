package employeedata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employeedetails {

	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet sh;

	public static String getStringData(int a, int b) throws IOException {

		f = new FileInputStream("C:\\Users\\LAKSHMI\\eclipse-workspace\\Examples\\src\\main\\resources\\EmployeeData.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		Row r = sh.getRow(a);
		Cell c = r.getCell(b);
		return c.getStringCellValue();
	}

	public static String getIntegerData(int a, int b) throws IOException {

		f = new FileInputStream("C:\\Users\\LAKSHMI\\eclipse-workspace\\Examples\\src\\main\\resources\\EmployeeData.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		Row r = sh.getRow(a);
		Cell c = r.getCell(b);
		int y = (int) c.getNumericCellValue();
		return String.valueOf(y);

	}
}
