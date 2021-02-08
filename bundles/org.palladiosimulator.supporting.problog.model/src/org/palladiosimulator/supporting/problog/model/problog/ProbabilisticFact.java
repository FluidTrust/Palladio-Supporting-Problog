/**
 */
package org.palladiosimulator.supporting.problog.model.problog;

import org.palladiosimulator.supporting.prolog.model.prolog.Clause;
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probabilistic Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getHead <em>Head</em>}</li>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticFact()
 * @model
 * @generated
 */
public interface ProbabilisticFact extends Clause {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(CompoundTerm)
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticFact_Head()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompoundTerm getHead();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getHead <em>Head</em>}' containment reference.
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
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticFact_Probability()
	 * @model
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

} // ProbabilisticFact
