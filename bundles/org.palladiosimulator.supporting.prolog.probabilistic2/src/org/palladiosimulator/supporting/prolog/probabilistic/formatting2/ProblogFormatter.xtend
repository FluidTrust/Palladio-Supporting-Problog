/*
 * generated by Xtext 2.23.0
 */
package org.palladiosimulator.supporting.prolog.probabilistic.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.palladiosimulator.supporting.prolog.formatting.PrologFormatter
import org.palladiosimulator.supporting.prolog.model.prolog.Program
import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.AnnotatedDisjunction
import org.palladiosimulator.supporting.prolog.probabilistic.services.ProblogGrammarAccess

class ProblogFormatter extends PrologFormatter {
	
	@Inject extension ProblogGrammarAccess

	override dispatch void format(Program program, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (clause : program.clauses) {
			clause.format
		}
	}

	def dispatch void format(AnnotatedDisjunction annotatedDisjunction, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (probabilisticFact : annotatedDisjunction.probablisticFacts) {
			probabilisticFact.format
		}
		annotatedDisjunction.body.format
	}
	
	// TODO: implement for ProbabilisticFact, ProbabilisticRule
}