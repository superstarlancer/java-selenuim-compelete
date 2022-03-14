package day33_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//File >Workbook>Sheets>Rows>Cells
public class ReadingExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("/Users/danielavazquez/SeleniumPractice/data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int totalrows =sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Rows:\s"+totalrows); //5
		System.out.println("Columns:\s"+totalcells); //4
		
		
		for(int r=0;r<=totalrows;r++) //rows
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++) //columns 0 1 2 3 start from 0 we will get 4 cells
			{
				XSSFCell cell=currentrow.getCell(c);
				System.out.println(cell.toString());
			}
		}
		
		workbook.close();
		file.close(); //close the file and clear the memory

	}

}
