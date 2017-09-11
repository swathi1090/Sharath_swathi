package DataDriven_FW;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Methods.OrgMaster;

public class ExcelOps {

	public static void main(String[] args) throws IOException  {
		
		String xlpath ="C:\\code repository\\Selenium Projects\\src\\com\\Selenium\\ExcelData\\TestData.xlsx";
		String xout = "C:\\code repository\\Selenium Projects\\src\\com\\Selenium\\Resutls\\Empres.xlsx";
		FileInputStream fi = new FileInputStream(xlpath);
		
		OrgMaster om = new OrgMaster();
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
		//XSSFRow r = ws.getRow(5);
		//XSSFCell c= r.getCell(0);
		
		//System.out.println(c.getStringCellValue());
		int rl = ws.getLastRowNum();
		System.out.println(rl);
		/*XSSFRow r= ws.getRow(1);
		int cc =r.getLastCellNum();
		System.out.println(cc);
		

	*/
		
		om.launch("http://opensource.demo.orangehrmlive.com");
		om.Login("Admin", "admin");
		
		for (int i = 1; i <= rl; i++) {
			
			XSSFRow r= ws.getRow(i);
			XSSFCell c = r.getCell(0);
			XSSFCell c1 = r.getCell(1);
			XSSFCell c2 = r.createCell(2);
			
			String f =c.getStringCellValue();
			String l = c1.getStringCellValue();
			
			System.out.println(f +"   "+l);
			
			String res =om.Empreg(f, l);
			c2.setCellValue(res);
			
		}
		om.Logout();
		om.close();
		FileOutputStream fo = new FileOutputStream(xout);
		wb.write(fo);
		
		wb.close();
		

	}

}
