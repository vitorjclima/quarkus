package org.github.vitorjclima;

import io.quarkus.test.junit.NativeImageTest;
import org.github.vitorjclima.resource.ExampleResourceTest;

@NativeImageTest
public class NativeExampleResourceIT extends ExampleResourceTest {

    // Execute the same tests but in native mode.
}
