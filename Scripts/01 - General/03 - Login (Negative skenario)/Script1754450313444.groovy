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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.eklipse.functions as func

'Navigate to URL'
WebUI.callTestCase(findTestCase('01 - General/01 - Navigate to URL'), [:], FailureHandling.STOP_ON_FAILURE)

buttonSignIn = findTestObject('01 - General/button login')

WebUI.click(buttonSignIn)

'Wrong Email'
email = 'wrongemail.com'

password = 'Test1234.'

inputEmail = findTestObject('01 - General/email credential')

inputPassword = findTestObject('01 - General/password credential')

WebUI.setText(inputEmail, email)

WebUI.setText(inputPassword, password)

WebUI.takeScreenshot()

buttonSignIn = findTestObject('01 - General/button sign in credential')

func.scrollClick(buttonSignIn)

WebUI.verifyTextPresent('Your account or password is incorrect. Reset or change your password.', false)

WebUI.takeScreenshot()

WebUI.refresh()

'Wrong Password'
email = 'dmmtstrccnt@gmail.com'

password = 'passwordSalah'

inputEmail = findTestObject('01 - General/email credential')

inputPassword = findTestObject('01 - General/password credential')

WebUI.setText(inputEmail, email)

WebUI.setText(inputPassword, password)

WebUI.takeScreenshot()

buttonSignIn = findTestObject('01 - General/button sign in credential')

func.scrollClick(buttonSignIn)

WebUI.verifyTextPresent('Your account or password is incorrect. Reset or change your password.', false)

WebUI.takeScreenshot()

WebUI.refresh()

