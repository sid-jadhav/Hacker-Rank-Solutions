package ReadingXcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExpt {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\LENOVO\\git\\Hacker-Rank-Solution\\JavaPractice\\target\\sid.xlsx");
		try {
			FileInputStream fin=new FileInputStream(f);
			XSSFWorkbook wb= new XSSFWorkbook(fin);
			System.out.println(wb.getActiveSheetIndex());
			XSSFSheet ws= wb.getSheetAt(0);
			System.out.println(ws.getActiveCell());
			XSSFRow row=ws.getRow(0);
			System.out.println(row.getRowNum());
			XSSFCell cell= row.getCell(0);
			System.out.println(cell.getStringCellValue());		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
