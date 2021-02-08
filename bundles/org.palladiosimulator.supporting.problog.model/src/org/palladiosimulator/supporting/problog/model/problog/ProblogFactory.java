/**
 */
package org.palladiosimulator.supporting.problog.model.problog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage
 * @generated
 */
public interface ProblogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProblogFactory eINSTANCE = org.palladiosimulator.supporting.problog.model.problog.impl.ProblogFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Probabilistic Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probabilistic Fact</em>'.
	 * @generated
	 */
	ProbabilisticFact createProbabilisticFact();

	/**
	 * Returns a new object of class '<em>Probabilistic Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probabilistic Rule</em>'.
	 * @generated
	 */
	ProbabilisticRule createProbabilisticRule();

	/**
	 * Returns a new object of class '<em>Annotated Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotated Disjunction</em>'.
	 * @generated
	 */
	AnnotatedDisjunction createAnnotatedDisjunction();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	ProblogProgram createProblogProgram();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProblogPackage getProblogPackage();

} //ProblogFactory
