/**
 */
package org.palladiosimulator.supporting.prolog.probabilistic.model.problog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.ProbabilisticFact;
import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.ProblogFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Probabilistic Fact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbabilisticFactTest extends TestCase {

	/**
	 * The fixture for this Probabilistic Fact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilisticFact fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProbabilisticFactTest.class);
	}

	/**
	 * Constructs a new Probabilistic Fact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticFactTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Probabilistic Fact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProbabilisticFact fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Probabilistic Fact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilisticFact getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProblogFactory.eINSTANCE.createProbabilisticFact());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProbabilisticFactTest
