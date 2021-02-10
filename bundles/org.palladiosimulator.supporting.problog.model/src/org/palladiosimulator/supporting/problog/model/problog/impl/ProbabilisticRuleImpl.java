/**
 */
package org.palladiosimulator.supporting.problog.model.problog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact;
import org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule;
import org.palladiosimulator.supporting.problog.model.problog.ProblogPackage;

import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression;

import org.palladiosimulator.supporting.prolog.model.prolog.impl.ClauseImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probabilistic Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.impl.ProbabilisticRuleImpl#getProbabilisticFact <em>Probabilistic Fact</em>}</li>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.impl.ProbabilisticRuleImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbabilisticRuleImpl extends ClauseImpl implements ProbabilisticRule {
	/**
	 * The cached value of the '{@link #getProbabilisticFact() <em>Probabilistic Fact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilisticFact()
	 * @generated
	 * @ordered
	 */
	protected ProbabilisticFact probabilisticFact;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Expression body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilisticRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblogPackage.Literals.PROBABILISTIC_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticFact getProbabilisticFact() {
		return probabilisticFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProbabilisticFact(ProbabilisticFact newProbabilisticFact, NotificationChain msgs) {
		ProbabilisticFact oldProbabilisticFact = probabilisticFact;
		probabilisticFact = newProbabilisticFact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProblogPackage.PROBABILISTIC_RULE__PROBABILISTIC_FACT, oldProbabilisticFact, newProbabilisticFact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabilisticFact(ProbabilisticFact newProbabilisticFact) {
		if (newProbabilisticFact != probabilisticFact) {
			NotificationChain msgs = null;
			if (probabilisticFact != null)
				msgs = ((InternalEObject)probabilisticFact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProblogPackage.PROBABILISTIC_RULE__PROBABILISTIC_FACT, null, msgs);
			if (newProbabilisticFact != null)
				msgs = ((InternalEObject)newProbabilisticFact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProblogPackage.PROBABILISTIC_RULE__PROBABILISTIC_FACT, null, msgs);
			msgs = basicSetProbabilisticFact(newProbabilisticFact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblogPackage.PROBABILISTIC_RULE__PROBABILISTIC_FACT, newProbabilisticFact, newProbabilisticFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Expression newBody, NotificationChain msgs) {
		Expression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProblogPackage.PROBABILISTIC_RULE__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Expression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProblogPackage.PROBABILISTIC_RULE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProblogPackage.PROBABILISTIC_RULE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblogPackage.PROBABILISTIC_RULE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProblogPackage.PROBABILISTIC_RULE__PROBABILISTIC_FACT:
				return basicSetProbabilisticFact(null, msgs);
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
				return basicSetBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProblogPackage.PROBABILISTIC_RULE__PROBABILISTIC_FACT:
				return getProbabilisticFact();
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
				return getBody();
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
			case ProblogPackage.PROBABILISTIC_RULE__PROBABILISTIC_FACT:
				setProbabilisticFact((ProbabilisticFact)newValue);
				return;
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
				setBody((Expression)newValue);
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
			case ProblogPackage.PROBABILISTIC_RULE__PROBABILISTIC_FACT:
				setProbabilisticFact((ProbabilisticFact)null);
				return;
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
				setBody((Expression)null);
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
			case ProblogPackage.PROBABILISTIC_RULE__PROBABILISTIC_FACT:
				return probabilisticFact != null;
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

} //ProbabilisticRuleImpl
