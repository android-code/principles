class PlayerManager {

    fun changeNick(player: Player, newNick: String) {
        player.nick = newNick
        //put player to database or send to server
    }
    
    fun increasePoints(player: Player, percent: Int) {
        player.increasePointsByPercent(percent)
        //put player to database or send to server
    }
}