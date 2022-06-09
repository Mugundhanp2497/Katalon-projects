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

WebUI.openBrowser(findTestData('Login').getValue('URL', 1))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login-Logout/input_Email_email'), findTestData('Login').getValue('Username', 1))

WebUI.click(findTestObject('Login-Logout/button_Next'))

WebUI.setEncryptedText(findTestObject('Login-Logout/input_Password_password'), findTestData('Login').getValue('Password', 
        1))

WebUI.click(findTestObject('Login-Logout/button_Sign In'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('IMobj/test automation'))

WebUI.click(findTestObject('challenge/challenge'))

WebUI.click(findTestObject('challenge/create challenge'))

Date latestdate = new Date()

CurrentEpoc = latestdate.getTime()

println(CurrentEpoc)

challengeName = ('Challenge' + CurrentEpoc)

WebUI.setText(findTestObject('challenge/title'), challengeName)

WebUI.switchToFrame(findTestObject('challenge/iframe'), 0)

WebUI.setText(findTestObject('challenge/body'), findTestData('Challnege Data').getValue(4, 1))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('challenge/tags'))

WebUI.click(findTestObject('challenge/tag1 college'))

WebUI.click(findTestObject('challenge/tag2 learning'))

WebUI.click(findTestObject('challenge/tag close'))

WebUI.click(findTestObject('challenge/category'))

WebUI.setText(findTestObject('challenge/start date'), findTestData('Challnege Data').getValue(5, 1))

WebUI.setText(findTestObject('challenge/end date'), findTestData('Challnege Data').getValue(6, 1))

WebUI.click(findTestObject('challenge/publish'))

WebUI.setText(findTestObject('challenge/comment'), findTestData('Challnege Data').getValue(7, 1))

WebUI.click(findTestObject('challenge/comment post'))

WebUI.click(findTestObject('challenge/reply comment'))

WebUI.setText(findTestObject('challenge/reply comment words'), findTestData('Challnege Data').getValue(8, 1))

WebUI.click(findTestObject('challenge/reply comment post'))

WebUI.setText(findTestObject('challenge/comment'), findTestData('Challnege Data').getValue(7, 1))

WebUI.click(findTestObject('challenge/input__privacyType'))

WebUI.click(findTestObject('challenge/comment post'))

WebUI.click(findTestObject('challenge/reply comment'))

WebUI.setText(findTestObject('challenge/reply comment words'), findTestData('Challnege Data').getValue(8, 1))

