package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String getTestData(int RowIndex,int ColumIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\SouceLab.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("DDF");
		String value = sheet.getRow(RowIndex).getCell(ColumIndex).getStringCellValue();
		return value;
	}
	public static void FailedTestCasesScreenshot(WebDriver driver,int TCID) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"\\FailedTestCasesScreenshot\\TestCase-"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
	public static String getDataFromPropertyFile(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\PropertyFile.properties");
		Properties prop=new Properties();
		prop.load(file);
		String value = prop.getProperty(key);
		return value;
	}


}
