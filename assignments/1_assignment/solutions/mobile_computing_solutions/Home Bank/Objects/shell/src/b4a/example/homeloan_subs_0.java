package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homeloan_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homeloan) ","homeloan",3,homeloan.mostCurrent.activityBA,homeloan.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.homeloan.remoteMe.runUserSub(false, "homeloan","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"homeLoan\")";
Debug.ShouldStop(2);
homeloan.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("homeLoan")),homeloan.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (homeloan) ","homeloan",3,homeloan.mostCurrent.activityBA,homeloan.mostCurrent,42);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.homeloan.remoteMe.runUserSub(false, "homeloan","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (homeloan) ","homeloan",3,homeloan.mostCurrent.activityBA,homeloan.mostCurrent,38);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.homeloan.remoteMe.runUserSub(false, "homeloan","activity_resume");}
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncalculate_click() throws Exception{
try {
		Debug.PushSubsStack("btnCalculate_Click (homeloan) ","homeloan",3,homeloan.mostCurrent.activityBA,homeloan.mostCurrent,47);
if (RapidSub.canDelegate("btncalculate_click")) { return b4a.example.homeloan.remoteMe.runUserSub(false, "homeloan","btncalculate_click");}
RemoteObject _amount = RemoteObject.createImmutable(0);
RemoteObject _deposit = RemoteObject.createImmutable(0);
RemoteObject _repayment = RemoteObject.createImmutable(0);
RemoteObject _term = RemoteObject.createImmutable(0);
RemoteObject _final_term = RemoteObject.createImmutable(0);
RemoteObject _months = RemoteObject.createImmutable(0);
RemoteObject _str1 = RemoteObject.createImmutable("");
RemoteObject _total_amount = RemoteObject.createImmutable(0);
RemoteObject _interest = RemoteObject.createImmutable(0);
RemoteObject _initial_interest = RemoteObject.createImmutable(0);
RemoteObject _final_interest = RemoteObject.createImmutable(0);
RemoteObject _initial_term = RemoteObject.createImmutable(0);
 BA.debugLineNum = 47;BA.debugLine="Sub btnCalculate_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 50;BA.debugLine="Dim amount As Double";
Debug.ShouldStop(131072);
_amount = RemoteObject.createImmutable(0);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 51;BA.debugLine="Dim deposit As Double";
Debug.ShouldStop(262144);
_deposit = RemoteObject.createImmutable(0);Debug.locals.put("deposit", _deposit);
 BA.debugLineNum = 52;BA.debugLine="Dim repayment As Double";
Debug.ShouldStop(524288);
_repayment = RemoteObject.createImmutable(0);Debug.locals.put("repayment", _repayment);
 BA.debugLineNum = 53;BA.debugLine="Dim term As Double";
Debug.ShouldStop(1048576);
_term = RemoteObject.createImmutable(0);Debug.locals.put("term", _term);
 BA.debugLineNum = 54;BA.debugLine="Dim final_term As Int";
Debug.ShouldStop(2097152);
_final_term = RemoteObject.createImmutable(0);Debug.locals.put("final_term", _final_term);
 BA.debugLineNum = 55;BA.debugLine="Dim months As Int";
Debug.ShouldStop(4194304);
_months = RemoteObject.createImmutable(0);Debug.locals.put("months", _months);
 BA.debugLineNum = 56;BA.debugLine="Dim str1 As String";
Debug.ShouldStop(8388608);
_str1 = RemoteObject.createImmutable("");Debug.locals.put("str1", _str1);
 BA.debugLineNum = 57;BA.debugLine="Dim total_amount As Double";
Debug.ShouldStop(16777216);
_total_amount = RemoteObject.createImmutable(0);Debug.locals.put("total_amount", _total_amount);
 BA.debugLineNum = 60;BA.debugLine="Dim const INTEREST As Double = 0.0965";
Debug.ShouldStop(134217728);
_interest = BA.numberCast(double.class, 0.0965);Debug.locals.put("INTEREST", _interest);Debug.locals.put("INTEREST", _interest);
 BA.debugLineNum = 61;BA.debugLine="Dim const INITIAL_INTEREST As Double = 0.0495";
Debug.ShouldStop(268435456);
_initial_interest = BA.numberCast(double.class, 0.0495);Debug.locals.put("INITIAL_INTEREST", _initial_interest);Debug.locals.put("INITIAL_INTEREST", _initial_interest);
 BA.debugLineNum = 62;BA.debugLine="Dim const FINAL_INTEREST As Double = 0.0695";
Debug.ShouldStop(536870912);
_final_interest = BA.numberCast(double.class, 0.0695);Debug.locals.put("FINAL_INTEREST", _final_interest);Debug.locals.put("FINAL_INTEREST", _final_interest);
 BA.debugLineNum = 63;BA.debugLine="Dim const INITIAL_TERM As Int = 5";
Debug.ShouldStop(1073741824);
_initial_term = BA.numberCast(int.class, 5);Debug.locals.put("INITIAL_TERM", _initial_term);Debug.locals.put("INITIAL_TERM", _initial_term);
 BA.debugLineNum = 66;BA.debugLine="If (edtTxtAmount.Text == \"\") Or (edtTxtDeposit.Te";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",homeloan.mostCurrent._edttxtamount.runMethod(true,"getText"),RemoteObject.createImmutable(""))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",homeloan.mostCurrent._edttxtdeposit.runMethod(true,"getText"),RemoteObject.createImmutable(""))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",homeloan.mostCurrent._edttxtterm.runMethod(true,"getText"),RemoteObject.createImmutable("")))))) { 
 BA.debugLineNum = 67;BA.debugLine="Msgbox(\"Please ensure all fields are filled befo";
Debug.ShouldStop(4);
homeloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please ensure all fields are filled before calculation")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),homeloan.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 68;BA.debugLine="Else If (edtTxtDeposit.Text >= edtTxtAmount.Text)";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, homeloan.mostCurrent._edttxtdeposit.runMethod(true,"getText")),BA.numberCast(double.class, homeloan.mostCurrent._edttxtamount.runMethod(true,"getText"))))) { 
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Please Check Deposit amount.\",\"Error\")";
Debug.ShouldStop(16);
homeloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please Check Deposit amount.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),homeloan.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 71;BA.debugLine="amount = edtTxtAmount.Text";
Debug.ShouldStop(64);
_amount = BA.numberCast(double.class, homeloan.mostCurrent._edttxtamount.runMethod(true,"getText"));Debug.locals.put("amount", _amount);
 BA.debugLineNum = 72;BA.debugLine="deposit = edtTxtDeposit.Text";
