class TextNote(title: String, description: String, val text) 
    : Note(title, description, File()) {
    
    override fun play() {
        //playing text is not supported so throw exception
        throw Exception("unsupported")
    }
}