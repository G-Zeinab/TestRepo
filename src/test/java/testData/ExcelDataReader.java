package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader 
{
	static FileInputStream fis =null;
	
	public Object [][] getExcelData () throws FileNotFoundException
	
	{
		String filepath = System.getProperty("user.dir")+ "//TestData//";
		File scrfile = new File(filepath);
		fis = new FileInputStream(scrfile);
		return arrExcel;
	}
         XSSFWorkbook wb = new XSSFWorkbook(fis);
         XSSFSheet sheet = wb.getSheetAt(0);
		 int TotalRows = sheet.getLastRowNum()+1;
		 int TotalColm= 9;
		 String [][]arrExcel = new String [TotalRows][TotalColm];
		private int row1;

		{
			{
		
		 for(int row=1;row<TotalRows;row ++)
		 {
			 
			 
		 }
			 for(int col=1;col<TotalColm;col++)
			 {
				 XSSFRow rowsh = sheet.getRow(row1);
                 arrExcel[row1][col]= rowsh.getCell(col).toString();
										 
		 }	 

}
		

}
}

