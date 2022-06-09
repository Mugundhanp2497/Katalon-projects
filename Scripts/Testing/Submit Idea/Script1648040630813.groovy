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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qaautomation.innovationminds.com/login')

WebUI.setText(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_Email_email'), findTestData('Login').getValue(
        'Username', 1))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_Password_password'), 'XAwCCXVtf52fWID5ckhaJA==')

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/div_Your Engagement Trend_cssClass0'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/a_Ideas'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/a_Go'))

WebUI.setText(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/textarea_A description of the problem in a _d0b963'), 
    'Automationed Idea')

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/div_Quickly explain your Idea. If you only _667fc1'))

WebUI.setText(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_In 2-3 words, what would you call you_0ddd98'), 
    'Automated Idea01')

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_Please enter less than 100 characters_b81a07'))

WebUI.setText(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_Start by typing in their first name.__a771d4'), 
    't')

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/a_No Thanks, Will Update Later'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/span_Like'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/span_Subscribe'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_(0)_6thonbutton'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_(0)_ImpactScoreButton'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_(0)_voteScoreButton'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/li_(0)_4'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_(0)_voteScoreButton'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_(0)_ImpactScoreButton'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_(0)_6thonbutton'))

WebUI.setText(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/textarea_Comments_body'), 'Hello')

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/button_Post'))

WebUI.setText(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/textarea_Comments_body'), 'Private')

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/input_Comments_privacyType'))

WebUI.click(findTestObject('Object Repository/Submit Idea/Page_Innovation Minds/button_Post'))

