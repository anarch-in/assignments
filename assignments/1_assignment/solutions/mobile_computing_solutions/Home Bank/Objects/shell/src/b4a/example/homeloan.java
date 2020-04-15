
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class homeloan implements IRemote{
	public static homeloan mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public homeloan() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("homeloan"), "b4a.example.homeloan");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, homeloan.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _edttxtamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edttxtdeposit = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edttxtterm = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblresults = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btncalculate = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnclear = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btncarloan = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btncontact = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnhomeloan = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pnlcalculator = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlcontact = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblinterestinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldecimal = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.carloan _carloan = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",homeloan.mostCurrent._activity,"btnCalculate",homeloan.mostCurrent._btncalculate,"btnCarLoan",homeloan.mostCurrent._btncarloan,"btnClear",homeloan.mostCurrent._btnclear,"btnContact",homeloan.mostCurrent._btncontact,"btnHomeLoan",homeloan.mostCurrent._btnhomeloan,"CarLoan",Debug.moduleToString(b4a.example.carloan.class),"edtTxtAmount",homeloan.mostCurrent._edttxtamount,"edtTxtDeposit",homeloan.mostCurrent._edttxtdeposit,"edtTxtTerm",homeloan.mostCurrent._edttxtterm,"lblDecimal",homeloan.mostCurrent._lbldecimal,"lblHeader",homeloan.mostCurrent._lblheader,"lblInterestInfo",homeloan.mostCurrent._lblinterestinfo,"lblResults",homeloan.mostCurrent._lblresults,"Main",Debug.moduleToString(b4a.example.main.class),"pnlCalculator",homeloan.mostCurrent._pnlcalculator,"pnlContact",homeloan.mostCurrent._pnlcontact,"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}