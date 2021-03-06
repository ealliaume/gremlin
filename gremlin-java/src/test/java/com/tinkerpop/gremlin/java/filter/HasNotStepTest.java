package com.tinkerpop.gremlin.java.filter;

import com.tinkerpop.blueprints.pgm.Graph;
import com.tinkerpop.blueprints.pgm.impls.tg.TinkerGraphFactory;
import com.tinkerpop.gremlin.java.GremlinPipeline;
import com.tinkerpop.gremlin.test.ComplianceTest;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class HasNotStepTest extends com.tinkerpop.gremlin.test.filter.HasNotStepTest {

    Graph g = TinkerGraphFactory.createTinkerGraph();

    public void testCompliance() {
        ComplianceTest.testCompliance(this.getClass());
    }

    public void test_g_V_hasNotXname_markoX() {
        super.test_g_V_hasNotXname_markoX(new GremlinPipeline(g).V().hasNot("name", "marko"));
    }

    public void test_g_V_hasNotXname_blahX() {
        super.test_g_V_hasNotXname_blahX(new GremlinPipeline(g).V().hasNot("name", "blah"));
    }

    public void test_g_V_hasNotXblah_nullX() {
        super.test_g_V_hasNotXblah_nullX(new GremlinPipeline(g).V().hasNot("blah", null));
    }
}