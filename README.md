# Kotlin "New IR" Issue Reproducer

This is a test using MockK, and it works with the old backend and fails with the new one.

## Steps to reproduce

Run `mvn clean test` and watch the test fail.

Run `mvn -Pold clean test`, activating the profile for the old JVM IR backend. The test works.

## Environment

Tested with AdoptOpenJDK 11.0.10 and Maven 3.6.3
