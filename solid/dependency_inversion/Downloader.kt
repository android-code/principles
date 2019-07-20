class Downloader(val network: Network) {
    
    //just use provided dependency without know any details

    fun fetch(param: String) {
        network.download(param)
    }
}