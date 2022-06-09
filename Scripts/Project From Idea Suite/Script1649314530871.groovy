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


c = 'Team Project'

Date latestdate = new Date()

CurrentEpoc = latestdate.getTime()

d = (c + CurrentEpoc)

WebUI.click(findTestObject('IMobj/create project'))

WebUI.setText(findTestObject('project/project name'), d)

WebUI.setText(findTestObject('project/short key'), findTestData('Challnege Data').getValue(15, 1))

WebUI.setText(findTestObject('project/intend to manage'), findTestData('Challnege Data').getValue(16, 1))

WebUI.setText(findTestObject('project/description'), findTestData('Challnege Data').getValue(17, 1))

WebUI.setText(findTestObject('project/list name'), findTestData('Challnege Data').getValue(18, 1))

WebUI.click(findTestObject('project/Resolution list name'))

WebUI.setText(findTestObject('project/start date'), findTestData('Challnege Data').getValue(19, 1))

WebUI.setText(findTestObject('project/end date'), findTestData('Challnege Data').getValue(20, 1))

WebUI.setText(findTestObject('project/estimated budget'), findTestData('Challnege Data').getValue(21, 1))

WebUI.setText(findTestObject('project/actual budget'), findTestData('Challnege Data').getValue(22, 1))

WebUI.setText(findTestObject('project/estimated effort'), findTestData('Challnege Data').getValue(23, 1))

WebUI.setText(findTestObject('project/actual effort'), findTestData('Challnege Data').getValue(24, 1))

WebUI.click(findTestObject('project/high priority'))

WebUI.click(findTestObject('project/status-inTesting'))

WebUI.click(findTestObject('project/funded'))

WebUI.setText(findTestObject('project/admins'), findTestData('Challnege Data').getValue(25, 1))

WebUI.click(findTestObject('project/admin suggestion'))

WebUI.click(findTestObject('project/save'))

ProjectName = ('Project Name :' + d)

FileInputStream fis = new FileInputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

int k = 1

Workbook wb = new XSSFWorkbook(fis)

Sheet s = wb.getSheet('Sheet1')

s.getRow(7).getCell(2).setCellValue(ProjectName)



FileOutputStream fos = new FileOutputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

wb.write(fos)


WebUI.click(findTestObject('My project/Create'))

WebUI.setText(findTestObject('My project/Project Summary'), findTestData('Challnege Data').getValue(27, 1))

WebUI.switchToFrame(findTestObject('My project/iframe'), 0)

WebUI.setText(findTestObject('My project/Project Description'), findTestData('Challnege Data').getValue(27, 1))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('My project/Task member'), findTestData('Challnege Data').getValue(28, 1))

WebUI.click(findTestObject('My project/Member suggestion'))

WebUI.click(findTestObject('My project/Card type-epic'))

WebUI.click(findTestObject('My project/Priority'))

WebUI.setText(findTestObject('My project/Original Estimation'), findTestData('Challnege Data').getValue(29, 1))

WebUI.setText(findTestObject('My project/Progress'), findTestData('Challnege Data').getValue(30, 1))

WebUI.click(findTestObject('My project/Create Task-submit'))

WebUI.takeScreenshot()