Debug.ShouldStop(128);
_deposit = BA.numberCast(double.class, homeloan.mostCurrent._edttxtdeposit.runMethod(true,"getText"));Debug.locals.put("deposit", _deposit);
 BA.debugLineNum = 73;BA.debugLine="term = edtTxtTerm.Text";
Debug.ShouldStop(256);
_term = BA.numberCast(double.class, homeloan.mostCurrent._edttxtterm.runMethod(true,"getText"));Debug.locals.put("term", _term);
 BA.debugLineNum = 74;BA.debugLine="months = term * 12";
Debug.ShouldStop(512);
_months = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_term,RemoteObject.createImmutable(12)}, "*",0, 0));Debug.locals.put("months", _months);
 BA.debugLineNum = 76;BA.debugLine="amount = amount - deposit";
Debug.ShouldStop(2048);
_amount = RemoteObject.solve(new RemoteObject[] {_amount,_deposit}, "-",1, 0);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 79;BA.debugLine="If (lblHeader.Text == \"Car Loan Calculator\") The";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",homeloan.mostCurrent._lblheader.runMethod(true,"getText"),RemoteObject.createImmutable("Car Loan Calculator")))) { 
 BA.debugLineNum = 81;BA.debugLine="If (edtTxtAmount.Text > 700000) Then	'Restricts";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean(">",BA.numberCast(double.class, homeloan.mostCurrent._edttxtamount.runMethod(true,"getText")),BA.numberCast(double.class, 700000)))) { 
 BA.debugLineNum = 82;BA.debugLine="Msgbox(\"Bank holds a maximum lending amount of";
Debug.ShouldStop(131072);
homeloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Bank holds a maximum lending amount of $700,000. Please call 1122334 for assistance.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),homeloan.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 83;BA.debugLine="Else If (edtTxtTerm.Text > 7) Then		'Restricts";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean(">",BA.numberCast(double.class, homeloan.mostCurrent._edttxtterm.runMethod(true,"getText")),BA.numberCast(double.class, 7)))) { 
 BA.debugLineNum = 84;BA.debugLine="Msgbox(\"Loan Term must be within 7 years\",\"Err";
Debug.ShouldStop(524288);
homeloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Loan Term must be within 7 years")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),homeloan.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 86;BA.debugLine="repayment = (((amount * INTEREST) * term) + am";
Debug.ShouldStop(2097152);
_repayment = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_amount,_interest}, "*",0, 0)),_term}, "*",0, 0)),_amount}, "+",1, 0)),_months}, "/",0, 0);Debug.locals.put("repayment", _repayment);
 BA.debugLineNum = 87;BA.debugLine="lblResults.Text = \"$\" & NumberFormat2(repaymen";
