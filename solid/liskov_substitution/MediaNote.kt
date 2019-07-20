class MediaNote(title: String, description: String, val file: File)
	: Note(title, description) {

    //some media variables
    
    fun play() {
        //read file, prepare media playback and play
    }
}