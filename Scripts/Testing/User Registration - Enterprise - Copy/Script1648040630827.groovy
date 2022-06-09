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

WebUI.click(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/a_Sign Up Here'))

Date latestdate = new Date()

CurrentEpoc = latestdate.getTime()

println(CurrentEpoc)

a = ('autosignup' + CurrentEpoc)

println(a)

b = '@mailinator.com'

c = (a + b)

println(c)

WebUI.setText(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/input_Your Email _email'), c)

WebUI.setText(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/input_Your First Name _firstName'), 
    'Automation')

WebUI.setText(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/input_Your Last Name _lastName'), 
    'ID')

WebUI.setText(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/input_Your Preferred Name _prefName'), 
    'AutoID')

WebUI.setEncryptedText(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/input_Create a Password _password'), 
    'XAwCCXVtf52fWID5ckhaJA==')

WebUI.selectOptionByValue(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/select_SelectOtherAlphIndInnovation MIndsRed Bull'), 
    'AlphInd', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/select_SelectOtherChennaiFremontSanta Monica'), 
    'Chennai', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/select_SelectOtherIndiaUSA'), 
    'India', true)

WebUI.click(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/input_Country_btn btn-primary btn-signup'))

WebUI.doubleClick(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/h1_Thank You For Signing Up'))

f = WebUI.getText(findTestObject('Object Repository/User-Reg-EnterPrise/Page_Innovation Minds/h1_Thank You For Signing Up'))

println(f)

g = 'Thank You For Signing Up!'

WebUI.verifyMatch(f, g, true)

WebUI.takeScreenshot()

