/**
 */
package org.palladiosimulator.supporting.problog.model.problog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.supporting.prolog.model.prolog.Clause;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.ProblogProgram#getClauses <em>Clauses</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProblogProgram()
 * @model
 * @generated
 */
public interface ProblogProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.supporting.prolog.model.prolog.Clause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clauses</em>' containment reference list.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProblogProgram_Clauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clause> getClauses();

} // ProblogProgram
