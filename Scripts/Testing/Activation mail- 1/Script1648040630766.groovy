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

WebUI.openBrowser('https://www.mailinator.com/v4/public/inboxes.jsp?to=testingIM2')

WebUI.maximizeWindow()

WebUI.doubleClick(findTestObject('Object Repository/ActivationWithMood/Page_Mailinator/input_Public Messages_inbox_field'))

WebUI.setText(findTestObject('Object Repository/ActivationWithMood/Page_Mailinator/input_Public Messages_inbox_field'), 
    findTestData('RegistrationMailID').getValue('EnterpriseLevel', 1))

WebUI.click(findTestObject('Object Repository/ActivationWithMood/Page_Mailinator/button_GO'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Mailinator/Open Activation Email'))

WebUI.switchToWindowTitle('Mailinator')

WebUI.click(findTestObject('Object Repository/ActivationWithMood/Page_Mailinator/a_httpsqaautomation.innovationminds.comloginactivatef105451b60526b239591497f7e4ae45a72d90ff2'))

WebUI.doubleClick(findTestObject('Object Repository/ActivationWithMood/Page_Innovation Minds/h1_Confirmation'))

j = WebUI.getText(findTestObject('Object Repository/ActivationWithMood/Page_Innovation Minds/h1_Confirmation'))

println(j)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/ActivationWithMood/Page_Innovation Minds/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/ActivationWithMood/Page_Innovation Minds/input_Email_email'), findTestData(
        'RegistrationMailID').getValue('EnterpriseLevel', 1))

WebUI.click(findTestObject('Object Repository/ActivationWithMood/Page_Innovation Minds/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/ActivationWithMood/Page_Innovation Minds/input_Password_password'), 
    'XAwCCXVtf52fWID5ckhaJA==')

WebUI.click(findTestObject('Object Repository/ActivationWithMood/Page_Innovation Minds/button_Sign In'))

WebUI.click(findTestObject('Object Repository/ActivationWithMood/Page_Innovation Minds/div_Good_mood-icon'))

WebUI.click(findTestObject('Object Repository/ActivationWithMood/Page_Innovation Minds/span_Me'))

WebUI.click(findTestObject('Object Repository/ActivationWithMood/Page_Innovation Minds/a_Sign out'))

