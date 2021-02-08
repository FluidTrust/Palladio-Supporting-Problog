/**
 */
package org.palladiosimulator.supporting.prolog.probabilistic.model.problog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm;

import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression;

import org.palladiosimulator.supporting.prolog.model.prolog.impl.ClauseImpl;

import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.ProbabilisticRule;
import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.ProblogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probabilistic Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.supporting.prolog.probabilistic.model.problog.impl.ProbabilisticRuleImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.palladiosimulator.supporting.prolog.probabilistic.model.problog.impl.ProbabilisticRuleImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.palladiosimulator.supporting.prolog.probabilistic.model.problog.impl.ProbabilisticRuleImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbabilisticRuleImpl extends ClauseImpl implements ProbabilisticRule {
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
	 * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected CompoundTerm head;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

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
	public CompoundTerm getHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(CompoundTerm newHead, NotificationChain msgs) {
		CompoundTerm oldHead = head;
		head = newHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProblogPackage.PROBABILISTIC_RULE__HEAD, oldHead, newHead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(CompoundTerm newHead) {
		if (newHead != head) {
			NotificationChain msgs = null;
			if (head != null)
				msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProblogPackage.PROBABILISTIC_RULE__HEAD, null, msgs);
			if (newHead != null)
				msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProblogPackage.PROBABILISTIC_RULE__HEAD, null, msgs);
			msgs = basicSetHead(newHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblogPackage.PROBABILISTIC_RULE__HEAD, newHead, newHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblogPackage.PROBABILISTIC_RULE__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
				return basicSetBody(null, msgs);
			case ProblogPackage.PROBABILISTIC_RULE__HEAD:
				return basicSetHead(null, msgs);
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
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
				return getBody();
			case ProblogPackage.PROBABILISTIC_RULE__HEAD:
				return getHead();
			case ProblogPackage.PROBABILISTIC_RULE__PROBABILITY:
				return getProbability();
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
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
				setBody((Expression)newValue);
				return;
			case ProblogPackage.PROBABILISTIC_RULE__HEAD:
				setHead((CompoundTerm)newValue);
				return;
			case ProblogPackage.PROBABILISTIC_RULE__PROBABILITY:
				setProbability((Double)newValue);
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
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
				setBody((Expression)null);
				return;
			case ProblogPackage.PROBABILISTIC_RULE__HEAD:
				setHead((CompoundTerm)null);
				return;
			case ProblogPackage.PROBABILISTIC_RULE__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
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
			case ProblogPackage.PROBABILISTIC_RULE__BODY:
				return body != null;
			case ProblogPackage.PROBABILISTIC_RULE__HEAD:
				return head != null;
			case ProblogPackage.PROBABILISTIC_RULE__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //ProbabilisticRuleImpl
