/**
 */
package org.palladiosimulator.supporting.problog.model.problog;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.supporting.prolog.model.prolog.Clause;

import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Disjunction Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunctionRule#getProbablisticFacts <em>Probablistic Facts</em>}</li>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunctionRule#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getAnnotatedDisjunctionRule()
 * @model
 * @generated
 */
public interface AnnotatedDisjunctionRule extends Clause {
	/**
	 * Returns the value of the '<em><b>Probablistic Facts</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probablistic Facts</em>' containment reference list.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getAnnotatedDisjunctionRule_ProbablisticFacts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProbabilisticFact> getProbablisticFacts();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getAnnotatedDisjunctionRule_Body()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunctionRule#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

} // AnnotatedDisjunctionRule
