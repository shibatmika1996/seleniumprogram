package testNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writeExcel {
  @Test
  public void test() throws IOException {
	  
	  
 File src=new File("C:\\Users\\A08019DIRP_C2C.02.02\\Documents\\SelExcel\\excelprog.xlsx");
	  
	  FileInputStream fis=new FileInputStream(src);
	  
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	sheet1.getRow(0).createCell(2).setCellValue("pass");
	sheet1.getRow(1).createCell(2).setCellValue("fail");
	
	FileOutputStream fo=new FileOutputStream(src);
	wb.write(fo);
	wb.close();
  }
}