Debug.ShouldStop(4194304);
homeloan.mostCurrent._lblresults.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),homeloan.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(_repayment),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(homeloan.mostCurrent.__c.getField(true,"False"))))));
 }}
;
 }else {
 BA.debugLineNum = 92;BA.debugLine="If (edtTxtAmount.Text > 12000000) Then	'Restric";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean(">",BA.numberCast(double.class, homeloan.mostCurrent._edttxtamount.runMethod(true,"getText")),BA.numberCast(double.class, 12000000)))) { 
 BA.debugLineNum = 93;BA.debugLine="Msgbox(\"Bank holds a maximum lending amount of";
Debug.ShouldStop(268435456);
homeloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Bank holds a maximum lending amount of $12 million. Please call 1122334 for assistance.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),homeloan.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 94;BA.debugLine="Else If (edtTxtTerm.Text > 30) Then		'Restricts";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean(">",BA.numberCast(double.class, homeloan.mostCurrent._edttxtterm.runMethod(true,"getText")),BA.numberCast(double.class, 30)))) { 
 BA.debugLineNum = 95;BA.debugLine="Msgbox(\"Loan Term must be within 30 years\",\"Er";
Debug.ShouldStop(1073741824);
homeloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Loan Term must be within 30 years")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),homeloan.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 97;BA.debugLine="final_term = term - INITIAL_TERM";
Debug.ShouldStop(1);
_final_term = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_term,_initial_term}, "-",1, 0));Debug.locals.put("final_term", _final_term);
 BA.debugLineNum = 99;BA.debugLine="total_amount = (amount * INITIAL_INTEREST * IN";
Debug.ShouldStop(4);
_total_amount = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_amount,_initial_interest,_initial_term}, "**",0, 0)),(RemoteObject.solve(new RemoteObject[] {_amount,_final_interest,_final_term}, "**",0, 0))}, "+",1, 0);Debug.locals.put("total_amount", _total_amount);
 BA.debugLineNum = 100;BA.debugLine="total_amount = total_amount + amount";
Debug.ShouldStop(8);
_total_amount = RemoteObject.solve(new RemoteObject[] {_total_amount,_amount}, "+",1, 0);Debug.locals.put("total_amount", _total_amount);
 BA.debugLineNum = 101;BA.debugLine="repayment = total_amount / months";
