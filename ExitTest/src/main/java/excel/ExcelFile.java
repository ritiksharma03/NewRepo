package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	

	//////////// This method is for reading the excel file //////////
	public XSSFSheet ExcelData(String sheetName) throws IOException {
		File file = new File(System.getProperty("user.dir") + "./Resources/TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet(sheetName);
		return sheet;
	}

	public String CellData(XSSFSheet sheet, int rowNum) {
		String data = sheet.getRow(rowNum).getCell(0).getStringCellValue();
		return data;
	}
}
