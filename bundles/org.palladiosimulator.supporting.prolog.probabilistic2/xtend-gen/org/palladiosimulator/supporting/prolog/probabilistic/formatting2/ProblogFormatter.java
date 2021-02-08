/**
 * generated by Xtext 2.23.0
 */
package org.palladiosimulator.supporting.prolog.probabilistic.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.palladiosimulator.supporting.prolog.formatting.PrologFormatter;
import org.palladiosimulator.supporting.prolog.model.prolog.Clause;
import org.palladiosimulator.supporting.prolog.model.prolog.Comment;
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm;
import org.palladiosimulator.supporting.prolog.model.prolog.Fact;
import org.palladiosimulator.supporting.prolog.model.prolog.List;
import org.palladiosimulator.supporting.prolog.model.prolog.Program;
import org.palladiosimulator.supporting.prolog.model.prolog.Rule;
import org.palladiosimulator.supporting.prolog.model.prolog.directives.Directive;
import org.palladiosimulator.supporting.prolog.model.prolog.directives.PredicateIndicator;
import org.palladiosimulator.supporting.prolog.model.prolog.directives.Table;
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.BinaryExpression;
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.Expression;
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.LogicalAnd;
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.LogicalOr;
import org.palladiosimulator.supporting.prolog.model.prolog.expressions.UnaryExpression;
import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.AnnotatedDisjunction;
import org.palladiosimulator.supporting.prolog.probabilistic.model.problog.ProbabilisticFact;
import org.palladiosimulator.supporting.prolog.probabilistic.services.ProblogGrammarAccess;

@SuppressWarnings("all")
public class ProblogFormatter extends PrologFormatter {
  @Inject
  @Extension
  private ProblogGrammarAccess _problogGrammarAccess;
  
  @Override
  protected void _format(final Program program, @Extension final IFormattableDocument document) {
    EList<Clause> _clauses = program.getClauses();
    for (final Clause clause : _clauses) {
      document.<Clause>format(clause);
    }
  }
  
  protected void _format(final AnnotatedDisjunction annotatedDisjunction, @Extension final IFormattableDocument document) {
    EList<ProbabilisticFact> _probablisticFacts = annotatedDisjunction.getProbablisticFacts();
    for (final ProbabilisticFact probabilisticFact : _probablisticFacts) {
      document.<ProbabilisticFact>format(probabilisticFact);
    }
    document.<Expression>format(annotatedDisjunction.getBody());
  }
  
  @Override
  public void format(final Object annotatedDisjunction, final IFormattableDocument document) {
    if (annotatedDisjunction instanceof XtextResource) {
      _format((XtextResource)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof CompoundTerm) {
      _format((CompoundTerm)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof List) {
      _format((List)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof LogicalAnd) {
      _format((LogicalAnd)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof LogicalOr) {
      _format((LogicalOr)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof Comment) {
      _format((Comment)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof Fact) {
      _format((Fact)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof Rule) {
      _format((Rule)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof Directive) {
      _format((Directive)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof Table) {
      _format((Table)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof BinaryExpression) {
      _format((BinaryExpression)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof UnaryExpression) {
      _format((UnaryExpression)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof AnnotatedDisjunction) {
      _format((AnnotatedDisjunction)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof Clause) {
      _format((Clause)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof Program) {
      _format((Program)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof PredicateIndicator) {
      _format((PredicateIndicator)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof Expression) {
      _format((Expression)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction instanceof EObject) {
      _format((EObject)annotatedDisjunction, document);
      return;
    } else if (annotatedDisjunction == null) {
      _format((Void)null, document);
      return;
    } else if (annotatedDisjunction != null) {
      _format(annotatedDisjunction, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(annotatedDisjunction, document).toString());
    }
  }
}