Debug.ShouldStop(16);
_repayment = RemoteObject.solve(new RemoteObject[] {_total_amount,_months}, "/",0, 0);Debug.locals.put("repayment", _repayment);
 BA.debugLineNum = 103;BA.debugLine="str1 = NumberFormat2(repayment,1,2,2,False)";
Debug.ShouldStop(64);
_str1 = homeloan.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(_repayment),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(homeloan.mostCurrent.__c.getField(true,"False")));Debug.locals.put("str1", _str1);
 BA.debugLineNum = 105;BA.debugLine="If (str1.Length >= 9)Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("g",_str1.runMethod(true,"length"),BA.numberCast(double.class, 9)))) { 
 BA.debugLineNum = 106;BA.debugLine="lblResults.Text = \"$\" & str1.SubString2(0,7)";
Debug.ShouldStop(512);
homeloan.mostCurrent._lblresults.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),_str1.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 7))))));
 BA.debugLineNum = 107;BA.debugLine="lblDecimal.Text = str1.SubString2(7,9)";
Debug.ShouldStop(1024);
homeloan.mostCurrent._lbldecimal.runMethod(true,"setText",BA.ObjectToCharSequence(_str1.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 9)))));
 }else {
 BA.debugLineNum = 109;BA.debugLine="lblDecimal.Text = \"\"";
Debug.ShouldStop(4096);
homeloan.mostCurrent._lbldecimal.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 110;BA.debugLine="lblResults.Text = \"$\" & NumberFormat2(repayme";
Debug.ShouldStop(8192);
homeloan.mostCurrent._lblresults.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),homeloan.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(_repayment),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(homeloan.mostCurrent.__c.getField(true,"False"))))));
 };
 }}
;
 };
 }}
