/**
 */
package org.palladiosimulator.supporting.problog.model.problog;

import org.palladiosimulator.supporting.prolog.model.prolog.Clause;
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm;

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
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getBody <em>Body</em>}</li>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getHead <em>Head</em>}</li>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticRule()
 * @model
 * @generated
 */
public interface ProbabilisticRule extends Clause {
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

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(CompoundTerm)
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticRule_Head()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompoundTerm getHead();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(CompoundTerm value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticRule_Probability()
	 * @model
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

} // ProbabilisticRule
