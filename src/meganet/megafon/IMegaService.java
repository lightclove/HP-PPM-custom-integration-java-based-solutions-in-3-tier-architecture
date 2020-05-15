package meganet.megafon;

import com.microsoft.schemas._2003._10.serialization.ObjectFactory;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfstringstring;
import org.datacontract.schemas._2004._07.system_collections.ObjectFactory;
import types.meganet.megafon.ArrayOfEmployee;
import types.meganet.megafon.ArrayOfOrgDepartment;
import types.meganet.megafon.ArrayOfShortEmployee;
import types.meganet.megafon.DepartmentWithEmployees;
import types.meganet.megafon.Employee;
import types.meganet.megafon.ObjectFactory;
import types.meganet.megafon.OrgDepartment;

@WebService(name = "IMegaService", targetNamespace = "http://megafon.meganet")
@XmlSeeAlso({ObjectFactory.class, ObjectFactory.class, ObjectFactory.class, ObjectFactory.class, ObjectFactory.class})
public interface IMegaService {
  @WebMethod(operationName = "GetUsersInfoByDepartment", action = "http://megafon.meganet/IMegaService/GetUsersInfoByDepartment")
  @WebResult(name = "GetUsersInfoByDepartmentResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetUsersInfoByDepartment", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetUsersInfoByDepartment")
  @ResponseWrapper(localName = "GetUsersInfoByDepartmentResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetUsersInfoByDepartmentResponse")
  ArrayOfEmployee getUsersInfoByDepartment(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") Integer paramInteger, @WebParam(name = "includeSubDep", targetNamespace = "http://megafon.meganet") Boolean paramBoolean);
  
  @WebMethod(operationName = "GetDepartmentInfo", action = "http://megafon.meganet/IMegaService/GetDepartmentInfo")
  @WebResult(name = "GetDepartmentInfoResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetDepartmentInfo", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetDepartmentInfo")
  @ResponseWrapper(localName = "GetDepartmentInfoResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetDepartmentInfoResponse")
  OrgDepartment getDepartmentInfo(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") Integer paramInteger, @WebParam(name = "includeSubDep", targetNamespace = "http://megafon.meganet") Boolean paramBoolean);
  
  @WebMethod(operationName = "GetRootDepartmentInfo", action = "http://megafon.meganet/IMegaService/GetRootDepartmentInfo")
  @WebResult(name = "GetRootDepartmentInfoResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetRootDepartmentInfo", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetRootDepartmentInfo")
  @ResponseWrapper(localName = "GetRootDepartmentInfoResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetRootDepartmentInfoResponse")
  OrgDepartment getRootDepartmentInfo(@WebParam(name = "includeSubDep", targetNamespace = "http://megafon.meganet") Boolean paramBoolean);
  
  @WebMethod(operationName = "GetDepartmentUsersInfo", action = "http://megafon.meganet/IMegaService/GetDepartmentUsersInfo")
  @WebResult(name = "GetDepartmentUsersInfoResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetDepartmentUsersInfo", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetDepartmentUsersInfo")
  @ResponseWrapper(localName = "GetDepartmentUsersInfoResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetDepartmentUsersInfoResponse")
  DepartmentWithEmployees getDepartmentUsersInfo(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") Integer paramInteger);
  
  @WebMethod(operationName = "GetFlatDepartmentCollection", action = "http://megafon.meganet/IMegaService/GetFlatDepartmentCollection")
  @WebResult(name = "GetFlatDepartmentCollectionResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetFlatDepartmentCollection", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetFlatDepartmentCollection")
  @ResponseWrapper(localName = "GetFlatDepartmentCollectionResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetFlatDepartmentCollectionResponse")
  ArrayOfOrgDepartment getFlatDepartmentCollection(@WebParam(name = "rootDepId", targetNamespace = "http://megafon.meganet") Integer paramInteger1, @WebParam(name = "maxHierarchyLevel", targetNamespace = "http://megafon.meganet") Integer paramInteger2);
  
  @WebMethod(operationName = "GetOrgStructureNameById", action = "http://megafon.meganet/IMegaService/GetOrgStructureNameById")
  @WebResult(name = "GetOrgStructureNameByIdResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetOrgStructureNameById", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetOrgStructureNameById")
  @ResponseWrapper(localName = "GetOrgStructureNameByIdResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetOrgStructureNameByIdResponse")
  String getOrgStructureNameById(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(operationName = "GetNewEmployeesForPeriod", action = "http://megafon.meganet/IMegaService/GetNewEmployeesForPeriod")
  @WebResult(name = "GetNewEmployeesForPeriodResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetNewEmployeesForPeriod", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetNewEmployeesForPeriod")
  @ResponseWrapper(localName = "GetNewEmployeesForPeriodResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetNewEmployeesForPeriodResponse")
  ArrayOfOrgDepartment getNewEmployeesForPeriod(@WebParam(name = "login", targetNamespace = "http://megafon.meganet") String paramString, @WebParam(name = "startdate", targetNamespace = "http://megafon.meganet") XMLGregorianCalendar paramXMLGregorianCalendar1, @WebParam(name = "enddate", targetNamespace = "http://megafon.meganet") XMLGregorianCalendar paramXMLGregorianCalendar2);
  
  @WebMethod(operationName = "GetNewEmployeesTopN", action = "http://megafon.meganet/IMegaService/GetNewEmployeesTopN")
  @WebResult(name = "GetNewEmployeesTopNResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetNewEmployeesTopN", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetNewEmployeesTopN")
  @ResponseWrapper(localName = "GetNewEmployeesTopNResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetNewEmployeesTopNResponse")
  ArrayOfOrgDepartment getNewEmployeesTopN(@WebParam(name = "login", targetNamespace = "http://megafon.meganet") String paramString, @WebParam(name = "employeesCount", targetNamespace = "http://megafon.meganet") Integer paramInteger);
  
  @WebMethod(operationName = "GetNewEmployees", action = "http://megafon.meganet/IMegaService/GetNewEmployees")
  @WebResult(name = "GetNewEmployeesResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetNewEmployees", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetNewEmployees")
  @ResponseWrapper(localName = "GetNewEmployeesResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetNewEmployeesResponse")
  ArrayOfOrgDepartment getNewEmployees(@WebParam(name = "login", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(operationName = "GetChildDepartments", action = "http://megafon.meganet/IMegaService/GetChildDepartments")
  @WebResult(name = "GetChildDepartmentsResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetChildDepartments", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetChildDepartments")
  @ResponseWrapper(localName = "GetChildDepartmentsResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetChildDepartmentsResponse")
  ArrayOfOrgDepartment getChildDepartments(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") Integer paramInteger);
  
  @WebMethod(operationName = "GetBirthday", action = "http://megafon.meganet/IMegaService/GetBirthday")
  @WebResult(name = "GetBirthdayResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetBirthday", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetBirthday")
  @ResponseWrapper(localName = "GetBirthdayResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetBirthdayResponse")
  ArrayOfEmployee getBirthday(@WebParam(name = "login", targetNamespace = "http://megafon.meganet") String paramString, @WebParam(name = "date", targetNamespace = "http://megafon.meganet") XMLGregorianCalendar paramXMLGregorianCalendar, @WebParam(name = "full", targetNamespace = "http://megafon.meganet") Boolean paramBoolean);
  
  @WebMethod(operationName = "FindOrganizationProfile", action = "http://megafon.meganet/IMegaService/FindOrganizationProfile")
  @WebResult(name = "FindOrganizationProfileResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "FindOrganizationProfile", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.FindOrganizationProfile")
  @ResponseWrapper(localName = "FindOrganizationProfileResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.FindOrganizationProfileResponse")
  OrgDepartment findOrganizationProfile(@WebParam(name = "login", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(operationName = "GetOrganizationsRoot", action = "http://megafon.meganet/IMegaService/GetOrganizationsRoot")
  @WebResult(name = "GetOrganizationsRootResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetOrganizationsRoot", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetOrganizationsRoot")
  @ResponseWrapper(localName = "GetOrganizationsRootResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetOrganizationsRootResponse")
  ArrayOfOrgDepartment getOrganizationsRoot();
  
  @WebMethod(operationName = "SaveSearchEmployee", action = "http://megafon.meganet/IMegaService/SaveSearchEmployee")
  @Oneway
  @RequestWrapper(localName = "SaveSearchEmployee", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.SaveSearchEmployee")
  void saveSearchEmployee(@WebParam(name = "LoginName", targetNamespace = "http://megafon.meganet") String paramString1, @WebParam(name = "AccountName", targetNamespace = "http://megafon.meganet") String paramString2, @WebParam(name = "Search", targetNamespace = "http://megafon.meganet") String paramString3, @WebParam(name = "IsSearch", targetNamespace = "http://megafon.meganet") Integer paramInteger);
  
  @WebMethod(operationName = "FindProfiles", action = "http://megafon.meganet/IMegaService/FindProfiles")
  @WebResult(name = "FindProfilesResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "FindProfiles", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.FindProfiles")
  @ResponseWrapper(localName = "FindProfilesResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.FindProfilesResponse")
  ArrayOfKeyValuePairOfstringstring findProfiles(@WebParam(name = "search", targetNamespace = "http://megafon.meganet") String paramString, @WebParam(name = "stage", targetNamespace = "http://megafon.meganet") Integer paramInteger1, @WebParam(name = "dep_id", targetNamespace = "http://megafon.meganet") Integer paramInteger2);
  
  @WebMethod(operationName = "FindAllProfiles", action = "http://megafon.meganet/IMegaService/FindAllProfiles")
  @WebResult(name = "FindAllProfilesResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "FindAllProfiles", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.FindAllProfiles")
  @ResponseWrapper(localName = "FindAllProfilesResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.FindAllProfilesResponse")
  ArrayOfShortEmployee findAllProfiles(@WebParam(name = "ProductKey", targetNamespace = "http://megafon.meganet") String paramString1, @WebParam(name = "Name", targetNamespace = "http://megafon.meganet") String paramString2);
  
  @WebMethod(operationName = "ObtainFullProfile", action = "http://megafon.meganet/IMegaService/ObtainFullProfile")
  @WebResult(name = "ObtainFullProfileResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "ObtainFullProfile", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.ObtainFullProfile")
  @ResponseWrapper(localName = "ObtainFullProfileResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.ObtainFullProfileResponse")
  Employee obtainFullProfile(@WebParam(name = "login", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(operationName = "BuildDepartmentPathProfile", action = "http://megafon.meganet/IMegaService/BuildDepartmentPathProfile")
  @WebResult(name = "BuildDepartmentPathProfileResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "BuildDepartmentPathProfile", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.BuildDepartmentPathProfile")
  @ResponseWrapper(localName = "BuildDepartmentPathProfileResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.BuildDepartmentPathProfileResponse")
  String buildDepartmentPathProfile(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") Integer paramInteger, @WebParam(name = "linkCurrentDep", targetNamespace = "http://megafon.meganet") Boolean paramBoolean, @WebParam(name = "urlorgstruct", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(operationName = "FindDepartmentProfile", action = "http://megafon.meganet/IMegaService/FindDepartmentProfile")
  @WebResult(name = "FindDepartmentProfileResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "FindDepartmentProfile", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.FindDepartmentProfile")
  @ResponseWrapper(localName = "FindDepartmentProfileResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.FindDepartmentProfileResponse")
  OrgDepartment findDepartmentProfile(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") Integer paramInteger);
  
  @WebMethod(operationName = "ObtainDepartmentEmployeesProfile", action = "http://megafon.meganet/IMegaService/ObtainDepartmentEmployeesProfile")
  @WebResult(name = "ObtainDepartmentEmployeesProfileResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "ObtainDepartmentEmployeesProfile", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.ObtainDepartmentEmployeesProfile")
  @ResponseWrapper(localName = "ObtainDepartmentEmployeesProfileResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.ObtainDepartmentEmployeesProfileResponse")
  ArrayOfEmployee obtainDepartmentEmployeesProfile(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") Integer paramInteger);
  
  @WebMethod(operationName = "FindOrganizationRootProfile", action = "http://megafon.meganet/IMegaService/FindOrganizationRootProfile")
  @WebResult(name = "FindOrganizationRootProfileResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "FindOrganizationRootProfile", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.FindOrganizationRootProfile")
  @ResponseWrapper(localName = "FindOrganizationRootProfileResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.FindOrganizationRootProfileResponse")
  OrgDepartment findOrganizationRootProfile();
  
  @WebMethod(operationName = "GetRootDepartmentId", action = "http://megafon.meganet/IMegaService/GetRootDepartmentId")
  @WebResult(name = "GetRootDepartmentIdResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetRootDepartmentId", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetRootDepartmentId")
  @ResponseWrapper(localName = "GetRootDepartmentIdResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetRootDepartmentIdResponse")
  String getRootDepartmentId(@WebParam(name = "login", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(operationName = "GetAllChildDepartments", action = "http://megafon.meganet/IMegaService/GetAllChildDepartments")
  @WebResult(name = "GetAllChildDepartmentsResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetAllChildDepartments", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetAllChildDepartments")
  @ResponseWrapper(localName = "GetAllChildDepartmentsResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetAllChildDepartmentsResponse")
  ArrayOfint getAllChildDepartments(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") Integer paramInteger);
  
  @WebMethod(operationName = "GetAllChildEmployees", action = "http://megafon.meganet/IMegaService/GetAllChildEmployees")
  @WebResult(name = "GetAllChildEmployeesResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetAllChildEmployees", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetAllChildEmployees")
  @ResponseWrapper(localName = "GetAllChildEmployeesResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetAllChildEmployeesResponse")
  ArrayOfstring getAllChildEmployees(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") Integer paramInteger);
  
  @WebMethod(operationName = "Helper", action = "http://megafon.meganet/IMegaService/Helper")
  @Oneway
  @RequestWrapper(localName = "Helper", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.Helper")
  void helper(@WebParam(name = "message", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(operationName = "HelloWorld2", action = "http://megafon.meganet/IMegaService/HelloWorld2")
  @WebResult(name = "HelloWorld2Result", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "HelloWorld2", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.HelloWorld2")
  @ResponseWrapper(localName = "HelloWorld2Response", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.HelloWorld2Response")
  String helloWorld2(@WebParam(name = "param", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(operationName = "HelloWorld", action = "http://megafon.meganet/IMegaService/HelloWorld")
  @WebResult(name = "HelloWorldResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "HelloWorld", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.HelloWorld")
  @ResponseWrapper(localName = "HelloWorldResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.HelloWorldResponse")
  String helloWorld(@WebParam(name = "name", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(action = "http://megafon.meganet/IMegaService/testList")
  @WebResult(name = "testListResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "testList", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.TestList")
  @ResponseWrapper(localName = "testListResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.TestListResponse")
  ArrayOfEmployee testList();
  
  @WebMethod(action = "http://megafon.meganet/IMegaService/test")
  @WebResult(name = "testResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "test", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.Test")
  @ResponseWrapper(localName = "testResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.TestResponse")
  Integer test(@WebParam(name = "name", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(action = "http://megafon.meganet/IMegaService/testArr")
  @WebResult(name = "testArrResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "testArr", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.TestArr")
  @ResponseWrapper(localName = "testArrResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.TestArrResponse")
  DepartmentWithEmployees testArr();
  
  @WebMethod(operationName = "GetVersion", action = "http://megafon.meganet/IMegaService/GetVersion")
  @WebResult(name = "GetVersionResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetVersion", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetVersion")
  @ResponseWrapper(localName = "GetVersionResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetVersionResponse")
  String getVersion();
  
  @WebMethod(operationName = "GetUserInfoByLogin", action = "http://megafon.meganet/IMegaService/GetUserInfoByLogin")
  @WebResult(name = "GetUserInfoByLoginResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetUserInfoByLogin", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetUserInfoByLogin")
  @ResponseWrapper(localName = "GetUserInfoByLoginResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetUserInfoByLoginResponse")
  Employee getUserInfoByLogin(@WebParam(name = "login", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(operationName = "GetUserInfoByEmail", action = "http://megafon.meganet/IMegaService/GetUserInfoByEmail")
  @WebResult(name = "GetUserInfoByEmailResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetUserInfoByEmail", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetUserInfoByEmail")
  @ResponseWrapper(localName = "GetUserInfoByEmailResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetUserInfoByEmailResponse")
  Employee getUserInfoByEmail(@WebParam(name = "email", targetNamespace = "http://megafon.meganet") String paramString);
  
  @WebMethod(operationName = "GetUsersInfoByDepartmentCount", action = "http://megafon.meganet/IMegaService/GetUsersInfoByDepartmentCount")
  @WebResult(name = "GetUsersInfoByDepartmentCountResult", targetNamespace = "http://megafon.meganet")
  @RequestWrapper(localName = "GetUsersInfoByDepartmentCount", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetUsersInfoByDepartmentCount")
  @ResponseWrapper(localName = "GetUsersInfoByDepartmentCountResponse", targetNamespace = "http://megafon.meganet", className = "meganet.megafon.GetUsersInfoByDepartmentCountResponse")
  Integer getUsersInfoByDepartmentCount(@WebParam(name = "depId", targetNamespace = "http://megafon.meganet") Integer paramInteger, @WebParam(name = "includeSubDep", targetNamespace = "http://megafon.meganet") Boolean paramBoolean);
}


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\IMegaService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */