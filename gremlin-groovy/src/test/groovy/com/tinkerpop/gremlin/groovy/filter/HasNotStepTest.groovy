package com.tinkerpop.gremlin.groovy.filter

import com.tinkerpop.blueprints.pgm.Graph
import com.tinkerpop.blueprints.pgm.impls.tg.TinkerGraphFactory
import com.tinkerpop.gremlin.groovy.Gremlin
import com.tinkerpop.gremlin.test.ComplianceTest

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
class HasNotStepTest extends com.tinkerpop.gremlin.test.filter.HasNotStepTest {

    Graph g = TinkerGraphFactory.createTinkerGraph();
    static {
        Gremlin.load();
    }

    public void testCompliance() {
        ComplianceTest.testCompliance(this.getClass());
    }

    public void test_g_V_hasNotXname_markoX() {
        super.test_g_V_hasNotXname_markoX(g.V.hasNot('name', 'marko'));
    }

    public void test_g_V_hasNotXname_blahX() {
        super.test_g_V_hasNotXname_blahX(g.V.hasNot('name', 'blah'));
    }

    public void test_g_V_hasNotXblah_nullX() {
        super.test_g_V_hasNotXblah_nullX(g.V.hasNot('blah', null));
    }
}
