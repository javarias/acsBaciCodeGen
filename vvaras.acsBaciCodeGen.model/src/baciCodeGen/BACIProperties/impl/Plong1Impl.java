/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.Plong1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plong1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Plong1Impl#getArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Plong1Impl#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Plong1Impl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Plong1Impl#getGraphMax <em>Graph Max</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Plong1Impl#getGraphMin <em>Graph Min</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Plong1Impl#getMinDeltaTrig <em>Min Delta Trig</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Plong1Impl#getMinStep <em>Min Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Plong1Impl extends PlongImpl implements Plong1 {
	/**
	 * The default value of the '{@link #getArchiveDelta() <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDelta()
	 * @generated
	 * @ordered
	 */
	protected static final int ARCHIVE_DELTA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArchiveDelta() <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDelta()
	 * @generated
	 * @ordered
	 */
	protected int archiveDelta = ARCHIVE_DELTA_EDEFAULT;

	/**
	 * This is true if the Archive Delta attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archiveDeltaESet;

	/**
	 * The default value of the '{@link #getArchiveDeltaPercent() <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDeltaPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double ARCHIVE_DELTA_PERCENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArchiveDeltaPercent() <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDeltaPercent()
	 * @generated
	 * @ordered
	 */
	protected double archiveDeltaPercent = ARCHIVE_DELTA_PERCENT_EDEFAULT;

	/**
	 * This is true if the Archive Delta Percent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archiveDeltaPercentESet;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected int defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * This is true if the Default Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValueESet;

	/**
	 * The default value of the '{@link #getGraphMax() <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphMax()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAPH_MAX_EDEFAULT = 2147483647;

	/**
	 * The cached value of the '{@link #getGraphMax() <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphMax()
	 * @generated
	 * @ordered
	 */
	protected int graphMax = GRAPH_MAX_EDEFAULT;

	/**
	 * This is true if the Graph Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean graphMaxESet;

	/**
	 * The default value of the '{@link #getGraphMin() <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphMin()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAPH_MIN_EDEFAULT = -2147483648;

	/**
	 * The cached value of the '{@link #getGraphMin() <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphMin()
	 * @generated
	 * @ordered
	 */
	protected int graphMin = GRAPH_MIN_EDEFAULT;

	/**
	 * This is true if the Graph Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean graphMinESet;

	/**
	 * The default value of the '{@link #getMinDeltaTrig() <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDeltaTrig()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_DELTA_TRIG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinDeltaTrig() <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDeltaTrig()
	 * @generated
	 * @ordered
	 */
	protected int minDeltaTrig = MIN_DELTA_TRIG_EDEFAULT;

	/**
	 * This is true if the Min Delta Trig attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minDeltaTrigESet;

	/**
	 * The default value of the '{@link #getMinStep() <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStep()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinStep() <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStep()
	 * @generated
	 * @ordered
	 */
	protected int minStep = MIN_STEP_EDEFAULT;

	/**
	 * This is true if the Min Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minStepESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Plong1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BACIPropertiesPackage.Literals.PLONG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArchiveDelta() {
		return archiveDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveDelta(int newArchiveDelta) {
		int oldArchiveDelta = archiveDelta;
		archiveDelta = newArchiveDelta;
		boolean oldArchiveDeltaESet = archiveDeltaESet;
		archiveDeltaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA, oldArchiveDelta, archiveDelta, !oldArchiveDeltaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchiveDelta() {
		int oldArchiveDelta = archiveDelta;
		boolean oldArchiveDeltaESet = archiveDeltaESet;
		archiveDelta = ARCHIVE_DELTA_EDEFAULT;
		archiveDeltaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA, oldArchiveDelta, ARCHIVE_DELTA_EDEFAULT, oldArchiveDeltaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchiveDelta() {
		return archiveDeltaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getArchiveDeltaPercent() {
		return archiveDeltaPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveDeltaPercent(double newArchiveDeltaPercent) {
		double oldArchiveDeltaPercent = archiveDeltaPercent;
		archiveDeltaPercent = newArchiveDeltaPercent;
		boolean oldArchiveDeltaPercentESet = archiveDeltaPercentESet;
		archiveDeltaPercentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA_PERCENT, oldArchiveDeltaPercent, archiveDeltaPercent, !oldArchiveDeltaPercentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchiveDeltaPercent() {
		double oldArchiveDeltaPercent = archiveDeltaPercent;
		boolean oldArchiveDeltaPercentESet = archiveDeltaPercentESet;
		archiveDeltaPercent = ARCHIVE_DELTA_PERCENT_EDEFAULT;
		archiveDeltaPercentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA_PERCENT, oldArchiveDeltaPercent, ARCHIVE_DELTA_PERCENT_EDEFAULT, oldArchiveDeltaPercentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchiveDeltaPercent() {
		return archiveDeltaPercentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(int newDefaultValue) {
		int oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		boolean oldDefaultValueESet = defaultValueESet;
		defaultValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PLONG1__DEFAULT_VALUE, oldDefaultValue, defaultValue, !oldDefaultValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultValue() {
		int oldDefaultValue = defaultValue;
		boolean oldDefaultValueESet = defaultValueESet;
		defaultValue = DEFAULT_VALUE_EDEFAULT;
		defaultValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PLONG1__DEFAULT_VALUE, oldDefaultValue, DEFAULT_VALUE_EDEFAULT, oldDefaultValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultValue() {
		return defaultValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGraphMax() {
		return graphMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphMax(int newGraphMax) {
		int oldGraphMax = graphMax;
		graphMax = newGraphMax;
		boolean oldGraphMaxESet = graphMaxESet;
		graphMaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PLONG1__GRAPH_MAX, oldGraphMax, graphMax, !oldGraphMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGraphMax() {
		int oldGraphMax = graphMax;
		boolean oldGraphMaxESet = graphMaxESet;
		graphMax = GRAPH_MAX_EDEFAULT;
		graphMaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PLONG1__GRAPH_MAX, oldGraphMax, GRAPH_MAX_EDEFAULT, oldGraphMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGraphMax() {
		return graphMaxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGraphMin() {
		return graphMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphMin(int newGraphMin) {
		int oldGraphMin = graphMin;
		graphMin = newGraphMin;
		boolean oldGraphMinESet = graphMinESet;
		graphMinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PLONG1__GRAPH_MIN, oldGraphMin, graphMin, !oldGraphMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGraphMin() {
		int oldGraphMin = graphMin;
		boolean oldGraphMinESet = graphMinESet;
		graphMin = GRAPH_MIN_EDEFAULT;
		graphMinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PLONG1__GRAPH_MIN, oldGraphMin, GRAPH_MIN_EDEFAULT, oldGraphMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGraphMin() {
		return graphMinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinDeltaTrig() {
		return minDeltaTrig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDeltaTrig(int newMinDeltaTrig) {
		int oldMinDeltaTrig = minDeltaTrig;
		minDeltaTrig = newMinDeltaTrig;
		boolean oldMinDeltaTrigESet = minDeltaTrigESet;
		minDeltaTrigESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PLONG1__MIN_DELTA_TRIG, oldMinDeltaTrig, minDeltaTrig, !oldMinDeltaTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinDeltaTrig() {
		int oldMinDeltaTrig = minDeltaTrig;
		boolean oldMinDeltaTrigESet = minDeltaTrigESet;
		minDeltaTrig = MIN_DELTA_TRIG_EDEFAULT;
		minDeltaTrigESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PLONG1__MIN_DELTA_TRIG, oldMinDeltaTrig, MIN_DELTA_TRIG_EDEFAULT, oldMinDeltaTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinDeltaTrig() {
		return minDeltaTrigESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinStep() {
		return minStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStep(int newMinStep) {
		int oldMinStep = minStep;
		minStep = newMinStep;
		boolean oldMinStepESet = minStepESet;
		minStepESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PLONG1__MIN_STEP, oldMinStep, minStep, !oldMinStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinStep() {
		int oldMinStep = minStep;
		boolean oldMinStepESet = minStepESet;
		minStep = MIN_STEP_EDEFAULT;
		minStepESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PLONG1__MIN_STEP, oldMinStep, MIN_STEP_EDEFAULT, oldMinStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinStep() {
		return minStepESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA:
				return getArchiveDelta();
			case BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA_PERCENT:
				return getArchiveDeltaPercent();
			case BACIPropertiesPackage.PLONG1__DEFAULT_VALUE:
				return getDefaultValue();
			case BACIPropertiesPackage.PLONG1__GRAPH_MAX:
				return getGraphMax();
			case BACIPropertiesPackage.PLONG1__GRAPH_MIN:
				return getGraphMin();
			case BACIPropertiesPackage.PLONG1__MIN_DELTA_TRIG:
				return getMinDeltaTrig();
			case BACIPropertiesPackage.PLONG1__MIN_STEP:
				return getMinStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA:
				setArchiveDelta((Integer)newValue);
				return;
			case BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA_PERCENT:
				setArchiveDeltaPercent((Double)newValue);
				return;
			case BACIPropertiesPackage.PLONG1__DEFAULT_VALUE:
				setDefaultValue((Integer)newValue);
				return;
			case BACIPropertiesPackage.PLONG1__GRAPH_MAX:
				setGraphMax((Integer)newValue);
				return;
			case BACIPropertiesPackage.PLONG1__GRAPH_MIN:
				setGraphMin((Integer)newValue);
				return;
			case BACIPropertiesPackage.PLONG1__MIN_DELTA_TRIG:
				setMinDeltaTrig((Integer)newValue);
				return;
			case BACIPropertiesPackage.PLONG1__MIN_STEP:
				setMinStep((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA:
				unsetArchiveDelta();
				return;
			case BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA_PERCENT:
				unsetArchiveDeltaPercent();
				return;
			case BACIPropertiesPackage.PLONG1__DEFAULT_VALUE:
				unsetDefaultValue();
				return;
			case BACIPropertiesPackage.PLONG1__GRAPH_MAX:
				unsetGraphMax();
				return;
			case BACIPropertiesPackage.PLONG1__GRAPH_MIN:
				unsetGraphMin();
				return;
			case BACIPropertiesPackage.PLONG1__MIN_DELTA_TRIG:
				unsetMinDeltaTrig();
				return;
			case BACIPropertiesPackage.PLONG1__MIN_STEP:
				unsetMinStep();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA:
				return isSetArchiveDelta();
			case BACIPropertiesPackage.PLONG1__ARCHIVE_DELTA_PERCENT:
				return isSetArchiveDeltaPercent();
			case BACIPropertiesPackage.PLONG1__DEFAULT_VALUE:
				return isSetDefaultValue();
			case BACIPropertiesPackage.PLONG1__GRAPH_MAX:
				return isSetGraphMax();
			case BACIPropertiesPackage.PLONG1__GRAPH_MIN:
				return isSetGraphMin();
			case BACIPropertiesPackage.PLONG1__MIN_DELTA_TRIG:
				return isSetMinDeltaTrig();
			case BACIPropertiesPackage.PLONG1__MIN_STEP:
				return isSetMinStep();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (archiveDelta: ");
		if (archiveDeltaESet) result.append(archiveDelta); else result.append("<unset>");
		result.append(", archiveDeltaPercent: ");
		if (archiveDeltaPercentESet) result.append(archiveDeltaPercent); else result.append("<unset>");
		result.append(", defaultValue: ");
		if (defaultValueESet) result.append(defaultValue); else result.append("<unset>");
		result.append(", graphMax: ");
		if (graphMaxESet) result.append(graphMax); else result.append("<unset>");
		result.append(", graphMin: ");
		if (graphMinESet) result.append(graphMin); else result.append("<unset>");
		result.append(", minDeltaTrig: ");
		if (minDeltaTrigESet) result.append(minDeltaTrig); else result.append("<unset>");
		result.append(", minStep: ");
		if (minStepESet) result.append(minStep); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //Plong1Impl
