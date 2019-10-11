import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://qa.medisource.com')

WebUI.delay(5)

WebUI.comment('Login')

WebUI.setText(findTestObject('Login/Username'), 'superagent@warriors')

WebUI.delay(2)

WebUI.setText(findTestObject('Login/Password'), 'Tester2019!')

WebUI.delay(2)

WebUI.click(findTestObject('Login/Login Button'))

WebUI.delay(8)

WebUI.comment('Go to Healthcare Vendor Page')

WebUI.navigateToUrl('https://qa.medisource.com/company')

WebUI.delay(5)

WebUI.comment('Edit a healthcare vendor')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/edit_healthcare'))

WebUI.delay(3)

WebUI.comment('Select Dropdown')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/Vendor Dropdown/dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/Vendor Dropdown/dd_option'))

WebUI.delay(3)

WebUI.comment('Modify Other fields')

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/vendor_name'), 'Lhanz De Vera')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/contact_person'), 'Lhanie')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/address'), 'Somewhere')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/city'), 'on earth')

WebUI.delay(2)

WebUI.comment('Select State')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/State Dropdown/State_dd'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/State Dropdown/state_option'))

WebUI.delay(2)

WebUI.comment('Modify Other fields')

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/zip_code'), '28081')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/phone_num'), '01928374654')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/fax'), '23461467432')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/email'), 'lanlan06.ldv@gmail.com')

WebUI.delay(2)

WebUI.comment('Select State')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/State Dropdown/State_dd'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/State Dropdown/state_option'))

WebUI.delay(2)

WebUI.comment('Modify Other fields')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/Checkboxes/yes'))

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/baa_upload'), 'jysgdjhsiue')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/baa_link'), 'fegjhrkeu')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/Edit Healthcare Vendor/save_button'))

