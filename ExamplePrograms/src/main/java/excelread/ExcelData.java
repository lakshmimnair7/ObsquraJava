package excelread;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet sh;

	public static String getStringData(int a, int b) throws IOException {    //here we pass in parameters as indexes

		f = new FileInputStream("C:\\Users\\LAKSHMI\\eclipse-workspace\\Examples\\src\\main\\resources\\TestData.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("sheet1");
		Row r = sh.getRow(a);
		Cell c = r.getCell(b);
		return c.getStringCellValue(); // method for recurring cell value
	}

	public static String getIntegerData(int a, int b) throws IOException {

		f = new FileInputStream("C:\\Users\\LAKSHMI\\eclipse-workspace\\Examples\\src\\main\\resources\\TestData.xlsx"); // excelpath
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		Row r = sh.getRow(a); // interface
		Cell c = r.getCell(b); // interface
		int x = (int) c.getNumericCellValue(); // Typecasting string value to intergervalue
		return String.valueOf(x); // Integer value to string
	}
}


//getStringData and getIntegerData are all inbuild methods