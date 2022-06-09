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

WebUI.click(findTestObject('Object Repository/UserManagment-ProgLevel/Page_Innovation Minds/span_Me'))

WebUI.click(findTestObject('Object Repository/UserManagment-ProgLevel/Page_Innovation Minds/a_Admin'))

WebUI.click(findTestObject('Object Repository/UserManagment-ProgLevel/Page_Innovation Minds/a_User Management (includes GDPR)'))

WebUI.setText(findTestObject('Object Repository/UserManagment-ProgLevel/Page_Innovation Minds/input'), findTestData('Useruploadfile-Prog').getValue(
        'Email', 1))

WebUI.click(findTestObject('Object Repository/UserManagment-ProgLevel/Page_Innovation Minds/i_Active_fa fa-pencil-square-o fa-lg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/UserManagment-ProgLevel/Page_Innovation Minds/select_Admin     Program Manager     Judge _286dca'), 
    '800', true)

WebUI.click(findTestObject('Object Repository/UserManagment-ProgLevel/Page_Innovation Minds/input_Please specify User Role._saveButton'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/User Upload- Super Admin/Page_Innovation Minds/span_Me'))

WebUI.delay(2)

WebUI.click(findTestObject('Login-Logout/a_Sign out'))

