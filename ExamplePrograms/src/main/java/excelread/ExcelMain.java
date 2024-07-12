package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		System.out.println(ExcelData.getStringData(1, 0)); //(ROW,COLOUM)
		System.out.println(ExcelData.getIntegerData(1, 1)); //ROW, COLOUM
		System.out.println(ExcelData.getStringData(2, 0)); 
		System.out.println(ExcelData.getIntegerData(2, 1));
		System.out.println(ExcelData.getStringData(3, 0)); 
		System.out.println(ExcelData.getIntegerData(3, 1));
		System.out.println(ExcelData.getStringData(4, 0)); 
		System.out.println(ExcelData.getIntegerData(4, 1));
		
	

	}

}
