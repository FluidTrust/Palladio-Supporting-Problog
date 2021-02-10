/**
 */
package org.palladiosimulator.supporting.problog.model.problog;

import org.palladiosimulator.supporting.prolog.model.prolog.Clause;

import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probabilistic Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getProbabilisticFact <em>Probabilistic Fact</em>}</li>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticRule()
 * @model
 * @generated
 */
public interface ProbabilisticRule extends Clause {
	/**
	 * Returns the value of the '<em><b>Probabilistic Fact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilistic Fact</em>' containment reference.
	 * @see #setProbabilisticFact(ProbabilisticFact)
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticRule_ProbabilisticFact()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProbabilisticFact getProbabilisticFact();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getProbabilisticFact <em>Probabilistic Fact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probabilistic Fact</em>' containment reference.
	 * @see #getProbabilisticFact()
	 * @generated
	 */
	void setProbabilisticFact(ProbabilisticFact value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticRule_Body()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

} // ProbabilisticRule
