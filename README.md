# Unhandled Exception in Kotlin's `map` Function

This repository demonstrates a common, yet subtle, error in Kotlin involving the `map` function and exception handling.  The `map` function applies a transformation to each element of a collection, but doesn't provide built-in exception handling.  If the transformation function throws an exception, the entire operation fails, potentially leading to crashes or unexpected behavior.

The `bug.kt` file showcases this issue. The `bugSolution.kt` file demonstrates how to use a `try-catch` block within the `map` function to handle potential exceptions and prevent the program from crashing.