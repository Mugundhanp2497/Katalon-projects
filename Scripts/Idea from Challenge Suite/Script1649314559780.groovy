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

WebUI.click(findTestObject('challenge/submit idea'))

Date latestdate = new Date()

CurrentEpoc = latestdate.getTime()

IdeaName = ('Challenge Idea' + CurrentEpoc)

WebUI.setText(findTestObject('IMobj/problemToSolve'), IdeaName)

WebUI.switchToFrame(findTestObject('IMobj/iframe'), 0)

WebUI.setText(findTestObject('IMobj/body'), findTestData('Challnege Data').getValue(9, 1))

WebUI.switchToDefaultContent()

IdeaTitle = (findTestData('Challnege Data').getValue(10, 1) + CurrentEpoc)

WebUI.setText(findTestObject('IMobj/title'), IdeaTitle)

WebUI.click(findTestObject('IMobj/submit idea'))

WebUI.setText(findTestObject('IMobj/members'), findTestData('Challnege Data').getValue(11, 1))

WebUI.click(findTestObject('IMobj/member sugestion 1'))

WebUI.setText(findTestObject('IMobj/members'), findTestData('Challnege Data').getValue(11, 1))

WebUI.click(findTestObject('IMobj/member sugestion 2'))

WebUI.setText(findTestObject('IMobj/skills'), findTestData('Challnege Data').getValue(12, 1))

WebUI.click(findTestObject('IMobj/member sugestion 1'))

//WebUI.click(findTestObject('IMobj/member Add'))
WebUI.click(findTestObject('IMobj/team update'))

WebUI.click(findTestObject('IMobj/select category'))

WebUI.setText(findTestObject('IMobj/tags'), findTestData('Challnege Data').getValue(13, 1))

WebUI.click(findTestObject('IMobj/option'))

WebUI.click(findTestObject('IMobj/submit'))

IdeaChallengeName = WebUI.getText(findTestObject('full demo check/get challenge name'))


IdeaName = ('Idea Name :' + IdeaChallengeName)

FileInputStream fis = new FileInputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

int k = 1

Workbook wb = new XSSFWorkbook(fis)

Sheet s = wb.getSheet('Sheet1')

s.getRow(26).getCell(2).setCellValue(IdeaName)

FileOutputStream fos = new FileOutputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Sanity Document.xlsx')

wb.write(fos)

WebUI.setText(findTestObject('IMobj/idea-comment'), findTestData('Challnege Data').getValue(14, 1))

WebUI.click(findTestObject('IMobj/private comment'))

WebUI.click(findTestObject('IMobj/comment post'))

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('IMobj/like'))

WebUI.click(findTestObject('IMobj/subscribe'))

WebUI.setText(findTestObject('IMobj/Ideation'), findTestData('Idea Score data').getValue(1, 1))

WebUI.setText(findTestObject('IMobj/Speed dating'), findTestData('Idea Score data').getValue(2, 1))

WebUI.setText(findTestObject('IMobj/Designation'), findTestData('Idea Score data').getValue(3, 1))

WebUI.setText(findTestObject('IMobj/Makeathon'), findTestData('Idea Score data').getValue(4, 1))

WebUI.setText(findTestObject('IMobj/Shark tank'), findTestData('Idea Score data').getValue(5, 1))

WebUI.setText(findTestObject('IMobj/Awardathon'), findTestData('Idea Score data').getValue(6, 1))

WebUI.scrollToPosition(0, 5)

WebUI.setText(findTestObject('IMobj/Effort'), findTestData('Idea Score data').getValue(7, 1))

WebUI.setText(findTestObject('IMobj/Impact'), findTestData('Idea Score data').getValue(8, 1))

WebUI.click(findTestObject('IMobj/vote star'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('whiteboard/whiteboard hyper link-2'))

WebUI.delay(15)

WebUI.takeScreenshot()

WebUI.click(findTestObject('whiteboard/program back whiteboard'))

