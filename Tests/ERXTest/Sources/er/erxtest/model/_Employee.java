// $LastChangedRevision: 4733 $ DO NOT EDIT.  Make changes to Employee.java instead.
package er.erxtest.model;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _Employee extends er.extensions.eof.ERXGenericRecord {
  public static final String ENTITY_NAME = "Employee";

  // Attribute Keys
  public static final ERXKey<String> ADDRESS1 = new ERXKey<String>("address1");
  public static final ERXKey<String> ADDRESS2 = new ERXKey<String>("address2");
  public static final ERXKey<String> CITY = new ERXKey<String>("city");
  public static final ERXKey<Boolean> MANAGER = new ERXKey<Boolean>("manager");
  public static final ERXKey<String> NAME = new ERXKey<String>("name");
  public static final ERXKey<String> STATE = new ERXKey<String>("state");
  public static final ERXKey<String> ZIPCODE = new ERXKey<String>("zipcode");
  // Relationship Keys
  public static final ERXKey<er.erxtest.model.Company> COMPANY = new ERXKey<er.erxtest.model.Company>("company");
  public static final ERXKey<er.erxtest.model.Paycheck> PAYCHECKS = new ERXKey<er.erxtest.model.Paycheck>("paychecks");
  public static final ERXKey<er.erxtest.model.Role> ROLES = new ERXKey<er.erxtest.model.Role>("roles");

  // Attributes
  public static final String ADDRESS1_KEY = ADDRESS1.key();
  public static final String ADDRESS2_KEY = ADDRESS2.key();
  public static final String CITY_KEY = CITY.key();
  public static final String MANAGER_KEY = MANAGER.key();
  public static final String NAME_KEY = NAME.key();
  public static final String STATE_KEY = STATE.key();
  public static final String ZIPCODE_KEY = ZIPCODE.key();
  // Relationships
  public static final String COMPANY_KEY = COMPANY.key();
  public static final String PAYCHECKS_KEY = PAYCHECKS.key();
  public static final String ROLES_KEY = ROLES.key();

  private static Logger LOG = Logger.getLogger(_Employee.class);

  public Employee localInstanceIn(EOEditingContext editingContext) {
    Employee localInstance = (Employee)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String address1() {
    return (String) storedValueForKey("address1");
  }

  public void setAddress1(String value) {
    if (_Employee.LOG.isDebugEnabled()) {
    	_Employee.LOG.debug( "updating address1 from " + address1() + " to " + value);
    }
    takeStoredValueForKey(value, "address1");
  }

  public String address2() {
    return (String) storedValueForKey("address2");
  }

  public void setAddress2(String value) {
    if (_Employee.LOG.isDebugEnabled()) {
    	_Employee.LOG.debug( "updating address2 from " + address2() + " to " + value);
    }
    takeStoredValueForKey(value, "address2");
  }

  public String city() {
    return (String) storedValueForKey("city");
  }

  public void setCity(String value) {
    if (_Employee.LOG.isDebugEnabled()) {
    	_Employee.LOG.debug( "updating city from " + city() + " to " + value);
    }
    takeStoredValueForKey(value, "city");
  }

  public Boolean manager() {
    return (Boolean) storedValueForKey("manager");
  }

  public void setManager(Boolean value) {
    if (_Employee.LOG.isDebugEnabled()) {
    	_Employee.LOG.debug( "updating manager from " + manager() + " to " + value);
    }
    takeStoredValueForKey(value, "manager");
  }

  public String name() {
    return (String) storedValueForKey("name");
  }

  public void setName(String value) {
    if (_Employee.LOG.isDebugEnabled()) {
    	_Employee.LOG.debug( "updating name from " + name() + " to " + value);
    }
    takeStoredValueForKey(value, "name");
  }

  public String state() {
    return (String) storedValueForKey("state");
  }

  public void setState(String value) {
    if (_Employee.LOG.isDebugEnabled()) {
    	_Employee.LOG.debug( "updating state from " + state() + " to " + value);
    }
    takeStoredValueForKey(value, "state");
  }

  public String zipcode() {
    return (String) storedValueForKey("zipcode");
  }

  public void setZipcode(String value) {
    if (_Employee.LOG.isDebugEnabled()) {
    	_Employee.LOG.debug( "updating zipcode from " + zipcode() + " to " + value);
    }
    takeStoredValueForKey(value, "zipcode");
  }

  public er.erxtest.model.Company company() {
    return (er.erxtest.model.Company)storedValueForKey("company");
  }
  
  public void setCompany(er.erxtest.model.Company value) {
    takeStoredValueForKey(value, "company");
  }

  public void setCompanyRelationship(er.erxtest.model.Company value) {
    if (_Employee.LOG.isDebugEnabled()) {
      _Employee.LOG.debug("updating company from " + company() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setCompany(value);
    }
    else if (value == null) {
    	er.erxtest.model.Company oldValue = company();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "company");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "company");
    }
  }
  
  public NSArray<er.erxtest.model.Paycheck> paychecks() {
    return (NSArray<er.erxtest.model.Paycheck>)storedValueForKey("paychecks");
  }

  public NSArray<er.erxtest.model.Paycheck> paychecks(EOQualifier qualifier) {
    return paychecks(qualifier, null, false);
  }

  public NSArray<er.erxtest.model.Paycheck> paychecks(EOQualifier qualifier, boolean fetch) {
    return paychecks(qualifier, null, fetch);
  }

  public NSArray<er.erxtest.model.Paycheck> paychecks(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<er.erxtest.model.Paycheck> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(er.erxtest.model.Paycheck.EMPLOYEE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = er.erxtest.model.Paycheck.fetchPaychecks(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = paychecks();
      if (qualifier != null) {
        results = (NSArray<er.erxtest.model.Paycheck>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<er.erxtest.model.Paycheck>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToPaychecks(er.erxtest.model.Paycheck object) {
    includeObjectIntoPropertyWithKey(object, "paychecks");
  }

  public void removeFromPaychecks(er.erxtest.model.Paycheck object) {
    excludeObjectFromPropertyWithKey(object, "paychecks");
  }

  public void addToPaychecksRelationship(er.erxtest.model.Paycheck object) {
    if (_Employee.LOG.isDebugEnabled()) {
      _Employee.LOG.debug("adding " + object + " to paychecks relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToPaychecks(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, "paychecks");
    }
  }

  public void removeFromPaychecksRelationship(er.erxtest.model.Paycheck object) {
    if (_Employee.LOG.isDebugEnabled()) {
      _Employee.LOG.debug("removing " + object + " from paychecks relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromPaychecks(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, "paychecks");
    }
  }

  public er.erxtest.model.Paycheck createPaychecksRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Paycheck");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "paychecks");
    return (er.erxtest.model.Paycheck) eo;
  }

  public void deletePaychecksRelationship(er.erxtest.model.Paycheck object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "paychecks");
    editingContext().deleteObject(object);
  }

  public void deleteAllPaychecksRelationships() {
    Enumeration objects = paychecks().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePaychecksRelationship((er.erxtest.model.Paycheck)objects.nextElement());
    }
  }

  public NSArray<er.erxtest.model.Role> roles() {
    return (NSArray<er.erxtest.model.Role>)storedValueForKey("roles");
  }

  public NSArray<er.erxtest.model.Role> roles(EOQualifier qualifier) {
    return roles(qualifier, null);
  }

  public NSArray<er.erxtest.model.Role> roles(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<er.erxtest.model.Role> results;
      results = roles();
      if (qualifier != null) {
        results = (NSArray<er.erxtest.model.Role>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<er.erxtest.model.Role>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRoles(er.erxtest.model.Role object) {
    includeObjectIntoPropertyWithKey(object, "roles");
  }

  public void removeFromRoles(er.erxtest.model.Role object) {
    excludeObjectFromPropertyWithKey(object, "roles");
  }

  public void addToRolesRelationship(er.erxtest.model.Role object) {
    if (_Employee.LOG.isDebugEnabled()) {
      _Employee.LOG.debug("adding " + object + " to roles relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToRoles(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, "roles");
    }
  }

  public void removeFromRolesRelationship(er.erxtest.model.Role object) {
    if (_Employee.LOG.isDebugEnabled()) {
      _Employee.LOG.debug("removing " + object + " from roles relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromRoles(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, "roles");
    }
  }

  public er.erxtest.model.Role createRolesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Role");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "roles");
    return (er.erxtest.model.Role) eo;
  }

  public void deleteRolesRelationship(er.erxtest.model.Role object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "roles");
    editingContext().deleteObject(object);
  }

  public void deleteAllRolesRelationships() {
    Enumeration objects = roles().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRolesRelationship((er.erxtest.model.Role)objects.nextElement());
    }
  }


  public static Employee createEmployee(EOEditingContext editingContext, Boolean manager
, String name
, er.erxtest.model.Company company) {
    Employee eo = (Employee) EOUtilities.createAndInsertInstance(editingContext, _Employee.ENTITY_NAME);    
		eo.setManager(manager);
		eo.setName(name);
    eo.setCompanyRelationship(company);
    return eo;
  }

  public static NSArray<Employee> fetchAllEmployees(EOEditingContext editingContext) {
    return _Employee.fetchAllEmployees(editingContext, null);
  }

  public static NSArray<Employee> fetchAllEmployees(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Employee.fetchEmployees(editingContext, null, sortOrderings);
  }

  public static NSArray<Employee> fetchEmployees(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Employee.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Employee> eoObjects = (NSArray<Employee>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Employee fetchEmployee(EOEditingContext editingContext, String keyName, Object value) {
    return _Employee.fetchEmployee(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Employee fetchEmployee(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Employee> eoObjects = _Employee.fetchEmployees(editingContext, qualifier, null);
    Employee eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Employee)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Employee that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Employee fetchRequiredEmployee(EOEditingContext editingContext, String keyName, Object value) {
    return _Employee.fetchRequiredEmployee(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Employee fetchRequiredEmployee(EOEditingContext editingContext, EOQualifier qualifier) {
    Employee eoObject = _Employee.fetchEmployee(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Employee that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Employee localInstanceIn(EOEditingContext editingContext, Employee eo) {
    Employee localInstance = (eo == null) ? null : (Employee)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}