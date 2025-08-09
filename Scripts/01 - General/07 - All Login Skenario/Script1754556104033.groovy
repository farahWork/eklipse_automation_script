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

dataSkenario = [[('loginMethod') : 'google account', ('emailCredential') : 'dmmtstrccnt@gmail.com', ('passwordCredential') : 'Test1234.']
    , [('loginMethod') : 'credential', ('emailCredential') : 'annisafarah712@gmail.com', ('passwordCredential') : 'Test1234.']]


for (int i = 0; i < dataSkenario.size(); i++) {
    WebUI.callTestCase(findTestCase('01 - General/02 - Login'), [('loginMethod') : dataSkenario[i].loginMethod, ('emailCredential') : dataSkenario[
            i].emailCredential, ('passwordCredential') : dataSkenario[i].passwordCredential], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('01 - General/03 - Login (Negative skenario)'), [:], FailureHandling.STOP_ON_FAILURE)

