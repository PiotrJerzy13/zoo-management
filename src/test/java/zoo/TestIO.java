package zoo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

final class TestIO implements AutoCloseable {
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    TestIO() {
        System.setOut(new PrintStream(buffer));
    }

    String out() {
        return buffer.toString();
    }

    @Override
    public void close() {
        System.setOut(originalOut);
    }
}

