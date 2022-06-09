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

WebUI.openBrowser(findTestData('Login').getValue('URL', 1))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login-Logout/input_Email_email'), findTestData('Login').getValue('Username', 1))

WebUI.click(findTestObject('Login-Logout/button_Next'))

WebUI.setEncryptedText(findTestObject('Login-Logout/input_Password_password'), findTestData('Login').getValue('Password', 
        1))

WebUI.click(findTestObject('Login-Logout/button_Sign In'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/User Upload- Super Admin/Page_Innovation Minds/span_Me'))

WebUI.click(findTestObject('Object Repository/User Upload- Super Admin/Page_Innovation Minds/a_Super Admin'))

WebUI.click(findTestObject('Object Repository/UserManagment-SuperAdmin/Page_Innovation Minds/a_User Management (includes GDPR)'))

WebUI.setText(findTestObject('Object Repository/UserManagment-SuperAdmin/Page_Innovation Minds/input'), findTestData('Useruploadfile-Enterprise').getValue(
        'Email', 1))

WebUI.click(findTestObject('Object Repository/UserManagment-SuperAdmin/Page_Innovation Minds/i_Active_fa fa-pencil-square-o fa-lg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/UserManagment-SuperAdmin/Page_Innovation Minds/select_YesNo'), 
    'true', true)

WebUI.click(findTestObject('Object Repository/UserManagment-SuperAdmin/Page_Innovation Minds/input_Please select IsSuperAdmin._saveButton'))

WebUI.click(findTestObject('Object Repository/UserManagment-SuperAdmin/Page_Innovation Minds/div_Manage User Account Super AdminPlatform_6cde41'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/User Upload- Super Admin/Page_Innovation Minds/span_Me'))

WebUI.delay(2)

WebUI.click(findTestObject('Login-Logout/a_Sign out'))

WebUI.delay(2)

