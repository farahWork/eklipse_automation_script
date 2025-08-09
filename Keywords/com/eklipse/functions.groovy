package com.eklipse

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebElement

public class functions {

	public static void scrollClick(TestObject object) {
		WebElement element = WebUI.findWebElement(object)
		WebUI.executeJavaScript("arguments[0].scrollIntoView({behavior: 'instant', block: 'center'});", Arrays.asList(element))
		WebUI.click(object)
	}
	
	public static void scrollClick(TestObject object, FailureHandling handling) {
		WebElement element = WebUI.findWebElement(object)
		WebUI.executeJavaScript("arguments[0].scrollIntoView({behavior: 'instant', block: 'center'});", Arrays.asList(element))
		WebUI.click(object, handling)
	}
}
