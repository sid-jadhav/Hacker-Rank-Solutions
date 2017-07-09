package ReadingXcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTheCellYouWant {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\LENOVO\\git\\Hacker-Rank-Solution\\JavaPractice\\target\\sid.xlsx");
		try {
			FileInputStream fin=new FileInputStream(f);
			GetTheCellData(fin,0,0);
			GetTheCellAlpha(fin,0,"D");
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void GetTheCellData(FileInputStream fin, int rownum,int colnum) throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook(fin);
		XSSFSheet sheet=wb.getSheetAt(wb.getActiveSheetIndex());
		XSSFRow row=sheet.getRow(rownum);
		XSSFCell cell=row.getCell(colnum);
		System.out.println(cell.getStringCellValue());
	}
	private static void GetTheCellAlpha(FileInputStream fin, int rownum,String colnum) throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook(fin);
		XSSFSheet sheet=wb.getSheetAt(wb.getActiveSheetIndex());
		XSSFRow row=sheet.getRow(rownum);
		XSSFCell cell;
		for(int i=0;i<row.getLastCellNum();i++){
			cell=row.getCell(i);
			System.out.println(cell.getStringCellValue());
			
		}
		
	}

}
