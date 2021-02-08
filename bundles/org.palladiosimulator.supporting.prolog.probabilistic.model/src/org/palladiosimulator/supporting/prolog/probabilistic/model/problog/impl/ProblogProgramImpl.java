/**
 */
package org.palladiosimulator.supporting.prolog.probabilistic.model.problog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.supporting.prolog.model.prolog.Clause;

import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.ProblogPackage;
import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.ProblogProgram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.supporting.prolog.probabilistic.model.problog.impl.ProblogProgramImpl#getClauses <em>Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProblogProgramImpl extends MinimalEObjectImpl.Container implements ProblogProgram {
	/**
	 * The cached value of the '{@link #getClauses() <em>Clauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> clauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblogProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblogPackage.Literals.PROBLOG_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getClauses() {
		if (clauses == null) {
			clauses = new EObjectContainmentEList<Clause>(Clause.class, this, ProblogPackage.PROBLOG_PROGRAM__CLAUSES);
		}
		return clauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProblogPackage.PROBLOG_PROGRAM__CLAUSES:
				return ((InternalEList<?>)getClauses()).basicRemove(otherEnd, msgs);
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
			case ProblogPackage.PROBLOG_PROGRAM__CLAUSES:
				return getClauses();
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
			case ProblogPackage.PROBLOG_PROGRAM__CLAUSES:
				getClauses().clear();
				getClauses().addAll((Collection<? extends Clause>)newValue);
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
			case ProblogPackage.PROBLOG_PROGRAM__CLAUSES:
				getClauses().clear();
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
			case ProblogPackage.PROBLOG_PROGRAM__CLAUSES:
				return clauses != null && !clauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProblogProgramImpl
