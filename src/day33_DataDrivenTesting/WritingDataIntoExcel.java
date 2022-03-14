package day33_DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file=new FileOutputStream("/Users/danielavazquez/SeleniumPractice/testdata.xlsx"); //creates a file
		XSSFWorkbook workbook=new XSSFWorkbook(); //create a workbook
		XSSFSheet sheet=workbook.createSheet("Data1"); //create a sheet
		
		
		//for same data
		/*for(int r=0;r<5;r++) //create row
		{
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<3;c++) //create cell and enter data
			{
				
				row.createCell(c).setCellValue("welcome"); //creating cell and setting cell value
			}
		}
	
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("You're Done!");*/
		
		
		
		//for different data
		
		Scanner sc=new Scanner(System.in);
		
		for(int r=0;r<5;r++) //create row
		{
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<3;c++) //create cell and enter data
			{
				System.out.println("Enter an Input Value:");
				row.createCell(c).setCellValue(sc.next()); //creating cell and setting cell value
			}
		}
	
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("You're Done!");
	}

}
