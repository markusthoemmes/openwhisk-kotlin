# Kotlin action on OpenWhisk

This is a minimum example to show how to run a Kotlin based action on [Apache OpenWhisk](https://github.com/apache/incubator-openwhisk).

## Instructions:

1. Install the [OpenWhisk CLI and set it up](https://github.com/apache/incubator-openwhisk/blob/master/docs/cli.md)
2. `./gradlew jar`
3. `wsk action create myKotlinAction build/libs/hello-kotlin.jar --main HelloKt --kind java`
4. `wsk action invoke myKotlinAction -r -p name "Markus"`
5. Happiness :)
