package amz.excelsheet; //Sheet is present inside next project, Selenium2 named as 'PriyankasExcelSheet'
//Apache POI jars needed for DDT concept
//For Amazon source and test
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DdtProgForAmzn 
{ 
	public static String un; //make it public because from different package we will access these 
	public static String pw;
	static FileInputStream f1;
	static Workbook w1;
    public static void FetchData() throws EncryptedDocumentException, IOException
     {
		f1=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\EclipseCopy.zip_expanded\\Selenium2\\PriyankasExc"
				+ "elSheet\\ExcelForDataDrivenTesting.xlsx");
		w1=WorkbookFactory.create(f1);
		un=w1.getSheet("Login_Cred").getRow(1).getCell(0).getStringCellValue();
	    pw= NumberToTextConverter.toText(w1.getSheet("Login_Cred").getRow(1).getCell(1).getNumericCellValue()); //converting numbers to string
		//pw=w1.getSheet("Login_Cred").getRow(1).getCell(1).getStringCellValue();
		System.out.println(un);
		System.out.println(pw);	
	}
}
