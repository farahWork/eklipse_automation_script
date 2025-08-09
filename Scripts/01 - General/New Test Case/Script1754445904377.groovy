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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.eklipse.functions as func

//WebUI.openBrowser(null)
//dmmtstrccnt@gmail.com

//buttonVideo = new TestObject().addProperty('xpath', ConditionType.EQUALS, "")
//func.scrollClick(buttonVideo)

//elementsButtonMedium = WebUI.findWebElements(findTestObject('03 - AI Edits/button Medium'), 0)
//
//for (int i = 1; i <= elementsButtonMedium.size(); i++) {
//    buttonMedium = new TestObject().addProperty("xpath", ConditionType.EQUALS, "(//button[text()='Medium'])[${i}]")
//
//    func.scrollClick(buttonMedium)
//}
spinnerLoading = findTestObject('03 - AI Edits/spinner loading')

WebUI.waitForElementPresent(spinnerLoading, 15)

WebUI.waitForElementNotPresent(spinnerLoading, 300)