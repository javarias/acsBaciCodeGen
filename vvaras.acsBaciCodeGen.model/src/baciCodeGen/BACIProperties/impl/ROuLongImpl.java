/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.ROuLong;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROu Long</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROuLongImpl#getAlarmFaultFamily <em>Alarm Fault Family</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROuLongImpl#getAlarmFaultMember <em>Alarm Fault Member</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROuLongImpl#getAlarmHighOff <em>Alarm High Off</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROuLongImpl#getAlarmHighOn <em>Alarm High On</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROuLongImpl#getAlarmLevel <em>Alarm Level</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROuLongImpl#getAlarmLowOff <em>Alarm Low Off</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROuLongImpl#getAlarmLowOn <em>Alarm Low On</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROuLongImpl#getAlarmTimerTrig <em>Alarm Timer Trig</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROuLongImpl extends PuLong1Impl implements ROuLong {
	/**
	 * The default value of the '{@link #getAlarmFaultFamily() <em>Alarm Fault Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmFaultFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String ALARM_FAULT_FAMILY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAlarmFaultFamily() <em>Alarm Fault Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmFaultFamily()
	 * @generated
	 * @ordered
	 */
	protected String alarmFaultFamily = ALARM_FAULT_FAMILY_EDEFAULT;

	/**
	 * This is true if the Alarm Fault Family attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmFaultFamilyESet;

	/**
	 * The default value of the '{@link #getAlarmFaultMember() <em>Alarm Fault Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmFaultMember()
	 * @generated
	 * @ordered
	 */
	protected static final String ALARM_FAULT_MEMBER_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAlarmFaultMember() <em>Alarm Fault Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmFaultMember()
	 * @generated
	 * @ordered
	 */
	protected String alarmFaultMember = ALARM_FAULT_MEMBER_EDEFAULT;

	/**
	 * This is true if the Alarm Fault Member attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmFaultMemberESet;

	/**
	 * The default value of the '{@link #getAlarmHighOff() <em>Alarm High Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmHighOff()
	 * @generated
	 * @ordered
	 */
	protected static final long ALARM_HIGH_OFF_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAlarmHighOff() <em>Alarm High Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmHighOff()
	 * @generated
	 * @ordered
	 */
	protected long alarmHighOff = ALARM_HIGH_OFF_EDEFAULT;

	/**
	 * This is true if the Alarm High Off attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmHighOffESet;

	/**
	 * The default value of the '{@link #getAlarmHighOn() <em>Alarm High On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmHighOn()
	 * @generated
	 * @ordered
	 */
	protected static final long ALARM_HIGH_ON_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAlarmHighOn() <em>Alarm High On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmHighOn()
	 * @generated
	 * @ordered
	 */
	protected long alarmHighOn = ALARM_HIGH_ON_EDEFAULT;

	/**
	 * This is true if the Alarm High On attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmHighOnESet;

	/**
	 * The default value of the '{@link #getAlarmLevel() <em>Alarm Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int ALARM_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlarmLevel() <em>Alarm Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmLevel()
	 * @generated
	 * @ordered
	 */
	protected int alarmLevel = ALARM_LEVEL_EDEFAULT;

	/**
	 * This is true if the Alarm Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmLevelESet;

	/**
	 * The default value of the '{@link #getAlarmLowOff() <em>Alarm Low Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmLowOff()
	 * @generated
	 * @ordered
	 */
	protected static final long ALARM_LOW_OFF_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAlarmLowOff() <em>Alarm Low Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmLowOff()
	 * @generated
	 * @ordered
	 */
	protected long alarmLowOff = ALARM_LOW_OFF_EDEFAULT;

	/**
	 * This is true if the Alarm Low Off attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmLowOffESet;

	/**
	 * The default value of the '{@link #getAlarmLowOn() <em>Alarm Low On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmLowOn()
	 * @generated
	 * @ordered
	 */
	protected static final long ALARM_LOW_ON_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAlarmLowOn() <em>Alarm Low On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmLowOn()
	 * @generated
	 * @ordered
	 */
	protected long alarmLowOn = ALARM_LOW_ON_EDEFAULT;

	/**
	 * This is true if the Alarm Low On attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmLowOnESet;

	/**
	 * The default value of the '{@link #getAlarmTimerTrig() <em>Alarm Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmTimerTrig()
	 * @generated
	 * @ordered
	 */
	protected static final double ALARM_TIMER_TRIG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAlarmTimerTrig() <em>Alarm Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmTimerTrig()
	 * @generated
	 * @ordered
	 */
	protected double alarmTimerTrig = ALARM_TIMER_TRIG_EDEFAULT;

	/**
	 * This is true if the Alarm Timer Trig attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmTimerTrigESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROuLongImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BACIPropertiesPackage.Literals.ROU_LONG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlarmFaultFamily() {
		return alarmFaultFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmFaultFamily(String newAlarmFaultFamily) {
		String oldAlarmFaultFamily = alarmFaultFamily;
		alarmFaultFamily = newAlarmFaultFamily;
		boolean oldAlarmFaultFamilyESet = alarmFaultFamilyESet;
		alarmFaultFamilyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_FAMILY, oldAlarmFaultFamily, alarmFaultFamily, !oldAlarmFaultFamilyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmFaultFamily() {
		String oldAlarmFaultFamily = alarmFaultFamily;
		boolean oldAlarmFaultFamilyESet = alarmFaultFamilyESet;
		alarmFaultFamily = ALARM_FAULT_FAMILY_EDEFAULT;
		alarmFaultFamilyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_FAMILY, oldAlarmFaultFamily, ALARM_FAULT_FAMILY_EDEFAULT, oldAlarmFaultFamilyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmFaultFamily() {
		return alarmFaultFamilyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlarmFaultMember() {
		return alarmFaultMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmFaultMember(String newAlarmFaultMember) {
		String oldAlarmFaultMember = alarmFaultMember;
		alarmFaultMember = newAlarmFaultMember;
		boolean oldAlarmFaultMemberESet = alarmFaultMemberESet;
		alarmFaultMemberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_MEMBER, oldAlarmFaultMember, alarmFaultMember, !oldAlarmFaultMemberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmFaultMember() {
		String oldAlarmFaultMember = alarmFaultMember;
		boolean oldAlarmFaultMemberESet = alarmFaultMemberESet;
		alarmFaultMember = ALARM_FAULT_MEMBER_EDEFAULT;
		alarmFaultMemberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_MEMBER, oldAlarmFaultMember, ALARM_FAULT_MEMBER_EDEFAULT, oldAlarmFaultMemberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmFaultMember() {
		return alarmFaultMemberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAlarmHighOff() {
		return alarmHighOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmHighOff(long newAlarmHighOff) {
		long oldAlarmHighOff = alarmHighOff;
		alarmHighOff = newAlarmHighOff;
		boolean oldAlarmHighOffESet = alarmHighOffESet;
		alarmHighOffESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_OFF, oldAlarmHighOff, alarmHighOff, !oldAlarmHighOffESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmHighOff() {
		long oldAlarmHighOff = alarmHighOff;
		boolean oldAlarmHighOffESet = alarmHighOffESet;
		alarmHighOff = ALARM_HIGH_OFF_EDEFAULT;
		alarmHighOffESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_OFF, oldAlarmHighOff, ALARM_HIGH_OFF_EDEFAULT, oldAlarmHighOffESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmHighOff() {
		return alarmHighOffESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAlarmHighOn() {
		return alarmHighOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmHighOn(long newAlarmHighOn) {
		long oldAlarmHighOn = alarmHighOn;
		alarmHighOn = newAlarmHighOn;
		boolean oldAlarmHighOnESet = alarmHighOnESet;
		alarmHighOnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_ON, oldAlarmHighOn, alarmHighOn, !oldAlarmHighOnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmHighOn() {
		long oldAlarmHighOn = alarmHighOn;
		boolean oldAlarmHighOnESet = alarmHighOnESet;
		alarmHighOn = ALARM_HIGH_ON_EDEFAULT;
		alarmHighOnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_ON, oldAlarmHighOn, ALARM_HIGH_ON_EDEFAULT, oldAlarmHighOnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmHighOn() {
		return alarmHighOnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlarmLevel() {
		return alarmLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmLevel(int newAlarmLevel) {
		int oldAlarmLevel = alarmLevel;
		alarmLevel = newAlarmLevel;
		boolean oldAlarmLevelESet = alarmLevelESet;
		alarmLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROU_LONG__ALARM_LEVEL, oldAlarmLevel, alarmLevel, !oldAlarmLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmLevel() {
		int oldAlarmLevel = alarmLevel;
		boolean oldAlarmLevelESet = alarmLevelESet;
		alarmLevel = ALARM_LEVEL_EDEFAULT;
		alarmLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROU_LONG__ALARM_LEVEL, oldAlarmLevel, ALARM_LEVEL_EDEFAULT, oldAlarmLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmLevel() {
		return alarmLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAlarmLowOff() {
		return alarmLowOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmLowOff(long newAlarmLowOff) {
		long oldAlarmLowOff = alarmLowOff;
		alarmLowOff = newAlarmLowOff;
		boolean oldAlarmLowOffESet = alarmLowOffESet;
		alarmLowOffESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROU_LONG__ALARM_LOW_OFF, oldAlarmLowOff, alarmLowOff, !oldAlarmLowOffESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmLowOff() {
		long oldAlarmLowOff = alarmLowOff;
		boolean oldAlarmLowOffESet = alarmLowOffESet;
		alarmLowOff = ALARM_LOW_OFF_EDEFAULT;
		alarmLowOffESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROU_LONG__ALARM_LOW_OFF, oldAlarmLowOff, ALARM_LOW_OFF_EDEFAULT, oldAlarmLowOffESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmLowOff() {
		return alarmLowOffESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAlarmLowOn() {
		return alarmLowOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmLowOn(long newAlarmLowOn) {
		long oldAlarmLowOn = alarmLowOn;
		alarmLowOn = newAlarmLowOn;
		boolean oldAlarmLowOnESet = alarmLowOnESet;
		alarmLowOnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROU_LONG__ALARM_LOW_ON, oldAlarmLowOn, alarmLowOn, !oldAlarmLowOnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmLowOn() {
		long oldAlarmLowOn = alarmLowOn;
		boolean oldAlarmLowOnESet = alarmLowOnESet;
		alarmLowOn = ALARM_LOW_ON_EDEFAULT;
		alarmLowOnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROU_LONG__ALARM_LOW_ON, oldAlarmLowOn, ALARM_LOW_ON_EDEFAULT, oldAlarmLowOnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmLowOn() {
		return alarmLowOnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlarmTimerTrig() {
		return alarmTimerTrig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmTimerTrig(double newAlarmTimerTrig) {
		double oldAlarmTimerTrig = alarmTimerTrig;
		alarmTimerTrig = newAlarmTimerTrig;
		boolean oldAlarmTimerTrigESet = alarmTimerTrigESet;
		alarmTimerTrigESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROU_LONG__ALARM_TIMER_TRIG, oldAlarmTimerTrig, alarmTimerTrig, !oldAlarmTimerTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmTimerTrig() {
		double oldAlarmTimerTrig = alarmTimerTrig;
		boolean oldAlarmTimerTrigESet = alarmTimerTrigESet;
		alarmTimerTrig = ALARM_TIMER_TRIG_EDEFAULT;
		alarmTimerTrigESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROU_LONG__ALARM_TIMER_TRIG, oldAlarmTimerTrig, ALARM_TIMER_TRIG_EDEFAULT, oldAlarmTimerTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmTimerTrig() {
		return alarmTimerTrigESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_FAMILY:
				return getAlarmFaultFamily();
			case BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_MEMBER:
				return getAlarmFaultMember();
			case BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_OFF:
				return getAlarmHighOff();
			case BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_ON:
				return getAlarmHighOn();
			case BACIPropertiesPackage.ROU_LONG__ALARM_LEVEL:
				return getAlarmLevel();
			case BACIPropertiesPackage.ROU_LONG__ALARM_LOW_OFF:
				return getAlarmLowOff();
			case BACIPropertiesPackage.ROU_LONG__ALARM_LOW_ON:
				return getAlarmLowOn();
			case BACIPropertiesPackage.ROU_LONG__ALARM_TIMER_TRIG:
				return getAlarmTimerTrig();
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
			case BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_FAMILY:
				setAlarmFaultFamily((String)newValue);
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_MEMBER:
				setAlarmFaultMember((String)newValue);
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_OFF:
				setAlarmHighOff((Long)newValue);
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_ON:
				setAlarmHighOn((Long)newValue);
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_LEVEL:
				setAlarmLevel((Integer)newValue);
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_LOW_OFF:
				setAlarmLowOff((Long)newValue);
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_LOW_ON:
				setAlarmLowOn((Long)newValue);
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_TIMER_TRIG:
				setAlarmTimerTrig((Double)newValue);
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
			case BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_FAMILY:
				unsetAlarmFaultFamily();
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_MEMBER:
				unsetAlarmFaultMember();
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_OFF:
				unsetAlarmHighOff();
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_ON:
				unsetAlarmHighOn();
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_LEVEL:
				unsetAlarmLevel();
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_LOW_OFF:
				unsetAlarmLowOff();
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_LOW_ON:
				unsetAlarmLowOn();
				return;
			case BACIPropertiesPackage.ROU_LONG__ALARM_TIMER_TRIG:
				unsetAlarmTimerTrig();
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
			case BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_FAMILY:
				return isSetAlarmFaultFamily();
			case BACIPropertiesPackage.ROU_LONG__ALARM_FAULT_MEMBER:
				return isSetAlarmFaultMember();
			case BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_OFF:
				return isSetAlarmHighOff();
			case BACIPropertiesPackage.ROU_LONG__ALARM_HIGH_ON:
				return isSetAlarmHighOn();
			case BACIPropertiesPackage.ROU_LONG__ALARM_LEVEL:
				return isSetAlarmLevel();
			case BACIPropertiesPackage.ROU_LONG__ALARM_LOW_OFF:
				return isSetAlarmLowOff();
			case BACIPropertiesPackage.ROU_LONG__ALARM_LOW_ON:
				return isSetAlarmLowOn();
			case BACIPropertiesPackage.ROU_LONG__ALARM_TIMER_TRIG:
				return isSetAlarmTimerTrig();
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
		result.append(" (alarmFaultFamily: ");
		if (alarmFaultFamilyESet) result.append(alarmFaultFamily); else result.append("<unset>");
		result.append(", alarmFaultMember: ");
		if (alarmFaultMemberESet) result.append(alarmFaultMember); else result.append("<unset>");
		result.append(", alarmHighOff: ");
		if (alarmHighOffESet) result.append(alarmHighOff); else result.append("<unset>");
		result.append(", alarmHighOn: ");
		if (alarmHighOnESet) result.append(alarmHighOn); else result.append("<unset>");
		result.append(", alarmLevel: ");
		if (alarmLevelESet) result.append(alarmLevel); else result.append("<unset>");
		result.append(", alarmLowOff: ");
		if (alarmLowOffESet) result.append(alarmLowOff); else result.append("<unset>");
		result.append(", alarmLowOn: ");
		if (alarmLowOnESet) result.append(alarmLowOn); else result.append("<unset>");
		result.append(", alarmTimerTrig: ");
		if (alarmTimerTrigESet) result.append(alarmTimerTrig); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ROuLongImpl
