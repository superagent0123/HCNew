
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

WebUI.navigateToUrl('https://app.medisource.com/patients/all')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('showAllTaskPrintPreviousEpisode/searchPatients'), 'danny')

WebUI.delay(3)

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/clickSelectedName'))

WebUI.delay(2)

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/episodeDropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/selectedPreviousEpisode'))

WebUI.scrollToPosition(400, 200)

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/socPrintIcon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/socPrintIconCompile'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/socPrintIconMO'))

WebUI.clickOffset(findTestObject('showAllTaskPrintPreviousEpisode/offset'), 0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/snvPrintIcon'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/lvnPrintIcon'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/jsvHHA'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/jsvLVN'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/rnSup'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/ptEval'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/ptVisit'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/ptaVisit'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/stEval'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/stVisit'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/otEval'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/otVisit'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/mswEval'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/mswVisit'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/trnsfrPrintIcon'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/trnsfrCompile'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/trnsfrMO'))

WebUI.clickOffset(findTestObject('showAllTaskPrintPreviousEpisode/offset'), 0, 0)

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/rocPrintIcon'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/rocCompiled'))

WebUI.click(findTestObject('showAllTaskPrintPreviousEpisode/rocMO'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('patientDashboardMenu/mdOrders'))

WebUI.click(findTestObject('showAllOrderPrint/POPrintIcon'))

WebUI.click(findTestObject('showAllOrderPrint/POprint'))

WebUI.clickOffset(findTestObject('showAllTaskPrintPreviousEpisode/offset'), 0, 0)

WebUI.click(findTestObject('showAllOrderPrint/poc_roc'))

WebUI.click(findTestObject('showAllOrderPrint/poc_roc_cms'))

WebUI.click(findTestObject('showAllOrderPrint/poc_roc_compiled'))

WebUI.clickOffset(findTestObject('showAllTaskPrintPreviousEpisode/offset'), 0, 0)

WebUI.click(findTestObject('showAllOrderPrint/roc_order'))

WebUI.click(findTestObject('showAllOrderPrint/roc_order_print'))

WebUI.clickOffset(findTestObject('showAllTaskPrintPreviousEpisode/offset'), 0, 0)

WebUI.click(findTestObject('showAllOrderPrint/transfer_order'))

WebUI.click(findTestObject('showAllOrderPrint/transfer_order_print'))

WebUI.clickOffset(findTestObject('showAllTaskPrintPreviousEpisode/offset'), 0, 0)

WebUI.click(findTestObject('showAllOrderPrint/admission_order'))

WebUI.click(findTestObject('showAllOrderPrint/admission_order_print'))

WebUI.clickOffset(findTestObject('showAllTaskPrintPreviousEpisode/offset'), 0, 0)

WebUI.click(findTestObject('showAllOrderPrint/f2f_order'))

WebUI.click(findTestObject('showAllOrderPrint/f2f_order_print'))

WebUI.clickOffset(findTestObject('showAllTaskPrintPreviousEpisode/offset'), 0, 0)

WebUI.click(findTestObject('showAllOrderPrint/poc_soc'))

WebUI.click(findTestObject('showAllOrderPrint/poc_soc_cms'))

WebUI.click(findTestObject('showAllOrderPrint/poc_soc_compiled'))

WebUI.clickOffset(findTestObject('showAllTaskPrintPreviousEpisode/offset'), 0, 0)

WebUI.click(findTestObject('showAllOrderPrint/episode_dropdown2'))

WebUI.delay(3)

WebUI.click(findTestObject('showAllOrderPrint/selectedCurrentEpisode'))

WebUI.delay(2)

WebUI.click(findTestObject('showAllTaskPrintCurrentEpisode/recPrintIcon'))

WebUI.click(findTestObject('showAllTaskPrintCurrentEpisode/rec_compiled'))

WebUI.click(findTestObject('showAllTaskPrintCurrentEpisode/rec_MO'))

WebUI.clickOffset(findTestObject('showAllTaskPrintCurrentEpisode/offset'), 0, 0)

WebUI.click(findTestObject('showAllTaskPrintCurrentEpisode/dcPrintIcon'))

WebUI.click(findTestObject('showAllTaskPrintCurrentEpisode/dc_compiled'))

WebUI.click(findTestObject('showAllTaskPrintCurrentEpisode/dc_MO'))

WebUI.click(findTestObject('patientDashboardMenu/communication'))

WebUI.click(findTestObject('showAllCommNotes/DC_Summary'))

WebUI.click(findTestObject('showAllCommNotes/DC_Instruction'))

WebUI.click(findTestObject('showAllCommNotes/transferSummary'))

WebUI.click(findTestObject('showAllCommNotes/CCN'))

WebUI.click(findTestObject('showAllCommNotes/HHA'))

WebUI.click(findTestObject('showAllCommNotes/30Day'))

WebUI.click(findTestObject('showAllCommNotes/casecon'))

WebUI.delay(2)

WebUI.click(findTestObject('patientDashboardMenu/MedPro'))

WebUI.delay(3)

WebUI.click(findTestObject('showAllMedPro/MedProPrint'))

WebUI.click(findTestObject('showAllMedPro/patientCOpy'))

WebUI.click(findTestObject('showAllMedPro/medSchedule'))

WebUI.click(findTestObject('showAllMedPro/agencyCopy'))

WebUI.click(findTestObject('showAllMedPro/medReconbutton'))

WebUI.delay(2)

WebUI.click(findTestObject('showAllMedPro/medReconPrint'))



