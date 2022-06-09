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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
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

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/i_Events_fa fa-comments-o'))

WebUI.click(findTestObject('Object Repository/ImFileUpload/Page_Innovation Minds/button_Add New'))

Date latestdate = new Date()

CurrentEpoc = latestdate.getTime()

println(CurrentEpoc)

String title = 'Event  ' + CurrentEpoc

WebUI.setText(findTestObject('Event/Page_Innovation Minds/Title'), title)

WebUI.setText(findTestObject('Event/Page_Innovation Minds/venue'), 'Zoom')

WebUI.setText(findTestObject('Event/Page_Innovation Minds/Location'), 'Chennai')

WebUI.click(findTestObject('Event/Page_Innovation Minds/is upcoming'))

WebUI.click(findTestObject('Event/Page_Innovation Minds/upload image'))

WebUI.delay(5)

Robot robot = new Robot()

String a = findTestData('EventDetails').getValue('File Location', 1)

StringSelection ss = new StringSelection(a)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Event/Page_Innovation Minds/image save'))

WebUI.click(findTestObject('Event/Page_Innovation Minds/save event'))

Eventname = WebUI.getText(findTestObject('full demo check/get challenge name'))

EventName = ('Event Name :' + Eventname)

FileInputStream fis1 = new FileInputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

int k = 1

Workbook wb1 = new XSSFWorkbook(fis1)

Sheet s1 = wb1.getSheet('Sheet1')

s1.getRow(36).getCell(2).setCellValue(EventName)

FileOutputStream fos1 = new FileOutputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

wb1.write(fos1)

WebUI.click(findTestObject('Event/Page_Innovation Minds/event like'))

WebUI.setText(findTestObject('Event/Page_Innovation Minds/event comment'), 'good')

WebUI.click(findTestObject('Event/Page_Innovation Minds/post'))

WebUI.click(findTestObject('Event/Page_Innovation Minds/reply comment'))

WebUI.setText(findTestObject('Event/Page_Innovation Minds/event comment 2'), 'new good')

WebUI.click(findTestObject('Event/Page_Innovation Minds/reply post'))

WebUI.scrollToPosition(0, 5)

WebUI.takeScreenshot()

