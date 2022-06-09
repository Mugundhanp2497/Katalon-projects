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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser(findTestData('Login').getValue('URL', 1))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login-Logout/input_Email_email'), findTestData('Login').getValue('Username', 1))

WebUI.click(findTestObject('Login-Logout/button_Next'))

WebUI.setEncryptedText(findTestObject('Login-Logout/input_Password_password'), findTestData('Login').getValue('Password', 
        1))

WebUI.click(findTestObject('Login-Logout/button_Sign In'))

WebUI.click(findTestObject('Object Repository/User Upload-Program Level/Page_Innovation Minds/div_Your Engagement Trend_cssClass0'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/User Upload-Program Level/Page_Innovation Minds/span_Me'))

WebUI.click(findTestObject('Object Repository/User Upload-Program Level/Page_Innovation Minds/a_Admin'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/User Upload-Program Level/Page_Innovation Minds/a_Upload Users (CSV File)'))

WebUI.uploadFile(findTestObject('Object Repository/User Upload-Program Level/Page_Innovation Minds/input_Click Here to Upload_uploadImageDocs'), 
    findTestData('UserUpload').getValue('EnterPrise File', 3))

WebUI.click(findTestObject('User Upload-Program Level/Page_Innovation Minds/send welcome mail'))

WebUI.click(findTestObject('User Upload-Program Level/Page_Innovation Minds/Submit Button-Prog'))

WebUI.takeScreenshot()

