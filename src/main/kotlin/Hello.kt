import com.google.gson.JsonObject
import com.github.salomonbrys.kotson.*

fun main(args : JsonObject): JsonObject {
    val name = args["name"].string

    return jsonObject(
        "message" to "Hello $name!"
    )
}