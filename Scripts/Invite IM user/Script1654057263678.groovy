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

WebUI.openBrowser(findTestData('Whiteboard').getValue('File location', 2))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('whiteboard/Invite email'), findTestData('Whiteboard').getValue('File location', 6))

WebUI.delay(5)

WebUI.setText(findTestObject('IMobj/password'), findTestData('Challnege Data').getValue(3, 1))

WebUI.click(findTestObject('IMobj/sign in'))

WebUI.delay(15)

WebUI.doubleClick(findTestObject('whiteboard/board'))

WebUI.delay(5)

WebUI.click(findTestObject('whiteboard/vote'))

WebUI.click(findTestObject('whiteboard/start vote'))

Date d = new Date()

String Epoc = d.getTime()

voteSession = ('Vote' + Epoc)

WebUI.setText(findTestObject('whiteboard/vote session name'), voteSession)

WebUI.click(findTestObject('whiteboard/vote session next'))

WebUI.doubleClick(findTestObject('whiteboard/board'))

WebUI.delay(10)

WebUI.click(findTestObject('whiteboard/end voting'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('whiteboard/vote close'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('whiteboard/whiteboard back'))

WebUI.takeScreenshot()

