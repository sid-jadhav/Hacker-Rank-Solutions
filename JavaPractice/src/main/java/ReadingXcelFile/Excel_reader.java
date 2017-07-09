package ReadingXcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_reader {
	public String path;
	FileInputStream fin;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public Excel_reader(String path){
		this.path=path;
		try {
			fin=new FileInputStream(path);
			workbook=new XSSFWorkbook(fin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Object getCellData(String sheetName, String colnum, int rownum){
		int index =workbook.getSheetIndex(sheetName);
		int col_num=0;
		sheet=workbook.getSheetAt(index);
		//getting column no.
		XSSFRow row=sheet.getRow(0);
		for(int i=0;i<row.getLastCellNum();i++){
			if(row.getCell(i).getStringCellValue().equals(colnum)){
				col_num=i;
			}
		}
		//getting row no.
		row=sheet.getRow(rownum-1);
		XSSFCell cell= row.getCell(col_num);
		
		if(cell.getCellType()==cell.CELL_TYPE_STRING){
			return cell.getStringCellValue();
		}else if(cell.getCellType()==cell.CELL_TYPE_BLANK){
			return "";
		}
		
		
		return null;
	}
	
	public static void main(String[] args){
		String path="C:\\Users\\LENOVO\\git\\Hacker-Rank-Solution\\JavaPractice\\target\\sid.xlsx";
		Excel_reader read=new Excel_reader(path);
		Object s=read.getCellData("Sheet1","A", 1);
		System.out.println(s+" "+read.getCellData("Sheet1","bbb1", 2)+" "+read.getCellData("Sheet1","A", 3));
		//System.out.println(System.getProperty("C:\\Users\\LENOVO\\git\\Hacker-Rank-Solution\\JavaPractice\\target\\sid.xlsx"));
		//System.out.println(System.getProperty("user.dir"));
	}
	
}
