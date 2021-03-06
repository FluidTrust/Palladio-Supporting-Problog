/*
 * generated by Xtext 2.24.0
 */
package org.palladiosimulator.supporting.prolog.probabilistic.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.palladiosimulator.supporting.prolog.probabilistic.ProblogRuntimeModule;
import org.palladiosimulator.supporting.prolog.probabilistic.ProblogStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ProblogIdeSetup extends ProblogStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ProblogRuntimeModule(), new ProblogIdeModule()));
	}
	
}
