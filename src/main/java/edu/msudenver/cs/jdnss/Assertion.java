package edu.msudenver.cs.jdnss;

class Assertion
{
    /**
     * an Assert that is independent of version and always executes...
     *
     * @param assertion        what to test
     */
    public static void aver(final boolean assertion)
    {
        if (!assertion) throw new AssertionError("Assertion failed");
    }

    public static void aver(final boolean assertion, final String message)
    {
        if (!assertion) throw new AssertionError(message);
    }

    public static void aver(final boolean assertion, final String message,
        final Throwable cause)
    {
        if (!assertion) throw new AssertionError(message, cause);
    }

    public static void aver(final boolean assertion, final Throwable cause)
    {
        if (!assertion) throw new AssertionError(cause);
    }
}
