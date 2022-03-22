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
		
		XSSFWorkbook  workbook=new XSSFWorkbook(); //create a workbook
		XSSFSheet sheet=workbook.createSheet("Data"); //create a sheet
 		
		//same data
		/*for(int r=0;r<5;r++)  //create row
		{
			XSSFRow row=sheet.createRow(r); //create cell and enter data
			
			for(int c=0;c<3;c++)
			{
				row.createCell(c).setCellValue("welcome");//creating cell and setting cell value
			}
		}*/

		
		//different data
		Scanner sc=new Scanner(System.in);
		
		for(int r=0;r<3;r++)
		{
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<2;c++)
			{				
				System.out.println("enter a input value:");
				row.createCell(c).setCellValue(sc.next());
			}
		}

		
		
		workbook.write(file); //this updates the file
		workbook.close(); //this closes the file and memory 
		file.close(); //this closes the file and memory
		
		System.out.println("Done!!!!");
		
		
		
	}

}
