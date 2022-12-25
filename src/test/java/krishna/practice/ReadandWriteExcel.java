package krishna.practice;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadandWriteExcel {

public static void main(String []args) throws IOException{
 

 // Specify the path of file
 File src=new File(".//driver//data.xlsx");

// load file
 FileInputStream fis=new FileInputStream(src);

// Load workbook
 XSSFWorkbook wb=new XSSFWorkbook(fis);
 
 // Load sheet- Here we are loading first sheetonly
  XSSFSheet sh1= wb.getSheet("TC1");
  
  String value=sh1.getRow(1).getCell(0).getStringCellValue();
  
  System.out.println(value);

  
  sh1.getRow(0).createCell(2).setCellValue("2.41.0");
  
  sh1.getRow(1).createCell(2).setCellValue("2.5");
  


 // here we need to specify where you want to save file
  
  FileOutputStream fout=new FileOutputStream(new File(".//driver//data1.xlsx"));
  
  
 // finally write content 
  
  wb.write(fout);
  
 // close the file
  
  fout.close();

 
 
}

}