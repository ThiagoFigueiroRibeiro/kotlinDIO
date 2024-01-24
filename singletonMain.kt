class User(val id: Int, val name: String)

object UserManager {

    private val users = mutableListOf<User>()
    var it = 1
    fun addUser(nome: String) {
        users.add(User(it,nome))
        it++
    }

    fun listUsers() {
        for (user in users){
            println("${user.id} - ${user.name}")
        }

    }
}

fun main() {
    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }

    UserManager.listUsers()
}