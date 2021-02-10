/**
 */
package org.palladiosimulator.supporting.problog.model.problog.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.supporting.problog.model.problog.AnnotatedDisjunctionRule;
import org.palladiosimulator.supporting.problog.model.problog.ProbabilisticFact;
import org.palladiosimulator.supporting.problog.model.problog.ProbabilisticRule;
import org.palladiosimulator.supporting.problog.model.problog.ProblogFactory;
import org.palladiosimulator.supporting.problog.model.problog.ProblogPackage;

import org.palladiosimulator.supporting.prolog.model.prolog.PrologPackage;

import org.palladiosimulator.supporting.prolog.model.prolog.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblogPackageImpl extends EPackageImpl implements ProblogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilisticFactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilisticRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedDisjunctionRuleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.supporting.problog.model.problog.ProblogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProblogPackageImpl() {
		super(eNS_URI, ProblogFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProblogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProblogPackage init() {
		if (isInited) return (ProblogPackage)EPackage.Registry.INSTANCE.getEPackage(ProblogPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProblogPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProblogPackageImpl theProblogPackage = registeredProblogPackage instanceof ProblogPackageImpl ? (ProblogPackageImpl)registeredProblogPackage : new ProblogPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PrologPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProblogPackage.createPackageContents();

		// Initialize created meta-data
		theProblogPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProblogPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProblogPackage.eNS_URI, theProblogPackage);
		return theProblogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilisticFact() {
		return probabilisticFactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbabilisticFact_Fact() {
		return (EReference)probabilisticFactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbabilisticFact_Probability() {
		return (EAttribute)probabilisticFactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilisticRule() {
		return probabilisticRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbabilisticRule_ProbabilisticFact() {
		return (EReference)probabilisticRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbabilisticRule_Body() {
		return (EReference)probabilisticRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatedDisjunctionRule() {
		return annotatedDisjunctionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedDisjunctionRule_ProbablisticFacts() {
		return (EReference)annotatedDisjunctionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedDisjunctionRule_Body() {
		return (EReference)annotatedDisjunctionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblogFactory getProblogFactory() {
		return (ProblogFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		probabilisticFactEClass = createEClass(PROBABILISTIC_FACT);
		createEReference(probabilisticFactEClass, PROBABILISTIC_FACT__FACT);
		createEAttribute(probabilisticFactEClass, PROBABILISTIC_FACT__PROBABILITY);

		probabilisticRuleEClass = createEClass(PROBABILISTIC_RULE);
		createEReference(probabilisticRuleEClass, PROBABILISTIC_RULE__PROBABILISTIC_FACT);
		createEReference(probabilisticRuleEClass, PROBABILISTIC_RULE__BODY);

		annotatedDisjunctionRuleEClass = createEClass(ANNOTATED_DISJUNCTION_RULE);
		createEReference(annotatedDisjunctionRuleEClass, ANNOTATED_DISJUNCTION_RULE__PROBABLISTIC_FACTS);
		createEReference(annotatedDisjunctionRuleEClass, ANNOTATED_DISJUNCTION_RULE__BODY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PrologPackage thePrologPackage = (PrologPackage)EPackage.Registry.INSTANCE.getEPackage(PrologPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		probabilisticFactEClass.getESuperTypes().add(thePrologPackage.getClause());
		probabilisticRuleEClass.getESuperTypes().add(thePrologPackage.getClause());
		annotatedDisjunctionRuleEClass.getESuperTypes().add(thePrologPackage.getClause());

		// Initialize classes and features; add operations and parameters
		initEClass(probabilisticFactEClass, ProbabilisticFact.class, "ProbabilisticFact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProbabilisticFact_Fact(), thePrologPackage.getCompoundTerm(), null, "fact", null, 1, 1, ProbabilisticFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProbabilisticFact_Probability(), ecorePackage.getEDouble(), "probability", null, 0, 1, ProbabilisticFact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilisticRuleEClass, ProbabilisticRule.class, "ProbabilisticRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProbabilisticRule_ProbabilisticFact(), this.getProbabilisticFact(), null, "probabilisticFact", null, 1, 1, ProbabilisticRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbabilisticRule_Body(), theExpressionsPackage.getExpression(), null, "body", null, 0, 1, ProbabilisticRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedDisjunctionRuleEClass, AnnotatedDisjunctionRule.class, "AnnotatedDisjunctionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedDisjunctionRule_ProbablisticFacts(), this.getProbabilisticFact(), null, "probablisticFacts", null, 1, -1, AnnotatedDisjunctionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedDisjunctionRule_Body(), theExpressionsPackage.getExpression(), null, "body", null, 0, 1, AnnotatedDisjunctionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProblogPackageImpl
