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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.datatransfer.DataFlavor as DataFlavor
import org.apache.poi.ss.usermodel.WorkbookFactory as WorkbookFactory


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


WebUI.openBrowser(findTestData('Challnege Data').getValue(1, 1))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('IMobj/email'), findTestData('Challnege Data').getValue(2, 1))

WebUI.click(findTestObject('IMobj/next'))

WebUI.setText(findTestObject('IMobj/password'), findTestData('Challnege Data').getValue(3, 1))

WebUI.click(findTestObject('IMobj/sign in'))

Date d = new Date()

String Epoc = d.getTime()

WebUI.click(findTestObject('whiteboard/test automation program'))

WebUI.click(findTestObject('My project/Me'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('whiteboard/whiteboard hyperLink'))

WebUI.click(findTestObject('whiteboard/create whiteboard'))

whiteboardName = ('My Board' + Epoc)

desc = whiteboardName



WebUI.setText(findTestObject('whiteboard/whiteboard name'), desc)

WebUI.setText(findTestObject('whiteboard/board description'), desc)

WebUI.click(findTestObject('whiteboard/board save'))

WebUI.delay(25)

WebUI.doubleClick(findTestObject('whiteboard/board'))

WebUI.click(findTestObject('whiteboard/sticky notes pen'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('whiteboard/sticky notes red color'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('whiteboard/sticky notes hyper'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.click(findTestObject('whiteboard/sticky notes pen'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('whiteboard/sticky notes blue color'))

WebUI.click(findTestObject('whiteboard/sticky notes hyper'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/pen'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/Logo'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/pen'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/More'))

WebUI.click(findTestObject('whiteboard/shapes'))

WebUI.click(findTestObject('whiteboard/square shape'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/pen'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/Logo'))

WebUI.click(findTestObject('whiteboard/shapes'))

WebUI.click(findTestObject('whiteboard/triangle shape'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/pen'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/Logo'))

WebUI.click(findTestObject('whiteboard/shapes'))

WebUI.click(findTestObject('whiteboard/circle shape'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/pen'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/Logo'))

WebUI.click(findTestObject('whiteboard/icons'))

WebUI.click(findTestObject('whiteboard/boy icon'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/pen'))

WebUI.click(findTestObject('whiteboard/icons'))

WebUI.click(findTestObject('whiteboard/girl icon'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/More'))

WebUI.click(findTestObject('whiteboard/icons'))

WebUI.click(findTestObject('whiteboard/delete icon'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/photo hyper'))

WebUI.click(findTestObject('whiteboard/icons'))

WebUI.click(findTestObject('whiteboard/fb icon'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/select hyper'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/select hyper'))

WebUI.click(findTestObject('whiteboard/icons'))

WebUI.click(findTestObject('whiteboard/google icon'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/select hyper'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/mini board'))

WebUI.click(findTestObject('whiteboard/icons'))

WebUI.click(findTestObject('whiteboard/instagram icon'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/select hyper'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/mini board'))

WebUI.click(findTestObject('whiteboard/More'))

WebUI.click(findTestObject('whiteboard/timer'))

WebUI.click(findTestObject('whiteboard/Increase Timer'))

WebUI.click(findTestObject('whiteboard/start Timer'))

WebUI.click(findTestObject('whiteboard/board'))

WebUI.click(findTestObject('whiteboard/pen'))

WebUI.click(findTestObject('whiteboard/pen black color'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/select hyper'))

WebUI.click(findTestObject('whiteboard/pen'))

WebUI.click(findTestObject('whiteboard/pen blue color'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/mini board'))

WebUI.doubleClick(findTestObject('whiteboard/pen'))

WebUI.click(findTestObject('whiteboard/red color'))

WebUI.dragAndDropToObject(findTestObject('whiteboard/board'), findTestObject('whiteboard/pen'))

WebUI.click(findTestObject('whiteboard/More'))

WebUI.click(findTestObject('whiteboard/celebrate'))

WebUI.click(findTestObject('whiteboard/show -hide'))

WebUI.click(findTestObject('whiteboard/show -hide'))

WebUI.click(findTestObject('whiteboard/More'))

WebUI.click(findTestObject('whiteboard/add template'))

String gh = 'My Template' + Epoc

Template='Save Template in Whiteboard : '+gh

WBName='White board Created, WB Name : ' + whiteboardName

FileInputStream fis = new FileInputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

int k = 1

Workbook wb = new XSSFWorkbook(fis)

Sheet s = wb.getSheet('Sheet1')

s.getRow(18).getCell(2).setCellValue(WBName)

s.getRow(20).getCell(2).setCellValue(Template)


FileOutputStream fos = new FileOutputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

wb.write(fos)

WebUI.setText(findTestObject('whiteboard/template name'), gh)

WebUI.click(findTestObject('whiteboard/select whiteboard global'))

WebUI.click(findTestObject('whiteboard/save template for this program'))

WebUI.click(findTestObject('whiteboard/template save'))

WebUI.click(findTestObject('whiteboard/photo hyper'))

WebUI.click(findTestObject('whiteboard/choose file'))

WebUI.delay(5)

String a = findTestData('Whiteboard').getValue('File location', 1)

Robot robot = new Robot()

StringSelection ss = new StringSelection(a)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('whiteboard/add to canvas'))

WebUI.delay(20)

WebUI.click(findTestObject('whiteboard/More'))

WebUI.click(findTestObject('whiteboard/Invite hyper'))

WebUI.click(findTestObject('whiteboard/copy link'))

String st = Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor)

WebUI.click(findTestObject('whiteboard/invate close button'))

WebUI.delay(5)

WebUI.takeScreenshot()

FileInputStream fin = new FileInputStream('C:\\katalon proojets\\InnovationMindTest1\\Excel\\Whiteboard.xlsx')

Workbook wb = WorkbookFactory.create(fin)

Sheet s = wb.getSheet('Sheet1')

Row r = s.createRow(2)

Cell c = r.createCell(0)

c.setCellValue(st)

FileOutputStream fout = new FileOutputStream('C:\\katalon proojets\\InnovationMindTest1\\Excel\\Whiteboard.xlsx')

wb.write(fout)

WebUI.click(findTestObject('whiteboard/whiteboard back'))

WebUI.takeScreenshot()

