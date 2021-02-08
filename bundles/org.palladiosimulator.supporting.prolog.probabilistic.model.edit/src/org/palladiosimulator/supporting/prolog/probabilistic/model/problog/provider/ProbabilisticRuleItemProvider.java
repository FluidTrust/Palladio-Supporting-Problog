/**
 */
package org.palladiosimulator.supporting.prolog.probabilistic.model.problog.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.supporting.prolog.model.prolog.PrologFactory;

import org.palladiosimulator.supporting.prolog.model.prolog.expressions.ExpressionsFactory;

import org.palladiosimulator.supporting.prolog.model.prolog.provider.ClauseItemProvider;

import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.ProbabilisticRule;
import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.ProblogPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.supporting.prolog.probabilistic.model.problog.ProbabilisticRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbabilisticRuleItemProvider extends ClauseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticRuleItemProvider(AdapterFactory adapterFactory) {
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

			addProbabilityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Probability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProbabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProbabilisticRule_probability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProbabilisticRule_probability_feature", "_UI_ProbabilisticRule_type"),
				 ProblogPackage.Literals.PROBABILISTIC_RULE__PROBABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY);
			childrenFeatures.add(ProblogPackage.Literals.PROBABILISTIC_RULE__HEAD);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ProbabilisticRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProbabilisticRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ProbabilisticRule probabilisticRule = (ProbabilisticRule)object;
		return getString("_UI_ProbabilisticRule_type") + " " + probabilisticRule.getProbability();
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

		switch (notification.getFeatureID(ProbabilisticRule.class)) {
			case ProblogPackage.PROBABILISTIC_RULE__PROBABILITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
			case ProblogPackage.PROBABILISTIC_RULE__HEAD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 PrologFactory.eINSTANCE.createCompoundTerm()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 PrologFactory.eINSTANCE.createAtomicNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 PrologFactory.eINSTANCE.createAtomicDouble()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 PrologFactory.eINSTANCE.createAtomicQuotedString()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 PrologFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 PrologFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 PrologFactory.eINSTANCE.createFalse()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 PrologFactory.eINSTANCE.createFail()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 PrologFactory.eINSTANCE.createCut()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createLogicalOr()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createSoftCut()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createLogicalAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createNotProvable()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createUnification()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createUniv()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createStructuralEquivalence()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createStructuralEquivalenceNotProvable()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createNumberEqual()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createLessOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createEquivalence()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createNonEqualNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createGreaterOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createStandardOrderBefore()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createEqualOrStandardOrderBefore()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createStandardOrderAfter()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createEqualOrStandardOrderAfter()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createNotUnifiable()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createDisequality()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createAs()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createIs()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createParticalUnification()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createSubDict()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createModuleCall()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createBinaryAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createBinaryOr()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createIntegerDivision()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createRdiv()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createBitwiseShiftLeft()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createMod()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createRem()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createPower()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createPositiveNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createNegativeNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__BODY,
				 ExpressionsFactory.eINSTANCE.createBitwiseNegation()));

		newChildDescriptors.add
			(createChildParameter
				(ProblogPackage.Literals.PROBABILISTIC_RULE__HEAD,
				 PrologFactory.eINSTANCE.createCompoundTerm()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ProblogPackage.Literals.PROBABILISTIC_RULE__BODY ||
			childFeature == ProblogPackage.Literals.PROBABILISTIC_RULE__HEAD;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}