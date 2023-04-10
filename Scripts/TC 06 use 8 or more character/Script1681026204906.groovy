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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=TH&continue=https%3A%2F%2Fwww.google.com%3Fhl%3Dth&dsh=S1962944456%3A1680965813808190&flowEntry=SignUp&flowName=GlifWebSignIn&hl=th')

WebUI.setText(findTestObject('Fname'), 'Narttaphong')

WebUI.setText(findTestObject('Lname'), 'Sriphaopahan')

WebUI.setText(findTestObject('Email'), 'Narttaphong12345')

WebUI.setText(findTestObject('password'), 'Pat123')

WebUI.setText(findTestObject('con_password'), 'Pat123456')

WebUI.click(findTestObject('checkBox'))

WebUI.click(findTestObject('button_next'))

WebUI.verifyTextPresent('ใช้อักขระ 8 ตัวขึ้นไปสำหรับรหัสผ่าน', false)

WebUI.closeBrowser()

