package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananomysql extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananomysql", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananomysql.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _rectype = null;
public String _db_varchar_20 = "";
public String _db_varchar_10 = "";
public String _db_varchar_30 = "";
public String _db_varchar_40 = "";
public String _db_varchar_50 = "";
public String _db_varchar_100 = "";
public String _db_varchar_255 = "";
public String _db_string = "";
public String _db_int = "";
public String _db_float = "";
public String _db_blob = "";
public String _db_bool = "";
public String _db_real = "";
public String _db_date = "";
public String _db_integer = "";
public String _db_text = "";
public com.ab.banano.BANano _banano = null;
public String _methodname = "";
public String _methodnamedynamic = "";
public anywheresoftware.b4a.objects.collections.Map _schema = null;
public String _host = "";
public String _username = "";
public String _password = "";
public String _dbase = "";
public anywheresoftware.b4a.objects.collections.List _result = null;
public String _command = "";
public anywheresoftware.b4a.objects.collections.List _types = null;
public anywheresoftware.b4a.objects.collections.List _args = null;
public String _query = "";
public String _response = "";
public String _error = "";
public long _affectedrows = 0L;
public String _json = "";
public boolean _ok = false;
public String _tablename = "";
public String _primarykey = "";
public anywheresoftware.b4a.objects.collections.Map _record = null;
public b4j.example.main _main = null;
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
public b4j.example.bananomysql  _addblobs(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 769;BA.debugLine="private Sub AddBlobs(fieldNames As List) As BANano";
 //BA.debugLineNum = 770;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 771;BA.debugLine="recType.Put(strfld,\"BLOB\")";
_rectype.Put((Object)(_strfld),(Object)("BLOB"));
 }
};
 //BA.debugLineNum = 773;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 774;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _addbooleans(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 756;BA.debugLine="private Sub AddBooleans(fieldNames As List) As BAN";
 //BA.debugLineNum = 757;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 758;BA.debugLine="recType.Put(strfld,\"BOOL\")";
_rectype.Put((Object)(_strfld),(Object)("BOOL"));
 }
};
 //BA.debugLineNum = 760;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 761;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _adddoubles(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 748;BA.debugLine="private Sub AddDoubles(fieldNames As List) As BANa";
 //BA.debugLineNum = 749;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 750;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
_rectype.Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
 //BA.debugLineNum = 752;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _addintegers(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 740;BA.debugLine="private Sub AddIntegers(fieldNames As List) As BAN";
 //BA.debugLineNum = 741;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 742;BA.debugLine="recType.Put(strfld,\"INT\")";
_rectype.Put((Object)(_strfld),(Object)("INT"));
 }
};
 //BA.debugLineNum = 744;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 745;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _addstrings(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 732;BA.debugLine="private Sub AddStrings(fieldNames As List) As BANa";
 //BA.debugLineNum = 733;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 734;BA.debugLine="recType.Put(strfld,\"STRING\")";
_rectype.Put((Object)(_strfld),(Object)("STRING"));
 }
};
 //BA.debugLineNum = 736;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _build() throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 707;BA.debugLine="Sub Build As Map";
 //BA.debugLineNum = 708;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 709;BA.debugLine="b.Put(\"command\", command)";
_b.Put((Object)("command"),(Object)(_command));
 //BA.debugLineNum = 710;BA.debugLine="b.Put(\"query\", query)";
_b.Put((Object)("query"),(Object)(_query));
 //BA.debugLineNum = 711;BA.debugLine="b.Put(\"args\", args)";
_b.Put((Object)("args"),(Object)(_args.getObject()));
 //BA.debugLineNum = 712;BA.debugLine="b.Put(\"types\", types)";
_b.Put((Object)("types"),(Object)(_types.getObject()));
 //BA.debugLineNum = 713;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _builddynamic() throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 717;BA.debugLine="Sub BuildDynamic As Map";
 //BA.debugLineNum = 718;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 719;BA.debugLine="b.Put(\"command\", command)";
_b.Put((Object)("command"),(Object)(_command));
 //BA.debugLineNum = 720;BA.debugLine="b.Put(\"query\", query)";
_b.Put((Object)("query"),(Object)(_query));
 //BA.debugLineNum = 721;BA.debugLine="b.Put(\"args\", args)";
_b.Put((Object)("args"),(Object)(_args.getObject()));
 //BA.debugLineNum = 722;BA.debugLine="b.Put(\"types\", types)";
_b.Put((Object)("types"),(Object)(_types.getObject()));
 //BA.debugLineNum = 723;BA.debugLine="b.put(\"host\", host)";
_b.Put((Object)("host"),(Object)(_host));
 //BA.debugLineNum = 724;BA.debugLine="b.Put(\"username\", username)";
