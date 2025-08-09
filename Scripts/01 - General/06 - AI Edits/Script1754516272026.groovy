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

WebUI.callTestCase(findTestCase('01 - General/04 - Home'), [:], FailureHandling.STOP_ON_FAILURE)

menuEdits = findTestObject('03 - AI Edits/menu edits')

func.scrollClick(menuEdits)

buttonCreate = findTestObject('03 - AI Edits/button create')

WebUI.waitForElementPresent(buttonCreate, 6)

WebUI.refresh()

WebUI.click(buttonCreate)

buttonAiEdit = findTestObject('03 - AI Edits/create ai edit')

WebUI.click(buttonAiEdit)

WebUI.takeScreenshot()

buttonStartAiEdit = findTestObject('03 - AI Edits/start ai edit')

WebUI.takeScreenshot()

func.scrollClick(buttonStartAiEdit)

buttonUploadLocal = findTestObject('03 - AI Edits/local upload')

WebUI.takeScreenshot()

WebUI.click(buttonUploadLocal)

titleVideoLocal = findTestObject('03 - AI Edits/title video local')

WebUI.takeScreenshot()

func.scrollClick(titleVideoLocal)

buttonConfirm = findTestObject('03 - AI Edits/button confirm')

func.scrollClick(buttonConfirm)

loadingPrecentage = findTestObject('03 - AI Edits/loading precentage')

WebUI.waitForElementNotPresent(loadingPrecentage, 300)

WebUI.waitForElementNotPresent(loadingPrecentage, 300)

elementsButtonMedium = WebUI.findWebElements(findTestObject('03 - AI Edits/button Medium'), 0)

for (int i = 1; i <= elementsButtonMedium.size(); i++) {
    buttonMedium = new TestObject().addProperty("xpath", ConditionType.EQUALS, "(//button[text()='Medium'])[${i}]")

    func.scrollClick(buttonMedium)
}
WebUI.takeScreenshot()

menuMontage = findTestObject('03 - AI Edits/menu montage')

WebUI.click(menuMontage)

buttonApplyStyle = findTestObject('03 - AI Edits/button apply style')

WebUI.takeScreenshot()

WebUI.click(buttonApplyStyle)

elementsButtonMedium = WebUI.findWebElements(findTestObject('03 - AI Edits/button Medium'), 0)

for (int i = 1; i <= (elementsButtonMedium.size() - 1); i++) {
    buttonMedium = new TestObject().addProperty("xpath", ConditionType.EQUALS, "(//button[text()='Medium'])[${i}]")

    func.scrollClick(buttonMedium)
}

ratio = findTestObject('03 - AI Edits/button ratio')

WebUI.click(ratio)

WebUI.takeScreenshot()

buttonUpdatePreview = findTestObject('03 - AI Edits/button update preview')

WebUI.click(buttonUpdatePreview)

WebUI.takeScreenshot()

WebUI.waitForElementNotPresent(loadingPrecentage, 300)

buttonGenerateAiEdit = findTestObject('03 - AI Edits/button generate ai edit')

WebUI.click(buttonGenerateAiEdit)

WebUI.takeFullPageScreenshot()

spinnerLoading = findTestObject('03 - AI Edits/spinner loading')

WebUI.waitForElementPresent(spinnerLoading, 15)

WebUI.waitForElementNotPresent(spinnerLoading, 300)

WebUI.takeFullPageScreenshot()


