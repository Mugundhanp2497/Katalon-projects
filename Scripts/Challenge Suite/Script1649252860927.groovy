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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
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

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('challenge/challenge'))

WebUI.click(findTestObject('challenge/create challenge'))

Date latestdate = new Date()

CurrentEpoc = latestdate.getTime()

println(CurrentEpoc)

challengeName = ('Challenge' + CurrentEpoc)

WebUI.setText(findTestObject('challenge/title'), challengeName)

WebUI.switchToFrame(findTestObject('challenge/iframe'), 0)

WebUI.setText(findTestObject('challenge/body'), findTestData('Challnege Data').getValue(4, 1))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('challenge/tags'))

WebUI.click(findTestObject('challenge/tag1 college'))

WebUI.click(findTestObject('challenge/tag2 learning'))

WebUI.click(findTestObject('challenge/tag close'))

WebUI.click(findTestObject('challenge/category'))

WebUI.setText(findTestObject('challenge/start date'), findTestData('Challnege Data').getValue(5, 1))

WebUI.setText(findTestObject('challenge/end date'), findTestData('Challnege Data').getValue(6, 1))

WebUI.click(findTestObject('challenge/publish'))

WebUI.waitForPageLoad(5)

ChallengeName = WebUI.getText(findTestObject('full demo check/get challenge name'))

Challengename = ('Challenge Name :' + ChallengeName)

FileInputStream fis = new FileInputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

int k = 1

Workbook wb = new XSSFWorkbook(fis)

Sheet s = wb.getSheet('Sheet1')

s.getRow(23).getCell(2).setCellValue(Challengename)

s.getRow(25).getCell(2).setCellValue(Challengename)

s.getRow(27).getCell(2).setCellValue(Challengename)

FileOutputStream fos = new FileOutputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

wb.write(fos)

WebUI.setText(findTestObject('challenge/comment'), findTestData('Challnege Data').getValue(7, 1))

WebUI.click(findTestObject('challenge/comment post'))

WebUI.click(findTestObject('challenge/reply comment'))

WebUI.setText(findTestObject('challenge/reply comment words'), findTestData('Challnege Data').getValue(8, 1))

WebUI.click(findTestObject('challenge/reply comment post'))

WebUI.setText(findTestObject('challenge/comment'), findTestData('Challnege Data').getValue(7, 1))

WebUI.click(findTestObject('challenge/input__privacyType'))

WebUI.click(findTestObject('challenge/comment post'))

WebUI.click(findTestObject('challenge/reply comment'))

WebUI.setText(findTestObject('challenge/reply comment words'), findTestData('Challnege Data').getValue(8, 1))

WebUI.click(findTestObject('challenge/reply comment post'))

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('challenge/liike'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('challenge/whiteboard hyper link'))

WebUI.delay(15)

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

WebUI.takeScreenshot()

WebUI.click(findTestObject('whiteboard/program back whiteboard'))