_b.Put((Object)("username"),(Object)(_username));
 //BA.debugLineNum = 725;BA.debugLine="b.Put(\"password\", password)";
_b.Put((Object)("password"),(Object)(_password));
 //BA.debugLineNum = 726;BA.debugLine="b.Put(\"dbname\", DBase)";
_b.Put((Object)("dbname"),(Object)(_dbase));
 //BA.debugLineNum = 727;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 728;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Public const DB_VARCHAR_20 As String = \"VARCHAR(2";
_db_varchar_20 = "VARCHAR(20)";
 //BA.debugLineNum = 5;BA.debugLine="Public const DB_VARCHAR_10 As String = \"VARCHAR(1";
_db_varchar_10 = "VARCHAR(10)";
 //BA.debugLineNum = 6;BA.debugLine="Public const DB_VARCHAR_30 As String = \"VARCHAR(3";
_db_varchar_30 = "VARCHAR(30)";
 //BA.debugLineNum = 7;BA.debugLine="Public const DB_VARCHAR_40 As String = \"VARCHAR(4";
_db_varchar_40 = "VARCHAR(40)";
 //BA.debugLineNum = 8;BA.debugLine="Public const DB_VARCHAR_50 As String = \"VARCHAR(5";
_db_varchar_50 = "VARCHAR(50)";
 //BA.debugLineNum = 9;BA.debugLine="Public const DB_VARCHAR_100 As String = \"VARCHAR(";
_db_varchar_100 = "VARCHAR(100)";
 //BA.debugLineNum = 10;BA.debugLine="Public const DB_VARCHAR_255 As String = \"VARCHAR(";
_db_varchar_255 = "VARCHAR(255)";
 //BA.debugLineNum = 11;BA.debugLine="Public const DB_STRING As String = \"TEXT\"";
_db_string = "TEXT";
 //BA.debugLineNum = 12;BA.debugLine="Public const DB_INT As String = \"INT\"";
_db_int = "INT";
 //BA.debugLineNum = 13;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
_db_float = "FLOAT";
 //BA.debugLineNum = 14;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
 //BA.debugLineNum = 15;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
 //BA.debugLineNum = 16;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
_db_real = "REAL";
 //BA.debugLineNum = 17;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
_db_date = "DATE";
 //BA.debugLineNum = 18;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
_db_integer = "INTEGER";
 //BA.debugLineNum = 19;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
_db_text = "TEXT";
 //BA.debugLineNum = 24;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 25;BA.debugLine="Public MethodName As String";
_methodname = "";
 //BA.debugLineNum = 26;BA.debugLine="Public MethodNameDynamic As String";
_methodnamedynamic = "";
 //BA.debugLineNum = 27;BA.debugLine="Private Schema As Map";
_schema = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 28;BA.debugLine="Private host As String";
_host = "";
 //BA.debugLineNum = 29;BA.debugLine="Private username As String";
_username = "";
 //BA.debugLineNum = 30;BA.debugLine="Private password As String";
_password = "";
 //BA.debugLineNum = 31;BA.debugLine="Public DBase As String";
_dbase = "";
 //BA.debugLineNum = 32;BA.debugLine="Public result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 33;BA.debugLine="Public command As String";
_command = "";
 //BA.debugLineNum = 34;BA.debugLine="Public types As List";
_types = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 35;BA.debugLine="Public args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 36;BA.debugLine="Public query As String";
_query = "";
 //BA.debugLineNum = 37;BA.debugLine="Public response As String";
_response = "";
 //BA.debugLineNum = 38;BA.debugLine="Public error As String";
_error = "";
 //BA.debugLineNum = 39;BA.debugLine="Public affectedRows As Long";
_affectedrows = 0L;
 //BA.debugLineNum = 40;BA.debugLine="Public json As String";
_json = "";
 //BA.debugLineNum = 41;BA.debugLine="Public OK As Boolean";
_ok = false;
 //BA.debugLineNum = 42;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 43;BA.debugLine="Public TableName As String";
_tablename = "";
 //BA.debugLineNum = 44;BA.debugLine="Public PrimaryKey As String";
_primarykey = "";
 //BA.debugLineNum = 45;BA.debugLine="Public Record As Map";
_record = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _connection() throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub Connection As BANanoMySQL";
 //BA.debugLineNum = 259;BA.debugLine="command = \"connection\"";