WebUI.click(findTestObject('challenge/reply comment post'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.click(findTestObject('challenge/liike'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('challenge/submit idea'))

IdeaName = ('Challenge Idea' + CurrentEpoc)

WebUI.setText(findTestObject('IMobj/problemToSolve'), IdeaName)

WebUI.switchToFrame(findTestObject('IMobj/iframe'), 0)

WebUI.setText(findTestObject('IMobj/body'), findTestData('Challnege Data').getValue(9, 1))

WebUI.switchToDefaultContent()

IdeaTitle = (findTestData('Challnege Data').getValue(10, 1) + CurrentEpoc)

WebUI.setText(findTestObject('IMobj/title'), IdeaTitle)

WebUI.click(findTestObject('IMobj/submit idea'))

WebUI.setText(findTestObject('IMobj/members'), findTestData('Challnege Data').getValue(11, 1))

WebUI.click(findTestObject('IMobj/member sugestion 1'))

WebUI.setText(findTestObject('IMobj/members'), findTestData('Challnege Data').getValue(11, 1))

WebUI.click(findTestObject('IMobj/member sugestion 2'))

WebUI.setText(findTestObject('IMobj/skills'), findTestData('Challnege Data').getValue(12, 1))

WebUI.click(findTestObject('IMobj/member sugestion 1'))

//WebUI.click(findTestObject('IMobj/member Add'))

WebUI.click(findTestObject('IMobj/team update'))

WebUI.click(findTestObject('IMobj/select category'))

WebUI.setText(findTestObject('IMobj/tags'), findTestData('Challnege Data').getValue(13, 1))

WebUI.click(findTestObject('IMobj/option'))

WebUI.click(findTestObject('IMobj/submit'))

WebUI.setText(findTestObject('IMobj/idea-comment'), findTestData('Challnege Data').getValue(14, 1))

WebUI.click(findTestObject('IMobj/private comment'))

WebUI.click(findTestObject('IMobj/comment post'))

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('IMobj/like'))

WebUI.click(findTestObject('IMobj/subscribe'))

WebUI.click(findTestObject('IMobj/Completeness score edit'))

WebUI.setText(findTestObject('IMobj/Ideation'), findTestData('Idea Score data').getValue(1, 1))

WebUI.setText(findTestObject('IMobj/Speed dating'), findTestData('Idea Score data').getValue(2, 1))

WebUI.setText(findTestObject('IMobj/Designation'), findTestData('Idea Score data').getValue(3, 1))

WebUI.setText(findTestObject('IMobj/Makeathon'), findTestData('Idea Score data').getValue(4, 1))

WebUI.setText(findTestObject('IMobj/Shark tank'), findTestData('Idea Score data').getValue(5, 1))

WebUI.setText(findTestObject('IMobj/Awardathon'), findTestData('Idea Score data').getValue(6, 1))

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('IMobj/completeness save'))

WebUI.click(findTestObject('IMobj/Impact score edit'))

WebUI.setText(findTestObject('IMobj/Effort'), findTestData('Idea Score data').getValue(7, 1))

WebUI.setText(findTestObject('IMobj/Impact'), findTestData('Idea Score data').getValue(8, 1))

WebUI.click(findTestObject('IMobj/impact score Save'))

WebUI.click(findTestObject('IMobj/vote edit'))

WebUI.click(findTestObject('IMobj/vote star'))

WebUI.click(findTestObject('IMobj/vote edit'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 5)

c = 'Team Project'

d = (c + CurrentEpoc)

WebUI.click(findTestObject('IMobj/create project'))

WebUI.setText(findTestObject('project/project name'), d)

WebUI.setText(findTestObject('project/short key'), findTestData('Challnege Data').getValue(15, 1))

WebUI.setText(findTestObject('project/intend to manage'), findTestData('Challnege Data').getValue(16, 1))

WebUI.setText(findTestObject('project/description'), findTestData('Challnege Data').getValue(17, 1))

WebUI.setText(findTestObject('project/list name'), findTestData('Challnege Data').getValue(18, 1))

WebUI.click(findTestObject('project/Resolution list name'))

WebUI.setText(findTestObject('project/start date'), findTestData('Challnege Data').getValue(19, 1))

WebUI.setText(findTestObject('project/end date'), findTestData('Challnege Data').getValue(20, 1))

WebUI.setText(findTestObject('project/estimated budget'), findTestData('Challnege Data').getValue(21, 1))

WebUI.setText(findTestObject('project/actual budget'), findTestData('Challnege Data').getValue(22, 1))

WebUI.setText(findTestObject('project/estimated effort'), findTestData('Challnege Data').getValue(23, 1))

WebUI.setText(findTestObject('project/actual effort'), findTestData('Challnege Data').getValue(24, 1))

WebUI.click(findTestObject('project/high priority'))

WebUI.click(findTestObject('project/status-inTesting'))

WebUI.click(findTestObject('project/funded'))

WebUI.setText(findTestObject('project/admins'), findTestData('Challnege Data').getValue(25, 1))

WebUI.click(findTestObject('project/admin suggestion'))

WebUI.setText(findTestObject('project/users'), findTestData('Challnege Data').getValue(26, 1))

WebUI.click(findTestObject('project/admin suggestion'))

WebUI.click(findTestObject('project/save'))

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

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/User Upload- Super Admin/Page_Innovation Minds/span_Me'))

WebUI.click(findTestObject('Login-Logout/a_Sign out'))

