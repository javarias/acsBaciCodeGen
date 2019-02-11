/**
 */
package baciCodeGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.Property#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.Property#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link baciCodeGen.Property#getBaciType <em>Baci Type</em>}</li>
 *   <li>{@link baciCodeGen.Property#getDevIO <em>Dev IO</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see baciCodeGen.BaciCodeGenPackage#getProperty_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link baciCodeGen.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.Characteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getProperty_Characteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Characteristic> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Baci Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baci Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baci Type</em>' reference.
	 * @see #setBaciType(BaciType)
	 * @see baciCodeGen.BaciCodeGenPackage#getProperty_BaciType()
	 * @model required="true"
	 * @generated
	 */
	BaciType getBaciType();

	/**
	 * Sets the value of the '{@link baciCodeGen.Property#getBaciType <em>Baci Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baci Type</em>' reference.
	 * @see #getBaciType()
	 * @generated
	 */
	void setBaciType(BaciType value);

	/**
	 * Returns the value of the '<em><b>Dev IO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dev IO</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dev IO</em>' reference.
	 * @see #setDevIO(DevIO)
	 * @see baciCodeGen.BaciCodeGenPackage#getProperty_DevIO()
	 * @model required="true"
	 * @generated
	 */
	DevIO getDevIO();

	/**
	 * Sets the value of the '{@link baciCodeGen.Property#getDevIO <em>Dev IO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev IO</em>' reference.
	 * @see #getDevIO()
	 * @generated
	 */
	void setDevIO(DevIO value);

} // Property
