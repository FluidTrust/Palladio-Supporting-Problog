/**
 */
package org.palladiosimulator.supporting.problog.model.problog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunction;
import org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact;
import org.palladiosimulator.supporting.problog.model.problog.ProblogPackage;

import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression;

import org.palladiosimulator.supporting.prolog.model.prolog.impl.ClauseImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotated Disjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.impl.AnnotatedDisjunctionImpl#getProbablisticFacts <em>Probablistic Facts</em>}</li>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.impl.AnnotatedDisjunctionImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotatedDisjunctionImpl extends ClauseImpl implements AnnotatedDisjunction {
	/**
	 * The cached value of the '{@link #getProbablisticFacts() <em>Probablistic Facts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbablisticFacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbabilisticFact> probablisticFacts;

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
	protected AnnotatedDisjunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblogPackage.Literals.ANNOTATED_DISJUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbabilisticFact> getProbablisticFacts() {
		if (probablisticFacts == null) {
			probablisticFacts = new EObjectContainmentEList<ProbabilisticFact>(ProbabilisticFact.class, this, ProblogPackage.ANNOTATED_DISJUNCTION__PROBABLISTIC_FACTS);
		}
		return probablisticFacts;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProblogPackage.ANNOTATED_DISJUNCTION__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProblogPackage.ANNOTATED_DISJUNCTION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProblogPackage.ANNOTATED_DISJUNCTION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblogPackage.ANNOTATED_DISJUNCTION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProblogPackage.ANNOTATED_DISJUNCTION__PROBABLISTIC_FACTS:
				return ((InternalEList<?>)getProbablisticFacts()).basicRemove(otherEnd, msgs);
			case ProblogPackage.ANNOTATED_DISJUNCTION__BODY:
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
			case ProblogPackage.ANNOTATED_DISJUNCTION__PROBABLISTIC_FACTS:
				return getProbablisticFacts();
			case ProblogPackage.ANNOTATED_DISJUNCTION__BODY:
				return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProblogPackage.ANNOTATED_DISJUNCTION__PROBABLISTIC_FACTS:
				getProbablisticFacts().clear();
				getProbablisticFacts().addAll((Collection<? extends ProbabilisticFact>)newValue);
				return;
			case ProblogPackage.ANNOTATED_DISJUNCTION__BODY:
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
			case ProblogPackage.ANNOTATED_DISJUNCTION__PROBABLISTIC_FACTS:
				getProbablisticFacts().clear();
				return;
			case ProblogPackage.ANNOTATED_DISJUNCTION__BODY:
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
			case ProblogPackage.ANNOTATED_DISJUNCTION__PROBABLISTIC_FACTS:
				return probablisticFacts != null && !probablisticFacts.isEmpty();
			case ProblogPackage.ANNOTATED_DISJUNCTION__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotatedDisjunctionImpl
