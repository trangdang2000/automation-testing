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

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'Trang')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_Login to your account_password'), 
    'trangdang.13101@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Mrs_title'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__name'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__password'), '6WfwmRkwuAQSKT6MS59qVw==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Year20212020201920182017201620152014_f874ed'), 
    '2016', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Date of Birth_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__first_name'), 'Trang')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__last_name'), 'Dang')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Company_company'), 'katalian')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 
    '14,djaimd street, ')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Address 2_address2'), '')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Address 2_address2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'Canada', true)

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__state'), 'Ontario')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/p_City'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__city'), 'Happy')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__zipcode'), '1274')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__mobile_number'), '90836743')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Account Created/b_Account Created'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Delete Account'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/div_Account DeletedYour account has been pe_1eedfd'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Account Created/b_Account Deleted'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.closeBrowser()

