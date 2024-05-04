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

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/div_Your product has been added to cart.View Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise/p_Your product has been added to cart'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/u_View Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Blue Top'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/i_Blue Top_fa fa-times'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Cart is empty Click here to buy products'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Checkout/b_Cart is empty'))
