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
import org.sikuli.script.Pattern as Pattern
import org.sikuli.script.Screen as Screen


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qaautomation.innovationminds.com/login')

WebUI.setText(findTestObject('Object Repository/Event/Page_Innovation Minds/input_Email_email'), 'demoportal@mailinator.com')

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Event/Page_Innovation Minds/input_Password_password'), 'XAwCCXVtf52fWID5ckhaJA==')

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/div_Your Engagement Trend_cssClass0'))

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/a_Events'))

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/button_Add New'))

WebUI.setText(findTestObject('Object Repository/Event/Page_Innovation Minds/input_Title_title'), 'Event 002')

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/span_Event Start Date and Time_glyphicon gl_d50ff0'))

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/td_22'))

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/span_Event End Date and Time_glyphicon glyp_8c5652'))

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/td_30'))

WebUI.setText(findTestObject('Object Repository/Event/Page_Innovation Minds/input_Venue_venue'), 'Virtual')

WebUI.setText(findTestObject('Object Repository/Event/Page_Innovation Minds/input_City_location'), 'Zoom')

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/input_Add To Upcoming Events_isUpcoming'))

WebUI.click(findTestObject('Event/Page_Innovation Minds/div_Drop Images OR Click anywhere inside th_0357ff'))

Screen SC = new Screen()
Pattern fn = new Pattern('Images\\Filename.png')
Pattern Openbutton = new Pattern('Images\\Open.png')
SC.type(fn, "C:\\Hajira\\Im Testing\\Automation- IM\\IM-Automation\\Images\\Event001.jpg")
SC.click(Openbutton)

//WebUI.uploadFile(findTestObject('Object Repository/Event/Page_Innovation Minds/div_Drop Images OR Click anywhere inside th_0357ff'), 
//    'C://Hajira//Im Testing//Pics//Award.jpg')

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/button_Save'))

WebUI.click(findTestObject('Object Repository/Event/Page_Innovation Minds/input_Paragraph_imgSubmit'))

