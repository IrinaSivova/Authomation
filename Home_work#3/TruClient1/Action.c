//   *****************************************************************************************************************************************
//   ****   PLEASE NOTE: This is a READ-ONLY representation of the actual script. For editing please press the "Develop Script" button.   ****
//   *****************************************************************************************************************************************

Action()
{
	lr_start_transaction("Open url");
	truclient_step("2", "Navigate to 'www.rozetka.ua/'", "snapshot=Action_2.inf");
	lr_end_transaction("Open url",0);
	truclient_step("3", "Wait 3 seconds", "snapshot=Action_3.inf");
	lr_start_transaction("Find the product");
	truclient_step("4", "Click on ����� �������� �����... textbox", "snapshot=Action_4.inf");
	truclient_step("5", "Type iPhone 6 in ����� �������� �����... textbox", "snapshot=Action_5.inf");
	truclient_step("6", "Click on ����� button", "snapshot=Action_6.inf");
	lr_end_transaction("Find the product",0);
	truclient_step("7", "Wait 3 seconds", "snapshot=Action_7.inf");
	lr_start_transaction("Add to th cart");
	truclient_step("8", "Click on ������ button", "snapshot=Action_8.inf");
	lr_end_transaction("Add to th cart",0);

	return 0;
}
