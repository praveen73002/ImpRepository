package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RWExel {
	
	
	public String[][] getExcelData(String filePath,String fileName,String sheetName){
		String[][] arrayExcelData = null;		
		int records=0;

		try{
		File file =new File(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook wb = null;

		wb=new XSSFWorkbook(inputStream);

		Sheet sh=wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
		int totalNoOfCols =sh.getRow(0).getLastCellNum() ;
		
		arrayExcelData = new String[rowCount+1][totalNoOfCols];
System.out.println(rowCount+1+"***********"+totalNoOfCols);
		for (int i = 0; i < rowCount+1; i++) {
			
			 Row row = sh.getRow(i);
			 
			 for (int j = 0; j <row.getLastCellNum(); j++) {
				 //System.out.print(row.getCell(j).getStringCellValue()+"|| ");
				 
				 DataFormatter formatter = new DataFormatter();
				// String val = formatter.formatCellValue(sheet.getRow(col).getCell(row));
				 arrayExcelData[i][j]=formatter.formatCellValue(row.getCell(j));
				 
				 
				//arrayExcelData[i][j]=row.getCell(j).getStringCellValue();    //Original

			 }
			// System.out.println("");
			// System.out.println("@"+i+"   row" );
			 records++;
		}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	//	System.out.println("---------------------------------------------------------");
	//	System.out.println(records);

		return arrayExcelData;
	}
	 

}
