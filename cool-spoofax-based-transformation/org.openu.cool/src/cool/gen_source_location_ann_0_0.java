package cool;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class gen_source_location_ann_0_0 extends Strategy 
{ 
  public static gen_source_location_ann_0_0 instance = new gen_source_location_ann_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_source_location_ann_0_0");
    Fail174:
    { 
      IStrategoTerm p_33 = null;
      IStrategoTerm q_33 = null;
      p_33 = term;
      term = get_file_0_0.instance.invoke(context, p_33);
      if(term == null)
        break Fail174;
      q_33 = term;
      term = get_location_0_0.instance.invoke(context, p_33);
      if(term == null)
        break Fail174;
      term = get_line_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail174;
      term = inc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail174;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail174;
      term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{cool.constTypeName6, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId32, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{q_33}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId31, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{term})})}), (IStrategoList)cool.constCons52))});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}