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

WebUI.openBrowser('https://www.mailinator.com/v4/public/inboxes.jsp?to=testingIM2')

WebUI.maximizeWindow()

WebUI.doubleClick(findTestObject('Activation mail/inbox'))

WebUI.setText(findTestObject('Activation mail/inbox'), findTestData('RegistrationMailID').getValue('New Created ID', 1))

WebUI.click(findTestObject('Activation mail/Go'))

WebUI.delay(5)

WebUI.click(findTestObject('Activation mail/email'))

WebUI.switchToWindowTitle('Mailinator')

WebUI.switchToFrame(findTestObject('Activation mail/iframe'), 0)

WebUI.click(findTestObject('Activation mail/link'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowTitle('Innovation Minds')

WebUI.doubleClick(findTestObject('Activation mail/confirmation'))

j = WebUI.getText(findTestObject('Activation mail/confirmation'))

println(j)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Activation mail/sign in'))

WebUI.setText(findTestObject('IMobj/email'), findTestData('RegistrationMailID').getValue('New Created ID', 1))

WebUI.click(findTestObject('IMobj/next'))

WebUI.setEncryptedText(findTestObject('IMobj/password'), 'XAwCCXVtf52fWID5ckhaJA==')

WebUI.click(findTestObject('IMobj/sign in'))

WebUI.click(findTestObject('Activation mail/good mood'))

WebUI.click(findTestObject('Object Repository/User Upload- Super Admin/Page_Innovation Minds/span_Me'))

WebUI.delay(2)

WebUI.click(findTestObject('Login-Logout/a_Sign out'))

