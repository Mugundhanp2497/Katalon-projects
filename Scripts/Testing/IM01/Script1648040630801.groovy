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

WebUI.click(findTestObject('IMobj/ideas'))

WebUI.click(findTestObject('IMobj/go'))

WebUI.setText(findTestObject('IMobj/problemToSolve'), findTestData('IM01data').getValue(4, 1))

WebUI.switchToFrame(findTestObject('IMobj/iframe'), 0)

WebUI.setText(findTestObject('IMobj/body'), findTestData('IM01data').getValue(5, 1))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('IMobj/title'), findTestData('IM01data').getValue(6, 1))

WebUI.click(findTestObject('IMobj/submit idea'))

WebUI.setText(findTestObject('IMobj/members'), findTestData('IM01data').getValue(7, 1))

WebUI.setText(findTestObject('IMobj/skills'), findTestData('IM01data').getValue(8, 1))

WebUI.click(findTestObject('IMobj/team update'))

WebUI.setText(findTestObject('IMobj/tags'), findTestData('IM01data').getValue(9, 1))

WebUI.click(findTestObject('IMobj/select category'))

WebUI.click(findTestObject('IMobj/option'))

WebUI.click(findTestObject('IMobj/submit'))

