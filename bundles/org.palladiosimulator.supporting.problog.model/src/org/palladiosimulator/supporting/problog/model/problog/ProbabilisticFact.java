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
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getFact <em>Fact</em>}</li>
 *   <li>{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticFact()
 * @model
 * @generated
 */
public interface ProbabilisticFact extends Clause {
	/**
	 * Returns the value of the '<em><b>Fact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' containment reference.
	 * @see #setFact(CompoundTerm)
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#getProbabilisticFact_Fact()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompoundTerm getFact();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getFact <em>Fact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' containment reference.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(CompoundTerm value);

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