;
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncarloan_click() throws Exception{
try {
		Debug.PushSubsStack("btnCarLoan_Click (homeloan) ","homeloan",3,homeloan.mostCurrent.activityBA,homeloan.mostCurrent,126);
if (RapidSub.canDelegate("btncarloan_click")) { return b4a.example.homeloan.remoteMe.runUserSub(false, "homeloan","btncarloan_click");}
 BA.debugLineNum = 126;BA.debugLine="Sub btnCarLoan_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="pnlCalculator.BringToFront";
Debug.ShouldStop(1073741824);
homeloan.mostCurrent._pnlcalculator.runVoidMethod ("BringToFront");
 BA.debugLineNum = 128;BA.debugLine="lblHeader.Text = \"Car Loan Calculator\"";
Debug.ShouldStop(-2147483648);
homeloan.mostCurrent._lblheader.runMethod(true,"setText",BA.ObjectToCharSequence("Car Loan Calculator"));
 BA.debugLineNum = 129;BA.debugLine="lblInterestInfo.Text = \"* Interest rate at 9.65%";
Debug.ShouldStop(1);
homeloan.mostCurrent._lblinterestinfo.runMethod(true,"setText",BA.ObjectToCharSequence("* Interest rate at 9.65% per annum"));
 BA.debugLineNum = 130;BA.debugLine="btnClear_Click";
Debug.ShouldStop(2);
_btnclear_click();
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnClear_Click (homeloan) ","homeloan",3,homeloan.mostCurrent.activityBA,homeloan.mostCurrent,117);
if (RapidSub.canDelegate("btnclear_click")) { return b4a.example.homeloan.remoteMe.runUserSub(false, "homeloan","btnclear_click");}
 BA.debugLineNum = 117;BA.debugLine="Sub btnClear_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="edtTxtAmount.Text = \"\"";
Debug.ShouldStop(2097152);
homeloan.mostCurrent._edttxtamount.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 119;BA.debugLine="edtTxtDeposit.Text = \"\"";
Debug.ShouldStop(4194304);
homeloan.mostCurrent._edttxtdeposit.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 120;BA.debugLine="edtTxtTerm.Text = \"\"";
Debug.ShouldStop(8388608);
homeloan.mostCurrent._edttxtterm.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 121;BA.debugLine="lblResults.Text = \"$0\"";
Debug.ShouldStop(16777216);
homeloan.mostCurrent._lblresults.runMethod(true,"setText",BA.ObjectToCharSequence("$0"));
 BA.debugLineNum = 122;BA.debugLine="lblDecimal.Text = \"\"";
Debug.ShouldStop(33554432);
homeloan.mostCurrent._lbldecimal.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 123;BA.debugLine="edtTxtAmount.RequestFocus";
Debug.ShouldStop(67108864);
homeloan.mostCurrent._edttxtamount.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncontact_click() throws Exception{
try {
		Debug.PushSubsStack("btnContact_Click (homeloan) ","homeloan",3,homeloan.mostCurrent.activityBA,homeloan.mostCurrent,133);
if (RapidSub.canDelegate("btncontact_click")) { return b4a.example.homeloan.remoteMe.runUserSub(false, "homeloan","btncontact_click");}
 BA.debugLineNum = 133;BA.debugLine="Sub btnContact_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="pnlContact.BringToFront";
Debug.ShouldStop(32);
homeloan.mostCurrent._pnlcontact.runVoidMethod ("BringToFront");
 BA.debugLineNum = 135;BA.debugLine="lblHeader.Text = \"Contact Us\"";
Debug.ShouldStop(64);
homeloan.mostCurrent._lblheader.runMethod(true,"setText",BA.ObjectToCharSequence("Contact Us"));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnhomeloan_click() throws Exception{
try {
		Debug.PushSubsStack("btnHomeLoan_Click (homeloan) ","homeloan",3,homeloan.mostCurrent.activityBA,homeloan.mostCurrent,138);
if (RapidSub.canDelegate("btnhomeloan_click")) { return b4a.example.homeloan.remoteMe.runUserSub(false, "homeloan","btnhomeloan_click");}
 BA.debugLineNum = 138;BA.debugLine="Sub btnHomeLoan_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="pnlCalculator.BringToFront";
Debug.ShouldStop(1024);
homeloan.mostCurrent._pnlcalculator.runVoidMethod ("BringToFront");
 BA.debugLineNum = 140;BA.debugLine="lblHeader.Text = \"Home Loan Calculator\"";
Debug.ShouldStop(2048);
homeloan.mostCurrent._lblheader.runMethod(true,"setText",BA.ObjectToCharSequence("Home Loan Calculator"));
 BA.debugLineNum = 141;BA.debugLine="lblInterestInfo.Text = \"* Interest at 4.95% for f";
Debug.ShouldStop(4096);
homeloan.mostCurrent._lblinterestinfo.runMethod(true,"setText",BA.ObjectToCharSequence("* Interest at 4.95% for first 5 years, 6.95% for remaining years"));
 BA.debugLineNum = 142;BA.debugLine="btnClear_Click";
Debug.ShouldStop(8192);
_btnclear_click();
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private edtTxtAmount As EditText";
homeloan.mostCurrent._edttxtamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private edtTxtDeposit As EditText";
homeloan.mostCurrent._edttxtdeposit = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private edtTxtTerm As EditText";
homeloan.mostCurrent._edttxtterm = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lblHeader As Label";
homeloan.mostCurrent._lblheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lblResults As Label";
homeloan.mostCurrent._lblresults = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnCalculate As Button";
homeloan.mostCurrent._btncalculate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private btnClear As Button";
homeloan.mostCurrent._btnclear = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private btnCarLoan As Button";
homeloan.mostCurrent._btncarloan = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btnContact As Button";
homeloan.mostCurrent._btncontact = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btnHomeLoan As Button";
homeloan.mostCurrent._btnhomeloan = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private pnlCalculator As Panel";
homeloan.mostCurrent._pnlcalculator = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private pnlContact As Panel";
homeloan.mostCurrent._pnlcontact = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblInterestInfo As Label";
homeloan.mostCurrent._lblinterestinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblDecimal As Label";
homeloan.mostCurrent._lbldecimal = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}