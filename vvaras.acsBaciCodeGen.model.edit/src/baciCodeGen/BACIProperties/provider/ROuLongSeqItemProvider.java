/**
 */
package baciCodeGen.BACIProperties.provider;


import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.ROuLongSeq;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link baciCodeGen.BACIProperties.ROuLongSeq} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ROuLongSeqItemProvider extends PuLongSeq1ItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROuLongSeqItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAlarmFaultFamilyPropertyDescriptor(object);
			addAlarmFaultMemberPropertyDescriptor(object);
			addAlarmHighOffPropertyDescriptor(object);
			addAlarmHighOnPropertyDescriptor(object);
			addAlarmLevelPropertyDescriptor(object);
			addAlarmLowOffPropertyDescriptor(object);
			addAlarmLowOnPropertyDescriptor(object);
			addAlarmTimerTrigPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Alarm Fault Family feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlarmFaultFamilyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROuLongSeq_alarmFaultFamily_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROuLongSeq_alarmFaultFamily_feature", "_UI_ROuLongSeq_type"),
				 BACIPropertiesPackage.Literals.ROU_LONG_SEQ__ALARM_FAULT_FAMILY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alarm Fault Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlarmFaultMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROuLongSeq_alarmFaultMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROuLongSeq_alarmFaultMember_feature", "_UI_ROuLongSeq_type"),
				 BACIPropertiesPackage.Literals.ROU_LONG_SEQ__ALARM_FAULT_MEMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alarm High Off feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlarmHighOffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROuLongSeq_alarmHighOff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROuLongSeq_alarmHighOff_feature", "_UI_ROuLongSeq_type"),
				 BACIPropertiesPackage.Literals.ROU_LONG_SEQ__ALARM_HIGH_OFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alarm High On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlarmHighOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROuLongSeq_alarmHighOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROuLongSeq_alarmHighOn_feature", "_UI_ROuLongSeq_type"),
				 BACIPropertiesPackage.Literals.ROU_LONG_SEQ__ALARM_HIGH_ON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alarm Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlarmLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROuLongSeq_alarmLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROuLongSeq_alarmLevel_feature", "_UI_ROuLongSeq_type"),
				 BACIPropertiesPackage.Literals.ROU_LONG_SEQ__ALARM_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alarm Low Off feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlarmLowOffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROuLongSeq_alarmLowOff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROuLongSeq_alarmLowOff_feature", "_UI_ROuLongSeq_type"),
				 BACIPropertiesPackage.Literals.ROU_LONG_SEQ__ALARM_LOW_OFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alarm Low On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlarmLowOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROuLongSeq_alarmLowOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROuLongSeq_alarmLowOn_feature", "_UI_ROuLongSeq_type"),
				 BACIPropertiesPackage.Literals.ROU_LONG_SEQ__ALARM_LOW_ON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alarm Timer Trig feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlarmTimerTrigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROuLongSeq_alarmTimerTrig_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROuLongSeq_alarmTimerTrig_feature", "_UI_ROuLongSeq_type"),
				 BACIPropertiesPackage.Literals.ROU_LONG_SEQ__ALARM_TIMER_TRIG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ROuLongSeq.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ROuLongSeq"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ROuLongSeq rOuLongSeq = (ROuLongSeq)object;
		return getString("_UI_ROuLongSeq_type") + " " + rOuLongSeq.getArchiveMaxInt();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ROuLongSeq.class)) {
			case BACIPropertiesPackage.ROU_LONG_SEQ__ALARM_FAULT_FAMILY:
			case BACIPropertiesPackage.ROU_LONG_SEQ__ALARM_FAULT_MEMBER:
			case BACIPropertiesPackage.ROU_LONG_SEQ__ALARM_HIGH_OFF:
			case BACIPropertiesPackage.ROU_LONG_SEQ__ALARM_HIGH_ON:
			case BACIPropertiesPackage.ROU_LONG_SEQ__ALARM_LEVEL:
			case BACIPropertiesPackage.ROU_LONG_SEQ__ALARM_LOW_OFF:
			case BACIPropertiesPackage.ROU_LONG_SEQ__ALARM_LOW_ON:
			case BACIPropertiesPackage.ROU_LONG_SEQ__ALARM_TIMER_TRIG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
