/*      */ package meganet.megafon;
/*      */ 
/*      */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
/*      */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
/*      */ import javax.xml.bind.JAXBElement;
/*      */ import javax.xml.bind.annotation.XmlElementDecl;
/*      */ import javax.xml.bind.annotation.XmlRegistry;
/*      */ import javax.xml.namespace.QName;
/*      */ import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfstringstring;
/*      */ import types.meganet.megafon.ArrayOfEmployee;
/*      */ import types.meganet.megafon.ArrayOfOrgDepartment;
/*      */ import types.meganet.megafon.ArrayOfShortEmployee;
/*      */ import types.meganet.megafon.DepartmentWithEmployees;
/*      */ import types.meganet.megafon.Employee;
/*      */ import types.meganet.megafon.OrgDepartment;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @XmlRegistry
/*      */ public class ObjectFactory
/*      */ {
/*   36 */   private static final QName _HelloWorldName_QNAME = new QName("http://megafon.meganet", "name");
/*   37 */   private static final QName _GetAllChildEmployeesResponseGetAllChildEmployeesResult_QNAME = new QName("http://megafon.meganet", "GetAllChildEmployeesResult");
/*   38 */   private static final QName _GetUsersInfoByDepartmentResponseGetUsersInfoByDepartmentResult_QNAME = new QName("http://megafon.meganet", "GetUsersInfoByDepartmentResult");
/*   39 */   private static final QName _GetBirthdayLogin_QNAME = new QName("http://megafon.meganet", "login");
/*   40 */   private static final QName _GetUserInfoByEmailResponseGetUserInfoByEmailResult_QNAME = new QName("http://megafon.meganet", "GetUserInfoByEmailResult");
/*   41 */   private static final QName _SaveSearchEmployeeSearch_QNAME = new QName("http://megafon.meganet", "Search");
/*   42 */   private static final QName _SaveSearchEmployeeLoginName_QNAME = new QName("http://megafon.meganet", "LoginName");
/*   43 */   private static final QName _SaveSearchEmployeeAccountName_QNAME = new QName("http://megafon.meganet", "AccountName");
/*   44 */   private static final QName _HelloWorld2Param_QNAME = new QName("http://megafon.meganet", "param");
/*   45 */   private static final QName _GetNewEmployeesTopNResponseGetNewEmployeesTopNResult_QNAME = new QName("http://megafon.meganet", "GetNewEmployeesTopNResult");
/*   46 */   private static final QName _TestListResponseTestListResult_QNAME = new QName("http://megafon.meganet", "testListResult");
/*   47 */   private static final QName _GetBirthdayResponseGetBirthdayResult_QNAME = new QName("http://megafon.meganet", "GetBirthdayResult");
/*   48 */   private static final QName _GetVersionResponseGetVersionResult_QNAME = new QName("http://megafon.meganet", "GetVersionResult");
/*   49 */   private static final QName _GetOrgStructureNameByIdDepId_QNAME = new QName("http://megafon.meganet", "depId");
/*   50 */   private static final QName _ObtainDepartmentEmployeesProfileResponseObtainDepartmentEmployeesProfileResult_QNAME = new QName("http://megafon.meganet", "ObtainDepartmentEmployeesProfileResult");
/*   51 */   private static final QName _FindAllProfilesResponseFindAllProfilesResult_QNAME = new QName("http://megafon.meganet", "FindAllProfilesResult");
/*   52 */   private static final QName _TestArrResponseTestArrResult_QNAME = new QName("http://megafon.meganet", "testArrResult");
/*   53 */   private static final QName _HelperMessage_QNAME = new QName("http://megafon.meganet", "message");
/*   54 */   private static final QName _GetAllChildDepartmentsResponseGetAllChildDepartmentsResult_QNAME = new QName("http://megafon.meganet", "GetAllChildDepartmentsResult");
/*   55 */   private static final QName _ObtainFullProfileResponseObtainFullProfileResult_QNAME = new QName("http://megafon.meganet", "ObtainFullProfileResult");
/*   56 */   private static final QName _FindProfilesResponseFindProfilesResult_QNAME = new QName("http://megafon.meganet", "FindProfilesResult");
/*   57 */   private static final QName _GetFlatDepartmentCollectionResponseGetFlatDepartmentCollectionResult_QNAME = new QName("http://megafon.meganet", "GetFlatDepartmentCollectionResult");
/*   58 */   private static final QName _FindOrganizationProfileResponseFindOrganizationProfileResult_QNAME = new QName("http://megafon.meganet", "FindOrganizationProfileResult");
/*   59 */   private static final QName _HelloWorldResponseHelloWorldResult_QNAME = new QName("http://megafon.meganet", "HelloWorldResult");
/*   60 */   private static final QName _FindProfilesSearch_QNAME = new QName("http://megafon.meganet", "search");
/*   61 */   private static final QName _GetRootDepartmentInfoResponseGetRootDepartmentInfoResult_QNAME = new QName("http://megafon.meganet", "GetRootDepartmentInfoResult");
/*   62 */   private static final QName _GetOrganizationsRootResponseGetOrganizationsRootResult_QNAME = new QName("http://megafon.meganet", "GetOrganizationsRootResult");
/*   63 */   private static final QName _GetUserInfoByEmailEmail_QNAME = new QName("http://megafon.meganet", "email");
/*   64 */   private static final QName _FindAllProfilesName_QNAME = new QName("http://megafon.meganet", "Name");
/*   65 */   private static final QName _FindAllProfilesProductKey_QNAME = new QName("http://megafon.meganet", "ProductKey");
/*   66 */   private static final QName _GetNewEmployeesResponseGetNewEmployeesResult_QNAME = new QName("http://megafon.meganet", "GetNewEmployeesResult");
/*   67 */   private static final QName _GetChildDepartmentsResponseGetChildDepartmentsResult_QNAME = new QName("http://megafon.meganet", "GetChildDepartmentsResult");
/*   68 */   private static final QName _FindOrganizationRootProfileResponseFindOrganizationRootProfileResult_QNAME = new QName("http://megafon.meganet", "FindOrganizationRootProfileResult");
/*   69 */   private static final QName _GetRootDepartmentIdResponseGetRootDepartmentIdResult_QNAME = new QName("http://megafon.meganet", "GetRootDepartmentIdResult");
/*   70 */   private static final QName _HelloWorld2ResponseHelloWorld2Result_QNAME = new QName("http://megafon.meganet", "HelloWorld2Result");
/*   71 */   private static final QName _BuildDepartmentPathProfileResponseBuildDepartmentPathProfileResult_QNAME = new QName("http://megafon.meganet", "BuildDepartmentPathProfileResult");
/*   72 */   private static final QName _GetDepartmentUsersInfoResponseGetDepartmentUsersInfoResult_QNAME = new QName("http://megafon.meganet", "GetDepartmentUsersInfoResult");
/*   73 */   private static final QName _GetOrgStructureNameByIdResponseGetOrgStructureNameByIdResult_QNAME = new QName("http://megafon.meganet", "GetOrgStructureNameByIdResult");
/*   74 */   private static final QName _BuildDepartmentPathProfileUrlorgstruct_QNAME = new QName("http://megafon.meganet", "urlorgstruct");
/*   75 */   private static final QName _GetNewEmployeesForPeriodResponseGetNewEmployeesForPeriodResult_QNAME = new QName("http://megafon.meganet", "GetNewEmployeesForPeriodResult");
/*   76 */   private static final QName _GetDepartmentInfoResponseGetDepartmentInfoResult_QNAME = new QName("http://megafon.meganet", "GetDepartmentInfoResult");
/*   77 */   private static final QName _FindDepartmentProfileResponseFindDepartmentProfileResult_QNAME = new QName("http://megafon.meganet", "FindDepartmentProfileResult");
/*   78 */   private static final QName _GetUserInfoByLoginResponseGetUserInfoByLoginResult_QNAME = new QName("http://megafon.meganet", "GetUserInfoByLoginResult");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public HelloWorld createHelloWorld() {
/*   92 */     return new HelloWorld();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAllChildEmployeesResponse createGetAllChildEmployeesResponse() {
/*  100 */     return new GetAllChildEmployeesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetUsersInfoByDepartmentResponse createGetUsersInfoByDepartmentResponse() {
/*  108 */     return new GetUsersInfoByDepartmentResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetBirthday createGetBirthday() {
/*  116 */     return new GetBirthday();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNewEmployees createGetNewEmployees() {
/*  124 */     return new GetNewEmployees();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetUserInfoByEmailResponse createGetUserInfoByEmailResponse() {
/*  132 */     return new GetUserInfoByEmailResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SaveSearchEmployee createSaveSearchEmployee() {
/*  140 */     return new SaveSearchEmployee();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetOrganizationsRoot createGetOrganizationsRoot() {
/*  148 */     return new GetOrganizationsRoot();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public HelloWorld2 createHelloWorld2() {
/*  156 */     return new HelloWorld2();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNewEmployeesTopNResponse createGetNewEmployeesTopNResponse() {
/*  164 */     return new GetNewEmployeesTopNResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TestListResponse createTestListResponse() {
/*  172 */     return new TestListResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRootDepartmentId createGetRootDepartmentId() {
/*  180 */     return new GetRootDepartmentId();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetUsersInfoByDepartment createGetUsersInfoByDepartment() {
/*  188 */     return new GetUsersInfoByDepartment();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAllChildDepartments createGetAllChildDepartments() {
/*  196 */     return new GetAllChildDepartments();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TestList createTestList() {
/*  204 */     return new TestList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Test createTest() {
/*  212 */     return new Test();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindOrganizationRootProfile createFindOrganizationRootProfile() {
/*  220 */     return new FindOrganizationRootProfile();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetUsersInfoByDepartmentCountResponse createGetUsersInfoByDepartmentCountResponse() {
/*  228 */     return new GetUsersInfoByDepartmentCountResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAllChildEmployees createGetAllChildEmployees() {
/*  236 */     return new GetAllChildEmployees();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDepartmentInfo createGetDepartmentInfo() {
/*  244 */     return new GetDepartmentInfo();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNewEmployeesForPeriod createGetNewEmployeesForPeriod() {
/*  252 */     return new GetNewEmployeesForPeriod();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetVersionResponse createGetVersionResponse() {
/*  260 */     return new GetVersionResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetBirthdayResponse createGetBirthdayResponse() {
/*  268 */     return new GetBirthdayResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetOrgStructureNameById createGetOrgStructureNameById() {
/*  276 */     return new GetOrgStructureNameById();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetFlatDepartmentCollection createGetFlatDepartmentCollection() {
/*  284 */     return new GetFlatDepartmentCollection();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRootDepartmentInfo createGetRootDepartmentInfo() {
/*  292 */     return new GetRootDepartmentInfo();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindAllProfilesResponse createFindAllProfilesResponse() {
/*  300 */     return new FindAllProfilesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetChildDepartments createGetChildDepartments() {
/*  308 */     return new GetChildDepartments();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ObtainDepartmentEmployeesProfileResponse createObtainDepartmentEmployeesProfileResponse() {
/*  316 */     return new ObtainDepartmentEmployeesProfileResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Helper createHelper() {
/*  324 */     return new Helper();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TestArrResponse createTestArrResponse() {
/*  332 */     return new TestArrResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ObtainFullProfile createObtainFullProfile() {
/*  340 */     return new ObtainFullProfile();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetUsersInfoByDepartmentCount createGetUsersInfoByDepartmentCount() {
/*  348 */     return new GetUsersInfoByDepartmentCount();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAllChildDepartmentsResponse createGetAllChildDepartmentsResponse() {
/*  356 */     return new GetAllChildDepartmentsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindProfilesResponse createFindProfilesResponse() {
/*  364 */     return new FindProfilesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ObtainFullProfileResponse createObtainFullProfileResponse() {
/*  372 */     return new ObtainFullProfileResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TestArr createTestArr() {
/*  380 */     return new TestArr();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetFlatDepartmentCollectionResponse createGetFlatDepartmentCollectionResponse() {
/*  388 */     return new GetFlatDepartmentCollectionResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ObtainDepartmentEmployeesProfile createObtainDepartmentEmployeesProfile() {
/*  396 */     return new ObtainDepartmentEmployeesProfile();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindOrganizationProfileResponse createFindOrganizationProfileResponse() {
/*  404 */     return new FindOrganizationProfileResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public HelloWorldResponse createHelloWorldResponse() {
/*  412 */     return new HelloWorldResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindProfiles createFindProfiles() {
/*  420 */     return new FindProfiles();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindOrganizationProfile createFindOrganizationProfile() {
/*  428 */     return new FindOrganizationProfile();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRootDepartmentInfoResponse createGetRootDepartmentInfoResponse() {
/*  436 */     return new GetRootDepartmentInfoResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetOrganizationsRootResponse createGetOrganizationsRootResponse() {
/*  444 */     return new GetOrganizationsRootResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetUserInfoByLogin createGetUserInfoByLogin() {
/*  452 */     return new GetUserInfoByLogin();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetUserInfoByEmail createGetUserInfoByEmail() {
/*  460 */     return new GetUserInfoByEmail();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindDepartmentProfile createFindDepartmentProfile() {
/*  468 */     return new FindDepartmentProfile();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRootDepartmentIdResponse createGetRootDepartmentIdResponse() {
/*  476 */     return new GetRootDepartmentIdResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetChildDepartmentsResponse createGetChildDepartmentsResponse() {
/*  484 */     return new GetChildDepartmentsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNewEmployeesResponse createGetNewEmployeesResponse() {
/*  492 */     return new GetNewEmployeesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindAllProfiles createFindAllProfiles() {
/*  500 */     return new FindAllProfiles();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindOrganizationRootProfileResponse createFindOrganizationRootProfileResponse() {
/*  508 */     return new FindOrganizationRootProfileResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNewEmployeesTopN createGetNewEmployeesTopN() {
/*  516 */     return new GetNewEmployeesTopN();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public HelloWorld2Response createHelloWorld2Response() {
/*  524 */     return new HelloWorld2Response();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BuildDepartmentPathProfileResponse createBuildDepartmentPathProfileResponse() {
/*  532 */     return new BuildDepartmentPathProfileResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDepartmentUsersInfoResponse createGetDepartmentUsersInfoResponse() {
/*  540 */     return new GetDepartmentUsersInfoResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetOrgStructureNameByIdResponse createGetOrgStructureNameByIdResponse() {
/*  548 */     return new GetOrgStructureNameByIdResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BuildDepartmentPathProfile createBuildDepartmentPathProfile() {
/*  556 */     return new BuildDepartmentPathProfile();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetNewEmployeesForPeriodResponse createGetNewEmployeesForPeriodResponse() {
/*  564 */     return new GetNewEmployeesForPeriodResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDepartmentInfoResponse createGetDepartmentInfoResponse() {
/*  572 */     return new GetDepartmentInfoResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FindDepartmentProfileResponse createFindDepartmentProfileResponse() {
/*  580 */     return new FindDepartmentProfileResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TestResponse createTestResponse() {
/*  588 */     return new TestResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetUserInfoByLoginResponse createGetUserInfoByLoginResponse() {
/*  596 */     return new GetUserInfoByLoginResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetVersion createGetVersion() {
/*  604 */     return new GetVersion();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDepartmentUsersInfo createGetDepartmentUsersInfo() {
/*  612 */     return new GetDepartmentUsersInfo();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "name", scope = HelloWorld.class)
/*      */   public JAXBElement<String> createHelloWorldName(String paramString) {
/*  621 */     return new JAXBElement<String>(_HelloWorldName_QNAME, String.class, HelloWorld.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetAllChildEmployeesResult", scope = GetAllChildEmployeesResponse.class)
/*      */   public JAXBElement<ArrayOfstring> createGetAllChildEmployeesResponseGetAllChildEmployeesResult(ArrayOfstring paramArrayOfstring) {
/*  630 */     return new JAXBElement<ArrayOfstring>(_GetAllChildEmployeesResponseGetAllChildEmployeesResult_QNAME, ArrayOfstring.class, GetAllChildEmployeesResponse.class, paramArrayOfstring);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetUsersInfoByDepartmentResult", scope = GetUsersInfoByDepartmentResponse.class)
/*      */   public JAXBElement<ArrayOfEmployee> createGetUsersInfoByDepartmentResponseGetUsersInfoByDepartmentResult(ArrayOfEmployee paramArrayOfEmployee) {
/*  639 */     return new JAXBElement<ArrayOfEmployee>(_GetUsersInfoByDepartmentResponseGetUsersInfoByDepartmentResult_QNAME, ArrayOfEmployee.class, GetUsersInfoByDepartmentResponse.class, paramArrayOfEmployee);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "login", scope = GetBirthday.class)
/*      */   public JAXBElement<String> createGetBirthdayLogin(String paramString) {
/*  648 */     return new JAXBElement<String>(_GetBirthdayLogin_QNAME, String.class, GetBirthday.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetUserInfoByEmailResult", scope = GetUserInfoByEmailResponse.class)
/*      */   public JAXBElement<Employee> createGetUserInfoByEmailResponseGetUserInfoByEmailResult(Employee paramEmployee) {
/*  657 */     return new JAXBElement<Employee>(_GetUserInfoByEmailResponseGetUserInfoByEmailResult_QNAME, Employee.class, GetUserInfoByEmailResponse.class, paramEmployee);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "login", scope = GetNewEmployees.class)
/*      */   public JAXBElement<String> createGetNewEmployeesLogin(String paramString) {
/*  666 */     return new JAXBElement<String>(_GetBirthdayLogin_QNAME, String.class, GetNewEmployees.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "Search", scope = SaveSearchEmployee.class)
/*      */   public JAXBElement<String> createSaveSearchEmployeeSearch(String paramString) {
/*  675 */     return new JAXBElement<String>(_SaveSearchEmployeeSearch_QNAME, String.class, SaveSearchEmployee.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "LoginName", scope = SaveSearchEmployee.class)
/*      */   public JAXBElement<String> createSaveSearchEmployeeLoginName(String paramString) {
/*  684 */     return new JAXBElement<String>(_SaveSearchEmployeeLoginName_QNAME, String.class, SaveSearchEmployee.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "AccountName", scope = SaveSearchEmployee.class)
/*      */   public JAXBElement<String> createSaveSearchEmployeeAccountName(String paramString) {
/*  693 */     return new JAXBElement<String>(_SaveSearchEmployeeAccountName_QNAME, String.class, SaveSearchEmployee.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "param", scope = HelloWorld2.class)
/*      */   public JAXBElement<String> createHelloWorld2Param(String paramString) {
/*  702 */     return new JAXBElement<String>(_HelloWorld2Param_QNAME, String.class, HelloWorld2.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetNewEmployeesTopNResult", scope = GetNewEmployeesTopNResponse.class)
/*      */   public JAXBElement<ArrayOfOrgDepartment> createGetNewEmployeesTopNResponseGetNewEmployeesTopNResult(ArrayOfOrgDepartment paramArrayOfOrgDepartment) {
/*  711 */     return new JAXBElement<ArrayOfOrgDepartment>(_GetNewEmployeesTopNResponseGetNewEmployeesTopNResult_QNAME, ArrayOfOrgDepartment.class, GetNewEmployeesTopNResponse.class, paramArrayOfOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "testListResult", scope = TestListResponse.class)
/*      */   public JAXBElement<ArrayOfEmployee> createTestListResponseTestListResult(ArrayOfEmployee paramArrayOfEmployee) {
/*  720 */     return new JAXBElement<ArrayOfEmployee>(_TestListResponseTestListResult_QNAME, ArrayOfEmployee.class, TestListResponse.class, paramArrayOfEmployee);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "login", scope = GetRootDepartmentId.class)
/*      */   public JAXBElement<String> createGetRootDepartmentIdLogin(String paramString) {
/*  729 */     return new JAXBElement<String>(_GetBirthdayLogin_QNAME, String.class, GetRootDepartmentId.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "name", scope = Test.class)
/*      */   public JAXBElement<String> createTestName(String paramString) {
/*  738 */     return new JAXBElement<String>(_HelloWorldName_QNAME, String.class, Test.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "login", scope = GetNewEmployeesForPeriod.class)
/*      */   public JAXBElement<String> createGetNewEmployeesForPeriodLogin(String paramString) {
/*  747 */     return new JAXBElement<String>(_GetBirthdayLogin_QNAME, String.class, GetNewEmployeesForPeriod.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetBirthdayResult", scope = GetBirthdayResponse.class)
/*      */   public JAXBElement<ArrayOfEmployee> createGetBirthdayResponseGetBirthdayResult(ArrayOfEmployee paramArrayOfEmployee) {
/*  756 */     return new JAXBElement<ArrayOfEmployee>(_GetBirthdayResponseGetBirthdayResult_QNAME, ArrayOfEmployee.class, GetBirthdayResponse.class, paramArrayOfEmployee);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetVersionResult", scope = GetVersionResponse.class)
/*      */   public JAXBElement<String> createGetVersionResponseGetVersionResult(String paramString) {
/*  765 */     return new JAXBElement<String>(_GetVersionResponseGetVersionResult_QNAME, String.class, GetVersionResponse.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "depId", scope = GetOrgStructureNameById.class)
/*      */   public JAXBElement<String> createGetOrgStructureNameByIdDepId(String paramString) {
/*  774 */     return new JAXBElement<String>(_GetOrgStructureNameByIdDepId_QNAME, String.class, GetOrgStructureNameById.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "ObtainDepartmentEmployeesProfileResult", scope = ObtainDepartmentEmployeesProfileResponse.class)
/*      */   public JAXBElement<ArrayOfEmployee> createObtainDepartmentEmployeesProfileResponseObtainDepartmentEmployeesProfileResult(ArrayOfEmployee paramArrayOfEmployee) {
/*  783 */     return new JAXBElement<ArrayOfEmployee>(_ObtainDepartmentEmployeesProfileResponseObtainDepartmentEmployeesProfileResult_QNAME, ArrayOfEmployee.class, ObtainDepartmentEmployeesProfileResponse.class, paramArrayOfEmployee);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "FindAllProfilesResult", scope = FindAllProfilesResponse.class)
/*      */   public JAXBElement<ArrayOfShortEmployee> createFindAllProfilesResponseFindAllProfilesResult(ArrayOfShortEmployee paramArrayOfShortEmployee) {
/*  792 */     return new JAXBElement<ArrayOfShortEmployee>(_FindAllProfilesResponseFindAllProfilesResult_QNAME, ArrayOfShortEmployee.class, FindAllProfilesResponse.class, paramArrayOfShortEmployee);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "testArrResult", scope = TestArrResponse.class)
/*      */   public JAXBElement<DepartmentWithEmployees> createTestArrResponseTestArrResult(DepartmentWithEmployees paramDepartmentWithEmployees) {
/*  801 */     return new JAXBElement<DepartmentWithEmployees>(_TestArrResponseTestArrResult_QNAME, DepartmentWithEmployees.class, TestArrResponse.class, paramDepartmentWithEmployees);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "message", scope = Helper.class)
/*      */   public JAXBElement<String> createHelperMessage(String paramString) {
/*  810 */     return new JAXBElement<String>(_HelperMessage_QNAME, String.class, Helper.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "login", scope = ObtainFullProfile.class)
/*      */   public JAXBElement<String> createObtainFullProfileLogin(String paramString) {
/*  819 */     return new JAXBElement<String>(_GetBirthdayLogin_QNAME, String.class, ObtainFullProfile.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetAllChildDepartmentsResult", scope = GetAllChildDepartmentsResponse.class)
/*      */   public JAXBElement<ArrayOfint> createGetAllChildDepartmentsResponseGetAllChildDepartmentsResult(ArrayOfint paramArrayOfint) {
/*  828 */     return new JAXBElement<ArrayOfint>(_GetAllChildDepartmentsResponseGetAllChildDepartmentsResult_QNAME, ArrayOfint.class, GetAllChildDepartmentsResponse.class, paramArrayOfint);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "ObtainFullProfileResult", scope = ObtainFullProfileResponse.class)
/*      */   public JAXBElement<Employee> createObtainFullProfileResponseObtainFullProfileResult(Employee paramEmployee) {
/*  837 */     return new JAXBElement<Employee>(_ObtainFullProfileResponseObtainFullProfileResult_QNAME, Employee.class, ObtainFullProfileResponse.class, paramEmployee);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "FindProfilesResult", scope = FindProfilesResponse.class)
/*      */   public JAXBElement<ArrayOfKeyValuePairOfstringstring> createFindProfilesResponseFindProfilesResult(ArrayOfKeyValuePairOfstringstring paramArrayOfKeyValuePairOfstringstring) {
/*  846 */     return new JAXBElement<ArrayOfKeyValuePairOfstringstring>(_FindProfilesResponseFindProfilesResult_QNAME, ArrayOfKeyValuePairOfstringstring.class, FindProfilesResponse.class, paramArrayOfKeyValuePairOfstringstring);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetFlatDepartmentCollectionResult", scope = GetFlatDepartmentCollectionResponse.class)
/*      */   public JAXBElement<ArrayOfOrgDepartment> createGetFlatDepartmentCollectionResponseGetFlatDepartmentCollectionResult(ArrayOfOrgDepartment paramArrayOfOrgDepartment) {
/*  855 */     return new JAXBElement<ArrayOfOrgDepartment>(_GetFlatDepartmentCollectionResponseGetFlatDepartmentCollectionResult_QNAME, ArrayOfOrgDepartment.class, GetFlatDepartmentCollectionResponse.class, paramArrayOfOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "FindOrganizationProfileResult", scope = FindOrganizationProfileResponse.class)
/*      */   public JAXBElement<OrgDepartment> createFindOrganizationProfileResponseFindOrganizationProfileResult(OrgDepartment paramOrgDepartment) {
/*  864 */     return new JAXBElement<OrgDepartment>(_FindOrganizationProfileResponseFindOrganizationProfileResult_QNAME, OrgDepartment.class, FindOrganizationProfileResponse.class, paramOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "HelloWorldResult", scope = HelloWorldResponse.class)
/*      */   public JAXBElement<String> createHelloWorldResponseHelloWorldResult(String paramString) {
/*  873 */     return new JAXBElement<String>(_HelloWorldResponseHelloWorldResult_QNAME, String.class, HelloWorldResponse.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "search", scope = FindProfiles.class)
/*      */   public JAXBElement<String> createFindProfilesSearch(String paramString) {
/*  882 */     return new JAXBElement<String>(_FindProfilesSearch_QNAME, String.class, FindProfiles.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "login", scope = FindOrganizationProfile.class)
/*      */   public JAXBElement<String> createFindOrganizationProfileLogin(String paramString) {
/*  891 */     return new JAXBElement<String>(_GetBirthdayLogin_QNAME, String.class, FindOrganizationProfile.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetRootDepartmentInfoResult", scope = GetRootDepartmentInfoResponse.class)
/*      */   public JAXBElement<OrgDepartment> createGetRootDepartmentInfoResponseGetRootDepartmentInfoResult(OrgDepartment paramOrgDepartment) {
/*  900 */     return new JAXBElement<OrgDepartment>(_GetRootDepartmentInfoResponseGetRootDepartmentInfoResult_QNAME, OrgDepartment.class, GetRootDepartmentInfoResponse.class, paramOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetOrganizationsRootResult", scope = GetOrganizationsRootResponse.class)
/*      */   public JAXBElement<ArrayOfOrgDepartment> createGetOrganizationsRootResponseGetOrganizationsRootResult(ArrayOfOrgDepartment paramArrayOfOrgDepartment) {
/*  909 */     return new JAXBElement<ArrayOfOrgDepartment>(_GetOrganizationsRootResponseGetOrganizationsRootResult_QNAME, ArrayOfOrgDepartment.class, GetOrganizationsRootResponse.class, paramArrayOfOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "login", scope = GetUserInfoByLogin.class)
/*      */   public JAXBElement<String> createGetUserInfoByLoginLogin(String paramString) {
/*  918 */     return new JAXBElement<String>(_GetBirthdayLogin_QNAME, String.class, GetUserInfoByLogin.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "email", scope = GetUserInfoByEmail.class)
/*      */   public JAXBElement<String> createGetUserInfoByEmailEmail(String paramString) {
/*  927 */     return new JAXBElement<String>(_GetUserInfoByEmailEmail_QNAME, String.class, GetUserInfoByEmail.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "Name", scope = FindAllProfiles.class)
/*      */   public JAXBElement<String> createFindAllProfilesName(String paramString) {
/*  936 */     return new JAXBElement<String>(_FindAllProfilesName_QNAME, String.class, FindAllProfiles.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "ProductKey", scope = FindAllProfiles.class)
/*      */   public JAXBElement<String> createFindAllProfilesProductKey(String paramString) {
/*  945 */     return new JAXBElement<String>(_FindAllProfilesProductKey_QNAME, String.class, FindAllProfiles.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetNewEmployeesResult", scope = GetNewEmployeesResponse.class)
/*      */   public JAXBElement<ArrayOfOrgDepartment> createGetNewEmployeesResponseGetNewEmployeesResult(ArrayOfOrgDepartment paramArrayOfOrgDepartment) {
/*  954 */     return new JAXBElement<ArrayOfOrgDepartment>(_GetNewEmployeesResponseGetNewEmployeesResult_QNAME, ArrayOfOrgDepartment.class, GetNewEmployeesResponse.class, paramArrayOfOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetChildDepartmentsResult", scope = GetChildDepartmentsResponse.class)
/*      */   public JAXBElement<ArrayOfOrgDepartment> createGetChildDepartmentsResponseGetChildDepartmentsResult(ArrayOfOrgDepartment paramArrayOfOrgDepartment) {
/*  963 */     return new JAXBElement<ArrayOfOrgDepartment>(_GetChildDepartmentsResponseGetChildDepartmentsResult_QNAME, ArrayOfOrgDepartment.class, GetChildDepartmentsResponse.class, paramArrayOfOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "FindOrganizationRootProfileResult", scope = FindOrganizationRootProfileResponse.class)
/*      */   public JAXBElement<OrgDepartment> createFindOrganizationRootProfileResponseFindOrganizationRootProfileResult(OrgDepartment paramOrgDepartment) {
/*  972 */     return new JAXBElement<OrgDepartment>(_FindOrganizationRootProfileResponseFindOrganizationRootProfileResult_QNAME, OrgDepartment.class, FindOrganizationRootProfileResponse.class, paramOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetRootDepartmentIdResult", scope = GetRootDepartmentIdResponse.class)
/*      */   public JAXBElement<String> createGetRootDepartmentIdResponseGetRootDepartmentIdResult(String paramString) {
/*  981 */     return new JAXBElement<String>(_GetRootDepartmentIdResponseGetRootDepartmentIdResult_QNAME, String.class, GetRootDepartmentIdResponse.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "HelloWorld2Result", scope = HelloWorld2Response.class)
/*      */   public JAXBElement<String> createHelloWorld2ResponseHelloWorld2Result(String paramString) {
/*  990 */     return new JAXBElement<String>(_HelloWorld2ResponseHelloWorld2Result_QNAME, String.class, HelloWorld2Response.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "login", scope = GetNewEmployeesTopN.class)
/*      */   public JAXBElement<String> createGetNewEmployeesTopNLogin(String paramString) {
/*  999 */     return new JAXBElement<String>(_GetBirthdayLogin_QNAME, String.class, GetNewEmployeesTopN.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "BuildDepartmentPathProfileResult", scope = BuildDepartmentPathProfileResponse.class)
/*      */   public JAXBElement<String> createBuildDepartmentPathProfileResponseBuildDepartmentPathProfileResult(String paramString) {
/* 1008 */     return new JAXBElement<String>(_BuildDepartmentPathProfileResponseBuildDepartmentPathProfileResult_QNAME, String.class, BuildDepartmentPathProfileResponse.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetDepartmentUsersInfoResult", scope = GetDepartmentUsersInfoResponse.class)
/*      */   public JAXBElement<DepartmentWithEmployees> createGetDepartmentUsersInfoResponseGetDepartmentUsersInfoResult(DepartmentWithEmployees paramDepartmentWithEmployees) {
/* 1017 */     return new JAXBElement<DepartmentWithEmployees>(_GetDepartmentUsersInfoResponseGetDepartmentUsersInfoResult_QNAME, DepartmentWithEmployees.class, GetDepartmentUsersInfoResponse.class, paramDepartmentWithEmployees);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetOrgStructureNameByIdResult", scope = GetOrgStructureNameByIdResponse.class)
/*      */   public JAXBElement<String> createGetOrgStructureNameByIdResponseGetOrgStructureNameByIdResult(String paramString) {
/* 1026 */     return new JAXBElement<String>(_GetOrgStructureNameByIdResponseGetOrgStructureNameByIdResult_QNAME, String.class, GetOrgStructureNameByIdResponse.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "urlorgstruct", scope = BuildDepartmentPathProfile.class)
/*      */   public JAXBElement<String> createBuildDepartmentPathProfileUrlorgstruct(String paramString) {
/* 1035 */     return new JAXBElement<String>(_BuildDepartmentPathProfileUrlorgstruct_QNAME, String.class, BuildDepartmentPathProfile.class, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetNewEmployeesForPeriodResult", scope = GetNewEmployeesForPeriodResponse.class)
/*      */   public JAXBElement<ArrayOfOrgDepartment> createGetNewEmployeesForPeriodResponseGetNewEmployeesForPeriodResult(ArrayOfOrgDepartment paramArrayOfOrgDepartment) {
/* 1044 */     return new JAXBElement<ArrayOfOrgDepartment>(_GetNewEmployeesForPeriodResponseGetNewEmployeesForPeriodResult_QNAME, ArrayOfOrgDepartment.class, GetNewEmployeesForPeriodResponse.class, paramArrayOfOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetDepartmentInfoResult", scope = GetDepartmentInfoResponse.class)
/*      */   public JAXBElement<OrgDepartment> createGetDepartmentInfoResponseGetDepartmentInfoResult(OrgDepartment paramOrgDepartment) {
/* 1053 */     return new JAXBElement<OrgDepartment>(_GetDepartmentInfoResponseGetDepartmentInfoResult_QNAME, OrgDepartment.class, GetDepartmentInfoResponse.class, paramOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "FindDepartmentProfileResult", scope = FindDepartmentProfileResponse.class)
/*      */   public JAXBElement<OrgDepartment> createFindDepartmentProfileResponseFindDepartmentProfileResult(OrgDepartment paramOrgDepartment) {
/* 1062 */     return new JAXBElement<OrgDepartment>(_FindDepartmentProfileResponseFindDepartmentProfileResult_QNAME, OrgDepartment.class, FindDepartmentProfileResponse.class, paramOrgDepartment);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://megafon.meganet", name = "GetUserInfoByLoginResult", scope = GetUserInfoByLoginResponse.class)
/*      */   public JAXBElement<Employee> createGetUserInfoByLoginResponseGetUserInfoByLoginResult(Employee paramEmployee) {
/* 1071 */     return new JAXBElement<Employee>(_GetUserInfoByLoginResponseGetUserInfoByLoginResult_QNAME, Employee.class, GetUserInfoByLoginResponse.class, paramEmployee);
/*      */   }
/*      */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\ObjectFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */