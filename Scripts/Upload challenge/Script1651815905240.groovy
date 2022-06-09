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
import org.openqa.selenium.Keys as Keys
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

WebUI.openBrowser(findTestData('Challnege Data').getValue(1, 1))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('IMobj/email'), findTestData('Challnege Data').getValue(2, 1))

WebUI.click(findTestObject('IMobj/next'))

WebUI.setText(findTestObject('IMobj/password'), findTestData('Challnege Data').getValue(3, 1))

WebUI.click(findTestObject('IMobj/sign in'))

WebUI.click(findTestObject('upload challenge/testing automation'))

WebUI.click(findTestObject('My project/Me'))

WebUI.click(findTestObject('survey/admin'))

WebUI.click(findTestObject('upload challenge/upload challenge'))

//WebUI.click(findTestObject('upload challenge/download challenge template'))

WebUI.click(findTestObject('upload challenge/click to upload challenge'))

WebDriver Driver = DriverFactory.getWebDriver()

Robot robot = new Robot()

FileInputStream fis = new FileInputStream('C:/Hajira/Im Testing/Automation- IM/IM-Automation/Excel/upload challenge.xlsx')

Workbook wb = new XSSFWorkbook(fis)

Sheet s = wb.getSheet('challenge sheet')

Row r1 = s.getRow(1)

Cell c1 = r1.getCell(1)

println(c1)

String a = c1.getStringCellValue()

StringSelection ss = new StringSelection(a)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('upload challenge/challenge upload submit'))

WebUI.click(findTestObject('upload challenge/upload challenge last submit'))

