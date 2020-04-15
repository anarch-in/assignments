package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class carloan extends Activity implements B4AActivity{
	public static carloan mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.carloan");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (carloan).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.carloan");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.carloan", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (carloan) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (carloan) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return carloan.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (carloan) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            carloan mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (carloan) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edttxtamount = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edttxtdeposit = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edttxtterm = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblresults = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncalculate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnclear = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncarloan = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncontact = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnhomeloan = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblheader = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcontact = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcalculator = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblinterestinfo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldecimal = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.homeloan _homeloan = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="carloan";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Activity.LoadLayout(\"carLoan\")";
mostCurrent._activity.LoadLayout("carLoan",mostCurrent.activityBA);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="carloan";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="carloan";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public static String  _btncalculate_click() throws Exception{
RDebugUtils.currentModule="carloan";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncalculate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncalculate_click", null));}
double _amount = 0;
double _deposit = 0;
double _repayment = 0;
double _term = 0;
int _final_term = 0;
int _months = 0;
String _str1 = "";
double _total_amount = 0;
double _interest = 0;
double _initial_interest = 0;
double _final_interest = 0;
int _initial_term = 0;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub btnCalculate_Click";
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Dim amount As Double";
_amount = 0;
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Dim deposit As Double";
_deposit = 0;
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Dim repayment As Double";
_repayment = 0;
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Dim term As Double";
_term = 0;
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Dim final_term As Int";
_final_term = 0;
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Dim months As Int";
_months = 0;
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Dim str1 As String";
_str1 = "";
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="Dim total_amount As Double";
_total_amount = 0;
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="Dim const INTEREST As Double = 0.0965";
_interest = 0.0965;
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="Dim const INITIAL_INTEREST As Double = 0.0495";
_initial_interest = 0.0495;
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="Dim const FINAL_INTEREST As Double = 0.0695";
_final_interest = 0.0695;
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="Dim const INITIAL_TERM As Int = 5";
_initial_term = (int) (5);
RDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="If (edtTxtAmount.Text == \"\") Or (edtTxtDeposit.Te";
if (((mostCurrent._edttxtamount.getText()).equals("")) || ((mostCurrent._edttxtdeposit.getText()).equals("")) || ((mostCurrent._edttxtterm.getText()).equals(""))) { 
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="Msgbox(\"Please ensure all fields are filled befo";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please ensure all fields are filled before calculation"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="Else If (edtTxtDeposit.Text >= edtTxtAmount.Text)";
if (((double)(Double.parseDouble(mostCurrent._edttxtdeposit.getText()))>=(double)(Double.parseDouble(mostCurrent._edttxtamount.getText())))) { 
RDebugUtils.currentLine=1441814;
 //BA.debugLineNum = 1441814;BA.debugLine="Msgbox(\"Please Check Deposit amount.\",\"Error\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please Check Deposit amount."),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=1441816;
 //BA.debugLineNum = 1441816;BA.debugLine="amount = edtTxtAmount.Text";
_amount = (double)(Double.parseDouble(mostCurrent._edttxtamount.getText()));
RDebugUtils.currentLine=1441817;
 //BA.debugLineNum = 1441817;BA.debugLine="deposit = edtTxtDeposit.Text";
_deposit = (double)(Double.parseDouble(mostCurrent._edttxtdeposit.getText()));
RDebugUtils.currentLine=1441818;
 //BA.debugLineNum = 1441818;BA.debugLine="term = edtTxtTerm.Text";
_term = (double)(Double.parseDouble(mostCurrent._edttxtterm.getText()));
RDebugUtils.currentLine=1441819;
 //BA.debugLineNum = 1441819;BA.debugLine="months = term * 12";
_months = (int) (_term*12);
RDebugUtils.currentLine=1441821;
 //BA.debugLineNum = 1441821;BA.debugLine="amount = amount - deposit";
_amount = _amount-_deposit;
RDebugUtils.currentLine=1441824;
 //BA.debugLineNum = 1441824;BA.debugLine="If (lblHeader.Text == \"Car Loan Calculator\") The";
if (((mostCurrent._lblheader.getText()).equals("Car Loan Calculator"))) { 
RDebugUtils.currentLine=1441826;
 //BA.debugLineNum = 1441826;BA.debugLine="If (edtTxtAmount.Text > 700000) Then	'Restricts";
if (((double)(Double.parseDouble(mostCurrent._edttxtamount.getText()))>700000)) { 
RDebugUtils.currentLine=1441827;
 //BA.debugLineNum = 1441827;BA.debugLine="Msgbox(\"Bank holds a maximum lending amount of";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Bank holds a maximum lending amount of $700,000. Please call 1122334 for assistance."),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=1441828;
 //BA.debugLineNum = 1441828;BA.debugLine="Else If (edtTxtTerm.Text > 7) Then		'Restricts";
if (((double)(Double.parseDouble(mostCurrent._edttxtterm.getText()))>7)) { 
RDebugUtils.currentLine=1441829;
 //BA.debugLineNum = 1441829;BA.debugLine="Msgbox(\"Loan Term must be within 7 years\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Loan Term must be within 7 years"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=1441831;
 //BA.debugLineNum = 1441831;BA.debugLine="repayment = (((amount * INTEREST) * term) + am";
_repayment = (((_amount*_interest)*_term)+_amount)/(double)_months;
RDebugUtils.currentLine=1441832;
 //BA.debugLineNum = 1441832;BA.debugLine="lblResults.Text = \"$\" & NumberFormat2(repaymen";
mostCurrent._lblresults.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat2(_repayment,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)));
 }}
;
 }else {
RDebugUtils.currentLine=1441837;
 //BA.debugLineNum = 1441837;BA.debugLine="If (edtTxtAmount.Text > 12000000) Then	'Restric";
if (((double)(Double.parseDouble(mostCurrent._edttxtamount.getText()))>12000000)) { 
RDebugUtils.currentLine=1441838;
 //BA.debugLineNum = 1441838;BA.debugLine="Msgbox(\"Bank holds a maximum lending amount of";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Bank holds a maximum lending amount of $12 million. Please call 1122334 for assistance."),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=1441839;
 //BA.debugLineNum = 1441839;BA.debugLine="Else If (edtTxtTerm.Text > 30) Then		'Restricts";
if (((double)(Double.parseDouble(mostCurrent._edttxtterm.getText()))>30)) { 
RDebugUtils.currentLine=1441840;
 //BA.debugLineNum = 1441840;BA.debugLine="Msgbox(\"Loan Term must be within 30 years\",\"Er";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Loan Term must be within 30 years"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=1441842;
 //BA.debugLineNum = 1441842;BA.debugLine="final_term = term - INITIAL_TERM";
_final_term = (int) (_term-_initial_term);
RDebugUtils.currentLine=1441844;
 //BA.debugLineNum = 1441844;BA.debugLine="total_amount = (amount * INITIAL_INTEREST * IN";
_total_amount = (_amount*_initial_interest*_initial_term)+(_amount*_final_interest*_final_term);
RDebugUtils.currentLine=1441845;
 //BA.debugLineNum = 1441845;BA.debugLine="total_amount = total_amount + amount";
_total_amount = _total_amount+_amount;
RDebugUtils.currentLine=1441846;
 //BA.debugLineNum = 1441846;BA.debugLine="repayment = total_amount / months";
_repayment = _total_amount/(double)_months;
RDebugUtils.currentLine=1441848;
 //BA.debugLineNum = 1441848;BA.debugLine="str1 = NumberFormat2(repayment,1,2,2,False)";
_str1 = anywheresoftware.b4a.keywords.Common.NumberFormat2(_repayment,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1441850;
 //BA.debugLineNum = 1441850;BA.debugLine="If (str1.Length >= 9)Then";
if ((_str1.length()>=9)) { 
RDebugUtils.currentLine=1441851;
 //BA.debugLineNum = 1441851;BA.debugLine="lblResults.Text = \"$\" & str1.SubString2(0,7)";
mostCurrent._lblresults.setText(BA.ObjectToCharSequence("$"+_str1.substring((int) (0),(int) (7))));
RDebugUtils.currentLine=1441852;
 //BA.debugLineNum = 1441852;BA.debugLine="lblDecimal.Text = str1.SubString2(7,9)";
mostCurrent._lbldecimal.setText(BA.ObjectToCharSequence(_str1.substring((int) (7),(int) (9))));
 }else {
RDebugUtils.currentLine=1441854;
 //BA.debugLineNum = 1441854;BA.debugLine="lblDecimal.Text = \"\"";
mostCurrent._lbldecimal.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1441855;
 //BA.debugLineNum = 1441855;BA.debugLine="lblResults.Text = \"$\" & NumberFormat2(repayme";
mostCurrent._lblresults.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat2(_repayment,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)));
 };
 }}
;
 };
 }}