_command = "connection";
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _createdatabase() throws Exception{
String _ssql = "";
 //BA.debugLineNum = 264;BA.debugLine="Sub CreateDatabase As BANanoMySQL";
 //BA.debugLineNum = 265;BA.debugLine="Dim sSQL As String = $\"CREATE DATABASE IF NOT EXI";
_ssql = ("CREATE DATABASE IF NOT EXISTS "+__c.SmartStringFormatter("",(Object)(_escapefield(_dbase)))+"");
 //BA.debugLineNum = 266;BA.debugLine="query = sSQL";
_query = _ssql;
 //BA.debugLineNum = 267;BA.debugLine="command = \"createdb\"";
_command = "createdb";
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _createtable(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,String _pk,String _auto) throws Exception{
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 286;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
 //BA.debugLineNum = 287;BA.debugLine="Dim fldName As String";
_fldname = "";
 //BA.debugLineNum = 288;BA.debugLine="Dim fldType As String";
_fldtype = "";
 //BA.debugLineNum = 289;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
 //BA.debugLineNum = 290;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
 //BA.debugLineNum = 291;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 292;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 293;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 294;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
 //BA.debugLineNum = 295;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
 //BA.debugLineNum = 296;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
 //BA.debugLineNum = 297;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
 //BA.debugLineNum = 298;BA.debugLine="fldType = fldType.Replace(\"STRING\", \"TEXT\")";
_fldtype = _fldtype.replace("STRING","TEXT");
 //BA.debugLineNum = 299;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
 //BA.debugLineNum = 300;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
 //BA.debugLineNum = 302;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(_escapefield(_fldname));
 //BA.debugLineNum = 303;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 304;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
 //BA.debugLineNum = 305;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
if (_fldname.equalsIgnoreCase(_pk)) { 
 //BA.debugLineNum = 306;BA.debugLine="sb.Append(\" NOT NULL PRIMARY KEY\")";
_sb.Append(" NOT NULL PRIMARY KEY");
 };
 //BA.debugLineNum = 308;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
if (_fldname.equalsIgnoreCase(_auto)) { 
 //BA.debugLineNum = 309;BA.debugLine="sb.Append(\" AUTO_INCREMENT\")";
_sb.Append(" AUTO_INCREMENT");
 };
 }
};
 //BA.debugLineNum = 312;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 314;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tblname)+" "+_sb.ToString();
 //BA.debugLineNum = 315;BA.debugLine="query = query";
_query = _query;
 //BA.debugLineNum = 316;BA.debugLine="command = \"createtable\"";
