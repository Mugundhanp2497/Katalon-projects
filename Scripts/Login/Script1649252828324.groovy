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

WebUI.openBrowser(findTestData('Login').getValue('URL', 1))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login-Logout/input_Email_email'), findTestData('Login').getValue('Username', 1))

WebUI.click(findTestObject('Login-Logout/button_Next'))

WebUI.setEncryptedText(findTestObject('Login-Logout/input_Password_password'), findTestData('Login').getValue('Password', 
        1))

WebUI.click(findTestObject('Login-Logout/button_Sign In'))

WebDriver d = DriverFactory.getWebDriver()

List<String> b = d.findElements(By.xpath('//div[@class=\'title text-center caption\']'))

FileInputStream fis = new FileInputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Program List.xlsx')

int k = 1

Workbook wb = new XSSFWorkbook(fis)

Sheet s = wb.getSheet('Programs')

for (int i = 0; i < b.size(); i++) {
    WebElement x1 = b.get(i)

    s.createRow(k).createCell(1).setCellValue(x1.getText())

    k++
}

FileOutputStream fos = new FileOutputStream('C://Hajira//Im Testing//Automation- IM//IM-Automation//Excel//Program List.xlsx')

wb.write(fos)

String P1 = findTestData('Sandbox program').getValue('Program Name', 1)

System.out.println(P1)

for (int i = 0; i < b.size(); i++) {
    WebElement y1 = b.get(i)

    String z1 = y1.getText()

    System.out.println(z1)

    if (z1.equals(P1)) {
        y1.click()

        break
    }
}

System.out.print('good')

