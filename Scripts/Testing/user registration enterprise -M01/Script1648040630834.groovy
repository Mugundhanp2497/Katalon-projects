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
import org.apache.poi.ss.usermodel.Sheet as Sheet
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Workbook as Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory as WorkbookFactory

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

WebUI.openBrowser('https://qaautomation.innovationminds.com/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('user register enterprise/sign up'))

Date latestdate = new Date()

CurrentEpoc = latestdate.getTime()

println(CurrentEpoc)

a = ('autosignup' + CurrentEpoc)

println(a)

b = '@mailinator.com'

m = (a + b)

println(m)

WebUI.setText(findTestObject('user register enterprise/email'), m)

WebUI.setText(findTestObject('user register enterprise/first name'), 'Automation')

l = ('ID' + CurrentEpoc)

WebUI.setText(findTestObject('user register enterprise/last name'), l)

WebUI.setText(findTestObject('user register enterprise/Preffered name'), 'AutoID')

WebUI.setEncryptedText(findTestObject('user register enterprise/create password'), 'XAwCCXVtf52fWID5ckhaJA==')

WebUI.click(findTestObject('user register enterprise/company'))

WebUI.click(findTestObject('user register enterprise/location'))

WebUI.click(findTestObject('user register enterprise/nation'))

WebUI.click(findTestObject('user register enterprise/create account'))

WebUI.doubleClick(findTestObject('user register enterprise/thank you'))

f = WebUI.getText(findTestObject('user register enterprise/thank you'))

println(f)

g = 'Thank You For Signing Up!'

//WebUI.verifyMatch(f, g, true)
WebUI.takeScreenshot()

FileInputStream fis = new FileInputStream('C://katalon proojets//InnovationMindTest1//Excel//Register Mail id.xlsx')

 Workbook wb = new XSSFWorkbook(fis)

Sheet s = wb.getSheet('Registration Mail ID')

Row r = s.createRow(1)

Cell c = r.createCell(1)

c.setCellValue(m)

FileOutputStream fos = new FileOutputStream('C://katalon proojets//InnovationMindTest1//Excel//Register Mail id.xlsx')

wb.write(fos)