;
RDebugUtils.currentLine=1441861;
 //BA.debugLineNum = 1441861;BA.debugLine="End Sub";
return "";
}
public static String  _btncarloan_click() throws Exception{
RDebugUtils.currentModule="carloan";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncarloan_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncarloan_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub btnCarLoan_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="pnlCalculator.BringToFront";
mostCurrent._pnlcalculator.BringToFront();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="lblHeader.Text = \"Car Loan Calculator\"";
mostCurrent._lblheader.setText(BA.ObjectToCharSequence("Car Loan Calculator"));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="lblInterestInfo.Text = \"* Interest rate at 9.65%";
mostCurrent._lblinterestinfo.setText(BA.ObjectToCharSequence("* Interest rate at 9.65% per annum"));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="btnClear_Click";
_btnclear_click();
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return "";
}
public static String  _btnclear_click() throws Exception{
RDebugUtils.currentModule="carloan";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclear_click", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub btnClear_Click";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="edtTxtAmount.Text = \"\"";
mostCurrent._edttxtamount.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="edtTxtDeposit.Text = \"\"";
mostCurrent._edttxtdeposit.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="edtTxtTerm.Text = \"\"";
mostCurrent._edttxtterm.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="lblResults.Text = \"$0\"";
mostCurrent._lblresults.setText(BA.ObjectToCharSequence("$0"));
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="lblDecimal.Text = \"\"";
mostCurrent._lbldecimal.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="edtTxtAmount.RequestFocus";
mostCurrent._edttxtamount.RequestFocus();
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="End Sub";
return "";
}
public static String  _btncontact_click() throws Exception{
RDebugUtils.currentModule="carloan";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncontact_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncontact_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub btnContact_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="pnlContact.BringToFront";
mostCurrent._pnlcontact.BringToFront();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="lblHeader.Text = \"Contact Us\"";
mostCurrent._lblheader.setText(BA.ObjectToCharSequence("Contact Us"));
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return "";
}
public static String  _btnhomeloan_click() throws Exception{
RDebugUtils.currentModule="carloan";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnhomeloan_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnhomeloan_click", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub btnHomeLoan_Click";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="pnlCalculator.BringToFront";
mostCurrent._pnlcalculator.BringToFront();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="lblHeader.Text = \"Home Loan Calculator\"";
mostCurrent._lblheader.setText(BA.ObjectToCharSequence("Home Loan Calculator"));
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="lblInterestInfo.Text = \"* Interest at 4.95% for f";
mostCurrent._lblinterestinfo.setText(BA.ObjectToCharSequence("* Interest at 4.95% for first 5 years, 6.95% for remaining years"));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="btnClear_Click";
_btnclear_click();
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="End Sub";
return "";
}
}