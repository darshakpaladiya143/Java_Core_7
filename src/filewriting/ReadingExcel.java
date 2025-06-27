package filewriting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File("C:\\FileWriting\\myExcelFile.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fi);
		
		Sheet sheet0 = workbook.getSheetAt(0);
		
		
		for(Row row : sheet0) {
			for(Cell cell:row) {
				
				switch(cell.getCellType()) {
				case STRING:
					 System.out.print("Cell Value :" + cell.getStringCellValue()+"\t");
			         break;
			         
			    case NUMERIC:
		             System.out.print("Cell Value: " + cell.getNumericCellValue()+"\t");
		             break;
		             
			    case BLANK : 
	                System.out.print("Blank Cell"+"\t");
	                break; 
		             
				}
				
				
			}
		}
		
		
		
		
		
		
		
		
//		Row row0 = sheet0.getRow(0);
//		Cell cellA = row0.getCell(0);
//		System.out.println(cellA);
		
		fi.close();
		
		
	}
}
