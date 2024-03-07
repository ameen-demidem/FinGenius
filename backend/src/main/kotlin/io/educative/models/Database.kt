package io.educative.models

import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

class Database {
    val db = KMongo.createClient(
        connectionString = "mongodb+srv://ameen:q8yQzMDUsqJZIrlf@cluster0.nwhzrfw.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0
    ).coroutine
        .getDatabase("fingenius")
}