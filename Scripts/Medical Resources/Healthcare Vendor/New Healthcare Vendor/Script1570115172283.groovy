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

WebUI.comment('Login account')

WebUI.setText(findTestObject('Login/Username'), 'superagent@warriors')

WebUI.setText(findTestObject('Login/Password'), 'Tester2019!')

WebUI.click(findTestObject('Login/Login Button'))

WebUI.delay(10)

WebUI.comment('Go to Healthcare Vendor Page')

WebUI.navigateToUrl('https://qa.medisource.com/company')

WebUI.delay(5)

WebUI.comment('Click New Healthcare Vendor button')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/new_healthcare'))

WebUI.delay(2)

WebUI.comment('Type Healthcare Vendor Name')

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/hcv_name'), 'asdfghjklassfdgf')

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/contact_person'), 'assdfdhghj')

WebUI.delay(2)

WebUI.comment('Discard changes then cancel')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Discard/discard_changes'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Discard/discard_cancel'))

WebUI.delay(2)

WebUI.comment('Discard changes then confirm')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Discard/discard_changes'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Discard/discard_confirm'))

WebUI.delay(3)

WebUI.comment('Click add vendor type then cancel')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Vendor Type/add_vendor_type'))

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Vendor Type/title'), 'jsdgfisurh')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Vendor Type/cancel'))

WebUI.delay(2)

WebUI.comment('Click add vendor type then save')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Vendor Type/add_vendor_type'))

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Vendor Type/title'), 'sample vendor')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Vendor Type/save'))

WebUI.delay(3)

WebUI.comment('Edit vendor type then cancel')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Vendor Type/edit_vendor_type'))

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Vendor Type/edit_title'), 'sample')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Vendor Type/cancel_type'))

WebUI.delay(2)

WebUI.comment('Edit vendor type then save')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Vendor Type/edit_vendor_type'))

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Vendor Type/edit_title'), 'Vendor 001')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Vendor Type/save_type'))

WebUI.delay(2)

WebUI.comment('Delete selected vendor type then cancel')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Delete Vendor Type/delete_type'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Delete Vendor Type/delete_type_cancel'))

WebUI.delay(3)

WebUI.comment('Delete selected vendor type then confirm')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Delete Vendor Type/delete_type'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Delete Vendor Type/delete_type_confirm'))

WebUI.delay(5)

WebUI.comment('Select Vendor Type')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Vendor Dropdown/dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Vendor Dropdown/dd_option'))

WebUI.delay(2)

WebUI.comment('Fill-up other fields')

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/hcv_name'), 'Lhanie Mae De Vera')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/contact_person'), 'Lhanz')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/address'), 'Sagunto')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/city'), 'Sison')

WebUI.delay(2)

WebUI.comment('Select Sate')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/State Dropdown/State_dd'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/State Dropdown/state_option'))

WebUI.delay(2)

WebUI.comment('Fill up other fields')

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/zip_code'), '92054')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/phone _num'), '09179274824')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/fax'), '09954755939')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/email_add'), 'lhaniemae.devera@gmail.com')

WebUI.delay(2)

WebUI.comment('Add Product then cancel')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Products or Services/add_products'))

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Products or Services/product_title'), 
    'jzhsdsjfhr')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Products or Services/cancel_prod'))

WebUI.delay(2)

WebUI.comment('Add Product then save')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Products or Services/add_products'))

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Products or Services/product_title'), 
    'Sample Product 1')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Add Products or Services/save_prod'))

WebUI.delay(3)

WebUI.comment('Edit Product then cancel')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Product or Services/edit_product'))

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Product or Services/title_edit'), 
    'Sample Product 2')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Product or Services/cancel_edits'))

WebUI.delay(5)

WebUI.comment('Edit Product then confirm')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Product or Services/edit_product'))

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Product or Services/title_edit'), 
    'Product 001')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Edit Product or Services/save_edits'))

WebUI.delay(5)

WebUI.comment('Delete Product then cancel')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Delete Product or Service/delete_product'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Delete Product or Service/delete_product_no'))

WebUI.delay(5)

WebUI.comment('Delete Product then confirm')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Delete Product or Service/delete_product'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Delete Product or Service/delete_product_yes'))

WebUI.delay(5)

WebUI.comment('Select Product')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Product Dropdown/prod_dd'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Product Dropdown/prod_option'))

WebUI.delay(5)

WebUI.comment('Checkboxes')

WebUI.check(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Checkboxes/yes'))

WebUI.delay(2)

WebUI.check(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Checkboxes/no'))

WebUI.delay(2)

WebUI.check(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/Checkboxes/NA'))

WebUI.delay(2)

WebUI.comment('fill-up remaining fields')

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/baa_upload'), 'sample')

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/baa_link'), 'sample')

WebUI.delay(5)

WebUI.comment('Save All')

WebUI.click(findTestObject('Medical Resources/Healthcare Vendor/New Healthcare Vendor/save_healthcare'))

