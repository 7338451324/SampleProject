package mcaProtect;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BuildExeecute {
	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes", "unused", "resource" })
	public static void main(String[] args) throws Exception {
		Keywords key = new Keywords();
		ArrayList al = new ArrayList();
		FileInputStream file = new FileInputStream("C:\\Users\\AL1694\\Desktop\\SampleData\\McapTestdata.xlsx");
		XSSFWorkbook wbks = new XSSFWorkbook(file);
		Sheet s = wbks.getSheet("SignInTestData");
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Row rowitr = (Row)itr.next();
			Iterator cellitr = rowitr.cellIterator();
			while(cellitr.hasNext()) {
				Cell celldata = (Cell) cellitr.next();
				switch(celldata.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					al.add(celldata.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					al.add(celldata.getNumericCellValue());
					break;
				}
				
			}
			
			
		}
		for(int i=0;i<al.size();i++) {
			if(al.get(i).equals("openBrowser")) {
				String keywords = (String) al.get(i);
				String data = (String) al.get(i+1);
				String objectName = (String) al.get(i+2);
				String runMode = (String) al.get(i+3);
				System.out.println(keywords);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runMode);
				if(runMode.equals("Yes")) {
					key.openBrowser();
					
				}
				
			}
			if(al.get(i).equals("navigate")) {
				String keywords = (String) al.get(i);
				String data = (String) al.get(i+1);
				String objectName = (String) al.get(i+2);
				String runMode = (String) al.get(i+3);
				System.out.println(keywords);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runMode);
				if(runMode.equals("Yes")) {
					key.navigate(data);
				}
				
			}
			if(al.get(i).equals("input")) {
				String keywords = (String) al.get(i);
				String data = (String) al.get(i+1);
				String objectName = (String) al.get(i+2);
				String runMode = (String) al.get(i+3);
				System.out.println(keywords);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runMode);
				if(runMode.equals("Yes")) {
					key.input(data,objectName);
				}
			}
			if(al.get(i).equals("inputPhoneNo")) {
				String keywords = (String) al.get(i);
				String data = (String) al.get(i+1);
				String objectName = (String) al.get(i+2);
				String runMode = (String) al.get(i+3);
				System.out.println(keywords);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runMode);
				if(runMode.equals("Yes")) {
					key.inputPhoneNo();
				}
			}
			if(al.get(i).equals("click")) {
				String keywords = (String) al.get(i);
				String data = (String) al.get(i+1);
				String objectName = (String) al.get(i+2);
				String runMode = (String) al.get(i+3);
				System.out.println(keywords);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runMode);
				if(runMode.equals("Yes")) {
					key.click(objectName);
				}
			}
			
			
			
			
		}
		
		
	}

}
