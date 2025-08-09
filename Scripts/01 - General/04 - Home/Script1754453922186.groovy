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
import com.eklipse.functions as func

WebUI.callTestCase(findTestCase('01 - General/02 - Login'), [('loginMethod') : 'credential', ('emailCredential') : 'annisafarah712@gmail.com'
        , ('passwordCredential') : 'Test1234.'], FailureHandling.STOP_ON_FAILURE)

buttonCloseAd =findTestObject('01 - General/close ad')

WebUI.click(buttonCloseAd, FailureHandling.OPTIONAL)

buttonAccept = findTestObject('01 - General/button accept')

WebUI.click(buttonAccept, FailureHandling.OPTIONAL)

buttonNotNow = findTestObject('01 - General/button Not now')

func.scrollClick(buttonNotNow, FailureHandling.OPTIONAL)

buttonSkip = findTestObject('01 - General/button skip')

func.scrollClick(buttonSkip, FailureHandling.OPTIONAL)

importStreams = findTestObject('01 - General/import streams')

WebUI.verifyElementPresent(importStreams, 10)

homeMenu = findTestObject('01 - General/homeMenu')

WebUI.verifyElementPresent(homeMenu, 10)

WebUI.takeFullPageScreenshot()


