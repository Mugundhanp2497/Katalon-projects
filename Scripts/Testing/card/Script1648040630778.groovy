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

WebUI.click(findTestObject('My project/Me'))

WebUI.click(findTestObject('My project/Me,My project'))

WebUI.click(findTestObject('My project/Project name'))

WebUI.click(findTestObject('My project/Create'))

WebUI.setText(findTestObject('My project/Project Summary'), 'My Star Card ')

WebUI.switchToFrame(findTestObject('My project/iframe'), 0)

WebUI.setText(findTestObject('My project/Project Description'), 'My Star Card ')

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('My project/Task member'), 'a')

WebUI.click(findTestObject('My project/Member suggestion'))

WebUI.click(findTestObject('My project/Card type-epic'))

WebUI.click(findTestObject('My project/Priority'))

WebUI.setText(findTestObject('My project/Original Estimation'), '11:13:55')

WebUI.setText(findTestObject('My project/Progress'), '30')

WebUI.click(findTestObject('My project/Create Task-submit'))

