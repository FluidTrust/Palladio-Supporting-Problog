/**
 */
package org.palladiosimulator.supporting.problog.model.problog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.supporting.prolog.model.prolog.PrologPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogFactory
 * @model kind="package"
 * @generated
 */
public interface ProblogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "problog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/supporting/problog/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "problog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProblogPackage eINSTANCE = org.palladiosimulator.supporting.problog.model.problog.impl.ProblogPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.supporting.problog.model.problog.impl.ProbabilisticFactImpl <em>Probabilistic Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProbabilisticFactImpl
	 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProblogPackageImpl#getProbabilisticFact()
	 * @generated
	 */
	int PROBABILISTIC_FACT = 0;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_FACT__HEAD = PrologPackage.CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_FACT__PROBABILITY = PrologPackage.CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Probabilistic Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_FACT_FEATURE_COUNT = PrologPackage.CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.supporting.problog.model.problog.impl.ProbabilisticRuleImpl <em>Probabilistic Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProbabilisticRuleImpl
	 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProblogPackageImpl#getProbabilisticRule()
	 * @generated
	 */
	int PROBABILISTIC_RULE = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_RULE__BODY = PrologPackage.CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_RULE__HEAD = PrologPackage.CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_RULE__PROBABILITY = PrologPackage.CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Probabilistic Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_RULE_FEATURE_COUNT = PrologPackage.CLAUSE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.supporting.problog.model.problog.impl.AnnotatedDisjunctionImpl <em>Annotated Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.supporting.problog.model.problog.impl.AnnotatedDisjunctionImpl
	 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProblogPackageImpl#getAnnotatedDisjunction()
	 * @generated
	 */
	int ANNOTATED_DISJUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Probablistic Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_DISJUNCTION__PROBABLISTIC_FACTS = PrologPackage.CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_DISJUNCTION__BODY = PrologPackage.CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotated Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_DISJUNCTION_FEATURE_COUNT = PrologPackage.CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.supporting.problog.model.problog.impl.ProblogProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProblogProgramImpl
	 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProblogPackageImpl#getProblogProgram()
	 * @generated
	 */
	int PROBLOG_PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLOG_PROGRAM__CLAUSES = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLOG_PROGRAM_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact <em>Probabilistic Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probabilistic Fact</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact
	 * @generated
	 */
	EClass getProbabilisticFact();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getHead()
	 * @see #getProbabilisticFact()
	 * @generated
	 */
	EReference getProbabilisticFact_Head();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact#getProbability()
	 * @see #getProbabilisticFact()
	 * @generated
	 */
	EAttribute getProbabilisticFact_Probability();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule <em>Probabilistic Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probabilistic Rule</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule
	 * @generated
	 */
	EClass getProbabilisticRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getBody()
	 * @see #getProbabilisticRule()
	 * @generated
	 */
	EReference getProbabilisticRule_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getHead()
	 * @see #getProbabilisticRule()
	 * @generated
	 */
	EReference getProbabilisticRule_Head();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule#getProbability()
	 * @see #getProbabilisticRule()
	 * @generated
	 */
	EAttribute getProbabilisticRule_Probability();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunction <em>Annotated Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Disjunction</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunction
	 * @generated
	 */
	EClass getAnnotatedDisjunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunction#getProbablisticFacts <em>Probablistic Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Probablistic Facts</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunction#getProbablisticFacts()
	 * @see #getAnnotatedDisjunction()
	 * @generated
	 */
	EReference getAnnotatedDisjunction_ProbablisticFacts();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunction#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunction#getBody()
	 * @see #getAnnotatedDisjunction()
	 * @generated
	 */
	EReference getAnnotatedDisjunction_Body();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.supporting.problog.model.problog.ProblogProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogProgram
	 * @generated
	 */
	EClass getProblogProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.supporting.problog.model.problog.ProblogProgram#getClauses <em>Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clauses</em>'.
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogProgram#getClauses()
	 * @see #getProblogProgram()
	 * @generated
	 */
	EReference getProblogProgram_Clauses();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProblogFactory getProblogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.supporting.problog.model.problog.impl.ProbabilisticFactImpl <em>Probabilistic Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProbabilisticFactImpl
		 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProblogPackageImpl#getProbabilisticFact()
		 * @generated
		 */
		EClass PROBABILISTIC_FACT = eINSTANCE.getProbabilisticFact();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILISTIC_FACT__HEAD = eINSTANCE.getProbabilisticFact_Head();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBABILISTIC_FACT__PROBABILITY = eINSTANCE.getProbabilisticFact_Probability();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.supporting.problog.model.problog.impl.ProbabilisticRuleImpl <em>Probabilistic Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProbabilisticRuleImpl
		 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProblogPackageImpl#getProbabilisticRule()
		 * @generated
		 */
		EClass PROBABILISTIC_RULE = eINSTANCE.getProbabilisticRule();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILISTIC_RULE__BODY = eINSTANCE.getProbabilisticRule_Body();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILISTIC_RULE__HEAD = eINSTANCE.getProbabilisticRule_Head();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBABILISTIC_RULE__PROBABILITY = eINSTANCE.getProbabilisticRule_Probability();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.supporting.problog.model.problog.impl.AnnotatedDisjunctionImpl <em>Annotated Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.supporting.problog.model.problog.impl.AnnotatedDisjunctionImpl
		 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProblogPackageImpl#getAnnotatedDisjunction()
		 * @generated
		 */
		EClass ANNOTATED_DISJUNCTION = eINSTANCE.getAnnotatedDisjunction();

		/**
		 * The meta object literal for the '<em><b>Probablistic Facts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_DISJUNCTION__PROBABLISTIC_FACTS = eINSTANCE.getAnnotatedDisjunction_ProbablisticFacts();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_DISJUNCTION__BODY = eINSTANCE.getAnnotatedDisjunction_Body();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.supporting.problog.model.problog.impl.ProblogProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProblogProgramImpl
		 * @see org.palladiosimulator.supporting.problog.model.problog.impl.ProblogPackageImpl#getProblogProgram()
		 * @generated
		 */
		EClass PROBLOG_PROGRAM = eINSTANCE.getProblogProgram();

		/**
		 * The meta object literal for the '<em><b>Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLOG_PROGRAM__CLAUSES = eINSTANCE.getProblogProgram_Clauses();

	}

} //ProblogPackage
