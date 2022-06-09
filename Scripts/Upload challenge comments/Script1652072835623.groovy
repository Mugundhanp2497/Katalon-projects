import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.io.File as File
import java.io.IOException as IOException
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Sheet as Sheet
import org.apache.poi.ss.usermodel.Workbook as Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.poi.hssf.usermodel.HSSFWorkbook as HSSFWorkbook
import java.io.FileOutputStream as FileOutputStream
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.*
import java.util.*
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import java.awt.*
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import java.awt.AWTException as AWTException
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.interactions.*
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import com.kms.katalon.core.annotation.Keyword as Keyword
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.testdata.reader.CSVReader as CSVReader
import com.kms.katalon.core.testdata.reader.CSVSeparator as CSVSeparator
import com.kms.katalon.core.testdata.reader.CsvWriter as CsvWriter
import org.apache.commons.io.FileUtils as FileUtils
import org.apache.poi.ss.usermodel.WorkbookFactory as WorkbookFactory

WebUI.click(findTestObject('challenge/challenge'))

WebDriver d = DriverFactory.getWebDriver()

File file = new File('C:/Hajira/Im Testing/Automation- IM/IM-Automation/Excel/Challenge_Template.csv')

filepath = file.getAbsolutePath().toString()

CSVReader csvreader = new CSVReader(filepath, CSVSeparator.COMMA, true)

int columncount = csvreader.columnCount

String[] columnnames = csvreader.columnNames

List data = csvreader.data.get(0)

Map m = new HashMap<String, String>()

for (int i = 0; i < columncount; i++) {
    m.put(columnnames[i], data.get(i))
}

int k = 2

File commentfile = new File('C:/Hajira/Im Testing/Automation- IM/IM-Automation/Excel/Challenge_Comments_Template.csv')

String commentfilepath = commentfile.getAbsolutePath().toString()

CSVReader commentreader = new CSVReader(commentfilepath, CSVSeparator.COMMA, true)

String[] str = commentreader.columnNames

int commentcolumncount = commentreader.columnCount

String header = ''

for (int i = 0; i < commentcolumncount; i++) {
    header = ((header + (str[i])) + ',')
}

SimpleDateFormat z = new SimpleDateFormat('dd-MMMM-yy')

String todaydate = z.format(new Date()).toString()

List a = d.findElements(By.xpath('//div[@class=\'problem-title\']'))

FileWriter writer = new FileWriter(commentfile, false)

writer.append(header)

writer.append('\n')

for (int i = 0; i < 6; i++) {
    WebElement x1 = a.get(i)

    String b = x1.getText()

    String[] c = b.split('-')

    String e = c[0]

    println(e)

    writer.append((((((((m.get('owner') + ',') + todaydate) + ',') + 'comment') + ',') + 'no') + ',') + e)

    writer.append('\n')
}

writer.close()

WebUI.click(findTestObject('My project/Me'))

WebUI.click(findTestObject('survey/admin'))

WebUI.click(findTestObject('upload challenge/upload challenge'))

WebUI.click(findTestObject('upload challenge/click to upload comments'))

WebUI.delay(5)

String sm = findTestData('upload challenge').getValue('Comment path', 1)

StringSelection ss = new StringSelection(sm)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('upload challenge/upload comment submit'))

WebUI.click(findTestObject('upload challenge/upload challenge last submit'))

WebUI.click(findTestObject('challenge/challenge'))

//PageFactory.InitElements(d,this);
List K1 = d.findElements(By.xpath('//div[@class=\'problem-title\']'))

WebElement K2 = K1.get(0)

K2.click()

WebUI.scrollToElement(findTestObject('challenge/comment post'), 0)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('challenge/challenge'))

