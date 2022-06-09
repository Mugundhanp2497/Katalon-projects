import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import net.sf.jasperreports.j2ee.servlets.XlsServlet as XlsServlet
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions


import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import java.io.File as File
import java.io.IOException as IOException
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Sheet as Sheet
import org.apache.poi.ss.usermodel.Workbook as Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
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


WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/i_Events_fa fa-comments-o'))

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/button_Add New'))

Date latestdate = new Date()

CurrentEpoc = latestdate.getTime()

println(CurrentEpoc)

String title = 'Event  ' + CurrentEpoc

println(title)

WebUI.setText(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/input_Title_title'), title)

b = WebUI.getAttribute(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/input_Title_title'), 'value')

println(b)

String Path = findTestData('EventDetails').getValue('File Path', 1)

println(Path)

FileInputStream fis = new FileInputStream(Path)

XSSFWorkbook book = new XSSFWorkbook(fis)

XSSFSheet sh = book.getSheet('Sheet1')

XSSFRow r = sh.getRow(1)

XSSFCell c = r.getCell(3)

c.setCellValue(b)

FileOutputStream fos = new FileOutputStream(Path)

book.write(fos)

fos.close()

WebUI.setText(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/input_Venue_venue'), findTestData('EventDetails').getValue(
        'Venue', 1))

WebUI.setText(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/input_City_location'), findTestData('EventDetails').getValue(
        'Location', 1))

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/span_Event Start Date and Time_input-group-addon'))

String Smonth = findTestData('EventDetails').getValue('Start Month', 1)

String month1 = WebUI.getText(findTestObject('ImFileUpload/Page_Innovation Minds/th_Smonth'))

while (!(Smonth.equals(month1))) {
    WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/Next'))

    month1 = WebUI.getText(findTestObject('ImFileUpload/Page_Innovation Minds/th_Smonth'))
}

String Stdate = findTestData('EventDetails').getValue('Start Date', 1)

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/td_Sdate', [('Sdate') : Stdate]))

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/span_Event End Date and Time_input-group-addon'))

String Emonth = findTestData('EventDetails').getValue('End Month', 1)

String month2 = WebUI.getText(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/th_Emonth'))

while (!(Emonth.equals(month2))) {
    WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/Next2'))

    month2 = WebUI.getText(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/th_Emonth'))
}

Endate = findTestData('EventDetails').getValue('End Date', 1)

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/td_Edate', [('Edate') : Endate]))

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/input_Add To Upcoming Events_isUpcoming'))

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/div_Drop Images OR Click anywhere inside the box to upload Images'), 
    findTestData('EventDetails').getValue('File Location', 1))

WebUI.click(findTestObject('ImFileUpload/Page_Innovation Minds/button_Save'))

WebUI.click(findTestObject('ImFileUpload/Page_Innovation Minds/input_Paragraph_imgSubmit'))

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/span_Like'))

Eventname = WebUI.getText(findTestObject('full demo check/get challenge name'))

EventName = ('Event Name :' + Eventname)

FileInputStream fis1 = new FileInputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

int k = 1

Workbook wb1 = new XSSFWorkbook(fis1)

Sheet s = wb1.getSheet('Sheet1')

s.getRow(37).getCell(2).setCellValue(EventName)
s.getRow(38).getCell(2).setCellValue(EventName)
s.getRow(39).getCell(2).setCellValue(EventName)



FileOutputStream fos1 = new FileOutputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

wb1.write(fos1)


WebUI.setText(findTestObject('ImFileUpload/Page_Innovation Minds/span__tagify__input'), 'Test comments ')

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/button_Post'))

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/button_Reply Comments'))

WebUI.setText(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/span__tagify__input (1)'), 'test reply comment')

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/button_Post (1)'))

WebDriver d = DriverFactory.getWebDriver()

JavascriptExecutor js = ((d) as JavascriptExecutor)

WebElement changebtn = d.findElement(By.xpath('//button[@id=\'eventRsvpUpdate\']'))

js.executeScript('arguments[0].scrollIntoView(false)', changebtn)

WebUI.click(findTestObject('ImFileUpload/Page_Innovation Minds/button_Change RSVP'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('ImFileUpload/Page_Innovation Minds/button_Change RSVP'))

WebUI.takeFullPageScreenshot()

