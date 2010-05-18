package examples;

import pt.iscte.dcti.instrumentation.aspects.AbstractTracer;




public aspect Tracer extends AbstractTracer {
    
    pointcut codeInsideMyProject() : within(pt.iscte.dcti.instrumentation..* || pt.iscte.dcti.visual_tracer..* || examples.Tracer) || cflow(execution(String *.toString()));
    
}
