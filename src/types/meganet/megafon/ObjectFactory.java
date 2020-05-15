/*     */ package types.meganet.megafon;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlElementDecl;
/*     */ import javax.xml.bind.annotation.XmlRegistry;
/*     */ import javax.xml.namespace.QName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlRegistry
/*     */ public class ObjectFactory
/*     */ {
/*  27 */   private static final QName _ArrayOfEmployee_QNAME = new QName("http://megafon.meganet.types", "ArrayOfEmployee");
/*  28 */   private static final QName _Employee_QNAME = new QName("http://megafon.meganet.types", "Employee");
/*  29 */   private static final QName _DepartmentWithEmployees_QNAME = new QName("http://megafon.meganet.types", "DepartmentWithEmployees");
/*  30 */   private static final QName _ArrayOfOrgDepartment_QNAME = new QName("http://megafon.meganet.types", "ArrayOfOrgDepartment");
/*  31 */   private static final QName _OrgDepartment_QNAME = new QName("http://megafon.meganet.types", "OrgDepartment");
/*  32 */   private static final QName _ArrayOfShortEmployee_QNAME = new QName("http://megafon.meganet.types", "ArrayOfShortEmployee");
/*  33 */   private static final QName _ShortEmployee_QNAME = new QName("http://megafon.meganet.types", "ShortEmployee");
/*  34 */   private static final QName _EmployeeUserName_QNAME = new QName("http://megafon.meganet.types", "UserName");
/*  35 */   private static final QName _EmployeeLastName_QNAME = new QName("http://megafon.meganet.types", "LastName");
/*  36 */   private static final QName _EmployeePhoto_QNAME = new QName("http://megafon.meganet.types", "Photo");
/*  37 */   private static final QName _EmployeeLogin_QNAME = new QName("http://megafon.meganet.types", "Login");
/*  38 */   private static final QName _EmployeePhone_QNAME = new QName("http://megafon.meganet.types", "Phone");
/*  39 */   private static final QName _EmployeeIoDepartmentId_QNAME = new QName("http://megafon.meganet.types", "ioDepartmentId");
/*  40 */   private static final QName _EmployeeMidName_QNAME = new QName("http://megafon.meganet.types", "MidName");
/*  41 */   private static final QName _EmployeeInternalPhone_QNAME = new QName("http://megafon.meganet.types", "InternalPhone");
/*  42 */   private static final QName _EmployeeJobIoName_QNAME = new QName("http://megafon.meganet.types", "JobIoName");
/*  43 */   private static final QName _EmployeeFirstName_QNAME = new QName("http://megafon.meganet.types", "FirstName");
/*  44 */   private static final QName _EmployeeDepartment_QNAME = new QName("http://megafon.meganet.types", "Department");
/*  45 */   private static final QName _EmployeeDepartmentId_QNAME = new QName("http://megafon.meganet.types", "DepartmentId");
/*  46 */   private static final QName _EmployeeJobTitle_QNAME = new QName("http://megafon.meganet.types", "JobTitle");
/*  47 */   private static final QName _EmployeeWorkEMail_QNAME = new QName("http://megafon.meganet.types", "WorkEMail");
/*  48 */   private static final QName _EmployeeCellPhone_QNAME = new QName("http://megafon.meganet.types", "CellPhone");
/*  49 */   private static final QName _EmployeeGrade_QNAME = new QName("http://megafon.meganet.types", "Grade");
/*  50 */   private static final QName _EmployeeManager_QNAME = new QName("http://megafon.meganet.types", "Manager");
/*  51 */   private static final QName _DepartmentWithEmployeesEmployees_QNAME = new QName("http://megafon.meganet.types", "Employees");
/*  52 */   private static final QName _ShortEmployeeLogin_QNAME = new QName("http://megafon.meganet.types", "login");
/*  53 */   private static final QName _ShortEmployeeName_QNAME = new QName("http://megafon.meganet.types", "Name");
/*  54 */   private static final QName _ShortEmployeeEmpId_QNAME = new QName("http://megafon.meganet.types", "emp_id");
/*  55 */   private static final QName _OrgDepartmentContentOwner_QNAME = new QName("http://megafon.meganet.types", "ContentOwner");
/*  56 */   private static final QName _OrgDepartmentCompany_QNAME = new QName("http://megafon.meganet.types", "Company");
/*  57 */   private static final QName _OrgDepartmentDepartmentName_QNAME = new QName("http://megafon.meganet.types", "DepartmentName");
/*  58 */   private static final QName _OrgDepartmentChildDepartments_QNAME = new QName("http://megafon.meganet.types", "ChildDepartments");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Employee createEmployee() {
/*  72 */     return new Employee();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayOfOrgDepartment createArrayOfOrgDepartment() {
/*  80 */     return new ArrayOfOrgDepartment();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DepartmentWithEmployees createDepartmentWithEmployees() {
/*  88 */     return new DepartmentWithEmployees();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayOfEmployee createArrayOfEmployee() {
/*  96 */     return new ArrayOfEmployee();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayOfShortEmployee createArrayOfShortEmployee() {
/* 104 */     return new ArrayOfShortEmployee();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ShortEmployee createShortEmployee() {
/* 112 */     return new ShortEmployee();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OrgDepartment createOrgDepartment() {
/* 120 */     return new OrgDepartment();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "ArrayOfEmployee")
/*     */   public JAXBElement<ArrayOfEmployee> createArrayOfEmployee(ArrayOfEmployee paramArrayOfEmployee) {
/* 129 */     return new JAXBElement<ArrayOfEmployee>(_ArrayOfEmployee_QNAME, ArrayOfEmployee.class, null, paramArrayOfEmployee);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Employee")
/*     */   public JAXBElement<Employee> createEmployee(Employee paramEmployee) {
/* 138 */     return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, paramEmployee);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "DepartmentWithEmployees")
/*     */   public JAXBElement<DepartmentWithEmployees> createDepartmentWithEmployees(DepartmentWithEmployees paramDepartmentWithEmployees) {
/* 147 */     return new JAXBElement<DepartmentWithEmployees>(_DepartmentWithEmployees_QNAME, DepartmentWithEmployees.class, null, paramDepartmentWithEmployees);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "ArrayOfOrgDepartment")
/*     */   public JAXBElement<ArrayOfOrgDepartment> createArrayOfOrgDepartment(ArrayOfOrgDepartment paramArrayOfOrgDepartment) {
/* 156 */     return new JAXBElement<ArrayOfOrgDepartment>(_ArrayOfOrgDepartment_QNAME, ArrayOfOrgDepartment.class, null, paramArrayOfOrgDepartment);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "OrgDepartment")
/*     */   public JAXBElement<OrgDepartment> createOrgDepartment(OrgDepartment paramOrgDepartment) {
/* 165 */     return new JAXBElement<OrgDepartment>(_OrgDepartment_QNAME, OrgDepartment.class, null, paramOrgDepartment);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "ArrayOfShortEmployee")
/*     */   public JAXBElement<ArrayOfShortEmployee> createArrayOfShortEmployee(ArrayOfShortEmployee paramArrayOfShortEmployee) {
/* 174 */     return new JAXBElement<ArrayOfShortEmployee>(_ArrayOfShortEmployee_QNAME, ArrayOfShortEmployee.class, null, paramArrayOfShortEmployee);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "ShortEmployee")
/*     */   public JAXBElement<ShortEmployee> createShortEmployee(ShortEmployee paramShortEmployee) {
/* 183 */     return new JAXBElement<ShortEmployee>(_ShortEmployee_QNAME, ShortEmployee.class, null, paramShortEmployee);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "UserName", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeUserName(String paramString) {
/* 192 */     return new JAXBElement<String>(_EmployeeUserName_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "LastName", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeLastName(String paramString) {
/* 201 */     return new JAXBElement<String>(_EmployeeLastName_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Photo", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeePhoto(String paramString) {
/* 210 */     return new JAXBElement<String>(_EmployeePhoto_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Login", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeLogin(String paramString) {
/* 219 */     return new JAXBElement<String>(_EmployeeLogin_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Phone", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeePhone(String paramString) {
/* 228 */     return new JAXBElement<String>(_EmployeePhone_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "ioDepartmentId", scope = Employee.class)
/*     */   public JAXBElement<Integer> createEmployeeIoDepartmentId(Integer paramInteger) {
/* 237 */     return new JAXBElement<Integer>(_EmployeeIoDepartmentId_QNAME, Integer.class, Employee.class, paramInteger);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "MidName", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeMidName(String paramString) {
/* 246 */     return new JAXBElement<String>(_EmployeeMidName_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "InternalPhone", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeInternalPhone(String paramString) {
/* 255 */     return new JAXBElement<String>(_EmployeeInternalPhone_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "JobIoName", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeJobIoName(String paramString) {
/* 264 */     return new JAXBElement<String>(_EmployeeJobIoName_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "FirstName", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeFirstName(String paramString) {
/* 273 */     return new JAXBElement<String>(_EmployeeFirstName_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Department", scope = Employee.class)
/*     */   public JAXBElement<OrgDepartment> createEmployeeDepartment(OrgDepartment paramOrgDepartment) {
/* 282 */     return new JAXBElement<OrgDepartment>(_EmployeeDepartment_QNAME, OrgDepartment.class, Employee.class, paramOrgDepartment);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "DepartmentId", scope = Employee.class)
/*     */   public JAXBElement<Integer> createEmployeeDepartmentId(Integer paramInteger) {
/* 291 */     return new JAXBElement<Integer>(_EmployeeDepartmentId_QNAME, Integer.class, Employee.class, paramInteger);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "JobTitle", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeJobTitle(String paramString) {
/* 300 */     return new JAXBElement<String>(_EmployeeJobTitle_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "WorkEMail", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeWorkEMail(String paramString) {
/* 309 */     return new JAXBElement<String>(_EmployeeWorkEMail_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "CellPhone", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeCellPhone(String paramString) {
/* 318 */     return new JAXBElement<String>(_EmployeeCellPhone_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Grade", scope = Employee.class)
/*     */   public JAXBElement<String> createEmployeeGrade(String paramString) {
/* 327 */     return new JAXBElement<String>(_EmployeeGrade_QNAME, String.class, Employee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Manager", scope = Employee.class)
/*     */   public JAXBElement<Employee> createEmployeeManager(Employee paramEmployee) {
/* 336 */     return new JAXBElement<Employee>(_EmployeeManager_QNAME, Employee.class, Employee.class, paramEmployee);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Employees", scope = DepartmentWithEmployees.class)
/*     */   public JAXBElement<ArrayOfEmployee> createDepartmentWithEmployeesEmployees(ArrayOfEmployee paramArrayOfEmployee) {
/* 345 */     return new JAXBElement<ArrayOfEmployee>(_DepartmentWithEmployeesEmployees_QNAME, ArrayOfEmployee.class, DepartmentWithEmployees.class, paramArrayOfEmployee);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Department", scope = DepartmentWithEmployees.class)
/*     */   public JAXBElement<OrgDepartment> createDepartmentWithEmployeesDepartment(OrgDepartment paramOrgDepartment) {
/* 354 */     return new JAXBElement<OrgDepartment>(_EmployeeDepartment_QNAME, OrgDepartment.class, DepartmentWithEmployees.class, paramOrgDepartment);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "login", scope = ShortEmployee.class)
/*     */   public JAXBElement<String> createShortEmployeeLogin(String paramString) {
/* 363 */     return new JAXBElement<String>(_ShortEmployeeLogin_QNAME, String.class, ShortEmployee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Name", scope = ShortEmployee.class)
/*     */   public JAXBElement<String> createShortEmployeeName(String paramString) {
/* 372 */     return new JAXBElement<String>(_ShortEmployeeName_QNAME, String.class, ShortEmployee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "emp_id", scope = ShortEmployee.class)
/*     */   public JAXBElement<String> createShortEmployeeEmpId(String paramString) {
/* 381 */     return new JAXBElement<String>(_ShortEmployeeEmpId_QNAME, String.class, ShortEmployee.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "ContentOwner", scope = OrgDepartment.class)
/*     */   public JAXBElement<Employee> createOrgDepartmentContentOwner(Employee paramEmployee) {
/* 390 */     return new JAXBElement<Employee>(_OrgDepartmentContentOwner_QNAME, Employee.class, OrgDepartment.class, paramEmployee);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "Company", scope = OrgDepartment.class)
/*     */   public JAXBElement<String> createOrgDepartmentCompany(String paramString) {
/* 399 */     return new JAXBElement<String>(_OrgDepartmentCompany_QNAME, String.class, OrgDepartment.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "DepartmentName", scope = OrgDepartment.class)
/*     */   public JAXBElement<String> createOrgDepartmentDepartmentName(String paramString) {
/* 408 */     return new JAXBElement<String>(_OrgDepartmentDepartmentName_QNAME, String.class, OrgDepartment.class, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://megafon.meganet.types", name = "ChildDepartments", scope = OrgDepartment.class)
/*     */   public JAXBElement<ArrayOfOrgDepartment> createOrgDepartmentChildDepartments(ArrayOfOrgDepartment paramArrayOfOrgDepartment) {
/* 417 */     return new JAXBElement<ArrayOfOrgDepartment>(_OrgDepartmentChildDepartments_QNAME, ArrayOfOrgDepartment.class, OrgDepartment.class, paramArrayOfOrgDepartment);
/*     */   }
/*     */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\types\meganet\megafon\ObjectFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */