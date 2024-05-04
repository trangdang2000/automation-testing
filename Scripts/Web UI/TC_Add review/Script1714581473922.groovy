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

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/h2_All Products'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - All Products/h2_All Products'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_View Product'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Product Details/a_Write Your Review'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/input_Write Your Review_name'), 
    'trang')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/input_Write Your Review_email'), 
    'trangdang.1310@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/textarea_Write Your Review_review'), 
    '123445')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Product Details/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Product Details/div_Write Your ReviewThank you for your rev_3cfa69'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Product Details/span_Thank you for your review'))