_command = "createtable";
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 121;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _delete(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 461;BA.debugLine="Sub Delete(primaryValue As String) As BANanoMySQL";
 //BA.debugLineNum = 462;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 463;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 464;BA.debugLine="DeleteWhere(TableName, qw, Array(\"=\"))";
_deletewhere(_tablename,_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}));
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _deleteall() throws Exception{
String _sb = "";
 //BA.debugLineNum = 608;BA.debugLine="Sub DeleteAll As BANanoMySQL";
 //BA.debugLineNum = 609;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(Ta";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 610;BA.debugLine="query = sb";
_query = _sb;
 //BA.debugLineNum = 611;BA.debugLine="command = \"delete\"";
_command = "delete";
 //BA.debugLineNum = 612;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 613;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _deletewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
 //BA.debugLineNum = 626;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
 //BA.debugLineNum = 627;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 628;BA.debugLine="Log($\"BANanoMySQL.DeleteWhere: '${tblName}' sche";
__c.Log(("BANanoMySQL.DeleteWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 630;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 631;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 632;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 633;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 634;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 635;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 636;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 637;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 638;BA.debugLine="For i = 0 To iWhere";
{
final int step12 = 1;
final int limit12 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 639;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 640;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 642;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 643;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 644;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 645;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 647;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 648;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 649;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 650;BA.debugLine="command = \"delete\"";
_command = "delete";
 //BA.debugLineNum = 651;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 652;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _dropdatabase() throws Exception{
String _ssql = "";
 //BA.debugLineNum = 272;BA.debugLine="Sub DropDataBase As BANanoMySQL";
 //BA.debugLineNum = 273;BA.debugLine="Dim sSQL As String = $\"DROP DATABASE ${EscapeFiel";
_ssql = ("DROP DATABASE "+__c.SmartStringFormatter("",(Object)(_escapefield(_dbase)))+"");
 //BA.debugLineNum = 274;BA.debugLine="query = sSQL";
_query = _ssql;
 //BA.debugLineNum = 275;BA.debugLine="command = \"dropdb\"";
_command = "dropdb";
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _droptable() throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="public Sub DropTable As BANanoMySQL";
 //BA.debugLineNum = 323;BA.debugLine="Dim query As String = \"DROP TABLE \" & EscapeField";
_query = "DROP TABLE "+_escapefield(_tablename);
 //BA.debugLineNum = 324;BA.debugLine="query = query";
_query = _query;
 //BA.debugLineNum = 325;BA.debugLine="command = \"droptable\"";
_command = "droptable";
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 615;BA.debugLine="private Sub EQOperators(sm As Map) As List";
 //BA.debugLineNum = 616;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 617;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 618;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 619;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
 //BA.debugLineNum = 621;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 622;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Private Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 254;BA.debugLine="Return $\"`${f}`\"$";
if (true) return ("`"+__c.SmartStringFormatter("",(Object)(_f))+"`");
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _execute(String _strsql) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub Execute(strSQL As String) As BANanoMySQL";
 //BA.debugLineNum = 280;BA.debugLine="query = strSQL";
_query = _strsql;
 //BA.debugLineNum = 281;BA.debugLine="command = \"execute\"";
_command = "execute";
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _exists(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 510;BA.debugLine="Sub Exists(primaryValue As String) As BANanoMySQL";
 //BA.debugLineNum = 511;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 512;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 513;BA.debugLine="SelectWhere(TableName, Array(PrimaryKey), qw, Nul";
_selectwhere(_tablename,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _firstrecord() throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 763;BA.debugLine="Sub FirstRecord As Map";
 //BA.debugLineNum = 764;BA.debugLine="Dim rec As Map = result.Get(0)";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_result.Get((int) (0))));
 //BA.debugLineNum = 765;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 766;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _fromjson() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 66;BA.debugLine="Sub FromJSON As BANanoMySQL";
 //BA.debugLineNum = 67;BA.debugLine="OK = False";
_ok = __c.False;
 //BA.debugLineNum = 68;BA.debugLine="Dim m As Map = BANano.FromJson(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_banano.FromJson((Object)(_json))));
 //BA.debugLineNum = 69;BA.debugLine="response = m.Get(\"response\")";
_response = BA.ObjectToString(_m.Get((Object)("response")));
 //BA.debugLineNum = 70;BA.debugLine="error = m.Get(\"error\")";
_error = BA.ObjectToString(_m.Get((Object)("error")));
 //BA.debugLineNum = 71;BA.debugLine="result = m.Get(\"result\")";
_result.setObject((java.util.List)(_m.Get((Object)("result"))));
 //BA.debugLineNum = 72;BA.debugLine="affectedRows = m.Get(\"affectedRows\")";
_affectedrows = BA.ObjectToLongNumber(_m.Get((Object)("affectedRows")));
 //BA.debugLineNum = 73;BA.debugLine="If response = \"Success\" And affectedRows >= 1 The";
if ((_response).equals("Success") && _affectedrows>=1) { 
 //BA.debugLineNum = 74;BA.debugLine="OK = True";
_ok = __c.True;
 };
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 374;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 375;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 376;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 377;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 378;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 379;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 380;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 381;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 382;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 384;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
 //BA.debugLineNum = 330;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
 //BA.debugLineNum = 331;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 332;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
 //BA.debugLineNum = 333;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 334;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 335;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 336;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 337;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 338;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_col),(Object)("STRING")));
 //BA.debugLineNum = 339;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"VARCHAR(20)","VARCHAR(10)","VARCHAR(30)","VARCHAR(40)","VARCHAR(50)","VARCHAR(100)","VARCHAR(255)","STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR","INTEGER","INT","BOOL","BOOLEAN","REAL","FLOAT","DOUBLE","BLOB")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 341;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 4: 
case 5: 
case 6: {
 //BA.debugLineNum = 343;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
 //BA.debugLineNum = 345;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 13: 
case 14: 
case 15: 
case 16: {
 //BA.debugLineNum = 347;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 17: 
case 18: 
case 19: {
 //BA.debugLineNum = 349;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
case 20: {
 //BA.debugLineNum = 351;BA.debugLine="listOfTypes.Add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
default: {
 //BA.debugLineNum = 353;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
 //BA.debugLineNum = 356;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 360;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 361;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 362;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 363;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 364;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 365;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 366;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 367;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
 //BA.debugLineNum = 368;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 370;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _getmax() throws Exception{
String _sb = "";
 //BA.debugLineNum = 81;BA.debugLine="Sub GetMax As BANanoMySQL";
 //BA.debugLineNum = 82;BA.debugLine="Dim sb As String = $\"SELECT MAX(${PrimaryKey}) As";
_sb = ("SELECT MAX("+__c.SmartStringFormatter("",(Object)(_primarykey))+") As "+__c.SmartStringFormatter("",(Object)(_primarykey))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 83;BA.debugLine="query = sb";
_query = _sb;
 //BA.debugLineNum = 84;BA.debugLine="command = \"getmax\"";
_command = "getmax";
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public String  _getnextid() throws Exception{
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
 //BA.debugLineNum = 104;BA.debugLine="Sub GetNextID As String";
 //BA.debugLineNum = 105;BA.debugLine="Dim nextid As Int";
_nextid = 0;
 //BA.debugLineNum = 106;BA.debugLine="Dim strid As String";
_strid = "";
 //BA.debugLineNum = 108;BA.debugLine="If result.Size = 0 Then";
if (_result.getSize()==0) { 
 //BA.debugLineNum = 109;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
 //BA.debugLineNum = 111;BA.debugLine="Dim nr As Map = result.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_result.Get((int) (0))));
 //BA.debugLineNum = 112;BA.debugLine="Dim ni As String = nr.GetDefault(PrimaryKey,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(_primarykey),(Object)("0")));
 //BA.debugLineNum = 113;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = _banano.parseInt((Object)(_ni));
 };
 //BA.debugLineNum = 115;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
 //BA.debugLineNum = 116;BA.debugLine="strid = CStr(nextid)";
_strid = _cstr((Object)(_nextid));
 //BA.debugLineNum = 117;BA.debugLine="Return strid";
if (true) return _strid;
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _gettablenames() throws Exception{
String _sb = "";
 //BA.debugLineNum = 89;BA.debugLine="Sub GetTableNames As BANanoMySQL";
 //BA.debugLineNum = 90;BA.debugLine="Dim sb As String = $\"select table_name from infor";
_sb = ("select table_name from information_schema.tables where table_schema = '"+__c.SmartStringFormatter("",(Object)(_dbase))+"'");
 //BA.debugLineNum = 91;BA.debugLine="query = sb";
_query = _sb;
 //BA.debugLineNum = 92;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _gettablestructure() throws Exception{
String _sb = "";
 //BA.debugLineNum = 97;BA.debugLine="Sub GetTableStructure As BANanoMySQL";
 //BA.debugLineNum = 98;BA.debugLine="Dim sb As String = $\"describe ${EscapeField(Table";
_sb = ("describe "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 99;BA.debugLine="query = sb";
_query = _sb;
 //BA.debugLineNum = 100;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _initialize(anywheresoftware.b4a.BA _ba,String _dbname,String _tblname,String _pk) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 126;BA.debugLine="Public Sub Initialize(dbName As String, tblName As";
 //BA.debugLineNum = 127;BA.debugLine="Schema.Initialize";
_schema.Initialize();
 //BA.debugLineNum = 128;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 129;BA.debugLine="Record.Initialize";
_record.Initialize();
 //BA.debugLineNum = 130;BA.debugLine="MethodName = \"BANanoMySQL\"";
_methodname = "BANanoMySQL";
 //BA.debugLineNum = 131;BA.debugLine="MethodNameDynamic = \"BANanoMySQLDynamic\"";
_methodnamedynamic = "BANanoMySQLDynamic";
 //BA.debugLineNum = 132;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 133;BA.debugLine="command = \"\"";
_command = "";
 //BA.debugLineNum = 134;BA.debugLine="PrimaryKey = PK";
_primarykey = _pk;
 //BA.debugLineNum = 135;BA.debugLine="DBase = dbName";
_dbase = _dbname;
 //BA.debugLineNum = 136;BA.debugLine="TableName = tblName";
_tablename = _tblname;
 //BA.debugLineNum = 137;BA.debugLine="types.Initialize";
_types.Initialize();
 //BA.debugLineNum = 138;BA.debugLine="args.Initialize";
_args.Initialize();
 //BA.debugLineNum = 139;BA.debugLine="types = Null";
_types.setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 140;BA.debugLine="args = Null";
_args.setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 141;BA.debugLine="query = \"\"";
_query = "";
 //BA.debugLineNum = 142;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 143;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 144;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 145;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 146;BA.debugLine="OK = False";
_ok = __c.False;
 //BA.debugLineNum = 147;BA.debugLine="host = \"\"";
_host = "";
 //BA.debugLineNum = 148;BA.debugLine="username = \"\"";
_username = "";
 //BA.debugLineNum = 149;BA.debugLine="password = \"\"";
_password = "";
 //BA.debugLineNum = 150;BA.debugLine="DBase = \"\"";
_dbase = "";
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _insert() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
 //BA.debugLineNum = 389;BA.debugLine="Sub Insert As BANanoMySQL";
 //BA.debugLineNum = 390;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 391;BA.debugLine="Log($\"BANanoMySQL.Insert: '${TableName}' schema";
__c.Log(("BANanoMySQL.Insert: '"+__c.SmartStringFormatter("",(Object)(_tablename))+"' schema is not set!"));
 };
 //BA.debugLineNum = 393;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 394;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 395;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 396;BA.debugLine="Dim listOfValues As List = GetMapValues(Record)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_record);
 //BA.debugLineNum = 397;BA.debugLine="Dim listOfTypes As List = GetMapTypes(Record)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_record);
 //BA.debugLineNum = 398;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 399;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 400;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 401;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 402;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 403;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(TableName)}";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" ("));
 //BA.debugLineNum = 404;BA.debugLine="iTot = Record.Size - 1";
_itot = (int) (_record.getSize()-1);
 //BA.debugLineNum = 405;BA.debugLine="For iCnt = 0 To iTot";
{
final int step16 = 1;
final int limit16 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit16 ;_icnt = _icnt + step16 ) {
 //BA.debugLineNum = 406;BA.debugLine="Dim col As String = Record.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_record.GetKeyAt(_icnt));
 //BA.debugLineNum = 407;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 408;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 409;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 411;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 412;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 414;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 415;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 416;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 417;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 418;BA.debugLine="query = sb.ToString";
_query = _sb.ToString();
 //BA.debugLineNum = 419;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 420;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 421;BA.debugLine="command = \"insert\"";
_command = "insert";
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _insertreplace() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
 //BA.debugLineNum = 427;BA.debugLine="Sub InsertReplace As BANanoMySQL";
 //BA.debugLineNum = 428;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 429;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 430;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 431;BA.debugLine="Dim listOfValues As List = GetMapValues(Record)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_record);
 //BA.debugLineNum = 432;BA.debugLine="Dim listOfTypes As List = GetMapTypes(Record)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_record);
 //BA.debugLineNum = 433;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 434;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 435;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 436;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 437;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 438;BA.debugLine="sb.Append($\"REPLACE INTO ${EscapeField(TableName)";
_sb.Append(("REPLACE INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" ("));
 //BA.debugLineNum = 439;BA.debugLine="iTot = Record.Size - 1";
_itot = (int) (_record.getSize()-1);
 //BA.debugLineNum = 440;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
 //BA.debugLineNum = 441;BA.debugLine="Dim col As String = Record.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_record.GetKeyAt(_icnt));
 //BA.debugLineNum = 442;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 443;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 444;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 446;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 447;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 449;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 450;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 451;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 452;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 453;BA.debugLine="query = sb.ToString";
_query = _sb.ToString();
 //BA.debugLineNum = 454;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 455;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 456;BA.debugLine="command = \"replace\"";
_command = "replace";
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 487;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
 //BA.debugLineNum = 488;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 489;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 490;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 491;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 492;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 493;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 494;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 495;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 496;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 498;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 470;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
 //BA.debugLineNum = 471;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 472;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 473;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 474;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 475;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 476;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 477;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 478;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 479;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 480;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 481;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 483;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _jsonx = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 228;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 229;BA.debugLine="Dim jsonx As BANanoJSONParser";
_jsonx = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 230;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 231;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 232;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 233;BA.debugLine="Try";
try { //BA.debugLineNum = 234;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 235;BA.debugLine="jsonx.Initialize(strJSON)";
_jsonx.Initialize(_strjson);
 //BA.debugLineNum = 236;BA.debugLine="Map1 = jsonx.NextObject";
_map1 = _jsonx.NextObject();
 };
 //BA.debugLineNum = 238;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 240;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _jsonx = null;
 //BA.debugLineNum = 245;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 246;BA.debugLine="Dim jsonx As BANanoJSONGenerator";
_jsonx = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 247;BA.debugLine="jsonx.Initialize(mp)";
_jsonx.Initialize(_mp);
 //BA.debugLineNum = 248;BA.debugLine="Return jsonx.ToString";
if (true) return _jsonx.ToString();
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _read(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 502;BA.debugLine="Sub Read(primaryValue As String) As BANanoMySQL";
 //BA.debugLineNum = 503;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 504;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 505;BA.debugLine="SelectWhere(TableName, Array(\"*\"), qw, Null, Arra";
_selectwhere(_tablename,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 506;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 507;BA.debugLine="End Sub";
return null;
}
public String  _recordfrommap(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 57;BA.debugLine="Sub RecordFromMap(sm As Map)";
 //BA.debugLineNum = 58;BA.debugLine="Record.Initialize";
_record.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _sm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 60;BA.debugLine="Dim v As Object = sm.Get(k)";
_v = _sm.Get((Object)(_k));
 //BA.debugLineNum = 61;BA.debugLine="Record.Put(k, v)";
_record.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _schemaaddblob(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoMySQL";
 //BA.debugLineNum = 200;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 201;BA.debugLine="Schema.Put(b, DB_BLOB)";
_schema.Put((Object)(_b),(Object)(_db_blob));
 }
};
 //BA.debugLineNum = 203;BA.debugLine="AddBlobs(bools)";
_addblobs(_bools);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaaddboolean(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 166;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoMySQL";
 //BA.debugLineNum = 167;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 168;BA.debugLine="Schema.Put(b, DB_BOOL)";
_schema.Put((Object)(_b),(Object)(_db_bool));
 }
};
 //BA.debugLineNum = 170;BA.debugLine="AddBooleans(bools)";
_addbooleans(_bools);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaadddate(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 219;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoMySQL";
 //BA.debugLineNum = 220;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 221;BA.debugLine="Schema.Put(b, DB_DATE)";
_schema.Put((Object)(_b),(Object)(_db_date));
 }
};
 //BA.debugLineNum = 223;BA.debugLine="AddStrings(bools)";
_addstrings(_bools);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaaddfloat(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 191;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoMySQL";
 //BA.debugLineNum = 192;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 193;BA.debugLine="Schema.Put(b, DB_FLOAT)";
_schema.Put((Object)(_b),(Object)(_db_float));
 }
};
 //BA.debugLineNum = 195;BA.debugLine="AddDoubles(bools)";
_adddoubles(_bools);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaaddint(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 183;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoMySQL";
 //BA.debugLineNum = 184;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 185;BA.debugLine="Schema.Put(b, DB_INT)";
_schema.Put((Object)(_b),(Object)(_db_int));
 }
};
 //BA.debugLineNum = 187;BA.debugLine="AddIntegers(bools)";
_addintegers(_bools);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaaddtext(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 207;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoMySQL";
 //BA.debugLineNum = 208;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 209;BA.debugLine="Schema.Put(b, DB_STRING)";
_schema.Put((Object)(_b),(Object)(_db_string));
 }
};
 //BA.debugLineNum = 211;BA.debugLine="AddStrings(bools)";
_addstrings(_bools);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaclear() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SchemaClear As BANanoMySQL";
 //BA.debugLineNum = 156;BA.debugLine="Schema.clear";
_schema.Clear();
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemacreatetable(String _tblname,String _pk,String _auto) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SchemaCreateTable(tblName As String, PK As Str";
 //BA.debugLineNum = 216;BA.debugLine="Return CreateTable(tblName, Schema, PK, Auto)";
if (true) return _createtable(_tblname,_schema,_pk,_auto);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public String  _schemafromdesign(b4j.example.vmcontainer _vdesign) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SchemaFromDesign(vDesign As VMContainer)";
 //BA.debugLineNum = 175;BA.debugLine="SchemaAddBoolean(vDesign.Booleans)";
_schemaaddboolean(_vdesign._booleans /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 176;BA.debugLine="SchemaAddDate(vDesign.Dates)";
_schemaadddate(_vdesign._dates /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 177;BA.debugLine="SchemaAddFloat(vDesign.Doubles)";
_schemaaddfloat(_vdesign._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 178;BA.debugLine="SchemaAddInt(vDesign.Integers)";
_schemaaddint(_vdesign._integers /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 179;BA.debugLine="SchemaAddText(vDesign.Strings)";
_schemaaddtext(_vdesign._strings /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _selectall(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
 //BA.debugLineNum = 656;BA.debugLine="Sub SelectAll(tblfields As List, orderBy As List)";
 //BA.debugLineNum = 658;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 659;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 660;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 662;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 664;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 666;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 667;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 668;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+""));
 //BA.debugLineNum = 669;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 671;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 672;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 673;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 676;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 677;BA.debugLine="command =  \"select\"";
_command = "select";
 //BA.debugLineNum = 678;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _selectdistinctall(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
 //BA.debugLineNum = 682;BA.debugLine="Sub SelectDistinctAll(tblfields As List, orderBy A";
 //BA.debugLineNum = 684;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 685;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 686;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 688;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 690;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 692;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 693;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 694;BA.debugLine="sb.Append($\"SELECT DISTINCT ${selFIelds} FROM ${E";
_sb.Append(("SELECT DISTINCT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+""));
 //BA.debugLineNum = 695;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 697;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 698;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 699;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 702;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 703;BA.debugLine="command =  \"select\"";
_command = "select";
 //BA.debugLineNum = 704;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 705;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _selectdistinctwhere(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _oper = "";
String _stro = "";
 //BA.debugLineNum = 563;BA.debugLine="Sub SelectDistinctWhere(tblName As String, tblfiel";
 //BA.debugLineNum = 564;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 565;BA.debugLine="Log($\"BANanoMySQL.SelectWhere: '${tblName}' sche";
__c.Log(("BANanoMySQL.SelectWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 567;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 568;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 569;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 571;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 572;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 573;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 575;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 577;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 579;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 580;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 581;BA.debugLine="sb.Append($\"SELECT DISTINCT ${selFIelds} FROM ${E";
_sb.Append(("SELECT DISTINCT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 582;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 583;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 584;BA.debugLine="For i = 0 To iWhere";
{
final int step20 = 1;
final int limit20 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 585;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 586;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 588;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 589;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 590;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 591;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 }
};
 //BA.debugLineNum = 593;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 595;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 596;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 597;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 600;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 601;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 602;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 603;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 604;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _selectwhere(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _oper = "";
String _stro = "";
 //BA.debugLineNum = 518;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
 //BA.debugLineNum = 519;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 520;BA.debugLine="Log($\"BANanoMySQL.SelectWhere: '${tblName}' sche";
__c.Log(("BANanoMySQL.SelectWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 522;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 523;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 524;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 526;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 527;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 528;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 530;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 532;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 534;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 535;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 536;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 537;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 538;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 539;BA.debugLine="For i = 0 To iWhere";
{
final int step20 = 1;
final int limit20 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 540;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 541;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 543;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 544;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 545;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 546;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 }
};
 //BA.debugLineNum = 548;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 550;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 551;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 552;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 555;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 556;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 557;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 558;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 559;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _setconnection(String _shost,String _susername,String _spassword,String _sdbname) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetConnection(shost As String, susername As St";
 //BA.debugLineNum = 50;BA.debugLine="host = shost";
_host = _shost;
 //BA.debugLineNum = 51;BA.debugLine="username = susername";
_username = _susername;
 //BA.debugLineNum = 52;BA.debugLine="password = spassword";
_password = _spassword;
 //BA.debugLineNum = 53;BA.debugLine="DBase = sdbname";
_dbase = _sdbname;
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _setfield(String _fldname,Object _fldvalue) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetField(fldName As String, fldValue As Object";
 //BA.debugLineNum = 161;BA.debugLine="Record.Put(fldName, fldValue)";
_record.Put((Object)(_fldname),_fldvalue);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _update(String _privalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
 //BA.debugLineNum = 776;BA.debugLine="Sub Update(priValue As String) As BANanoMySQL";
 //BA.debugLineNum = 777;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
 //BA.debugLineNum = 778;BA.debugLine="tblWhere.Put(PrimaryKey, priValue)";
_tblwhere.Put((Object)(_primarykey),(Object)(_privalue));
 //BA.debugLineNum = 779;BA.debugLine="UpdateWhere(TableName, Record, tblWhere, Null)";
_updatewhere(_tablename,_record,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 780;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 781;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _updateall(anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
String _oper = "";
 //BA.debugLineNum = 829;BA.debugLine="Sub UpdateAll(tblFields As Map, operators As List)";
 //BA.debugLineNum = 830;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblfields);};
 //BA.debugLineNum = 831;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 832;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = _getmapvalues(_tblfields);
 //BA.debugLineNum = 833;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 834;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 835;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(TableName)} SET";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" SET "));
 //BA.debugLineNum = 836;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 837;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 838;BA.debugLine="For i = 0 To iTot";
{
final int step9 = 1;
final int limit9 = _itot;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 839;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 840;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 841;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 842;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 843;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
 //BA.debugLineNum = 845;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 };
 }
};
 //BA.debugLineNum = 848;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 849;BA.debugLine="args = args";
_args = _args;
 //BA.debugLineNum = 850;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 851;BA.debugLine="command = \"update\"";
_command = "update";
 //BA.debugLineNum = 852;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 853;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _updatewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listoftypes1 = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listofvalues1 = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
int _iwhere = 0;
String _opr = "";
 //BA.debugLineNum = 784;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
 //BA.debugLineNum = 785;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 786;BA.debugLine="Log($\"BANanoMySQL.UpdateWhere: '${tblName}' sche";
__c.Log(("BANanoMySQL.UpdateWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 788;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 789;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 790;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 791;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
 //BA.debugLineNum = 792;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 793;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 794;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
 //BA.debugLineNum = 795;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 796;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 797;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 798;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 799;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 800;BA.debugLine="For i = 0 To iTot";
{
final int step16 = 1;
final int limit16 = _itot;
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 801;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 802;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 803;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 804;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
 //BA.debugLineNum = 806;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
 //BA.debugLineNum = 809;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
 //BA.debugLineNum = 810;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 811;BA.debugLine="For i = 0 To iWhere";
{
final int step27 = 1;
final int limit27 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
 //BA.debugLineNum = 812;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 813;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 815;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 816;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 817;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 818;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 820;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 821;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 822;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 823;BA.debugLine="command = \"update\"";
_command = "update";
 //BA.debugLineNum = 824;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
 //BA.debugLineNum = 825;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
