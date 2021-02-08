/**
 */
package org.palladiosimulator.supporting.problog.model.problog.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.supporting.problog.model.problog.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblogFactoryImpl extends EFactoryImpl implements ProblogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProblogFactory init() {
		try {
			ProblogFactory theProblogFactory = (ProblogFactory)EPackage.Registry.INSTANCE.getEFactory(ProblogPackage.eNS_URI);
			if (theProblogFactory != null) {
				return theProblogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProblogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProblogPackage.PROBABILISTIC_FACT: return createProbabilisticFact();
			case ProblogPackage.PROBABILISTIC_RULE: return createProbabilisticRule();
			case ProblogPackage.ANNOTATED_DISJUNCTION: return createAnnotatedDisjunction();
			case ProblogPackage.PROBLOG_PROGRAM: return createProblogProgram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticFact createProbabilisticFact() {
		ProbabilisticFactImpl probabilisticFact = new ProbabilisticFactImpl();
		return probabilisticFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticRule createProbabilisticRule() {
		ProbabilisticRuleImpl probabilisticRule = new ProbabilisticRuleImpl();
		return probabilisticRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedDisjunction createAnnotatedDisjunction() {
		AnnotatedDisjunctionImpl annotatedDisjunction = new AnnotatedDisjunctionImpl();
		return annotatedDisjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblogProgram createProblogProgram() {
		ProblogProgramImpl problogProgram = new ProblogProgramImpl();
		return problogProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblogPackage getProblogPackage() {
		return (ProblogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProblogPackage getPackage() {
		return ProblogPackage.eINSTANCE;
	}

} //ProblogFactoryImpl
